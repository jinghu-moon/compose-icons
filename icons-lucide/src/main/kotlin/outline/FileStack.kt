package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileStack: ImageVector
    get() {
        if (_fileStack != null) return _fileStack!!
        _fileStack = lucideOutlineIcon(
            name = "FileStack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 21.000 C 11.000 21.552 10.552 22.000 10.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 13.000 C 3.000 12.448 3.448 12.000 4.000 12.000"),
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
        pathData = parseSvgPathData("M 16.000 16.000 C 16.000 16.552 15.552 17.000 15.000 17.000 L 9.000 17.000 C 8.448 17.000 8.000 16.552 8.000 16.000 L 8.000 8.000 C 8.000 7.448 8.448 7.000 9.000 7.000"),
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
        pathData = parseSvgPathData("M 21.000 6.000 C 21.000 5.470 20.789 4.961 20.414 4.586 L 18.414 2.586 C 18.039 2.211 17.530 2.000 17.000 2.000 L 14.000 2.000 C 13.448 2.000 13.000 2.448 13.000 3.000 L 13.000 11.000 C 13.000 11.552 13.448 12.000 14.000 12.000 L 20.000 12.000 C 20.552 12.000 21.000 11.552 21.000 11.000 Z"),
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
        return _fileStack!!
    }

private var _fileStack: ImageVector? = null
