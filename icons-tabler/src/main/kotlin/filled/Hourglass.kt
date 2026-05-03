package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Hourglass: ImageVector
    get() {
        if (_hourglass != null) return _hourglass!!
        _hourglass = tablerFilledIcon(
            name = "Hourglass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 C 18.047 2.000 18.917 2.806 18.995 3.850 L 19.000 4.000 L 19.000 6.000 C 19.001 8.457 17.713 10.735 15.607 12.000 C 17.631 13.215 18.905 15.369 18.995 17.728 L 19.000 18.000 L 19.000 20.000 C 19.000 21.047 18.194 21.917 17.150 21.995 L 17.000 22.000 L 7.000 22.000 C 5.953 22.000 5.083 21.194 5.005 20.150 L 5.000 20.000 L 5.000 18.000 C 4.999 15.543 6.287 13.265 8.393 12.000 C 6.369 10.785 5.095 8.631 5.005 6.272 L 5.000 6.000 L 5.000 4.000 C 5.000 2.953 5.806 2.083 6.850 2.005 L 7.000 2.000 L 17.000 2.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
