package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LanguageHiragana: ImageVector
    get() {
        if (_languageHiragana != null) return _languageHiragana!!
        _languageHiragana = tablerOutlineIcon(
            name = "LanguageHiragana",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5h7")
            addPathData("M7 4c0 4.846 0 7 .5 8")
            addPathData("M10 8.5C10 10.786 8 13 6.5 13 5 13 4 11.865 4 11 4 9 5 8 7 8c2 0 5 .57 5 2.857 0 1.524-.667 2.571-2 3.143")
            addPathData("M12 20l4-9 4 9")
            addPathData("M19.1 18h-6.2")
        }
        return _languageHiragana!!
    }

private var _languageHiragana: ImageVector? = null
