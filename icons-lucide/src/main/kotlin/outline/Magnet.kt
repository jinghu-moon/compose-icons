package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = lucideOutlineIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 15.000 L 16.000 19.000"),
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
        pathData = parseSvgPathData("M 2.352 10.648 C 1.882 11.119 1.882 11.881 2.352 12.352 L 4.648 14.648 C 5.119 15.118 5.881 15.118 6.352 14.648 L 12.381 8.619 C 13.209 7.791 14.553 7.791 15.381 8.619 C 16.209 9.447 16.209 10.791 15.381 11.619 L 9.352 17.648 C 8.882 18.119 8.882 18.881 9.352 19.352 L 11.648 21.648 C 12.119 22.118 12.881 22.118 13.352 21.648 L 19.717 15.281 C 22.754 12.243 22.754 7.318 19.716 4.281 C 16.678 1.244 11.753 1.244 8.716 4.282 Z"),
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
        pathData = parseSvgPathData("M 5.000 8.000 L 9.000 12.000"),
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
        return _magnet!!
    }

private var _magnet: ImageVector? = null
