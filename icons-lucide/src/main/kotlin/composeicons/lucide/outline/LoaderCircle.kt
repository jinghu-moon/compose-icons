package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LoaderCircle: ImageVector
    get() {
        if (_loaderCircle != null) return _loaderCircle!!
        _loaderCircle = lucideOutlineIcon(
            name = "LoaderCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 12c-0 3.899-2.511 7.354-6.219 8.559C11.073 21.764 7.01 20.444 4.719 17.29 2.427 14.135 2.427 9.864 4.719 6.709 7.011 3.555 11.073 2.235 14.781 3.44"),
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
        return _loaderCircle!!
    }

private var _loaderCircle: ImageVector? = null
