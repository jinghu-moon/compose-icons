package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FediverseFill: ImageVector
    get() {
        if (_fediverseFill != null) return _fediverseFill!!
        _fediverseFill = remixIcon(
            name = "FediverseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.268 1.555 L 11.268 2.170 L 11.521 6.186 L 8.169 3.959 L 7.636 3.651 L 6.903 4.920 L 7.437 5.228 L 11.040 7.017 L 7.437 8.806 L 6.903 9.113 L 7.636 10.382 L 8.169 10.075 L 11.521 7.848 L 11.268 11.864 L 11.268 12.479 L 12.733 12.479 L 12.733 11.864 L 12.480 7.848 L 15.831 10.075 L 16.364 10.382 L 17.097 9.113 L 16.564 8.806 L 12.960 7.017 L 16.564 5.228 L 17.097 4.920 L 16.364 3.651 L 15.831 3.959 L 12.480 6.186 L 12.733 2.170 L 12.733 1.555 L 11.268 1.555 ZM 5.972 10.727 L 5.972 11.342 L 6.225 15.357 L 2.874 13.131 L 2.341 12.823 L 1.608 14.092 L 2.141 14.400 L 5.746 16.188 L 2.141 17.978 L 1.608 18.285 L 2.341 19.554 L 2.874 19.247 L 6.225 17.020 L 5.972 21.035 L 5.972 21.651 L 7.438 21.651 L 7.438 21.035 L 7.185 17.020 L 10.536 19.247 L 11.069 19.554 L 11.802 18.285 L 11.269 17.978 L 7.665 16.188 L 11.269 14.400 L 11.802 14.092 L 11.069 12.823 L 10.536 13.131 L 7.185 15.357 L 7.438 11.342 L 7.438 10.727 L 5.972 10.727 ZM 16.562 10.727 L 16.562 11.342 L 16.815 15.357 L 13.464 13.131 L 12.932 12.823 L 12.199 14.092 L 12.731 14.400 L 16.336 16.188 L 12.731 17.978 L 12.199 18.285 L 12.932 19.554 L 13.464 19.247 L 16.815 17.020 L 16.562 21.035 L 16.562 21.651 L 18.028 21.651 L 18.028 21.035 L 17.775 17.020 L 21.126 19.247 L 21.659 19.554 L 22.392 18.285 L 21.859 17.978 L 18.255 16.188 L 21.859 14.400 L 22.392 14.092 L 21.659 12.823 L 21.126 13.131 L 17.775 15.357 L 18.028 11.342 L 18.028 10.727 L 16.562 10.727 Z"),
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
        return _fediverseFill!!
    }

private var _fediverseFill: ImageVector? = null
