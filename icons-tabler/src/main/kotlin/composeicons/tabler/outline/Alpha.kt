package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Alpha: ImageVector
    get() {
        if (_alpha != null) return _alpha!!
        _alpha = tablerOutlineIcon(
            name = "Alpha",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.1 6C17 8.913 16.2 10.913 15.7 12c-1.879 4.088-3.713 6-6 6C7.3 18 4.9 15.6 4.9 12 4.9 8.4 7.3 6 9.7 6c2.267 0 4.135 1.986 6 6 .512 1.102 1.312 3.102 2.4 6"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _alpha!!
    }

private var _alpha: ImageVector? = null
