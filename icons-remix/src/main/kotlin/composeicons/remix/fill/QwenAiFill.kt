package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.QwenAiFill: ImageVector
    get() {
        if (_qwenAiFill != null) return _qwenAiFill!!
        _qwenAiFill = remixIcon(
            name = "QwenAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.71 1.999c.179 0 .344 .095 .434 .25l1.299 2.25h5.485c.178 0 .343 .096 .433 .25l1.154 2c.089 .155 .089 .345 0 .5L19.216 9.499l2.742 4.75c.089 .155 .089 .345 0 .5l-1.154 2c-.089 .155-.255 .25-.434 .25h-2.598l-2.742 4.75c-.089 .154-.254 .25-.433 .25h-2.31c-.179 0-.344-.095-.434-.25L10.556 19.499h-5.484c-.179 0-.344-.095-.434-.25l-1.154-2c-.089-.155-.089-.345 0-.5L4.783 14.499 2.04 9.75c-.089-.155-.089-.345 0-.5l1.155-2C3.285 7.096 3.45 7 3.628 7h2.599L8.968 2.249c.089-.155 .255-.25 .434-.25h2.309ZM6.587 7.625 4.421 7.624l5.052 8.75h-2.886L5.144 18.874h5.772l1.084 1.876L17.052 12l1.442 2.5 2.887-.001L18.495 9.499 19.578 7.625h-10.104L10.917 5.124 9.474 2.625l-2.887 5ZM15.464 10l-3.464 6L8.536 10h6.929Z"),
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
        return _qwenAiFill!!
    }

private var _qwenAiFill: ImageVector? = null
