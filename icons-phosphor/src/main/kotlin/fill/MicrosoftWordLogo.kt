package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MicrosoftWordLogo: ImageVector
    get() {
        if (_microsoftWordLogo != null) return _microsoftWordLogo!!
        _microsoftWordLogo = phosphorFillIcon(
            name = "MicrosoftWordLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 24.000 L 72.000 24.000 C 63.163 24.000 56.000 31.163 56.000 40.000 L 56.000 64.000 L 40.000 64.000 C 31.163 64.000 24.000 71.163 24.000 80.000 L 24.000 176.000 C 24.000 184.837 31.163 192.000 40.000 192.000 L 56.000 192.000 L 56.000 216.000 C 56.000 224.837 63.163 232.000 72.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 68.240 153.940 L 56.240 105.940 C 55.491 103.148 56.306 100.169 58.373 98.148 C 60.440 96.126 63.436 95.377 66.211 96.188 C 68.986 96.999 71.107 99.244 71.760 102.060 L 78.520 129.060 L 84.840 116.400 C 86.193 113.685 88.966 111.969 92.000 111.969 C 95.034 111.969 97.807 113.685 99.160 116.400 L 105.480 129.060 L 112.240 102.060 C 113.371 97.844 117.673 95.313 121.907 96.372 C 126.142 97.431 128.746 101.688 127.760 105.940 L 115.760 153.940 C 114.944 157.184 112.195 159.577 108.870 159.940 C 108.581 159.972 108.291 159.988 108.000 159.990 C 104.969 159.992 102.197 158.281 100.840 155.570 L 92.000 137.890 L 83.160 155.580 C 81.664 158.577 78.458 160.324 75.129 159.958 C 71.799 159.592 69.050 157.190 68.240 153.940 ZM 200.000 216.000 L 72.000 216.000 L 72.000 192.000 L 144.000 192.000 C 152.837 192.000 160.000 184.837 160.000 176.000 L 160.000 168.000 L 200.000 168.000 ZM 200.000 152.000 L 160.000 152.000 L 160.000 104.000 L 200.000 104.000 ZM 200.000 88.000 L 160.000 88.000 L 160.000 80.000 C 160.000 71.163 152.837 64.000 144.000 64.000 L 72.000 64.000 L 72.000 40.000 L 200.000 40.000 Z"),
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
        return _microsoftWordLogo!!
    }

private var _microsoftWordLogo: ImageVector? = null
