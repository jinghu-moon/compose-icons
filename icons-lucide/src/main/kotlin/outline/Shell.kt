package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shell: ImageVector
    get() {
        if (_shell != null) return _shell!!
        _shell = lucideOutlineIcon(
            name = "Shell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 11.000 C 14.000 12.105 13.105 13.000 12.000 13.000 C 10.895 13.000 10.000 12.105 10.000 11.000 C 10.000 8.791 11.791 7.000 14.000 7.000 C 16.209 7.000 18.000 8.791 18.000 11.000 C 18.000 14.314 15.314 17.000 12.000 17.000 C 8.686 17.000 6.000 14.314 6.000 11.000 C 6.000 6.582 9.582 3.000 14.000 3.000 C 18.418 3.000 22.000 6.582 22.000 11.000 C 22.000 16.523 17.523 21.000 12.000 21.000 C 6.477 21.000 2.000 16.523 2.000 11.000 C 1.996 8.394 2.846 5.858 4.420 3.780 C 4.838 3.164 5.562 2.831 6.302 2.915 C 7.041 2.999 7.672 3.487 7.941 4.181 C 8.209 4.875 8.070 5.660 7.580 6.220"),
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
        return _shell!!
    }

private var _shell: ImageVector? = null
