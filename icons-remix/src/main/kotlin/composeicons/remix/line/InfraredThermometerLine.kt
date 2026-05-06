package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.InfraredThermometerLine: ImageVector
    get() {
        if (_infraredThermometerLine != null) return _infraredThermometerLine!!
        _infraredThermometerLine = remixIcon(
            name = "InfraredThermometerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 2v9h-3.001L18 12c0 2.209-1.791 4-4 4h-1.379l-.613 3.111 .911 1.321c.314 .455 .199 1.077-.256 1.391-.167 .115-.365 .177-.568 .177h-9.096L5.313 11.976 3 11 7 2h14ZM19 4h-10.7L5.655 9.95l1.984 .838L5.514 20h4.678l-.309-.448L11.96 9h7.04v-5ZM15.999 11h-2.394l-.591 3h.986c1.105 0 2-.895 2-2l-.001-1Z"),
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
        return _infraredThermometerLine!!
    }

private var _infraredThermometerLine: ImageVector? = null
