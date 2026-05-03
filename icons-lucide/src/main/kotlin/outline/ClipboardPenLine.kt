package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClipboardPenLine: ImageVector
    get() {
        if (_clipboardPenLine != null) return _clipboardPenLine!!
        _clipboardPenLine = lucideOutlineIcon(
            name = "ClipboardPenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 2.000 L 15.000 2.000 C 15.552 2.000 16.000 2.448 16.000 3.000 L 16.000 5.000 C 16.000 5.552 15.552 6.000 15.000 6.000 L 9.000 6.000 C 8.448 6.000 8.000 5.552 8.000 5.000 L 8.000 3.000 C 8.000 2.448 8.448 2.000 9.000 2.000 Z"),
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
        pathData = parseSvgPathData("M 8.000 4.000 L 6.000 4.000 C 4.895 4.000 4.000 4.895 4.000 6.000 L 4.000 20.000 C 4.000 21.105 4.895 22.000 6.000 22.000 L 18.000 22.000 C 19.105 22.000 20.000 21.105 20.000 20.000 L 20.000 19.500"),
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
        pathData = parseSvgPathData("M 16.000 4.000 L 18.000 4.000 C 18.714 4.001 19.373 4.382 19.730 5.000"),
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
        pathData = parseSvgPathData("M 8.000 18.000 L 9.000 18.000"),
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
        pathData = parseSvgPathData("M 21.378 12.626 C 22.208 11.796 22.208 10.452 21.378 9.622 C 20.548 8.792 19.204 8.792 18.374 9.622 L 14.364 13.634 C 14.126 13.872 13.952 14.165 13.858 14.488 L 13.021 17.358 C 12.970 17.533 13.018 17.722 13.147 17.852 C 13.277 17.981 13.466 18.029 13.641 17.978 L 16.511 17.141 C 16.834 17.047 17.127 16.873 17.365 16.635 Z"),
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
        return _clipboardPenLine!!
    }

private var _clipboardPenLine: ImageVector? = null
