package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExchangeDollarFill: ImageVector
    get() {
        if (_exchangeDollarFill != null) return _exchangeDollarFill!!
        _exchangeDollarFill = remixIcon(
            name = "ExchangeDollarFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.378 4.513C7.143 2.951 9.463 2.003 12.005 2.003c5.523 0 10 4.477 10 10 0 2.125-.663 4.095-1.793 5.715L17.505 12.003h2.5c0-4.418-3.582-8-8-8-2.244 0-4.273 .924-5.726 2.413L5.378 4.513ZM18.631 19.492c-1.764 1.562-4.085 2.511-6.626 2.511C6.482 22.003 2.005 17.526 2.005 12.003c0-2.125 .663-4.095 1.793-5.715l2.707 5.715h-2.5c0 4.418 3.582 8 8 8 2.244 0 4.273-.924 5.726-2.413l.901 1.902ZM8.505 14.003h5.5c.276 0 .5-.224 .5-.5 0-.276-.224-.5-.5-.5h-4c-1.381 0-2.5-1.119-2.5-2.5 0-1.381 1.119-2.5 2.5-2.5h1v-1h2v1h2.5v2h-5.5c-.276 0-.5 .224-.5 .5 0 .276 .224 .5 .5 .5h4c1.381 0 2.5 1.119 2.5 2.5 0 1.381-1.119 2.5-2.5 2.5h-1v1h-2v-1h-2.5v-2Z"),
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
        return _exchangeDollarFill!!
    }

private var _exchangeDollarFill: ImageVector? = null
