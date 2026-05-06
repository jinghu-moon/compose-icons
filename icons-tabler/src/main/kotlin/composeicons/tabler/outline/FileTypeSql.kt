package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeSql: ImageVector
    get() {
        if (_fileTypeSql != null) return _fileTypeSql!!
        _fileTypeSql = tablerOutlineIcon(
            name = "FileTypeSql",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 20.25c0 .414 .336 .75 .75 .75h1.25c.552 0 1-.448 1-1v-1C8 18.448 7.552 18 7 18h-1C5.448 18 5 17.552 5 17v-1c0-.552 .448-1 1-1h1.25c.414 0 .75 .336 .75 .75")
            addPathData("M5 12v-7C5 3.895 5.895 3 7 3h7l5 5v4")
            addPathData("M18 15v6h2")
            addPathData("M13 15c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-2c0-1.105 .895-2 2-2")
            addPathData("M14 20l1.5 1.5")
        }
        return _fileTypeSql!!
    }

private var _fileTypeSql: ImageVector? = null
