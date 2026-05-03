package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) return _telegramLogo!!
        _telegramLogo = phosphorThinIcon(
            name = "TelegramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 226.270 29.220 C 224.864 28.005 222.900 27.670 221.170 28.350 L 18.510 107.660 C 14.266 109.307 11.623 113.564 12.029 118.098 C 12.435 122.633 15.791 126.352 20.260 127.220 L 76.000 138.160 L 76.000 200.000 C 75.999 204.894 78.971 209.299 83.510 211.130 C 84.938 211.703 86.462 211.998 88.000 212.000 C 91.253 211.993 94.364 210.664 96.620 208.320 L 124.620 179.320 L 167.620 217.030 C 169.800 218.953 172.603 220.019 175.510 220.030 C 176.779 220.025 178.041 219.826 179.250 219.440 C 183.279 218.165 186.326 214.843 187.250 210.720 L 227.870 34.120 C 228.285 32.316 227.669 30.431 226.270 29.220 ZM 20.000 117.380 C 19.879 116.383 20.471 115.437 21.420 115.110 L 196.070 46.760 L 79.070 130.610 L 21.810 119.370 C 20.809 119.223 20.051 118.390 20.000 117.380 ZM 90.870 202.760 C 89.739 203.925 88.016 204.291 86.509 203.686 C 85.002 203.080 84.011 201.624 84.000 200.000 L 84.000 143.700 L 118.580 174.000 ZM 179.450 208.900 C 179.135 210.282 178.113 211.394 176.762 211.823 C 175.412 212.253 173.935 211.936 172.880 210.990 L 86.430 135.180 L 218.130 40.800 Z"),
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
        return _telegramLogo!!
    }

private var _telegramLogo: ImageVector? = null
