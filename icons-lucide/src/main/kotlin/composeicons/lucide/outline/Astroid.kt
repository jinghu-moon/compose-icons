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
                pathData = parseSvgPathData("M12.983 21.186c-.088 .473-.502 .816-.983 .816-.481 0-.895-.343-.983-.816C10.31 16.983 7.017 13.69 2.814 12.983 2.341 12.895 1.998 12.481 1.998 12c0-.481 .343-.895 .816-.983 4.203-.707 7.496-4 8.203-8.203 .088-.473 .502-.816 .983-.816 .481 0 .895 .343 .983 .816 .707 4.203 4 7.496 8.203 8.203 .473 .088 .816 .502 .816 .983 0 .481-.343 .895-.816 .983-4.203 .707-7.496 4-8.203 8.203"),
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
