package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hash: ImageVector
    get() {
        if (_hash != null) return _hash!!
        _hash = phosphorBoldIcon(
            name = "Hash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 84.000 L 180.200 84.000 L 187.810 42.150 C 188.997 35.628 184.672 29.377 178.150 28.190 C 171.628 27.003 165.377 31.328 164.190 37.850 L 155.800 84.000 L 116.200 84.000 L 123.810 42.150 C 124.997 35.628 120.672 29.377 114.150 28.190 C 107.628 27.003 101.377 31.328 100.190 37.850 L 91.800 84.000 L 48.000 84.000 C 41.373 84.000 36.000 89.373 36.000 96.000 C 36.000 102.627 41.373 108.000 48.000 108.000 L 87.440 108.000 L 80.170 148.000 L 32.000 148.000 C 25.373 148.000 20.000 153.373 20.000 160.000 C 20.000 166.627 25.373 172.000 32.000 172.000 L 75.800 172.000 L 68.190 213.850 C 67.607 216.988 68.298 220.230 70.111 222.857 C 71.924 225.484 74.709 227.281 77.850 227.850 C 78.560 227.968 79.280 228.018 80.000 228.000 C 85.799 227.996 90.766 223.846 91.800 218.140 L 100.200 172.000 L 139.800 172.000 L 132.190 213.850 C 131.607 216.988 132.298 220.230 134.111 222.857 C 135.924 225.484 138.709 227.281 141.850 227.850 C 142.562 227.985 143.285 228.052 144.010 228.050 C 149.809 228.046 154.776 223.896 155.810 218.190 L 164.200 172.000 L 208.000 172.000 C 214.627 172.000 220.000 166.627 220.000 160.000 C 220.000 153.373 214.627 148.000 208.000 148.000 L 168.560 148.000 L 175.830 108.000 L 224.000 108.000 C 230.627 108.000 236.000 102.627 236.000 96.000 C 236.000 89.373 230.627 84.000 224.000 84.000 ZM 144.170 148.000 L 104.560 148.000 L 111.830 108.000 L 151.440 108.000 Z"),
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
        return _hash!!
    }

private var _hash: ImageVector? = null
