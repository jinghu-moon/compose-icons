package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.QwenAiLine: ImageVector
    get() {
        if (_qwenAiLine != null) return _qwenAiLine!!
        _qwenAiLine = remixIcon(
            name = "QwenAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.442 4.499h5.486c.179 0 .344 .095 .433 .25l1.155 2c.089 .155 .089 .345-0 .5L19.216 9.499l2.742 4.75c.089 .155 .089 .345 0 .5l-1.155 2c-.089 .155-.254 .25-.433 .25h-2.598l-2.742 4.75c-.089 .155-.254 .25-.433 .25h-2.309c-.179 0-.344-.095-.433-.25L10.556 19.499h-5.485c-.179 0-.344-.095-.433-.25l-1.155-2c-.089-.155-.089-.345 0-.5L4.782 14.499 2.041 9.75c-.089-.155-.089-.345 0-.5L3.195 7.25C3.285 7.095 3.45 7 3.628 7h2.598L8.968 2.249c.089-.155 .254-.25 .433-.25h2.309c.179 0 .344 .095 .433 .25l1.299 2.25ZM16.041 11l-4.042 6.999 1.155 2h.576l2.888-5h2.886l.288-.5L17.772 11h-1.732ZM4.495 9l-.289 .5 2.886 4.999L5.648 16.999l.289 .5h4.042L10.844 16 6.804 9h-2.309ZM11.999 14l1.733-3h-3.465l1.731 3ZM8.246 7.5 9.112 9h8.082L18.349 6.999l-.288-.5h-5.773L10.844 3.999h-.576L8.246 7.5Z"),
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
        return _qwenAiLine!!
    }

private var _qwenAiLine: ImageVector? = null
