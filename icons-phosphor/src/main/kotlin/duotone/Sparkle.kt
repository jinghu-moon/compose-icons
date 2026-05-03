package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Sparkle: ImageVector
    get() {
        if (_sparkle != null) return _sparkle!!
        _sparkle = phosphorDuotoneIcon(
            name = "Sparkle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 194.820 151.430 L 139.730 171.730 L 119.430 226.820 C 118.282 229.931 115.316 231.997 112.000 231.997 C 108.684 231.997 105.718 229.931 104.570 226.820 L 84.270 171.730 L 29.180 151.430 C 26.069 150.282 24.003 147.316 24.003 144.000 C 24.003 140.684 26.069 137.718 29.180 136.570 L 84.270 116.270 L 104.570 61.180 C 105.718 58.069 108.684 56.003 112.000 56.003 C 115.316 56.003 118.282 58.069 119.430 61.180 L 139.730 116.270 L 194.820 136.570 C 197.931 137.718 199.997 140.684 199.997 144.000 C 199.997 147.316 197.931 150.282 194.820 151.430 Z"),
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
        pathData = parseSvgPathData("M 197.580 129.060 L 146.000 110.000 L 127.000 58.380 C 124.695 52.119 118.732 47.959 112.060 47.959 C 105.388 47.959 99.425 52.119 97.120 58.380 L 78.000 110.000 L 26.380 129.000 C 20.119 131.305 15.959 137.268 15.959 143.940 C 15.959 150.612 20.119 156.575 26.380 158.880 L 78.000 178.000 L 97.000 229.620 C 99.305 235.881 105.268 240.041 111.940 240.041 C 118.612 240.041 124.575 235.881 126.880 229.620 L 146.000 178.000 L 197.620 159.000 C 203.881 156.695 208.041 150.732 208.041 144.060 C 208.041 137.388 203.881 131.425 197.620 129.120 ZM 137.000 164.220 C 134.802 165.030 133.070 166.762 132.260 168.960 L 112.000 223.850 L 91.780 169.000 C 90.971 166.779 89.221 165.029 87.000 164.220 L 32.150 144.000 L 87.000 123.780 C 89.221 122.971 90.971 121.221 91.780 119.000 L 112.000 64.150 L 132.220 119.000 C 133.030 121.198 134.762 122.930 136.960 123.740 L 191.850 144.000 ZM 144.000 40.000 C 144.000 35.582 147.582 32.000 152.000 32.000 L 168.000 32.000 L 168.000 16.000 C 168.000 11.582 171.582 8.000 176.000 8.000 C 180.418 8.000 184.000 11.582 184.000 16.000 L 184.000 32.000 L 200.000 32.000 C 204.418 32.000 208.000 35.582 208.000 40.000 C 208.000 44.418 204.418 48.000 200.000 48.000 L 184.000 48.000 L 184.000 64.000 C 184.000 68.418 180.418 72.000 176.000 72.000 C 171.582 72.000 168.000 68.418 168.000 64.000 L 168.000 48.000 L 152.000 48.000 C 147.582 48.000 144.000 44.418 144.000 40.000 ZM 248.000 88.000 C 248.000 92.418 244.418 96.000 240.000 96.000 L 232.000 96.000 L 232.000 104.000 C 232.000 108.418 228.418 112.000 224.000 112.000 C 219.582 112.000 216.000 108.418 216.000 104.000 L 216.000 96.000 L 208.000 96.000 C 203.582 96.000 200.000 92.418 200.000 88.000 C 200.000 83.582 203.582 80.000 208.000 80.000 L 216.000 80.000 L 216.000 72.000 C 216.000 67.582 219.582 64.000 224.000 64.000 C 228.418 64.000 232.000 67.582 232.000 72.000 L 232.000 80.000 L 240.000 80.000 C 244.418 80.000 248.000 83.582 248.000 88.000 Z"),
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
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
