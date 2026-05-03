package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PenTool: ImageVector
    get() {
        if (_penTool != null) return _penTool!!
        _penTool = lucideOutlineIcon(
            name = "PenTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.707 21.293 C 15.316 21.683 14.684 21.683 14.293 21.293 L 12.707 19.707 C 12.317 19.316 12.317 18.684 12.707 18.293 L 18.293 12.707 C 18.684 12.317 19.316 12.317 19.707 12.707 L 21.293 14.293 C 21.683 14.684 21.683 15.316 21.293 15.707 Z"),
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
        pathData = parseSvgPathData("M 18.000 13.000 L 16.625 6.126 C 16.549 5.744 16.258 5.441 15.879 5.350 L 3.235 2.028 C 2.896 1.946 2.539 2.046 2.293 2.293 C 2.046 2.539 1.946 2.896 2.028 3.235 L 5.350 15.879 C 5.441 16.258 5.744 16.549 6.126 16.625 L 13.000 18.000"),
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
        pathData = parseSvgPathData("M 2.300 2.300 L 9.586 9.586"),
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
        pathData = parseSvgPathData("M 13.000 11.000 C 13.000 12.105 12.105 13.000 11.000 13.000 C 9.895 13.000 9.000 12.105 9.000 11.000 C 9.000 9.895 9.895 9.000 11.000 9.000 C 12.105 9.000 13.000 9.895 13.000 11.000 Z"),
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
        return _penTool!!
    }

private var _penTool: ImageVector? = null
