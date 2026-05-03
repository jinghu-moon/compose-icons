package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileBadge: ImageVector
    get() {
        if (_fileBadge != null) return _fileBadge!!
        _fileBadge = lucideOutlineIcon(
            name = "FileBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 22.000 L 18.000 22.000 C 19.105 22.000 20.000 21.105 20.000 20.000 L 20.000 8.000 C 20.002 7.360 19.747 6.746 19.294 6.294 L 15.706 2.706 C 15.254 2.253 14.640 1.998 14.000 2.000 L 6.000 2.000 C 4.895 2.000 4.000 2.895 4.000 4.000 L 4.000 7.300"),
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
        pathData = parseSvgPathData("M 14.000 2.000 L 14.000 7.000 C 14.000 7.552 14.448 8.000 15.000 8.000 L 20.000 8.000"),
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
        pathData = parseSvgPathData("M 7.690 16.479 L 8.980 21.359 C 9.036 21.549 8.975 21.754 8.823 21.882 C 8.672 22.010 8.460 22.036 8.282 21.950 L 6.439 21.101 C 6.162 20.966 5.837 20.966 5.560 21.102 L 3.714 21.952 C 3.536 22.035 3.326 22.007 3.177 21.879 C 3.027 21.751 2.967 21.548 3.022 21.359 L 4.312 16.479"),
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
        pathData = parseSvgPathData("M 9.000 14.000 C 9.000 15.657 7.657 17.000 6.000 17.000 C 4.343 17.000 3.000 15.657 3.000 14.000 C 3.000 12.343 4.343 11.000 6.000 11.000 C 7.657 11.000 9.000 12.343 9.000 14.000 Z"),
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
        return _fileBadge!!
    }

private var _fileBadge: ImageVector? = null
