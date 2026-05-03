package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Lollipop: ImageVector
    get() {
        if (_lollipop != null) return _lollipop!!
        _lollipop = lucideOutlineIcon(
            name = "Lollipop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 11.000 C 19.000 15.418 15.418 19.000 11.000 19.000 C 6.582 19.000 3.000 15.418 3.000 11.000 C 3.000 6.582 6.582 3.000 11.000 3.000 C 15.418 3.000 19.000 6.582 19.000 11.000 Z"),
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
        pathData = parseSvgPathData("M 21.000 21.000 L 16.700 16.700"),
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
        pathData = parseSvgPathData("M 11.000 11.000 C 11.000 12.105 11.895 13.000 13.000 13.000 C 14.105 13.000 15.000 12.105 15.000 11.000 C 15.000 8.791 13.209 7.000 11.000 7.000 C 8.791 7.000 7.000 8.791 7.000 11.000 C 7.000 14.314 9.686 17.000 13.000 17.000 C 16.314 17.000 19.000 14.314 19.000 11.000"),
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
        return _lollipop!!
    }

private var _lollipop: ImageVector? = null
