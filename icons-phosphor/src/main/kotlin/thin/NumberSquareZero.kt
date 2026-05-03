package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) return _numberSquareZero!!
        _numberSquareZero = phosphorThinIcon(
            name = "NumberSquareZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 76.000 C 115.180 76.000 104.590 81.810 97.380 92.810 C 91.330 102.000 88.000 114.520 88.000 128.000 C 88.000 141.480 91.330 154.000 97.380 163.200 C 104.590 174.200 115.180 180.000 128.000 180.000 C 140.820 180.000 151.410 174.190 158.620 163.200 C 164.620 153.980 168.000 141.480 168.000 128.000 C 168.000 114.520 164.670 102.000 158.620 92.810 C 151.410 81.810 140.820 76.000 128.000 76.000 ZM 128.000 172.000 C 105.890 172.000 96.000 149.900 96.000 128.000 C 96.000 106.100 105.890 84.000 128.000 84.000 C 150.110 84.000 160.000 106.100 160.000 128.000 C 160.000 149.900 150.110 172.000 128.000 172.000 ZM 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 Z"),
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
        return _numberSquareZero!!
    }

private var _numberSquareZero: ImageVector? = null
