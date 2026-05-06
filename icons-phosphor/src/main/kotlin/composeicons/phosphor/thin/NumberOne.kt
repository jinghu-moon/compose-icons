package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberOne: ImageVector
    get() {
        if (_numberOne != null) return _numberOne!!
        _numberOne = phosphorThinIcon(
            name = "NumberOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 48v160c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-152.94L98.06 75.43c-1.894 1.138-4.352 .524-5.49-1.37-1.138-1.894-.524-4.352 1.37-5.49l40-24c1.236-.742 2.776-.762 4.03-.052 1.255 .71 2.03 2.041 2.03 3.482Z"),
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
