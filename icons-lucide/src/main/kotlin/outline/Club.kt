package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Club: ImageVector
    get() {
        if (_club != null) return _club!!
        _club = lucideOutlineIcon(
            name = "Club",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.280 9.050 C 17.936 6.802 17.096 4.385 15.188 3.028 C 13.279 1.671 10.721 1.671 8.812 3.028 C 6.904 4.385 6.064 6.802 6.720 9.050 C 4.236 9.407 2.309 11.400 2.035 13.894 C 1.762 16.389 3.211 18.752 5.558 19.639 C 7.906 20.526 10.556 19.712 12.000 17.660 C 13.441 19.718 16.093 20.538 18.444 19.652 C 20.794 18.767 22.247 16.402 21.972 13.905 C 21.698 11.408 19.767 9.414 17.280 9.060 Z"),
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
                pathData = parseSvgPathData("M 12.000 17.660 L 12.000 22.000"),
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
        return _club!!
    }

private var _club: ImageVector? = null
