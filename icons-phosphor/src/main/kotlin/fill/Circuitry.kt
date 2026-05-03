package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Circuitry: ImageVector
    get() {
        if (_circuitry != null) return _circuitry!!
        _circuitry = phosphorFillIcon(
            name = "Circuitry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 111.310 L 136.000 159.310 L 136.000 220.000 C 136.000 222.209 134.209 224.000 132.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 68.000 32.000 C 70.209 32.000 72.000 33.791 72.000 36.000 L 72.000 153.380 C 60.980 157.276 54.369 168.545 56.346 180.066 C 58.322 191.586 68.311 200.007 80.000 200.007 C 91.689 200.007 101.678 191.586 103.654 180.066 C 105.631 168.545 99.020 157.276 88.000 153.380 ZM 80.000 184.000 C 84.418 184.000 88.000 180.418 88.000 176.000 C 88.000 171.582 84.418 168.000 80.000 168.000 C 75.582 168.000 72.000 171.582 72.000 176.000 C 72.000 180.418 75.582 184.000 80.000 184.000 ZM 184.000 104.000 C 184.000 99.582 180.418 96.000 176.000 96.000 C 171.582 96.000 168.000 99.582 168.000 104.000 C 168.000 108.418 171.582 112.000 176.000 112.000 C 180.418 112.000 184.000 108.418 184.000 104.000 ZM 208.000 32.000 L 156.000 32.000 C 153.791 32.000 152.000 33.791 152.000 36.000 L 152.000 68.690 L 165.660 82.350 C 176.208 77.311 188.851 80.604 195.601 90.148 C 202.350 99.692 201.242 112.711 192.976 120.976 C 184.711 129.242 171.692 130.350 162.148 123.601 C 152.604 116.851 149.311 104.208 154.350 93.660 L 138.350 77.660 C 136.846 76.160 136.001 74.124 136.000 72.000 L 136.000 36.000 C 136.000 33.791 134.209 32.000 132.000 32.000 L 92.000 32.000 C 89.791 32.000 88.000 33.791 88.000 36.000 L 88.000 88.690 L 149.660 150.340 C 151.160 151.842 152.002 153.878 152.000 156.000 L 152.000 220.000 C 152.000 222.209 153.791 224.000 156.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 Z"),
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
        return _circuitry!!
    }

private var _circuitry: ImageVector? = null
