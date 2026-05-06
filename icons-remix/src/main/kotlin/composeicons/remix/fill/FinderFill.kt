package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FinderFill: ImageVector
    get() {
        if (_finderFill != null) return _finderFill!!
        _finderFill = remixIcon(
            name = "FinderFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.001 3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1h18ZM20.001 5h-8.465C10.846 6.977 10.501 9.644 10.501 13h3c-.115 .919-.151 1.878-.107 2.877 1.226-.212 2.704-.777 4.027-1.709l1.135 1.664c-1.642 1.094-3.302 1.779-4.976 2.043 .051 .37 .113 .745 .184 1.125L20.001 19v-14ZM6.556 14.168 5.446 15.832C7.603 17.27 9.793 18 12.001 18v-2C10.209 16 8.399 15.397 6.556 14.168ZM17.001 7c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-1c0-.552 .448-1 1-1ZM7.001 7c-.552 0-1 .452-1 1 0 .366 0 .699 0 1 0 .552 .448 1 1 1 .552 0 1-.45 1-1v-1C8.001 7.448 7.553 7 7.001 7Z"),
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
        return _finderFill!!
    }

private var _finderFill: ImageVector? = null
