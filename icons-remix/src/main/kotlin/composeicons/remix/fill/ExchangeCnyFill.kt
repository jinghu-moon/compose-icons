package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExchangeCnyFill: ImageVector
    get() {
        if (_exchangeCnyFill != null) return _exchangeCnyFill!!
        _exchangeCnyFill = remixIcon(
            name = "ExchangeCnyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.378 4.513C7.143 2.951 9.463 2.003 12.005 2.003c5.523 0 10 4.477 10 10 0 2.125-.663 4.095-1.793 5.715L17.505 12.003h2.5c0-4.418-3.582-8-8-8-2.244 0-4.273 .924-5.726 2.413L5.378 4.513ZM18.631 19.492c-1.764 1.562-4.085 2.511-6.626 2.511C6.482 22.003 2.005 17.526 2.005 12.003c0-2.125 .663-4.095 1.793-5.715l2.707 5.715h-2.5c0 4.418 3.582 8 8 8 2.244 0 4.273-.924 5.726-2.413l.901 1.902ZM13.005 13.538h3v2h-3v2h-2v-2h-3v-2h3v-1h-3v-2h2.586L8.469 8.417 9.884 7.003l2.121 2.121L14.126 7.003l1.414 1.414-2.121 2.121h2.586v2h-3v1Z"),
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
        return _exchangeCnyFill!!
    }

private var _exchangeCnyFill: ImageVector? = null
