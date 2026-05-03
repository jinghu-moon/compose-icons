package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.KeyRound: ImageVector
    get() {
        if (_keyRound != null) return _keyRound!!
        _keyRound = lucideOutlineIcon(
            name = "KeyRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.586 17.414 C 2.211 17.789 2.000 18.298 2.000 18.828 L 2.000 21.000 C 2.000 21.552 2.448 22.000 3.000 22.000 L 6.000 22.000 C 6.552 22.000 7.000 21.552 7.000 21.000 L 7.000 20.000 C 7.000 19.448 7.448 19.000 8.000 19.000 L 9.000 19.000 C 9.552 19.000 10.000 18.552 10.000 18.000 L 10.000 17.000 C 10.000 16.448 10.448 16.000 11.000 16.000 L 11.172 16.000 C 11.702 16.000 12.211 15.789 12.586 15.414 L 13.400 14.600 C 16.262 15.597 19.434 14.484 21.044 11.916 C 22.655 9.349 22.278 6.009 20.134 3.866 C 17.991 1.722 14.651 1.345 12.084 2.956 C 9.516 4.566 8.403 7.738 9.400 10.600 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 17.000 7.500 C 17.000 7.776 16.776 8.000 16.500 8.000 C 16.224 8.000 16.000 7.776 16.000 7.500 C 16.000 7.224 16.224 7.000 16.500 7.000 C 16.776 7.000 17.000 7.224 17.000 7.500 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _keyRound!!
    }

private var _keyRound: ImageVector? = null
