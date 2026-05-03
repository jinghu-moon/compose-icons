package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Store: ImageVector
    get() {
        if (_store != null) return _store!!
        _store = lucideOutlineIcon(
            name = "Store",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 21.000 L 15.000 16.000 C 15.000 15.448 14.552 15.000 14.000 15.000 L 10.000 15.000 C 9.448 15.000 9.000 15.448 9.000 16.000 L 9.000 21.000"),
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
                pathData = parseSvgPathData("M 17.774 10.310 C 17.341 9.895 16.658 9.895 16.225 10.310 C 15.259 11.231 13.740 11.231 12.774 10.310 C 12.341 9.896 11.659 9.896 11.226 10.310 C 10.260 11.232 8.740 11.232 7.774 10.310 C 7.341 9.895 6.658 9.895 6.225 10.310 C 5.294 11.198 3.842 11.235 2.867 10.395 C 1.893 9.556 1.714 8.114 2.455 7.062 L 5.344 2.878 C 5.716 2.329 6.337 2.000 7.000 2.000 L 17.000 2.000 C 17.661 2.000 18.280 2.327 18.653 2.873 L 21.548 7.065 C 22.289 8.118 22.109 9.561 21.133 10.400 C 20.157 11.239 18.703 11.199 17.774 10.309"),
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
                pathData = parseSvgPathData("M 4.000 10.950 L 4.000 19.000 C 4.000 20.105 4.895 21.000 6.000 21.000 L 18.000 21.000 C 19.105 21.000 20.000 20.105 20.000 19.000 L 20.000 10.950"),
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
        return _store!!
    }

private var _store: ImageVector? = null
