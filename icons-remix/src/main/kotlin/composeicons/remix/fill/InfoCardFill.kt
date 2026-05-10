package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.InfoCardFill: ImageVector
    get() {
        if (_infoCardFill != null) return _infoCardFill!!
        _infoCardFill = remixIcon(
            name = "InfoCardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1 5C1 4.448 1.448 4 2 4h20c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-20C1.448 20 1 19.552 1 19v-14ZM9 8h-2v2h2v-2ZM7 13v3h2v-5h-3v2h1ZM13 9v2h6v-2h-6ZM18 13h-5v2h5v-2Z"),
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
        return _infoCardFill!!
    }

private var _infoCardFill: ImageVector? = null
