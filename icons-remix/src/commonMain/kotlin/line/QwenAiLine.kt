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
                pathData = parseSvgPathData("M 13.442 4.499 L 18.928 4.499 C 19.107 4.499 19.272 4.594 19.361 4.749 L 20.516 6.749 C 20.605 6.904 20.605 7.094 20.515 7.249 L 19.216 9.499 L 21.958 14.249 C 22.047 14.404 22.047 14.594 21.958 14.749 L 20.803 16.749 C 20.714 16.904 20.549 16.999 20.370 16.999 L 17.772 16.999 L 15.030 21.749 C 14.941 21.904 14.776 21.999 14.597 21.999 L 12.288 21.999 C 12.109 21.999 11.944 21.904 11.854 21.749 L 10.556 19.499 L 5.071 19.499 C 4.892 19.499 4.727 19.404 4.638 19.249 L 3.483 17.249 C 3.394 17.094 3.394 16.904 3.483 16.749 L 4.782 14.499 L 2.041 9.750 C 1.951 9.595 1.951 9.405 2.041 9.250 L 3.195 7.250 C 3.285 7.095 3.450 7.000 3.628 7.000 L 6.226 7.000 L 8.968 2.249 C 9.057 2.094 9.222 1.999 9.401 1.999 L 11.710 1.999 C 11.889 1.999 12.054 2.094 12.143 2.249 L 13.442 4.499 ZM 16.041 11.000 L 11.999 17.999 L 13.154 19.999 L 13.730 19.999 L 16.618 14.999 L 19.504 14.999 L 19.792 14.499 L 17.772 11.000 L 16.041 11.000 ZM 4.495 9.000 L 4.206 9.500 L 7.092 14.499 L 5.648 16.999 L 5.937 17.499 L 9.979 17.499 L 10.844 16.000 L 6.804 9.000 L 4.495 9.000 ZM 11.999 14.000 L 13.732 11.000 L 10.267 11.000 L 11.999 14.000 ZM 8.246 7.500 L 9.112 9.000 L 17.194 9.000 L 18.349 6.999 L 18.061 6.499 L 12.288 6.499 L 10.844 3.999 L 10.267 3.999 L 8.246 7.500 Z"),
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
