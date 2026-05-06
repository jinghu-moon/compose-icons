package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VocabularyOff: ImageVector
    get() {
        if (_vocabularyOff != null) return _vocabularyOff!!
        _vocabularyOff = tablerOutlineIcon(
            name = "VocabularyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3h3c1.105 0 2 .895 2 2 0-1.105 .895-2 2-2h6c.552 0 1 .448 1 1v13M19 19h-5c-1.105 0-2 .895-2 2 0-1.105-.895-2-2-2h-6C3.448 19 3 18.552 3 18v-14c0-.279 .114-.53 .298-.712")
            addPathData("M12 5v3M12 12v9")
            addPathData("M7 11h1")
            addPathData("M16 7h1")
            addPathData("M16 11h1")
            addPathData("M3 3 21 21")
        }
        return _vocabularyOff!!
    }

private var _vocabularyOff: ImageVector? = null
