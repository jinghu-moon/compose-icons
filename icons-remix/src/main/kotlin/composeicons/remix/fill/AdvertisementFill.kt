package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AdvertisementFill: ImageVector
    get() {
        if (_advertisementFill != null) return _advertisementFill!!
        _advertisementFill = remixIcon(
            name = "AdvertisementFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.552 13l.847-2.115L9.244 13h-1.692ZM16 12h1v2h-1c-.552 0-1-.448-1-1 0-.552 .448-1 1-1ZM21 3h-18C2.448 3 2 3.448 2 4v16c0 .552 .448 1 1 1h18c.552 0 1-.448 1-1v-16C22 3.448 21.552 3 21 3ZM12.598 16h-2.155l-.4-1h-3.29l-.4 1h-2.154L5.398 13.002 5.399 13l2-5h2l3.199 8ZM17 8h2v8h-3c-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3h1v-2Z"),
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
        return _advertisementFill!!
    }

private var _advertisementFill: ImageVector? = null
