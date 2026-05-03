package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsOut: ImageVector
    get() {
        if (_arrowsOut != null) return _arrowsOut!!
        _arrowsOut = phosphorFillIcon(
            name = "ArrowsOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 109.660 146.340 C 111.162 147.841 112.006 149.877 112.006 152.000 C 112.006 154.123 111.162 156.159 109.660 157.660 L 83.310 184.000 L 101.660 202.340 C 103.951 204.628 104.636 208.071 103.397 211.062 C 102.158 214.053 99.238 216.003 96.000 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 L 40.000 160.000 C 39.997 156.762 41.947 153.842 44.938 152.603 C 47.929 151.364 51.372 152.049 53.660 154.340 L 72.000 172.690 L 98.340 146.340 C 99.841 144.838 101.877 143.994 104.000 143.994 C 106.123 143.994 108.159 144.838 109.660 146.340 ZM 83.310 72.000 L 101.660 53.660 C 103.951 51.372 104.636 47.929 103.397 44.938 C 102.158 41.947 99.238 39.997 96.000 40.000 L 48.000 40.000 C 43.582 40.000 40.000 43.582 40.000 48.000 L 40.000 96.000 C 39.997 99.238 41.947 102.158 44.938 103.397 C 47.929 104.636 51.372 103.951 53.660 101.660 L 72.000 83.310 L 98.340 109.660 C 101.466 112.786 106.534 112.786 109.660 109.660 C 112.786 106.534 112.786 101.466 109.660 98.340 ZM 208.000 40.000 L 160.000 40.000 C 156.762 39.997 153.842 41.947 152.603 44.938 C 151.364 47.929 152.049 51.372 154.340 53.660 L 172.690 72.000 L 146.340 98.340 C 143.214 101.466 143.214 106.534 146.340 109.660 C 149.466 112.786 154.534 112.786 157.660 109.660 L 184.000 83.310 L 202.340 101.660 C 204.628 103.951 208.071 104.636 211.062 103.397 C 214.053 102.158 216.003 99.238 216.000 96.000 L 216.000 48.000 C 216.000 43.582 212.418 40.000 208.000 40.000 ZM 211.060 152.610 C 208.071 151.370 204.629 152.053 202.340 154.340 L 184.000 172.690 L 157.660 146.340 C 154.534 143.214 149.466 143.214 146.340 146.340 C 143.214 149.466 143.214 154.534 146.340 157.660 L 172.690 184.000 L 154.340 202.340 C 152.049 204.628 151.364 208.071 152.603 211.062 C 153.842 214.053 156.762 216.003 160.000 216.000 L 208.000 216.000 C 212.418 216.000 216.000 212.418 216.000 208.000 L 216.000 160.000 C 215.999 156.764 214.050 153.848 211.060 152.610 Z"),
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
        return _arrowsOut!!
    }

private var _arrowsOut: ImageVector? = null
