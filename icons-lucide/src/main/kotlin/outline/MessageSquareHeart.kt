package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageSquareHeart: ImageVector
    get() {
        if (_messageSquareHeart != null) return _messageSquareHeart!!
        _messageSquareHeart = lucideOutlineIcon(
            name = "MessageSquareHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 17.000 C 22.000 18.105 21.105 19.000 20.000 19.000 L 6.828 19.000 C 6.298 19.000 5.789 19.211 5.414 19.586 L 3.212 21.788 C 3.009 21.991 2.704 22.052 2.438 21.942 C 2.173 21.832 2.000 21.573 2.000 21.286 L 2.000 5.000 C 2.000 3.895 2.895 3.000 4.000 3.000 L 20.000 3.000 C 21.105 3.000 22.000 3.895 22.000 5.000 Z"),
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
                pathData = parseSvgPathData("M 7.500 9.500 C 7.500 10.187 7.765 10.883 8.197 11.344 L 11.206 14.608 C 11.316 14.742 11.455 14.850 11.613 14.922 C 11.864 15.027 12.146 15.026 12.396 14.918 C 12.550 14.846 12.686 14.740 12.794 14.608 L 15.802 11.344 C 16.253 10.836 16.501 10.179 16.500 9.500 C 16.500 8.424 15.811 7.469 14.791 7.128 C 13.770 6.788 12.646 7.139 12.000 8.000 C 11.354 7.139 10.230 6.788 9.209 7.128 C 8.189 7.469 7.500 8.424 7.500 9.500"),
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
        return _messageSquareHeart!!
    }

private var _messageSquareHeart: ImageVector? = null
