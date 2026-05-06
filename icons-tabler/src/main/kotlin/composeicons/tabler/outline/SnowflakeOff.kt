package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SnowflakeOff: ImageVector
    get() {
        if (_snowflakeOff != null) return _snowflakeOff!!
        _snowflakeOff = tablerOutlineIcon(
            name = "SnowflakeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 4l2 1L14 4")
            addPathData("M12 2v6M13.196 9.186 15 10.22")
            addPathData("M17.928 6.268l.134 2.232 1.866 1.232")
            addPathData("M20.66 7l-5.629 3.25L15 11")
            addPathData("M19.928 14.268l-1.015 .67")
            addPathData("M14.212 14.226l-2.171 1.262")
            addPathData("M14 20 12 19l-2 1")
            addPathData("M12 22v-6.5L9 13.78")
            addPathData("M6.072 17.732 5.938 15.5 4.072 14.268")
            addPathData("M3.34 17 8.969 13.75 8.959 10.292")
            addPathData("M4.072 9.732 5.938 8.5 6.072 6.268")
            addPathData("M3.34 7l5.629 3.25 .802-.466")
            addPathData("M3 3 21 21")
        }
        return _snowflakeOff!!
    }

private var _snowflakeOff: ImageVector? = null
