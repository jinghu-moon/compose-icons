package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LayoutGrid: ImageVector
    get() {
        if (_layoutGrid != null) return _layoutGrid!!
        _layoutGrid = lucideOutlineIcon(
            name = "LayoutGrid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 3.000 L 9.000 3.000 C 9.552 3.000 10.000 3.448 10.000 4.000 L 10.000 9.000 C 10.000 9.552 9.552 10.000 9.000 10.000 L 4.000 10.000 C 3.448 10.000 3.000 9.552 3.000 9.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 Z"),
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
        pathData = parseSvgPathData("M 15.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 9.000 C 21.000 9.552 20.552 10.000 20.000 10.000 L 15.000 10.000 C 14.448 10.000 14.000 9.552 14.000 9.000 L 14.000 4.000 C 14.000 3.448 14.448 3.000 15.000 3.000 Z"),
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
        pathData = parseSvgPathData("M 15.000 14.000 L 20.000 14.000 C 20.552 14.000 21.000 14.448 21.000 15.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 15.000 21.000 C 14.448 21.000 14.000 20.552 14.000 20.000 L 14.000 15.000 C 14.000 14.448 14.448 14.000 15.000 14.000 Z"),
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
        pathData = parseSvgPathData("M 4.000 14.000 L 9.000 14.000 C 9.552 14.000 10.000 14.448 10.000 15.000 L 10.000 20.000 C 10.000 20.552 9.552 21.000 9.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 15.000 C 3.000 14.448 3.448 14.000 4.000 14.000 Z"),
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
        return _layoutGrid!!
    }

private var _layoutGrid: ImageVector? = null
