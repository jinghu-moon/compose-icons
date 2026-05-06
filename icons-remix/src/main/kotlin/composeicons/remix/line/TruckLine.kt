package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TruckLine: ImageVector
    get() {
        if (_truckLine != null) return _truckLine!!
        _truckLine = remixIcon(
            name = "TruckLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.965 18c-.243 1.696-1.701 3-3.465 3C3.737 21 2.278 19.696 2.035 18h-1.035v-12C1 5.448 1.448 5 2 5h14c.552 0 1 .448 1 1v2h3l3 4.056v5.944h-2.035c-.243 1.696-1.701 3-3.465 3-1.763 0-3.222-1.304-3.465-3h-5.071ZM15 7h-12v8.05C3.635 14.402 4.521 14 5.5 14c1.396 0 2.601 .818 3.163 2h5.674c.168-.353 .393-.674 .663-.95v-8.05ZM17 13h4v-.285L18.992 10h-1.992v3ZM17.5 19c.653 0 1.209-.417 1.415-1 .055-.156 .085-.325 .085-.5C19 16.672 18.328 16 17.5 16 16.672 16 16 16.672 16 17.5c0 .175 .03 .344 .085 .5 .206 .583 .762 1 1.415 1ZM7 17.5C7 16.672 6.328 16 5.5 16 4.672 16 4 16.672 4 17.5c0 .175 .03 .344 .085 .5 .206 .583 .762 1 1.415 1 .653 0 1.209-.417 1.415-1C6.97 17.844 7 17.675 7 17.5Z"),
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
        return _truckLine!!
    }

private var _truckLine: ImageVector? = null
