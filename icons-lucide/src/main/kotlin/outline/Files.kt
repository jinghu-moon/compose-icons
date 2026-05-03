package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = lucideOutlineIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 2.000 L 11.000 2.000 C 9.895 2.000 9.000 2.895 9.000 4.000 L 9.000 15.000 C 9.000 16.105 9.895 17.000 11.000 17.000 L 19.000 17.000 C 20.105 17.000 21.000 16.105 21.000 15.000 L 21.000 8.000"),
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
        pathData = parseSvgPathData("M 16.706 2.706 C 16.254 2.253 15.640 1.998 15.000 2.000 L 15.000 7.000 C 15.000 7.552 15.448 8.000 16.000 8.000 L 21.000 8.000 C 21.002 7.360 20.747 6.746 20.294 6.294 Z"),
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
        pathData = parseSvgPathData("M 5.000 7.000 C 3.895 7.000 3.000 7.895 3.000 9.000 L 3.000 20.000 C 3.000 21.105 3.895 22.000 5.000 22.000 L 13.000 22.000 C 13.715 22.000 14.375 21.619 14.732 21.000"),
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
        return _files!!
    }

private var _files: ImageVector? = null
