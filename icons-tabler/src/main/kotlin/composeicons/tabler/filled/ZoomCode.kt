package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomCode: ImageVector
    get() {
        if (_zoomCode != null) return _zoomCode!!
        _zoomCode = tablerFilledIcon(
            name = "ZoomCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 3.072c2.002 1.156 3.406 3.121 3.851 5.389 .445 2.269-.114 4.618-1.531 6.445l5.387 5.387c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012L14.905 16.32c-2.413 1.872-5.681 2.208-8.424 .865C3.739 15.842 2 13.054 2 10l.005-.285C2.105 6.91 3.668 4.362 6.124 3.002 8.58 1.642 11.569 1.668 14 3.072M8.707 7.292c-.391-.39-1.023-.39-1.414 0l-2 2c-.188 .188-.293 .442-.293 .708 0 .265 .106 .52 .293 .707l2 2c.39 .39 1.023 .39 1.414 0l.083-.094c.309-.398 .273-.964-.083-1.32L7.415 10 8.707 8.707c.39-.391 .39-1.023 0-1.414M12.707 7.293c-.391-.39-1.023-.39-1.414 0l-.083 .095c-.309 .398-.273 .964 .083 1.32L12.585 10l-1.292 1.293c-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012l2-2c.39-.391 .39-1.023 0-1.414Z"),
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
        return _zoomCode!!
    }

private var _zoomCode: ImageVector? = null
