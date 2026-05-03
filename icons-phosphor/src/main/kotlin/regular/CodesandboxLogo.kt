package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = phosphorRegularIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 223.680 66.150 L 135.680 18.000 C 130.898 15.370 125.102 15.370 120.320 18.000 L 32.320 66.180 C 27.201 68.981 24.013 74.345 24.000 80.180 L 24.000 175.820 C 24.013 181.655 27.201 187.019 32.320 189.820 L 120.320 237.990 C 125.099 240.631 130.901 240.631 135.680 237.990 L 223.680 189.820 C 228.799 187.019 231.987 181.655 232.000 175.820 L 232.000 80.180 C 231.998 74.335 228.808 68.956 223.680 66.150 ZM 168.000 152.000 L 168.000 202.090 L 136.000 219.610 L 136.000 132.740 L 216.000 88.940 L 216.000 120.940 L 172.160 144.940 C 169.582 146.351 167.985 149.061 168.000 152.000 ZM 83.840 145.000 L 40.000 121.000 L 40.000 89.000 L 120.000 132.800 L 120.000 219.670 L 88.000 202.090 L 88.000 152.000 C 87.993 149.083 86.399 146.400 83.840 145.000 ZM 83.140 56.590 L 124.140 79.040 C 126.533 80.349 129.427 80.349 131.820 79.040 L 172.820 56.590 L 207.300 75.460 L 128.000 118.880 L 48.660 75.440 ZM 128.000 32.000 L 128.000 32.000 L 156.200 47.440 L 128.000 62.890 L 99.800 47.450 ZM 40.000 139.220 L 72.000 156.740 L 72.000 193.330 L 40.000 175.820 ZM 184.000 193.330 L 184.000 156.740 L 216.000 139.220 L 216.000 175.820 Z"),
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
