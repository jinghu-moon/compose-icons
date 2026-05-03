package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = radixIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 2.000 C 14.105 2.000 15.000 2.895 15.000 4.000 L 15.000 11.000 C 15.000 12.105 14.105 13.000 13.000 13.000 L 2.000 13.000 C 0.964 13.000 0.113 12.213 0.011 11.204 L 0.000 11.000 L 0.000 4.000 C 0.000 2.895 0.895 2.000 2.000 2.000 L 13.000 2.000 ZM 2.000 3.000 C 1.448 3.000 1.000 3.448 1.000 4.000 L 1.000 11.000 L 1.005 11.102 C 1.056 11.607 1.482 12.000 2.000 12.000 L 13.000 12.000 C 13.552 12.000 14.000 11.552 14.000 11.000 L 14.000 4.000 C 14.000 3.448 13.552 3.000 13.000 3.000 L 2.000 3.000 ZM 9.686 3.988 C 11.588 4.085 13.101 5.658 13.102 7.584 L 13.097 7.770 C 13.000 9.672 11.426 11.185 9.500 11.186 L 9.315 11.181 C 7.474 11.087 5.998 9.611 5.904 7.770 L 5.899 7.584 C 5.900 5.596 7.512 3.984 9.500 3.983 L 9.686 3.988 ZM 9.500 4.983 C 8.064 4.984 6.900 6.148 6.899 7.584 C 6.900 9.020 8.064 10.185 9.500 10.186 C 10.936 10.185 12.101 9.020 12.102 7.584 C 12.101 6.148 10.936 4.984 9.500 4.983 ZM 4.750 4.000 C 4.888 4.000 5.000 4.112 5.000 4.250 L 5.000 5.755 C 5.000 5.893 4.888 6.005 4.750 6.005 L 2.250 6.005 C 2.112 6.005 2.000 5.893 2.000 5.755 L 2.000 4.250 C 2.000 4.112 2.112 4.000 2.250 4.000 L 4.750 4.000 Z"),
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
        return _camera!!
    }

private var _camera: ImageVector? = null
