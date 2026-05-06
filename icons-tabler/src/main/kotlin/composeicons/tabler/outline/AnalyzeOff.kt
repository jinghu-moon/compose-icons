package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AnalyzeOff: ImageVector
    get() {
        if (_analyzeOff != null) return _analyzeOff!!
        _analyzeOff = tablerOutlineIcon(
            name = "AnalyzeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 11C19.497 7.383 16.636 4.549 13.014 4.082c-1.466-.191-2.957 .023-4.31 .62M6.321 6.31C5.806 6.812 5.36 7.38 4.995 8")
            addPathData("M4 13c.421 3.029 2.511 5.562 5.404 6.551 2.893 .989 6.097 .263 8.283-1.875")
            addPathData("M20 16c0-.552-.448-1-1-1")
            addPathData("M4 8c0 .552 .448 1 1 1C5.552 9 6 8.552 6 8 6 7.448 5.552 7 5 7 4.448 7 4 7.448 4 8")
            addPathData("M9.888 9.87c-.769 .754-1.075 1.863-.802 2.905 .274 1.042 1.085 1.857 2.126 2.136 1.041 .278 2.151-.023 2.909-.789M14.716 10.725c-.296-.628-.799-1.135-1.426-1.435")
            addPathData("M3 3 21 21")
        }
        return _analyzeOff!!
    }

private var _analyzeOff: ImageVector? = null
