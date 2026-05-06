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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.586 17.414c-.375 .375-.586 .884-.586 1.414v2.172c0 .552 .448 1 1 1h3c.552 0 1-.448 1-1v-1c0-.552 .448-1 1-1h1c.552 0 1-.448 1-1v-1c0-.552 .448-1 1-1h.172c.53-0 1.039-.211 1.414-.586l.814-.814c2.862 .997 6.034-.116 7.644-2.684C22.655 9.349 22.278 6.009 20.134 3.866 17.991 1.722 14.651 1.345 12.084 2.956 9.516 4.566 8.403 7.738 9.4 10.6Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M17 7.5C17 7.776 16.776 8 16.5 8 16.224 8 16 7.776 16 7.5 16 7.224 16.224 7 16.5 7c.276 0 .5 .224 .5 .5Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _keyRound!!
    }

private var _keyRound: ImageVector? = null
