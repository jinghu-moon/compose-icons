package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleZero: ImageVector
    get() {
        if (_numberCircleZero != null) return _numberCircleZero!!
        _numberCircleZero = phosphorThinIcon(
            name = "NumberCircleZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 128.000 76.000 C 115.180 76.000 104.590 81.810 97.380 92.800 C 91.330 102.000 88.000 114.520 88.000 128.000 C 88.000 141.480 91.330 154.000 97.380 163.200 C 104.590 174.200 115.180 180.000 128.000 180.000 C 140.820 180.000 151.410 174.190 158.620 163.200 C 164.620 153.980 168.000 141.480 168.000 128.000 C 168.000 114.520 164.670 102.000 158.620 92.810 C 151.410 81.810 140.820 76.000 128.000 76.000 ZM 128.000 172.000 C 105.890 172.000 96.000 149.900 96.000 128.000 C 96.000 106.100 105.890 84.000 128.000 84.000 C 150.110 84.000 160.000 106.100 160.000 128.000 C 160.000 149.900 150.110 172.000 128.000 172.000 Z"),
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
        return _numberCircleZero!!
    }

private var _numberCircleZero: ImageVector? = null
