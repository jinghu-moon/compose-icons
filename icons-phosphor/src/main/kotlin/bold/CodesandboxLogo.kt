package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = phosphorBoldIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 225.600 62.650 L 137.600 14.470 C 131.623 11.180 124.377 11.180 118.400 14.470 L 30.400 62.640 C 23.986 66.149 19.998 72.879 20.000 80.190 L 20.000 175.810 C 19.998 183.121 23.986 189.851 30.400 193.360 L 118.400 241.530 C 124.376 244.824 131.624 244.824 137.600 241.530 L 225.600 193.350 C 232.011 189.842 235.998 183.118 236.000 175.810 L 236.000 80.190 C 235.998 72.882 232.011 66.158 225.600 62.650 ZM 164.000 152.000 L 164.000 199.720 L 140.000 212.860 L 140.000 135.110 L 212.000 95.690 L 212.000 118.610 L 170.240 141.470 C 166.392 143.576 163.999 147.613 164.000 152.000 ZM 85.760 141.470 L 44.000 118.610 L 44.000 95.690 L 116.000 135.110 L 116.000 212.860 L 92.000 199.720 L 92.000 152.000 C 92.001 147.613 89.608 143.576 85.760 141.470 ZM 83.140 61.130 L 122.240 82.530 C 125.827 84.503 130.173 84.503 133.760 82.530 L 172.860 61.130 L 199.000 75.450 L 128.000 114.320 L 57.000 75.450 ZM 128.000 36.570 L 147.870 47.450 L 128.000 58.330 L 108.130 47.450 ZM 44.000 146.000 L 68.000 159.140 L 68.000 186.610 L 44.000 173.440 ZM 188.000 186.610 L 188.000 159.110 L 212.000 146.000 L 212.000 173.470 Z"),
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
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null
