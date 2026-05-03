package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShakeHandsFill: ImageVector
    get() {
        if (_shakeHandsFill != null) return _shakeHandsFill!!
        _shakeHandsFill = remixIcon(
            name = "ShakeHandsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.291 6.000 L 20.000 6.000 C 20.552 6.000 21.000 6.448 21.000 7.000 L 21.000 14.000 C 21.000 14.552 20.552 15.000 20.000 15.000 L 18.000 15.000 L 13.832 9.164 C 13.335 8.468 12.449 8.165 11.630 8.411 L 9.144 9.157 C 8.440 9.368 7.676 9.176 7.156 8.655 L 6.863 8.362 C 6.417 7.916 6.490 7.173 7.015 6.823 L 12.416 3.223 C 13.075 2.783 13.931 2.774 14.599 3.199 L 18.755 5.844 C 18.915 5.946 19.101 6.000 19.291 6.000 ZM 5.027 14.295 L 3.411 15.708 C 2.940 16.121 2.959 16.860 3.452 17.247 L 8.593 21.287 C 9.073 21.664 9.776 21.526 10.079 20.996 L 10.783 19.764 C 11.213 19.012 11.109 18.068 10.526 17.427 L 7.824 14.455 C 7.091 13.648 5.847 13.577 5.027 14.295 ZM 7.046 5.000 L 3.000 5.000 C 2.448 5.000 2.000 5.448 2.000 6.000 L 2.000 13.516 C 2.000 13.924 2.125 14.317 2.350 14.646 C 2.374 14.624 2.399 14.601 2.424 14.580 L 4.039 13.166 C 5.475 11.910 7.651 12.034 8.934 13.446 L 11.636 16.418 C 12.656 17.540 12.838 19.192 12.085 20.509 L 11.431 21.654 C 11.994 21.867 12.635 21.819 13.169 21.499 L 17.578 18.853 C 18.079 18.553 18.217 17.890 17.878 17.415 L 12.611 10.036 C 12.486 9.862 12.265 9.786 12.060 9.848 L 9.575 10.593 C 8.342 10.963 7.005 10.626 6.094 9.716 L 5.802 9.423 C 4.686 8.308 4.870 6.450 6.183 5.575 L 7.046 5.000 Z"),
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
        return _shakeHandsFill!!
    }

private var _shakeHandsFill: ImageVector? = null
