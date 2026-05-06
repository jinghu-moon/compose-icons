package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandKakoTalk: ImageVector
    get() {
        if (_brandKakoTalk != null) return _brandKakoTalk!!
        _brandKakoTalk = tablerOutlineIcon(
            name = "BrandKakoTalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 8v7")
            addPathData("M14 10l-2 2.5L14 15")
            addPathData("M12 4c4.97 0 9 3.358 9 7.5C21 15.642 16.97 19 12 19c-.67 0-1.323-.061-1.95-.177L7 21l.592-2.962C4.851 16.754 3 14.308 3 11.5 3 7.358 7.03 4 12 4")
        }
        return _brandKakoTalk!!
    }

private var _brandKakoTalk: ImageVector? = null
