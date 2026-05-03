package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TelegramLine: ImageVector
    get() {
        if (_telegramLine != null) return _telegramLine!!
        _telegramLine = remixIcon(
            name = "TelegramLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 12.000 C 20.000 16.418 16.418 20.000 12.000 20.000 C 7.582 20.000 4.000 16.418 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 C 16.418 4.000 20.000 7.582 20.000 12.000 ZM 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 ZM 12.358 9.382 C 11.386 9.787 9.442 10.624 6.527 11.894 C 6.053 12.083 5.805 12.267 5.783 12.447 C 5.745 12.751 6.126 12.871 6.645 13.034 C 6.715 13.057 6.788 13.080 6.863 13.104 C 7.374 13.270 8.061 13.464 8.418 13.472 C 8.742 13.479 9.103 13.345 9.502 13.071 C 12.226 11.233 13.632 10.303 13.720 10.283 C 13.783 10.269 13.869 10.251 13.927 10.303 C 13.986 10.355 13.980 10.454 13.974 10.480 C 13.936 10.641 12.440 12.032 11.666 12.752 C 11.435 12.966 11.210 13.185 10.983 13.404 C 10.509 13.861 10.153 14.204 11.003 14.764 C 11.864 15.332 12.732 15.898 13.572 16.497 C 13.987 16.792 14.359 17.058 14.819 17.016 C 15.086 16.991 15.362 16.740 15.502 15.990 C 15.833 14.219 16.485 10.382 16.635 8.801 C 16.648 8.662 16.632 8.485 16.618 8.407 C 16.605 8.329 16.577 8.218 16.476 8.136 C 16.356 8.039 16.171 8.019 16.089 8.020 C 15.712 8.027 15.135 8.227 12.358 9.382 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _telegramLine!!
    }

private var _telegramLine: ImageVector? = null
