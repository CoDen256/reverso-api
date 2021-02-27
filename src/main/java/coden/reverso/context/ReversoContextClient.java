package coden.reverso.context;

import coden.reverso.language.ReversoLanguage;

import java.util.List;

public interface ReversoContextClient {
    List<ReversoContext> getContexts(ReversoLanguage source, ReversoLanguage target, String phrase) throws Exception;
    String getContextUrl(ReversoLanguage source, ReversoLanguage target, String phrase);
}
