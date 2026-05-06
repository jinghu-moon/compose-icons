package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberOne: ImageVector
    get() {
        if (_numberOne != null) return _numberOne!!
        _numberOne = phosphorBoldIcon(
            name = "NumberOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 48v160c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-138.81L102.17 82.29C96.499 85.553 89.259 83.671 85.894 78.06 82.53 72.448 84.28 65.176 89.83 61.71l40-24c3.707-2.222 8.323-2.279 12.083-.15 3.761 2.13 6.086 6.118 6.087 10.44Z"),
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
        return _numberOne!!
    }

private var _numberOne: ImageVector? = null
