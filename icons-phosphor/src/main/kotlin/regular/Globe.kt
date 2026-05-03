package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = phosphorRegularIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 L 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.934 70.590 185.410 24.066 128.000 24.000 ZM 216.000 128.000 C 216.007 136.116 214.886 144.193 212.670 152.000 L 174.160 152.000 C 176.613 136.094 176.613 119.906 174.160 104.000 L 212.670 104.000 C 214.886 111.807 216.007 119.884 216.000 128.000 ZM 102.000 168.000 L 154.000 168.000 C 148.877 184.786 139.984 200.178 128.000 213.000 C 116.021 200.175 107.128 184.784 102.000 168.000 ZM 98.100 152.000 C 95.353 136.118 95.353 119.882 98.100 104.000 L 157.980 104.000 C 160.727 119.882 160.727 136.118 157.980 152.000 ZM 40.000 128.000 C 39.993 119.884 41.114 111.807 43.330 104.000 L 81.840 104.000 C 79.387 119.906 79.387 136.094 81.840 152.000 L 43.330 152.000 C 41.114 144.193 39.993 136.116 40.000 128.000 ZM 154.000 88.000 L 102.000 88.000 C 107.123 71.214 116.016 55.822 128.000 43.000 C 139.979 55.825 148.872 71.216 154.000 88.000 ZM 206.330 88.000 L 170.710 88.000 C 166.221 71.529 158.654 56.057 148.410 42.400 C 173.457 48.417 194.627 65.073 206.370 88.000 ZM 107.590 42.400 C 97.346 56.057 89.779 71.529 85.290 88.000 L 49.630 88.000 C 61.373 65.073 82.543 48.417 107.590 42.400 ZM 49.630 168.000 L 85.290 168.000 C 89.779 184.471 97.346 199.943 107.590 213.600 C 82.543 207.583 61.373 190.927 49.630 168.000 ZM 148.410 213.600 C 158.654 199.943 166.221 184.471 170.710 168.000 L 206.370 168.000 C 194.627 190.927 173.457 207.583 148.410 213.600 Z"),
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
        return _globe!!
    }

private var _globe: ImageVector? = null
