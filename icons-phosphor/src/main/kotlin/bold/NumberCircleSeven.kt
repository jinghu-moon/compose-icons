package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleSeven: ImageVector
    get() {
        if (_numberCircleSeven != null) return _numberCircleSeven!!
        _numberCircleSeven = phosphorBoldIcon(
            name = "NumberCircleSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 161.830 81.120 C 164.081 84.330 164.623 88.437 163.280 92.120 L 131.280 180.120 C 129.016 186.350 122.130 189.564 115.900 187.300 C 109.670 185.036 106.456 178.150 108.720 171.920 L 134.870 100.000 L 104.000 100.000 C 97.373 100.000 92.000 94.627 92.000 88.000 C 92.000 81.373 97.373 76.000 104.000 76.000 L 152.000 76.000 C 155.916 76.001 159.585 77.912 161.830 81.120 Z"),
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
        return _numberCircleSeven!!
    }

private var _numberCircleSeven: ImageVector? = null
