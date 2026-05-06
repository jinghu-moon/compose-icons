package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PriceTagLine: ImageVector
    get() {
        if (_priceTagLine != null) return _priceTagLine!!
        _priceTagLine = remixIcon(
            name = "PriceTagLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.005 7 11.45 1.37c.336-.224 .773-.224 1.109 0l8.445 5.63v14c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-14ZM5.005 8.07v11.93h14v-11.93l-7-4.667L5.005 8.07ZM12.005 11c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2Z"),
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
        return _priceTagLine!!
    }

private var _priceTagLine: ImageVector? = null
