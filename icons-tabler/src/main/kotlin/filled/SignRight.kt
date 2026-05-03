package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SignRight: ImageVector
    get() {
        if (_signRight != null) return _signRight!!
        _signRight = tablerFilledIcon(
            name = "SignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 2.000 C 10.507 2.000 10.934 2.380 10.993 2.883 L 11.000 3.000 L 11.000 5.000 L 16.000 5.000 C 16.259 5.000 16.508 5.100 16.694 5.280 L 16.781 5.375 L 18.781 7.875 C 19.044 8.204 19.073 8.663 18.853 9.022 L 18.781 9.125 L 16.781 11.625 C 16.619 11.827 16.386 11.959 16.129 11.992 L 16.000 12.000 L 11.000 12.000 L 11.000 20.000 L 12.000 20.000 C 12.529 20.001 12.966 20.413 12.997 20.941 C 13.028 21.470 12.642 21.931 12.117 21.993 L 12.000 22.000 L 8.000 22.000 C 7.471 21.999 7.034 21.587 7.003 21.059 C 6.972 20.530 7.358 20.069 7.883 20.007 L 8.000 20.000 L 9.000 20.000 L 9.000 12.000 L 6.000 12.000 C 5.493 12.000 5.066 11.620 5.007 11.117 L 5.000 11.000 L 5.000 6.000 C 5.000 5.493 5.380 5.066 5.883 5.007 L 6.000 5.000 L 9.000 5.000 L 9.000 3.000 C 9.000 2.448 9.448 2.000 10.000 2.000 Z"),
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
        return _signRight!!
    }

private var _signRight: ImageVector? = null
