package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CurrencyLine: ImageVector
    get() {
        if (_currencyLine != null) return _currencyLine!!
        _currencyLine = remixIcon(
            name = "CurrencyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.005 16.003h2v-12h-10v2h8v10ZM17.005 18.003v2.999c0 .553-.45 1.001-1.007 1.001h-11.986c-.556 0-1.007-.445-1.007-1.001L3.007 7.004C3.008 6.451 3.458 6.003 4.014 6.003h2.99v-3c0-.552 .448-1 1-1h12c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-3ZM5.007 8.003 5.005 20.003h10v-12h-9.997ZM7.005 16.003h4.5c.276 0 .5-.224 .5-.5 0-.276-.224-.5-.5-.5h-3c-1.381 0-2.5-1.119-2.5-2.5 0-1.381 1.119-2.5 2.5-2.5h.5v-1h2v1h2v2h-4.5c-.276 0-.5 .224-.5 .5 0 .276 .224 .5 .5 .5h3c1.381 0 2.5 1.119 2.5 2.5 0 1.381-1.119 2.5-2.5 2.5h-.5v1h-2v-1h-2v-2Z"),
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
        return _currencyLine!!
    }

private var _currencyLine: ImageVector? = null
