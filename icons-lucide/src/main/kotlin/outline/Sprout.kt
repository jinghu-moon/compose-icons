package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sprout: ImageVector
    get() {
        if (_sprout != null) return _sprout!!
        _sprout = lucideOutlineIcon(
            name = "Sprout",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 9.536 L 14.000 7.000 C 14.000 4.791 15.791 3.000 18.000 3.000 L 19.500 3.000 C 19.776 3.000 20.000 3.224 20.000 3.500 L 20.000 5.000 C 20.000 7.209 18.209 9.000 16.000 9.000 C 13.791 9.000 12.000 10.791 12.000 13.000 C 12.000 15.000 13.000 16.000 13.000 18.000 C 13.000 19.082 12.649 20.135 12.000 21.000"),
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
        pathData = parseSvgPathData("M 4.000 9.000 C 5.515 7.864 7.542 7.681 9.236 8.528 C 10.930 9.375 12.000 11.106 12.000 13.000 C 10.485 14.136 8.458 14.319 6.764 13.472 C 5.070 12.625 4.000 10.894 4.000 9.000"),
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
        pathData = parseSvgPathData("M 5.000 21.000 L 19.000 21.000"),
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
        return _sprout!!
    }

private var _sprout: ImageVector? = null
