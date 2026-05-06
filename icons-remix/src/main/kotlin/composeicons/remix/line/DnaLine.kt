package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DnaLine: ImageVector
    get() {
        if (_dnaLine != null) return _dnaLine!!
        _dnaLine = remixIcon(
            name = "DnaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 1c0 .716-.064 1.379-.184 2h-9.584c.182 .727 .468 1.383 .849 2h8.1C16.132 7.317 14.187 8.994 12 10.727 8.729 8.135 6 5.668 6 1h-2c0 5.466 3.21 8.464 6.386 11C7.21 14.536 4 17.534 4 23h2C6 18.04 9.08 15.566 12.618 12.786l.092-.072C16.149 10.012 20 6.987 20 1h-2ZM17.816 21h-9.584c.182-.727 .468-1.383 .849-2h8.1c-.787-1.738-2.078-3.116-3.598-4.428 .533-.42 1.07-.837 1.598-1.263C17.766 15.598 20 18.44 20 23h-2c0-.716-.064-1.379-.184-2Z"),
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
        return _dnaLine!!
    }

private var _dnaLine: ImageVector? = null
