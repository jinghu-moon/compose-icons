package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) return _androidLogo!!
        _androidLogo = phosphorThinIcon(
            name = "AndroidLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 148.000 C 172.000 152.418 168.418 156.000 164.000 156.000 C 159.582 156.000 156.000 152.418 156.000 148.000 C 156.000 143.582 159.582 140.000 164.000 140.000 C 168.418 140.000 172.000 143.582 172.000 148.000 ZM 92.000 140.000 C 87.582 140.000 84.000 143.582 84.000 148.000 C 84.000 152.418 87.582 156.000 92.000 156.000 C 96.418 156.000 100.000 152.418 100.000 148.000 C 100.000 143.582 96.418 140.000 92.000 140.000 ZM 236.000 160.000 L 236.000 184.000 C 236.000 190.627 230.627 196.000 224.000 196.000 L 32.000 196.000 C 25.373 196.000 20.000 190.627 20.000 184.000 L 20.000 161.130 C 19.971 129.627 33.519 99.640 57.180 78.840 L 29.180 50.840 C 27.617 49.277 27.617 46.743 29.180 45.180 C 30.743 43.617 33.277 43.617 34.840 45.180 L 63.410 73.750 C 81.877 59.708 104.420 52.072 127.620 52.000 L 128.000 52.000 C 151.368 51.935 174.116 59.509 192.780 73.570 L 221.170 45.170 C 222.733 43.607 225.267 43.607 226.830 45.170 C 228.393 46.733 228.393 49.267 226.830 50.830 L 199.000 78.640 C 200.780 80.200 202.520 81.810 204.210 83.500 C 224.625 103.713 236.077 131.271 236.000 160.000 ZM 228.000 160.000 C 228.000 104.772 183.228 60.000 128.000 60.000 L 127.650 60.000 C 72.700 60.190 28.000 105.560 28.000 161.130 L 28.000 184.000 C 28.000 186.209 29.791 188.000 32.000 188.000 L 224.000 188.000 C 226.209 188.000 228.000 186.209 228.000 184.000 Z"),
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
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
