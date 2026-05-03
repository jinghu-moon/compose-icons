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
                pathData = parseSvgPathData("M 12.598 16.000 L 9.399 8.000 L 7.399 8.000 L 5.399 13.000 L 5.398 13.002 L 4.199 16.000 L 6.353 16.000 L 6.753 15.000 L 10.043 15.000 L 10.443 16.000 L 12.598 16.000 ZM 7.552 13.000 L 8.399 10.885 L 9.244 13.000 L 7.552 13.000 ZM 17.000 8.000 L 19.000 8.000 L 19.000 16.000 L 16.000 16.000 C 14.343 16.000 13.000 14.657 13.000 13.000 C 13.000 11.343 14.343 10.000 16.000 10.000 L 17.000 10.000 L 17.000 8.000 ZM 16.000 12.000 C 15.448 12.000 15.000 12.448 15.000 13.000 C 15.000 13.552 15.448 14.000 16.000 14.000 L 17.000 14.000 L 17.000 12.000 L 16.000 12.000 ZM 21.000 3.000 L 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 21.000 21.000 C 21.552 21.000 22.000 20.552 22.000 20.000 L 22.000 4.000 C 22.000 3.448 21.552 3.000 21.000 3.000 ZM 4.000 19.000 L 4.000 5.000 L 20.000 5.000 L 20.000 19.000 L 4.000 19.000 Z"),
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
