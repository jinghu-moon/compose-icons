package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FaceMask: ImageVector
    get() {
        if (_faceMask != null) return _faceMask!!
        _faceMask = phosphorDuotoneIcon(
            name = "FaceMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 77.090 L 216.000 136.000 C 216.000 192.000 128.000 208.000 128.000 208.000 C 128.000 208.000 40.000 192.000 40.000 136.000 L 40.000 77.090 C 40.000 73.724 42.106 70.719 45.270 69.570 L 125.270 40.480 C 127.034 39.840 128.966 39.840 130.730 40.480 L 210.730 69.570 C 213.894 70.719 216.000 73.724 216.000 77.090 Z"),
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
        pathData = parseSvgPathData("M 176.000 104.000 C 176.000 108.418 172.418 112.000 168.000 112.000 L 88.000 112.000 C 83.582 112.000 80.000 108.418 80.000 104.000 C 80.000 99.582 83.582 96.000 88.000 96.000 L 168.000 96.000 C 172.418 96.000 176.000 99.582 176.000 104.000 ZM 168.000 128.000 L 88.000 128.000 C 83.582 128.000 80.000 131.582 80.000 136.000 C 80.000 140.418 83.582 144.000 88.000 144.000 L 168.000 144.000 C 172.418 144.000 176.000 140.418 176.000 136.000 C 176.000 131.582 172.418 128.000 168.000 128.000 ZM 256.000 104.000 L 256.000 128.000 C 256.000 145.673 241.673 160.000 224.000 160.000 L 218.810 160.000 C 211.620 175.800 197.020 189.430 175.580 200.160 C 160.930 207.345 145.421 212.624 129.430 215.870 C 128.485 216.043 127.515 216.043 126.570 215.870 C 110.579 212.624 95.070 207.345 80.420 200.160 C 59.000 189.430 44.380 175.800 37.190 160.000 L 32.000 160.000 C 14.327 160.000 0.000 145.673 0.000 128.000 L 0.000 104.000 C 0.000 86.327 14.327 72.000 32.000 72.000 L 32.850 72.000 C 34.382 67.364 37.947 63.682 42.530 62.000 L 122.530 32.910 C 126.064 31.630 129.936 31.630 133.470 32.910 L 213.470 62.000 C 218.053 63.682 221.618 67.364 223.150 72.000 L 224.000 72.000 C 241.673 72.000 256.000 86.327 256.000 104.000 ZM 32.550 144.000 C 32.185 141.349 32.001 138.676 32.000 136.000 L 32.000 88.000 C 23.163 88.000 16.000 95.163 16.000 104.000 L 16.000 128.000 C 16.000 136.837 23.163 144.000 32.000 144.000 ZM 208.000 136.000 L 208.000 77.090 L 128.000 48.000 L 48.000 77.090 L 48.000 136.000 C 48.000 181.000 117.090 197.520 128.000 199.840 C 138.890 197.520 208.000 181.000 208.000 136.000 ZM 240.000 104.000 C 240.000 95.163 232.837 88.000 224.000 88.000 L 224.000 136.000 C 223.999 138.676 223.815 141.349 223.450 144.000 L 224.000 144.000 C 232.837 144.000 240.000 136.837 240.000 128.000 Z"),
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
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
