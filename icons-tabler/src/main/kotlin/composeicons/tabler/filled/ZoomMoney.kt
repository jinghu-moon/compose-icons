package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomMoney: ImageVector
    get() {
        if (_zoomMoney != null) return _zoomMoney!!
        _zoomMoney = tablerFilledIcon(
            name = "ZoomMoney",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 3.072c2.002 1.156 3.406 3.121 3.851 5.389 .445 2.269-.114 4.618-1.531 6.445l5.387 5.387c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012L14.905 16.32c-2.413 1.872-5.681 2.208-8.424 .865C3.739 15.842 2 13.054 2 10l.005-.285C2.105 6.91 3.668 4.362 6.124 3.002 8.58 1.642 11.569 1.668 14 3.072M12 6h-2.5C8.119 6 7 7.119 7 8.5 7 9.881 8.119 11 9.5 11h1c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-2.5c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h2.5C11.881 14 13 12.881 13 11.5 13 10.119 11.881 9 10.5 9h-1C9.224 9 9 8.776 9 8.5 9 8.224 9.224 8 9.5 8h2.5c.552 0 1-.448 1-1C13 6.448 12.552 6 12 6"),
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
        return _zoomMoney!!
    }

private var _zoomMoney: ImageVector? = null
