package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberFour: ImageVector
    get() {
        if (_numberFour != null) return _numberFour!!
        _numberFour = phosphorThinIcon(
            name = "NumberFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 164h-20v-116c-.001-1.697-1.074-3.209-2.675-3.771-1.601-.562-3.383-.053-4.445 1.271l-96 120c-.961 1.2-1.149 2.845-.484 4.231 .665 1.386 2.066 2.268 3.604 2.269h92v36c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-36h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM156 164h-83.68L156 59.4Z"),
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
        return _numberFour!!
    }

private var _numberFour: ImageVector? = null
