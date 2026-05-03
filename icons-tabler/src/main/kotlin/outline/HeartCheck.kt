package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartCheck: ImageVector
    get() {
        if (_heartCheck != null) return _heartCheck!!
        _heartCheck = tablerOutlineIcon(
            name = "HeartCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.500 12.572 L 16.500 15.500M 11.000 19.000 C 8.834 16.856 6.668 14.714 4.500 12.572 C 3.151 11.260 2.654 9.301 3.212 7.504 C 3.771 5.707 5.292 4.376 7.147 4.060 C 9.002 3.743 10.877 4.496 12.000 6.006 C 13.127 4.507 14.999 3.765 16.847 4.084 C 18.696 4.403 20.210 5.730 20.769 7.520 C 21.328 9.311 20.838 11.264 19.500 12.578"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 15.000 19.000 L 17.000 21.000 L 21.000 17.000"),
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
        return _heartCheck!!
    }

private var _heartCheck: ImageVector? = null
