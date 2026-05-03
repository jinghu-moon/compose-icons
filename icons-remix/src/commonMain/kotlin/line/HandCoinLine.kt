package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HandCoinLine: ImageVector
    get() {
        if (_handCoinLine != null) return _handCoinLine!!
        _handCoinLine = remixIcon(
            name = "HandCoinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.005 9.003 C 5.557 9.003 6.005 9.451 6.005 10.003 C 7.640 10.003 9.144 10.563 10.335 11.502 L 12.505 11.503 C 13.837 11.503 15.035 12.082 15.859 13.002 L 19.005 13.003 C 20.997 13.003 22.717 14.168 23.521 15.854 C 21.156 18.975 17.327 21.003 13.005 21.003 C 10.214 21.003 7.855 20.400 5.944 19.345 C 5.806 19.728 5.437 20.003 5.005 20.003 L 2.005 20.003 C 1.453 20.003 1.005 19.555 1.005 19.003 L 1.005 10.003 C 1.005 9.451 1.453 9.003 2.005 9.003 L 5.005 9.003 ZM 6.006 12.003 L 6.005 17.025 L 6.050 17.057 C 7.844 18.318 10.183 19.003 13.005 19.003 C 16.009 19.003 18.803 17.847 20.840 15.873 L 20.973 15.740 L 20.854 15.639 C 20.390 15.276 19.820 15.051 19.210 15.010 L 19.005 15.003 L 16.893 15.003 C 16.966 15.324 17.005 15.659 17.005 16.003 L 17.005 17.003 L 8.005 17.003 L 8.005 15.003 L 14.795 15.002 L 14.760 14.923 C 14.380 14.130 13.593 13.568 12.669 13.508 L 12.505 13.503 L 9.575 13.503 C 8.668 12.577 7.404 12.003 6.006 12.003 ZM 4.005 11.003 L 3.005 11.003 L 3.005 18.003 L 4.005 18.003 L 4.005 11.003 ZM 18.005 5.003 C 19.662 5.003 21.005 6.346 21.005 8.003 C 21.005 9.660 19.662 11.003 18.005 11.003 C 16.348 11.003 15.005 9.660 15.005 8.003 C 15.005 6.346 16.348 5.003 18.005 5.003 ZM 18.005 7.003 C 17.453 7.003 17.005 7.451 17.005 8.003 C 17.005 8.555 17.453 9.003 18.005 9.003 C 18.557 9.003 19.005 8.555 19.005 8.003 C 19.005 7.451 18.557 7.003 18.005 7.003 ZM 11.005 2.003 C 12.662 2.003 14.005 3.346 14.005 5.003 C 14.005 6.660 12.662 8.003 11.005 8.003 C 9.348 8.003 8.005 6.660 8.005 5.003 C 8.005 3.346 9.348 2.003 11.005 2.003 ZM 11.005 4.003 C 10.453 4.003 10.005 4.451 10.005 5.003 C 10.005 5.555 10.453 6.003 11.005 6.003 C 11.557 6.003 12.005 5.555 12.005 5.003 C 12.005 4.451 11.557 4.003 11.005 4.003 Z"),
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
        return _handCoinLine!!
    }

private var _handCoinLine: ImageVector? = null
