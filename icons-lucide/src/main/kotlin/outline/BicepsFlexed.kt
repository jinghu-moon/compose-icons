package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BicepsFlexed: ImageVector
    get() {
        if (_bicepsFlexed != null) return _bicepsFlexed!!
        _bicepsFlexed = lucideOutlineIcon(
            name = "BicepsFlexed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.409 13.017 C 13.349 10.839 15.689 9.621 18.012 10.101 C 20.335 10.581 22.001 12.628 22.000 15.000 C 22.000 18.866 18.000 22.000 13.000 22.000 C 8.923 22.000 4.847 21.180 2.629 19.538 C 2.203 19.222 1.998 18.706 2.009 18.176 C 2.118 12.723 2.627 2.000 10.000 2.000 C 11.657 2.000 13.000 3.343 13.000 5.000 C 13.000 6.105 12.105 7.000 11.000 7.000 C 9.895 7.000 9.360 6.556 9.000 6.000"),
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
                pathData = parseSvgPathData("M 15.000 14.000 C 13.777 13.082 12.202 12.775 10.724 13.164 C 9.246 13.554 8.027 14.599 7.416 16.000"),
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
                pathData = parseSvgPathData("M 9.964 6.825 C 8.019 7.977 9.500 13.000 8.000 15.000"),
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
        return _bicepsFlexed!!
    }

private var _bicepsFlexed: ImageVector? = null
