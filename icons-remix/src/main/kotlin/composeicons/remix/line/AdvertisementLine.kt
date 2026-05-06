package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AdvertisementLine: ImageVector
    get() {
        if (_advertisementLine != null) return _advertisementLine!!
        _advertisementLine = remixIcon(
            name = "AdvertisementLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.598 16 9.399 8h-2l-2 5-.001 .002L4.199 16h2.154l.4-1h3.29l.4 1h2.155ZM7.552 13l.847-2.115L9.244 13h-1.692ZM17 8h2v8h-3c-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3h1v-2ZM16 12c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h1v-2h-1ZM21 3h-18C2.448 3 2 3.448 2 4v16c0 .552 .448 1 1 1h18c.552 0 1-.448 1-1v-16C22 3.448 21.552 3 21 3ZM4 19v-14h16v14h-16Z"),
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
        return _advertisementLine!!
    }

private var _advertisementLine: ImageVector? = null
