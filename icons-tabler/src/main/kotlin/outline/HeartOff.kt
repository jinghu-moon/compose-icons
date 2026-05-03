package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartOff: ImageVector
    get() {
        if (_heartOff != null) return _heartOff!!
        _heartOff = tablerOutlineIcon(
            name = "HeartOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
                pathData = parseSvgPathData("M 19.500 12.572 L 18.000 14.000M 16.000 16.000 L 12.000 20.000 L 4.500 12.572 C 3.151 11.260 2.653 9.301 3.212 7.504 C 3.529 6.501 4.154 5.625 5.000 5.000M 8.000 4.000 C 9.560 4.000 11.050 4.727 12.000 6.000 C 13.127 4.501 14.999 3.759 16.847 4.078 C 18.696 4.397 20.210 5.724 20.769 7.514 C 21.328 9.305 20.838 11.258 19.500 12.572"),
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
        return _heartOff!!
    }

private var _heartOff: ImageVector? = null
