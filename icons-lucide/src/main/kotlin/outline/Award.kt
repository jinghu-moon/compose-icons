package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Award: ImageVector
    get() {
        if (_award != null) return _award!!
        _award = lucideOutlineIcon(
            name = "Award",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.477 12.890 L 16.992 21.416 C 17.027 21.622 16.930 21.827 16.750 21.932 C 16.570 22.036 16.343 22.018 16.182 21.886 L 12.602 19.199 C 12.247 18.934 11.760 18.934 11.405 19.199 L 7.819 21.885 C 7.658 22.017 7.432 22.035 7.252 21.931 C 7.071 21.827 6.975 21.621 7.009 21.416 L 8.523 12.890"),
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
                pathData = parseSvgPathData("M 18.000 8.000 C 18.000 11.314 15.314 14.000 12.000 14.000 C 8.686 14.000 6.000 11.314 6.000 8.000 C 6.000 4.686 8.686 2.000 12.000 2.000 C 15.314 2.000 18.000 4.686 18.000 8.000 Z"),
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
        return _award!!
    }

private var _award: ImageVector? = null
