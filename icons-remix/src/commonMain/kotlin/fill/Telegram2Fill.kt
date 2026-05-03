package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Telegram2Fill: ImageVector
    get() {
        if (_telegram2Fill != null) return _telegram2Fill!!
        _telegram2Fill = remixIcon(
            name = "Telegram2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.148 11.810 C 7.395 9.524 10.894 8.017 12.645 7.288 C 17.643 5.209 18.682 4.848 19.359 4.836 C 19.508 4.833 19.841 4.870 20.057 5.045 C 20.239 5.193 20.289 5.393 20.313 5.533 C 20.337 5.673 20.367 5.992 20.343 6.241 C 20.072 9.088 18.900 15.995 18.304 19.183 C 18.051 20.531 17.555 20.984 17.074 21.028 C 16.028 21.124 15.234 20.337 14.222 19.674 C 12.638 18.635 11.743 17.989 10.205 16.975 C 8.428 15.804 9.580 15.160 10.593 14.108 C 10.858 13.833 15.464 9.644 15.553 9.264 C 15.564 9.216 15.574 9.039 15.469 8.946 C 15.364 8.852 15.208 8.884 15.096 8.910 C 14.937 8.946 12.406 10.618 7.504 13.928 C 6.785 14.421 6.135 14.662 5.552 14.649 C 4.909 14.635 3.673 14.286 2.754 13.987 C 1.626 13.620 0.730 13.427 0.808 12.804 C 0.849 12.480 1.295 12.149 2.148 11.810 Z"),
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
        return _telegram2Fill!!
    }

private var _telegram2Fill: ImageVector? = null
