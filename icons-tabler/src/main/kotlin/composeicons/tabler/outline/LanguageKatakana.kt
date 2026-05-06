package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LanguageKatakana: ImageVector
    get() {
        if (_languageKatakana != null) return _languageKatakana!!
        _languageKatakana = tablerOutlineIcon(
            name = "LanguageKatakana",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5h6.586c.404 0 .769 .244 .924 .617 .155 .374 .069 .804-.217 1.09L11 8")
            addPathData("M8 8c0 1.5 .5 3-2 5")
            addPathData("M12 20l4-9 4 9")
            addPathData("M19.1 18h-6.2")
        }
        return _languageKatakana!!
    }

private var _languageKatakana: ImageVector? = null
