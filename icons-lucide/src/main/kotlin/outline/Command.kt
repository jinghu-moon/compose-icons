package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = lucideOutlineIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 6.000 L 15.000 18.000 C 15.000 19.657 16.343 21.000 18.000 21.000 C 19.657 21.000 21.000 19.657 21.000 18.000 C 21.000 16.343 19.657 15.000 18.000 15.000 L 6.000 15.000 C 4.343 15.000 3.000 16.343 3.000 18.000 C 3.000 19.657 4.343 21.000 6.000 21.000 C 7.657 21.000 9.000 19.657 9.000 18.000 L 9.000 6.000 C 9.000 4.343 7.657 3.000 6.000 3.000 C 4.343 3.000 3.000 4.343 3.000 6.000 C 3.000 7.657 4.343 9.000 6.000 9.000 L 18.000 9.000 C 19.657 9.000 21.000 7.657 21.000 6.000 C 21.000 4.343 19.657 3.000 18.000 3.000 C 16.343 3.000 15.000 4.343 15.000 6.000"),
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
        return _command!!
    }

private var _command: ImageVector? = null
