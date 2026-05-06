package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberOne: ImageVector
    get() {
        if (_numberOne != null) return _numberOne!!
        _numberOne = phosphorRegularIcon(
            name = "NumberOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 48v160c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-145.87L100.12 78.86c-3.789 2.275-8.705 1.049-10.98-2.74C86.865 72.331 88.091 67.415 91.88 65.14l40-24c2.472-1.485 5.551-1.525 8.061-.105 2.509 1.42 4.06 4.081 4.059 6.965Z"),
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
