package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.OilLine: ImageVector
    get() {
        if (_oilLine != null) return _oilLine!!
        _oilLine = remixIcon(
            name = "OilLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.07 7 6 11.606v8.394h12v-13h-8.93ZM8 5h11c.552 0 1 .448 1 1v15c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-10L8 5ZM13 1h5c.552 0 1 .448 1 1v2h-7v-2c0-.552 .448-1 1-1ZM8 12h2v6h-2v-6Z"),
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
        return _oilLine!!
    }

private var _oilLine: ImageVector? = null
