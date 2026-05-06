package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomExclamation: ImageVector
    get() {
        if (_zoomExclamation != null) return _zoomExclamation!!
        _zoomExclamation = tablerFilledIcon(
            name = "ZoomExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 3.072c2.002 1.156 3.406 3.121 3.851 5.389 .445 2.269-.114 4.618-1.531 6.445l5.387 5.387c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012L14.905 16.32c-2.413 1.872-5.681 2.208-8.424 .865C3.739 15.842 2 13.054 2 10l.005-.285C2.105 6.91 3.668 4.362 6.124 3.002 8.58 1.642 11.569 1.668 14 3.072M10 12c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C10.934 12.38 10.507 12 10 12M10 6C9.448 6 9 6.448 9 7v3c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-3C11 6.448 10.552 6 10 6"),
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
        return _zoomExclamation!!
    }

private var _zoomExclamation: ImageVector? = null
