package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DropLine: ImageVector
    get() {
        if (_dropLine != null) return _dropLine!!
        _dropLine = remixIcon(
            name = "DropLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3.097 7.05 8.047c-2.734 2.734-2.734 7.166 0 9.9 2.734 2.734 7.166 2.734 9.899 0 2.734-2.734 2.734-7.166 0-9.9L12 3.097ZM12 .269l6.364 6.364c3.515 3.515 3.515 9.213 0 12.728-3.515 3.515-9.213 3.515-12.728 0C2.121 15.846 2.121 10.148 5.636 6.633L12 .269Z"),
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
        return _dropLine!!
    }

private var _dropLine: ImageVector? = null
