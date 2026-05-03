package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitFork: ImageVector
    get() {
        if (_gitFork != null) return _gitFork!!
        _gitFork = phosphorBoldIcon(
            name = "GitFork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 64.000 C 228.001 45.692 214.261 30.300 196.070 28.230 C 177.880 26.160 161.033 38.072 156.920 55.912 C 152.807 73.752 162.739 91.837 180.000 97.940 L 180.000 112.000 C 180.000 114.209 178.209 116.000 176.000 116.000 L 80.000 116.000 C 77.791 116.000 76.000 114.209 76.000 112.000 L 76.000 97.940 C 92.531 92.096 102.446 75.192 99.482 57.911 C 96.517 40.630 81.533 27.999 64.000 27.999 C 46.467 27.999 31.483 40.630 28.518 57.911 C 25.554 75.192 35.469 92.096 52.000 97.940 L 52.000 112.000 C 52.000 127.464 64.536 140.000 80.000 140.000 L 116.000 140.000 L 116.000 158.060 C 99.469 163.904 89.554 180.808 92.518 198.089 C 95.483 215.370 110.467 228.001 128.000 228.001 C 145.533 228.001 160.517 215.370 163.482 198.089 C 166.446 180.808 156.531 163.904 140.000 158.060 L 140.000 140.000 L 176.000 140.000 C 191.464 140.000 204.000 127.464 204.000 112.000 L 204.000 97.940 C 218.370 92.837 227.979 79.249 228.000 64.000 ZM 64.000 52.000 C 70.627 52.000 76.000 57.373 76.000 64.000 C 76.000 70.627 70.627 76.000 64.000 76.000 C 57.373 76.000 52.000 70.627 52.000 64.000 C 52.000 57.373 57.373 52.000 64.000 52.000 ZM 128.000 204.000 C 121.373 204.000 116.000 198.627 116.000 192.000 C 116.000 185.373 121.373 180.000 128.000 180.000 C 134.627 180.000 140.000 185.373 140.000 192.000 C 140.000 198.627 134.627 204.000 128.000 204.000 ZM 192.000 76.000 C 185.373 76.000 180.000 70.627 180.000 64.000 C 180.000 57.373 185.373 52.000 192.000 52.000 C 198.627 52.000 204.000 57.373 204.000 64.000 C 204.000 70.627 198.627 76.000 192.000 76.000 Z"),
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
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
