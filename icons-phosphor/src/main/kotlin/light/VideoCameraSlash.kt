package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) return _videoCameraSlash!!
        _videoCameraSlash = phosphorLightIcon(
            name = "VideoCameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 250.830 74.710 C 248.878 73.666 246.511 73.782 244.670 75.010 L 206.000 100.790 L 206.000 72.000 C 206.000 64.268 199.732 58.000 192.000 58.000 L 113.060 58.000 C 109.746 58.000 107.060 60.686 107.060 64.000 C 107.060 67.314 109.746 70.000 113.060 70.000 L 192.000 70.000 C 193.105 70.000 194.000 70.895 194.000 72.000 L 194.000 159.630 C 194.000 162.944 196.686 165.630 200.000 165.630 C 203.314 165.630 206.000 162.944 206.000 159.630 L 206.000 155.210 L 244.670 181.000 C 246.512 182.229 248.882 182.344 250.834 181.297 C 252.786 180.251 254.003 178.215 254.000 176.000 L 254.000 80.000 C 254.000 77.787 252.781 75.754 250.830 74.710 ZM 242.000 164.790 L 206.000 140.790 L 206.000 115.210 L 242.000 91.210 ZM 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 56.250 58.000 L 32.000 58.000 C 24.268 58.000 18.000 64.268 18.000 72.000 L 18.000 184.000 C 18.000 191.732 24.268 198.000 32.000 198.000 L 183.530 198.000 L 203.530 220.000 C 205.761 222.452 209.558 222.631 212.010 220.400 C 214.462 218.169 214.641 214.372 212.410 211.920 ZM 32.000 186.000 C 30.895 186.000 30.000 185.105 30.000 184.000 L 30.000 72.000 C 30.000 70.895 30.895 70.000 32.000 70.000 L 67.160 70.000 L 172.620 186.000 Z"),
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
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
