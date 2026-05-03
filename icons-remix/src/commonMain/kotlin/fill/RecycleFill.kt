package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RecycleFill: ImageVector
    get() {
        if (_recycleFill != null) return _recycleFill!!
        _recycleFill = remixIcon(
            name = "RecycleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.561 12.099 L 21.093 14.750 C 22.059 16.424 21.486 18.565 19.812 19.531 C 19.279 19.838 18.676 20.000 18.062 20.000 L 15.999 20.000 L 15.999 22.000 L 10.999 18.500 L 15.999 15.000 L 15.999 17.000 L 18.062 17.000 C 18.149 17.000 18.236 16.977 18.312 16.933 C 18.524 16.810 18.612 16.555 18.532 16.332 L 18.494 16.250 L 16.963 13.599 L 19.561 12.099 ZM 7.736 9.384 L 8.267 15.464 L 6.536 14.465 L 5.504 16.250 C 5.460 16.326 5.437 16.412 5.437 16.500 C 5.437 16.746 5.614 16.950 5.847 16.992 L 5.937 17.000 L 8.999 17.000 L 8.999 20.000 L 5.937 20.000 C 4.004 20.000 2.437 18.433 2.437 16.500 C 2.437 15.886 2.599 15.282 2.906 14.750 L 3.938 12.965 L 2.205 11.964 L 7.736 9.384 ZM 13.749 2.969 C 14.281 3.276 14.723 3.718 15.030 4.250 L 16.061 6.036 L 17.794 5.036 L 17.262 11.116 L 11.731 8.536 L 13.463 7.536 L 12.432 5.750 C 12.388 5.674 12.325 5.611 12.249 5.567 C 12.037 5.444 11.771 5.495 11.618 5.676 L 11.566 5.750 L 10.036 8.402 L 7.438 6.902 L 8.968 4.250 C 9.935 2.576 12.075 2.003 13.749 2.969 Z"),
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
        return _recycleFill!!
    }

private var _recycleFill: ImageVector? = null
