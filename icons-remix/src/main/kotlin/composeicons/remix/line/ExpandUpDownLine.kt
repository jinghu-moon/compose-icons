package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandUpDownLine: ImageVector
    get() {
        if (_expandUpDownLine != null) return _expandUpDownLine!!
        _expandUpDownLine = remixIcon(
            name = "ExpandUpDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.207 9.043 12 2.836 5.793 9.043l1.414 1.414L12 5.664l4.793 4.793L18.207 9.043ZM5.793 14.957 12 21.164l6.207-6.207L16.793 13.543 12 18.336 7.207 13.543 5.793 14.957Z"),
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
        return _expandUpDownLine!!
    }

private var _expandUpDownLine: ImageVector? = null
