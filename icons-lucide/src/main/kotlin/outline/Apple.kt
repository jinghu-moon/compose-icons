package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Apple: ImageVector
    get() {
        if (_apple != null) return _apple!!
        _apple = lucideOutlineIcon(
            name = "Apple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 6.528 L 12.000 3.000 C 12.000 2.448 12.448 2.000 13.000 2.000 L 13.000 2.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 18.237 21.000 C 20.676 18.242 22.016 14.682 22.000 11.000 C 22.000 8.634 20.609 6.489 18.449 5.523 C 16.289 4.557 13.764 4.951 12.000 6.528 C 10.236 4.951 7.711 4.557 5.551 5.523 C 3.391 6.489 2.000 8.634 2.000 11.000 C 1.994 14.681 3.332 18.237 5.763 21.000 C 6.684 22.031 8.191 22.298 9.411 21.648 C 11.029 20.785 12.971 20.785 14.589 21.648 C 15.809 22.298 17.316 22.031 18.237 21.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _apple!!
    }

private var _apple: ImageVector? = null
