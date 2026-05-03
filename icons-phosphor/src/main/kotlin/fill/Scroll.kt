package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Scroll: ImageVector
    get() {
        if (_scroll != null) return _scroll!!
        _scroll = phosphorFillIcon(
            name = "Scroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.800 169.600 C 219.415 168.561 217.731 168.000 216.000 168.000 L 208.000 168.000 L 208.000 64.000 C 208.000 46.327 193.673 32.000 176.000 32.000 L 40.000 32.000 C 22.327 32.000 8.000 46.327 8.000 64.000 C 8.000 77.610 18.050 85.540 19.200 86.400 L 19.200 86.400 C 20.581 87.446 22.268 88.008 24.000 88.000 C 27.418 87.991 30.453 85.811 31.553 82.574 C 32.653 79.338 31.575 75.760 28.870 73.670 L 28.870 73.670 C 28.830 73.620 24.000 69.740 24.000 64.000 C 24.000 55.163 31.163 48.000 40.000 48.000 C 48.837 48.000 56.000 55.163 56.000 64.000 L 56.000 192.000 C 56.000 209.673 70.327 224.000 88.000 224.000 L 200.000 224.000 C 217.673 224.000 232.000 209.673 232.000 192.000 C 232.000 178.390 222.000 170.460 220.800 169.600 ZM 104.000 96.000 L 168.000 96.000 C 172.418 96.000 176.000 99.582 176.000 104.000 C 176.000 108.418 172.418 112.000 168.000 112.000 L 104.000 112.000 C 99.582 112.000 96.000 108.418 96.000 104.000 C 96.000 99.582 99.582 96.000 104.000 96.000 ZM 96.000 136.000 C 96.000 131.582 99.582 128.000 104.000 128.000 L 168.000 128.000 C 172.418 128.000 176.000 131.582 176.000 136.000 C 176.000 140.418 172.418 144.000 168.000 144.000 L 104.000 144.000 C 99.582 144.000 96.000 140.418 96.000 136.000 ZM 200.000 208.000 L 107.710 208.000 C 110.528 203.139 112.008 197.619 112.000 192.000 C 112.002 189.288 111.594 186.590 110.790 184.000 L 212.790 184.000 C 214.776 186.203 215.920 189.036 216.020 192.000 C 216.020 196.247 214.332 200.320 211.327 203.321 C 208.322 206.322 204.247 208.005 200.000 208.000 Z"),
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
        return _scroll!!
    }

private var _scroll: ImageVector? = null
