package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareSeven: ImageVector
    get() {
        if (_numberSquareSeven != null) return _numberSquareSeven!!
        _numberSquareSeven = phosphorLightIcon(
            name = "NumberSquareSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 156.910 84.560 C 158.034 86.162 158.306 88.210 157.640 90.050 L 125.640 178.050 C 124.778 180.422 122.524 182.000 120.000 182.000 C 119.318 181.992 118.642 181.870 118.000 181.640 C 116.504 181.097 115.285 179.981 114.612 178.539 C 113.939 177.096 113.866 175.446 114.410 173.950 L 143.430 94.000 L 104.000 94.000 C 100.686 94.000 98.000 91.314 98.000 88.000 C 98.000 84.686 100.686 82.000 104.000 82.000 L 152.000 82.000 C 153.956 82.002 155.788 82.957 156.910 84.560 Z"),
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
        return _numberSquareSeven!!
    }

private var _numberSquareSeven: ImageVector? = null
