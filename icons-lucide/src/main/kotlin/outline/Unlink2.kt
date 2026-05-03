package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Unlink2: ImageVector
    get() {
        if (_unlink2 != null) return _unlink2!!
        _unlink2 = lucideOutlineIcon(
            name = "Unlink2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 7.000 L 17.000 7.000 C 19.761 7.000 22.000 9.239 22.000 12.000 C 22.000 14.761 19.761 17.000 17.000 17.000 L 15.000 17.000M 9.000 17.000 L 7.000 17.000 C 4.239 17.000 2.000 14.761 2.000 12.000 C 2.000 9.239 4.239 7.000 7.000 7.000 L 9.000 7.000"),
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
        return _unlink2!!
    }

private var _unlink2: ImageVector? = null
