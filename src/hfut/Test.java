package hfut;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import javax.security.auth.login.AppConfigurationEntry;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException
    {
        File file=new File("src/generator.xml");
        List<String> warnings=new ArrayList<>();
        ConfigurationParser cp=new ConfigurationParser(warnings);

        Configuration config=cp.parseConfiguration(file);
        DefaultShellCallback callback=new DefaultShellCallback(true);
        MyBatisGenerator generator=new MyBatisGenerator(config,callback,warnings);
        generator.generate(null);
    }
}
