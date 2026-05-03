package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) return _numberSquareZero!!
        _numberSquareZero = phosphorRegularIcon(
            name = "NumberSquareZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 72.000 C 113.770 72.000 102.000 78.440 94.000 90.610 C 87.530 100.470 84.000 113.750 84.000 128.000 C 84.000 142.250 87.560 155.530 94.000 165.390 C 102.000 177.560 113.740 184.000 128.000 184.000 C 142.260 184.000 154.000 177.560 162.000 165.390 C 168.470 155.530 172.000 142.250 172.000 128.000 C 172.000 113.750 168.440 100.470 162.000 90.610 C 154.000 78.440 142.230 72.000 128.000 72.000 ZM 128.000 168.000 C 105.900 168.000 100.000 142.860 100.000 128.000 C 100.000 113.140 105.900 88.000 128.000 88.000 C 150.100 88.000 156.000 113.140 156.000 128.000 C 156.000 142.860 150.100 168.000 128.000 168.000 ZM 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 48.000 L 208.000 48.000 L 208.000 208.000 Z"),
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
