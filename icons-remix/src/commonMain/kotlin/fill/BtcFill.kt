package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BtcFill: ImageVector
    get() {
        if (_btcFill != null) return _btcFill!!
        _btcFill = remixIcon(
            name = "BtcFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 ZM 16.705 10.564 C 16.532 11.617 15.981 12.131 15.235 12.313 C 16.227 12.868 16.705 13.711 16.194 15.190 C 15.559 17.044 14.137 17.212 12.253 16.853 L 11.768 18.810 L 10.674 18.539 L 11.159 16.582 C 11.035 16.549 10.910 16.520 10.786 16.491 C 10.614 16.451 10.436 16.410 10.260 16.359 L 9.775 18.316 L 8.683 18.045 L 9.168 16.088 L 6.992 15.496 L 7.533 14.112 C 7.533 14.112 8.354 14.338 8.341 14.324 C 8.646 14.398 8.795 14.185 8.856 14.036 L 9.632 10.899 L 10.198 8.669 C 10.222 8.428 10.146 8.112 9.701 7.992 C 9.732 7.975 8.900 7.794 8.900 7.794 L 9.224 6.482 L 11.467 7.038 L 11.942 5.121 L 13.071 5.401 L 12.597 7.318 C 12.888 7.382 13.171 7.459 13.462 7.533 L 13.937 5.616 L 15.037 5.888 L 14.549 7.855 C 15.936 8.364 16.934 9.118 16.705 10.564 ZM 11.606 10.954 C 12.263 11.152 14.211 11.737 14.539 10.434 C 14.845 9.195 13.157 8.816 12.373 8.640 C 12.280 8.620 12.200 8.602 12.138 8.585 L 11.551 10.938 L 11.606 10.954 ZM 10.592 14.774 L 10.687 14.802 C 11.496 15.043 13.793 15.726 14.104 14.433 C 14.425 13.187 12.361 12.702 11.436 12.484 C 11.335 12.461 11.247 12.440 11.178 12.422 L 10.592 14.774 Z"),
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
        return _btcFill!!
    }

private var _btcFill: ImageVector? = null
