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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 12.000 C 21.000 15.899 18.489 19.354 14.781 20.559 C 11.073 21.764 7.010 20.444 4.719 17.290 C 2.427 14.135 2.427 9.864 4.719 6.709 C 7.011 3.555 11.073 2.235 14.781 3.440"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _loaderCircle!!
    }

private var _loaderCircle: ImageVector? = null
