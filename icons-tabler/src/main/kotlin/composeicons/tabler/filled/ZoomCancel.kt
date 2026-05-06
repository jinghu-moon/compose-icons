package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomCancel: ImageVector
    get() {
        if (_zoomCancel != null) return _zoomCancel!!
        _zoomCancel = tablerFilledIcon(
            name = "ZoomCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 3.072c2.002 1.156 3.406 3.121 3.851 5.389 .445 2.269-.114 4.618-1.531 6.445l5.387 5.387c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012L14.905 16.32c-2.413 1.872-5.681 2.208-8.424 .865C3.739 15.842 2 13.054 2 10l.005-.285C2.105 6.91 3.668 4.362 6.124 3.002 8.58 1.642 11.569 1.668 14 3.072M8.707 7.292C8.316 6.902 7.683 6.902 7.293 7.293c-.39 .391-.39 1.024 .001 1.414L8.585 10 7.293 11.293c-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012L10 11.415l1.293 1.292c.392 .379 1.016 .374 1.402-.012 .386-.386 .391-1.009 .012-1.402L11.415 10 12.707 8.707c.26-.251 .364-.623 .273-.973-.092-.35-.365-.623-.714-.714-.35-.092-.721 .013-.973 .273L10 8.585Z"),
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
        return _zoomCancel!!
    }

private var _zoomCancel: ImageVector? = null
