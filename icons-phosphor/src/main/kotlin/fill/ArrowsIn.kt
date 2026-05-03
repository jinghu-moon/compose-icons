package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) return _arrowsIn!!
        _arrowsIn = phosphorFillIcon(
            name = "ArrowsIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 104.000 L 144.000 64.000 C 143.997 60.762 145.947 57.842 148.938 56.603 C 151.929 55.364 155.372 56.049 157.660 58.340 L 172.000 72.690 L 202.340 42.340 C 205.466 39.214 210.534 39.214 213.660 42.340 C 216.786 45.466 216.786 50.534 213.660 53.660 L 183.310 84.000 L 197.660 98.340 C 199.951 100.628 200.636 104.071 199.397 107.062 C 198.158 110.053 195.238 112.003 192.000 112.000 L 152.000 112.000 C 147.582 112.000 144.000 108.418 144.000 104.000 ZM 104.000 144.000 L 64.000 144.000 C 60.762 143.997 57.842 145.947 56.603 148.938 C 55.364 151.929 56.049 155.372 58.340 157.660 L 72.690 172.000 L 42.340 202.340 C 39.214 205.466 39.214 210.534 42.340 213.660 C 45.466 216.786 50.534 216.786 53.660 213.660 L 84.000 183.310 L 98.340 197.660 C 100.628 199.951 104.071 200.636 107.062 199.397 C 110.053 198.158 112.003 195.238 112.000 192.000 L 112.000 152.000 C 112.000 147.582 108.418 144.000 104.000 144.000 ZM 107.060 56.610 C 104.071 55.370 100.629 56.053 98.340 58.340 L 84.000 72.690 L 53.660 42.340 C 50.534 39.214 45.466 39.214 42.340 42.340 C 39.214 45.466 39.214 50.534 42.340 53.660 L 72.690 84.000 L 58.340 98.340 C 56.049 100.628 55.364 104.071 56.603 107.062 C 57.842 110.053 60.762 112.003 64.000 112.000 L 104.000 112.000 C 108.418 112.000 112.000 108.418 112.000 104.000 L 112.000 64.000 C 111.999 60.764 110.050 57.848 107.060 56.610 ZM 183.310 172.000 L 197.660 157.660 C 199.951 155.372 200.636 151.929 199.397 148.938 C 198.158 145.947 195.238 143.997 192.000 144.000 L 152.000 144.000 C 147.582 144.000 144.000 147.582 144.000 152.000 L 144.000 192.000 C 143.997 195.238 145.947 198.158 148.938 199.397 C 151.929 200.636 155.372 199.951 157.660 197.660 L 172.000 183.310 L 202.340 213.660 C 205.466 216.786 210.534 216.786 213.660 213.660 C 216.786 210.534 216.786 205.466 213.660 202.340 Z"),
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
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
