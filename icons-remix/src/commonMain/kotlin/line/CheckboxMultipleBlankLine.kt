package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CheckboxMultipleBlankLine: ImageVector
    get() {
        if (_checkboxMultipleBlankLine != null) return _checkboxMultipleBlankLine!!
        _checkboxMultipleBlankLine = remixIcon(
            name = "CheckboxMultipleBlankLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 7.000 L 7.000 3.000 C 7.000 2.448 7.448 2.000 8.000 2.000 L 21.000 2.000 C 21.552 2.000 22.000 2.448 22.000 3.000 L 22.000 16.000 C 22.000 16.552 21.552 17.000 21.000 17.000 L 17.000 17.000 L 17.000 20.993 C 17.000 21.549 16.551 22.000 15.993 22.000 L 3.007 22.000 C 2.451 22.000 2.000 21.551 2.000 20.993 L 2.003 8.007 C 2.003 7.451 2.452 7.000 3.010 7.000 L 7.000 7.000 ZM 9.000 7.000 L 15.993 7.000 C 16.549 7.000 17.000 7.449 17.000 8.007 L 17.000 15.000 L 20.000 15.000 L 20.000 4.000 L 9.000 4.000 L 9.000 7.000 ZM 4.003 9.000 L 4.000 20.000 L 15.000 20.000 L 15.000 9.000 L 4.003 9.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _checkboxMultipleBlankLine!!
    }

private var _checkboxMultipleBlankLine: ImageVector? = null
