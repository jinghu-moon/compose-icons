package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mouse: ImageVector
    get() {
        if (_mouse != null) return _mouse!!
        _mouse = tablerFilledIcon(
            name = "Mouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 2.000 C 16.761 2.000 19.000 4.239 19.000 7.000 L 19.000 17.000 C 19.000 19.761 16.761 22.000 14.000 22.000 L 10.000 22.000 C 7.239 22.000 5.000 19.761 5.000 17.000 L 5.000 7.000 C 5.000 4.239 7.239 2.000 10.000 2.000 ZM 12.000 6.000 C 11.448 6.000 11.000 6.448 11.000 7.000 L 11.000 11.000 L 11.007 11.117 C 11.069 11.642 11.530 12.028 12.059 11.997 C 12.587 11.966 12.999 11.529 13.000 11.000 L 13.000 7.000 L 12.993 6.883 C 12.934 6.380 12.507 6.000 12.000 6.000 Z"),
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
        return _mouse!!
    }

private var _mouse: ImageVector? = null
