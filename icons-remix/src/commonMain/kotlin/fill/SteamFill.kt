package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SteamFill: ImageVector
    get() {
        if (_steamFill != null) return _steamFill!!
        _steamFill = remixIcon(
            name = "SteamFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.005 2.000 C 6.754 2.000 2.449 6.050 2.041 11.198 L 7.401 13.413 C 7.855 13.103 8.404 12.921 8.994 12.921 C 9.047 12.921 9.099 12.924 9.151 12.926 L 11.535 9.474 L 11.535 9.425 C 11.535 7.346 13.225 5.655 15.305 5.655 C 17.383 5.655 19.075 7.347 19.075 9.427 C 19.075 11.507 17.383 13.198 15.305 13.198 L 15.218 13.198 L 11.821 15.624 C 11.821 15.667 11.824 15.712 11.824 15.757 C 11.824 17.319 10.562 18.587 8.999 18.587 C 7.637 18.587 6.486 17.609 6.224 16.314 L 2.386 14.725 C 3.574 18.923 7.428 22.000 12.005 22.000 C 17.528 22.000 22.004 17.522 22.004 12.000 C 22.004 6.477 17.527 2.000 12.005 2.000 ZM 7.079 16.667 C 7.297 17.119 7.674 17.499 8.174 17.708 C 9.254 18.157 10.501 17.645 10.950 16.562 C 11.169 16.038 11.170 15.463 10.954 14.938 C 10.738 14.413 10.329 14.004 9.807 13.786 C 9.287 13.569 8.732 13.578 8.242 13.761 L 9.511 14.286 C 10.308 14.619 10.685 15.536 10.352 16.332 C 10.021 17.129 9.104 17.507 8.307 17.175 L 7.079 16.667 ZM 17.819 9.422 C 17.819 8.038 16.691 6.910 15.306 6.910 C 13.918 6.910 12.793 8.038 12.793 9.422 C 12.793 10.810 13.918 11.935 15.306 11.935 C 16.692 11.935 17.819 10.810 17.819 9.422 ZM 15.312 7.530 C 16.353 7.530 17.200 8.375 17.200 9.418 C 17.200 10.461 16.353 11.306 15.312 11.306 C 14.268 11.306 13.424 10.461 13.424 9.418 C 13.424 8.375 14.269 7.530 15.312 7.530 Z"),
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
        return _steamFill!!
    }

private var _steamFill: ImageVector? = null
