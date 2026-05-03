package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) return _flowerTulip!!
        _flowerTulip = phosphorThinIcon(
            name = "FlowerTulip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 52.000 C 195.168 51.992 182.507 54.942 171.000 60.620 C 156.800 34.160 131.000 20.990 129.810 20.420 C 128.683 19.856 127.357 19.856 126.230 20.420 C 125.090 20.990 99.230 34.160 85.040 60.620 C 73.521 54.936 60.845 51.986 48.000 52.000 C 45.791 52.000 44.000 53.791 44.000 56.000 L 44.000 96.000 C 44.053 140.815 79.239 177.715 124.000 179.900 L 124.000 225.530 L 81.790 204.420 C 79.813 203.431 77.409 204.233 76.420 206.210 C 75.431 208.187 76.233 210.591 78.210 211.580 L 126.210 235.580 C 127.337 236.144 128.663 236.144 129.790 235.580 L 177.790 211.580 C 179.767 210.591 180.569 208.187 179.580 206.210 C 178.591 204.233 176.187 203.431 174.210 204.420 L 132.000 225.530 L 132.000 179.900 C 176.761 177.715 211.947 140.815 212.000 96.000 L 212.000 56.000 C 212.000 53.791 210.209 52.000 208.000 52.000 ZM 128.000 28.560 C 133.910 31.930 153.000 44.010 164.000 64.490 C 146.926 75.034 134.164 91.313 128.000 110.410 C 121.836 91.313 109.074 75.034 92.000 64.490 C 103.000 44.070 122.100 31.940 128.000 28.560 ZM 52.000 96.000 L 52.000 60.100 C 92.340 62.282 123.947 95.601 124.000 136.000 L 124.000 171.900 C 83.660 169.718 52.053 136.399 52.000 96.000 ZM 204.000 96.000 C 203.947 136.399 172.340 169.718 132.000 171.900 L 132.000 136.000 C 132.053 95.601 163.660 62.282 204.000 60.100 Z"),
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
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
