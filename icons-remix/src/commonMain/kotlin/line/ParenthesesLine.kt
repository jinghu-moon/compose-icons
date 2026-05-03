package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ParenthesesLine: ImageVector
    get() {
        if (_parenthesesLine != null) return _parenthesesLine!!
        _parenthesesLine = remixIcon(
            name = "ParenthesesLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.923 21.000 C 5.113 18.664 4.000 15.493 4.000 12.000 C 4.000 8.507 5.113 5.336 6.923 3.000 L 8.937 3.000 C 7.235 5.388 6.200 8.542 6.200 12.000 C 6.200 15.458 7.235 18.612 8.937 21.000 L 6.923 21.000 ZM 17.074 21.000 L 15.060 21.000 C 16.762 18.612 17.797 15.458 17.797 12.000 C 17.797 8.542 16.762 5.388 15.060 3.000 L 17.074 3.000 C 18.885 5.336 19.997 8.507 19.997 12.000 C 19.997 15.493 18.885 18.664 17.074 21.000 Z"),
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
        return _parenthesesLine!!
    }

private var _parenthesesLine: ImageVector? = null
