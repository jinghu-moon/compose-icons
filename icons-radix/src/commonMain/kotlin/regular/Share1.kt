package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Share1: ImageVector
    get() {
        if (_share1 != null) return _share1!!
        _share1 = radixIcon(
            name = "Share1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 1.000 7.500 C 1.000 6.119 2.119 5.000 3.500 5.000 C 4.460 5.000 5.292 5.543 5.711 6.337 L 9.104 4.217 C 9.037 3.990 9.000 3.749 9.000 3.500 C 9.000 2.119 10.119 1.000 11.500 1.000 C 12.881 1.000 14.000 2.119 14.000 3.500 C 14.000 4.881 12.881 6.000 11.500 6.000 C 10.691 6.000 9.975 5.615 9.518 5.020 L 5.984 7.229 C 5.994 7.318 6.000 7.408 6.000 7.500 C 6.000 7.592 5.994 7.683 5.984 7.772 L 9.518 9.981 C 9.975 9.386 10.691 9.000 11.500 9.000 C 12.881 9.000 14.000 10.119 14.000 11.500 C 14.000 12.881 12.881 14.000 11.500 14.000 C 10.119 14.000 9.000 12.881 9.000 11.500 C 9.000 11.251 9.037 11.011 9.104 10.784 L 5.711 8.664 C 5.292 9.458 4.460 10.000 3.500 10.000 C 2.119 10.000 1.000 8.881 1.000 7.500 ZM 10.000 3.500 C 10.000 4.328 10.672 5.000 11.500 5.000 C 12.328 5.000 13.000 4.328 13.000 3.500 C 13.000 2.672 12.328 2.000 11.500 2.000 C 10.672 2.000 10.000 2.672 10.000 3.500 ZM 2.000 7.500 C 2.000 8.328 2.672 9.000 3.500 9.000 C 4.328 9.000 5.000 8.328 5.000 7.500 C 5.000 6.672 4.328 6.000 3.500 6.000 C 2.672 6.000 2.000 6.672 2.000 7.500 ZM 11.500 13.000 C 12.328 13.000 13.000 12.328 13.000 11.500 C 13.000 10.672 12.328 10.000 11.500 10.000 C 10.672 10.000 10.000 10.672 10.000 11.500 C 10.000 12.328 10.672 13.000 11.500 13.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _share1!!
    }

private var _share1: ImageVector? = null
