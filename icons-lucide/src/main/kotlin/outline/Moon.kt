package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = lucideOutlineIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.985 12.486 C 20.724 17.323 16.680 21.086 11.837 20.999 C 6.993 20.913 3.087 17.007 3.000 12.163 C 2.912 7.320 6.675 3.276 11.512 3.014 C 11.917 2.992 12.129 3.474 11.914 3.817 C 10.433 6.186 10.784 9.264 12.759 11.240 C 14.735 13.215 17.813 13.566 20.182 12.085 C 20.526 11.870 21.007 12.081 20.985 12.486"),
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
        return _moon!!
    }

private var _moon: ImageVector? = null
