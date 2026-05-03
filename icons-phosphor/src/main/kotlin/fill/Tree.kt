package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = phosphorFillIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 187.850 C 130.566 189.559 133.238 191.102 136.000 192.470 L 136.000 232.000 C 136.000 236.418 132.418 240.000 128.000 240.000 C 123.582 240.000 120.000 236.418 120.000 232.000 L 120.000 192.470 C 122.762 191.102 125.434 189.559 128.000 187.850 ZM 198.100 62.590 C 186.267 34.337 158.630 15.950 128.000 15.950 C 97.370 15.950 69.733 34.337 57.900 62.590 C 32.377 74.256 16.004 99.737 16.000 127.800 C 15.900 166.000 48.000 199.000 86.140 200.000 C 97.871 200.278 109.493 197.693 120.000 192.470 L 120.000 156.940 L 76.420 135.160 C 72.466 133.183 70.863 128.374 72.840 124.420 C 74.817 120.466 79.626 118.863 83.580 120.840 L 120.000 139.060 L 120.000 88.000 C 120.000 83.582 123.582 80.000 128.000 80.000 C 132.418 80.000 136.000 83.582 136.000 88.000 L 136.000 115.060 L 172.420 96.840 C 176.374 94.863 181.183 96.466 183.160 100.420 C 185.137 104.374 183.534 109.183 179.580 111.160 L 136.000 132.940 L 136.000 192.470 C 145.945 197.408 156.896 199.985 168.000 200.000 L 169.820 200.000 C 208.000 199.000 240.110 166.000 240.000 127.800 C 239.996 99.737 223.623 74.256 198.100 62.590 Z"),
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
        return _tree!!
    }

private var _tree: ImageVector? = null
