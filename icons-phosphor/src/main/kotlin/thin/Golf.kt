package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = phosphorThinIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 100.000 C 172.000 104.418 168.418 108.000 164.000 108.000 C 159.582 108.000 156.000 104.418 156.000 100.000 C 156.000 95.582 159.582 92.000 164.000 92.000 C 168.418 92.000 172.000 95.582 172.000 100.000 ZM 132.000 124.000 C 127.582 124.000 124.000 127.582 124.000 132.000 C 124.000 136.418 127.582 140.000 132.000 140.000 C 136.418 140.000 140.000 136.418 140.000 132.000 C 140.000 127.582 136.418 124.000 132.000 124.000 ZM 212.000 96.000 C 212.000 142.392 174.392 180.000 128.000 180.000 C 81.608 180.000 44.000 142.392 44.000 96.000 C 44.000 49.608 81.608 12.000 128.000 12.000 C 174.371 12.050 211.950 49.629 212.000 96.000 ZM 204.000 96.000 C 204.000 54.026 169.974 20.000 128.000 20.000 C 86.026 20.000 52.000 54.026 52.000 96.000 C 52.000 137.974 86.026 172.000 128.000 172.000 C 169.955 171.956 203.956 137.955 204.000 96.000 ZM 166.570 196.260 C 153.000 201.470 140.340 204.000 128.000 204.000 C 115.660 204.000 103.000 201.470 89.430 196.260 C 87.364 195.470 85.050 196.504 84.260 198.570 C 83.470 200.636 84.504 202.950 86.570 203.740 C 98.525 208.462 111.165 211.221 124.000 211.910 L 124.000 248.000 C 124.000 250.209 125.791 252.000 128.000 252.000 C 130.209 252.000 132.000 250.209 132.000 248.000 L 132.000 211.910 C 144.835 211.221 157.475 208.462 169.430 203.740 C 171.496 202.950 172.530 200.636 171.740 198.570 C 170.950 196.504 168.636 195.470 166.570 196.260 Z"),
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
        return _golf!!
    }

private var _golf: ImageVector? = null
