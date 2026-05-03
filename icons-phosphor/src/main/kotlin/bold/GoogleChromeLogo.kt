package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) return _googleChromeLogo!!
        _googleChromeLogo = phosphorBoldIcon(
            name = "GoogleChromeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 44.000 C 153.710 44.005 177.997 55.799 193.900 76.000 L 128.000 76.000 C 108.586 76.018 90.794 86.839 81.850 104.070 L 64.180 73.470 C 80.108 54.770 103.436 43.997 128.000 44.000 ZM 156.000 128.000 C 156.000 143.464 143.464 156.000 128.000 156.000 C 112.536 156.000 100.000 143.464 100.000 128.000 C 100.000 112.536 112.536 100.000 128.000 100.000 C 143.464 100.000 156.000 112.536 156.000 128.000 ZM 44.000 128.000 C 43.994 117.342 46.031 106.781 50.000 96.890 L 83.000 154.000 C 83.060 154.110 83.140 154.200 83.200 154.300 C 92.523 170.201 109.567 179.979 128.000 180.000 Q 129.190 180.000 130.340 179.940 L 112.660 210.570 C 72.897 203.136 44.056 168.452 44.000 128.000 ZM 140.050 211.120 L 173.000 154.000 C 173.090 153.850 173.160 153.700 173.240 153.540 C 182.731 136.806 182.169 116.192 171.780 100.000 L 207.180 100.000 C 215.576 123.702 212.906 149.919 199.904 171.442 C 186.902 192.964 164.937 207.525 140.050 211.120 Z"),
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
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null
