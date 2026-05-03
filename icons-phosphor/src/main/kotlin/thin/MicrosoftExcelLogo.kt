package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MicrosoftExcelLogo: ImageVector
    get() {
        if (_microsoftExcelLogo != null) return _microsoftExcelLogo!!
        _microsoftExcelLogo = phosphorThinIcon(
            name = "MicrosoftExcelLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 28.000 L 72.000 28.000 C 65.373 28.000 60.000 33.373 60.000 40.000 L 60.000 68.000 L 40.000 68.000 C 33.373 68.000 28.000 73.373 28.000 80.000 L 28.000 176.000 C 28.000 182.627 33.373 188.000 40.000 188.000 L 60.000 188.000 L 60.000 216.000 C 60.000 222.627 65.373 228.000 72.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 40.000 C 212.000 33.373 206.627 28.000 200.000 28.000 ZM 156.000 100.000 L 204.000 100.000 L 204.000 156.000 L 156.000 156.000 ZM 204.000 40.000 L 204.000 92.000 L 156.000 92.000 L 156.000 80.000 C 156.000 73.373 150.627 68.000 144.000 68.000 L 140.000 68.000 L 140.000 36.000 L 200.000 36.000 C 202.209 36.000 204.000 37.791 204.000 40.000 ZM 68.000 40.000 C 68.000 37.791 69.791 36.000 72.000 36.000 L 132.000 36.000 L 132.000 68.000 L 68.000 68.000 ZM 36.000 176.000 L 36.000 80.000 C 36.000 77.791 37.791 76.000 40.000 76.000 L 144.000 76.000 C 146.209 76.000 148.000 77.791 148.000 80.000 L 148.000 176.000 C 148.000 178.209 146.209 180.000 144.000 180.000 L 40.000 180.000 C 37.791 180.000 36.000 178.209 36.000 176.000 ZM 68.000 216.000 L 68.000 188.000 L 132.000 188.000 L 132.000 220.000 L 72.000 220.000 C 69.791 220.000 68.000 218.209 68.000 216.000 ZM 200.000 220.000 L 140.000 220.000 L 140.000 188.000 L 144.000 188.000 C 150.627 188.000 156.000 182.627 156.000 176.000 L 156.000 164.000 L 204.000 164.000 L 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 ZM 68.930 149.440 L 86.790 128.000 L 68.930 106.560 C 67.613 104.858 67.879 102.419 69.532 101.041 C 71.185 99.662 73.632 99.839 75.070 101.440 L 92.000 121.750 L 108.930 101.440 C 109.826 100.282 111.283 99.706 112.728 99.938 C 114.174 100.170 115.377 101.173 115.865 102.554 C 116.353 103.934 116.048 105.471 115.070 106.560 L 97.210 128.000 L 115.070 149.440 C 116.048 150.529 116.353 152.066 115.865 153.446 C 115.377 154.827 114.174 155.830 112.728 156.062 C 111.283 156.294 109.826 155.718 108.930 154.560 L 92.000 134.250 L 75.070 154.560 C 74.311 155.471 73.186 155.999 72.000 156.000 C 71.063 156.004 70.156 155.674 69.440 155.070 C 67.746 153.655 67.518 151.136 68.930 149.440 Z"),
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
