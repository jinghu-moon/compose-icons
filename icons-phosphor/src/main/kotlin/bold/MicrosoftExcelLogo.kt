package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MicrosoftExcelLogo: ImageVector
    get() {
        if (_microsoftExcelLogo != null) return _microsoftExcelLogo!!
        _microsoftExcelLogo = phosphorBoldIcon(
            name = "MicrosoftExcelLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 20.000 L 72.000 20.000 C 60.954 20.000 52.000 28.954 52.000 40.000 L 52.000 56.000 L 36.000 56.000 C 24.954 56.000 16.000 64.954 16.000 76.000 L 16.000 180.000 C 16.000 191.046 24.954 200.000 36.000 200.000 L 52.000 200.000 L 52.000 216.000 C 52.000 227.046 60.954 236.000 72.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 40.000 C 220.000 28.954 211.046 20.000 200.000 20.000 ZM 168.000 108.000 L 196.000 108.000 L 196.000 148.000 L 168.000 148.000 ZM 196.000 84.000 L 168.000 84.000 L 168.000 76.000 C 168.000 64.954 159.046 56.000 148.000 56.000 L 148.000 44.000 L 196.000 44.000 ZM 76.000 44.000 L 124.000 44.000 L 124.000 56.000 L 76.000 56.000 ZM 40.000 80.000 L 144.000 80.000 L 144.000 176.000 L 40.000 176.000 ZM 76.000 200.000 L 124.000 200.000 L 124.000 212.000 L 76.000 212.000 ZM 148.000 212.000 L 148.000 200.000 C 159.046 200.000 168.000 191.046 168.000 180.000 L 168.000 172.000 L 196.000 172.000 L 196.000 212.000 ZM 64.320 161.220 C 59.228 156.978 58.539 149.412 62.780 144.320 L 76.380 128.000 L 62.780 111.680 C 59.995 108.391 59.188 103.860 60.666 99.811 C 62.144 95.763 65.680 92.818 69.929 92.096 C 74.178 91.374 78.488 92.986 81.220 96.320 L 92.000 109.250 L 102.780 96.320 C 107.038 91.290 114.555 90.636 119.619 94.853 C 124.682 99.071 125.397 106.583 121.220 111.680 L 107.620 128.000 L 121.220 144.320 C 124.005 147.609 124.812 152.140 123.334 156.189 C 121.856 160.237 118.320 163.182 114.071 163.904 C 109.822 164.626 105.512 163.014 102.780 159.680 L 92.000 146.750 L 81.220 159.680 C 76.978 164.772 69.412 165.461 64.320 161.220 Z"),
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
        return _microsoftExcelLogo!!
    }

private var _microsoftExcelLogo: ImageVector? = null
