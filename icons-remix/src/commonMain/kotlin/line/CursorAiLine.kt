package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CursorAiLine: ImageVector
    get() {
        if (_cursorAiLine != null) return _cursorAiLine!!
        _cursorAiLine = remixIcon(
            name = "CursorAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.550 1.354 C 11.828 1.194 12.172 1.194 12.450 1.354 L 21.121 6.330 C 21.355 6.465 21.500 6.714 21.500 6.983 L 21.500 17.019 L 21.494 17.118 C 21.463 17.348 21.327 17.553 21.122 17.670 L 12.450 22.648 L 12.343 22.699 C 12.087 22.804 11.793 22.787 11.550 22.648 L 2.879 17.670 C 2.674 17.553 2.538 17.348 2.507 17.118 L 2.500 17.019 L 2.500 6.983 C 2.500 6.714 2.645 6.465 2.879 6.330 L 11.550 1.354 ZM 4.500 7.705 L 4.500 16.294 L 12.000 20.599 L 12.000 12.305 C 12.000 12.116 11.899 11.942 11.734 11.847 L 4.509 7.699 L 4.500 7.705 ZM 13.354 19.822 L 19.500 16.294 L 19.500 9.238 L 13.354 19.822 ZM 5.861 6.924 L 18.139 6.924 L 11.999 3.401 L 5.861 6.924 Z"),
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
        return _cursorAiLine!!
    }

private var _cursorAiLine: ImageVector? = null
