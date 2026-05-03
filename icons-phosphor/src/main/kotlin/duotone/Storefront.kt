package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Storefront: ImageVector
    get() {
        if (_storefront != null) return _storefront!!
        _storefront = phosphorDuotoneIcon(
            name = "Storefront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 96.000 L 224.000 112.000 C 224.000 129.673 209.673 144.000 192.000 144.000 C 174.327 144.000 160.000 129.673 160.000 112.000 L 160.000 96.000 L 96.000 96.000 L 96.000 112.000 C 96.000 129.673 81.673 144.000 64.000 144.000 C 46.327 144.000 32.000 129.673 32.000 112.000 L 32.000 96.000 L 46.340 45.800 C 47.319 42.378 50.441 40.014 54.000 40.000 L 202.000 40.000 C 205.570 40.001 208.708 42.367 209.690 45.800 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 231.690 93.810 L 217.350 43.600 C 215.369 36.759 209.122 32.038 202.000 32.000 L 54.000 32.000 C 46.878 32.038 40.631 36.759 38.650 43.600 L 24.310 93.810 C 24.105 94.522 24.001 95.259 24.000 96.000 L 24.000 112.000 C 24.000 124.590 29.928 136.446 40.000 144.000 L 40.000 216.000 C 40.000 220.418 43.582 224.000 48.000 224.000 L 208.000 224.000 C 212.418 224.000 216.000 220.418 216.000 216.000 L 216.000 144.000 C 226.072 136.446 232.000 124.590 232.000 112.000 L 232.000 96.000 C 231.999 95.259 231.895 94.522 231.690 93.810 ZM 54.000 48.000 L 202.000 48.000 L 213.420 88.000 L 42.610 88.000 ZM 152.000 104.000 L 152.000 112.000 C 152.000 125.255 141.255 136.000 128.000 136.000 C 114.745 136.000 104.000 125.255 104.000 112.000 L 104.000 104.000 ZM 51.060 132.200 C 44.173 127.791 40.004 120.178 40.000 112.000 L 40.000 104.000 L 88.000 104.000 L 88.000 112.000 C 87.997 120.394 83.609 128.176 76.429 132.523 C 69.248 136.870 60.318 137.149 52.880 133.260 C 52.323 132.827 51.711 132.470 51.060 132.200 ZM 200.000 208.000 L 56.000 208.000 L 56.000 151.200 C 58.634 151.731 61.313 151.999 64.000 152.000 C 76.590 152.000 88.446 146.072 96.000 136.000 C 103.554 146.072 115.410 152.000 128.000 152.000 C 140.590 152.000 152.446 146.072 160.000 136.000 C 167.554 146.072 179.410 152.000 192.000 152.000 C 194.687 151.999 197.366 151.731 200.000 151.200 ZM 216.000 112.000 C 215.993 120.180 211.821 127.793 204.930 132.200 C 204.287 132.471 203.682 132.824 203.130 133.250 C 195.692 137.143 186.761 136.867 179.578 132.522 C 172.395 128.177 168.005 120.395 168.000 112.000 L 168.000 104.000 L 216.000 104.000 Z"),
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
        return _storefront!!
    }

private var _storefront: ImageVector? = null
