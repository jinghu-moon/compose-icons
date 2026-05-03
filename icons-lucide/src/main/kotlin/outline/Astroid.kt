package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Astroid: ImageVector
    get() {
        if (_astroid != null) return _astroid!!
        _astroid = lucideOutlineIcon(
            name = "Astroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.983 21.186 C 12.895 21.659 12.481 22.002 12.000 22.002 C 11.519 22.002 11.105 21.659 11.017 21.186 C 10.310 16.983 7.017 13.690 2.814 12.983 C 2.341 12.895 1.998 12.481 1.998 12.000 C 1.998 11.519 2.341 11.105 2.814 11.017 C 7.017 10.310 10.310 7.017 11.017 2.814 C 11.105 2.341 11.519 1.998 12.000 1.998 C 12.481 1.998 12.895 2.341 12.983 2.814 C 13.690 7.017 16.983 10.310 21.186 11.017 C 21.659 11.105 22.002 11.519 22.002 12.000 C 22.002 12.481 21.659 12.895 21.186 12.983 C 16.983 13.690 13.690 16.983 12.983 21.186"),
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
        return _astroid!!
    }

private var _astroid: ImageVector? = null
