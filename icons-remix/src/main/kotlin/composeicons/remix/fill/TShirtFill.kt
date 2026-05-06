package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TShirtFill: ImageVector
    get() {
        if (_tShirtFill != null) return _tShirtFill!!
        _tShirtFill = remixIcon(
            name = "TShirtFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.514 5 17.12 2.393c.39-.391 1.024-.391 1.414 0l4.243 4.243c.39 .391 .39 1.024 0 1.414l-3.778 3.778v9.172c0 .552-.448 1-1 1h-12c-.552 0-1-.448-1-1v-9.172L1.221 8.05C.83 7.66 .83 7.027 1.221 6.636L5.463 2.393c.391-.391 1.024-.391 1.414 0L9.484 5h5.029Z"),
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
        return _tShirtFill!!
    }

private var _tShirtFill: ImageVector? = null
