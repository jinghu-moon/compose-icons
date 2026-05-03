package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Omega: ImageVector
    get() {
        if (_omega != null) return _omega!!
        _omega = lucideOutlineIcon(
            name = "Omega",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 20.000 L 7.500 20.000 C 7.776 20.000 8.000 19.776 8.000 19.500 L 8.000 19.218 C 7.998 19.040 7.905 18.875 7.753 18.781 C 4.730 16.888 3.325 13.221 4.310 9.792 C 5.295 6.364 8.431 4.001 11.998 4.001 C 15.566 4.000 18.702 6.362 19.688 9.791 C 20.673 13.219 19.270 16.886 16.247 18.780 C 16.095 18.874 16.002 19.039 16.000 19.218 L 16.000 19.500 C 16.000 19.776 16.224 20.000 16.500 20.000 L 21.000 20.000"),
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
        return _omega!!
    }

private var _omega: ImageVector? = null
