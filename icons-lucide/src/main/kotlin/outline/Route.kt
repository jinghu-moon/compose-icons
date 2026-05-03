package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Route: ImageVector
    get() {
        if (_route != null) return _route!!
        _route = lucideOutlineIcon(
            name = "Route",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 19.000 C 9.000 20.657 7.657 22.000 6.000 22.000 C 4.343 22.000 3.000 20.657 3.000 19.000 C 3.000 17.343 4.343 16.000 6.000 16.000 C 7.657 16.000 9.000 17.343 9.000 19.000 Z"),
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
                pathData = parseSvgPathData("M 9.000 19.000 L 17.500 19.000 C 19.433 19.000 21.000 17.433 21.000 15.500 C 21.000 13.567 19.433 12.000 17.500 12.000 L 6.500 12.000 C 4.567 12.000 3.000 10.433 3.000 8.500 C 3.000 6.567 4.567 5.000 6.500 5.000 L 15.000 5.000"),
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
                pathData = parseSvgPathData("M 21.000 5.000 C 21.000 6.657 19.657 8.000 18.000 8.000 C 16.343 8.000 15.000 6.657 15.000 5.000 C 15.000 3.343 16.343 2.000 18.000 2.000 C 19.657 2.000 21.000 3.343 21.000 5.000 Z"),
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
        return _route!!
    }

private var _route: ImageVector? = null
