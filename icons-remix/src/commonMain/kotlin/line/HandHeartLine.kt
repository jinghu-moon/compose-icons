package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HandHeartLine: ImageVector
    get() {
        if (_handHeartLine != null) return _handHeartLine!!
        _handHeartLine = remixIcon(
            name = "HandHeartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.005 9.003 C 5.557 9.003 6.005 9.450 6.005 10.003 C 7.640 10.003 9.144 10.563 10.335 11.502 L 12.505 11.503 C 13.837 11.503 15.034 12.082 15.858 13.001 L 19.005 13.003 C 20.997 13.003 22.717 14.168 23.521 15.854 C 21.156 18.975 17.327 21.003 13.005 21.003 C 10.214 21.003 7.855 20.399 5.944 19.345 C 5.806 19.728 5.437 20.003 5.005 20.003 L 2.005 20.003 C 1.453 20.003 1.005 19.555 1.005 19.003 L 1.005 10.003 C 1.005 9.450 1.453 9.003 2.005 9.003 L 5.005 9.003 ZM 6.006 12.003 L 6.005 17.024 L 6.050 17.057 C 7.844 18.318 10.183 19.003 13.005 19.003 C 16.009 19.003 18.803 17.847 20.840 15.873 L 20.973 15.740 L 20.854 15.639 C 20.390 15.276 19.820 15.051 19.210 15.010 L 19.005 15.003 L 16.893 15.002 C 16.966 15.324 17.005 15.659 17.005 16.003 L 17.005 17.003 L 8.005 17.003 L 8.005 15.003 L 14.795 15.002 L 14.760 14.923 C 14.380 14.130 13.593 13.568 12.669 13.508 L 12.505 13.503 L 9.575 13.502 C 8.668 12.577 7.404 12.003 6.006 12.003 ZM 4.005 11.003 L 3.005 11.003 L 3.005 18.003 L 4.005 18.003 L 4.005 11.003 ZM 13.651 3.578 L 14.005 3.932 L 14.358 3.578 C 15.335 2.602 16.918 2.602 17.894 3.578 C 18.870 4.554 18.870 6.137 17.894 7.114 L 14.005 11.003 L 10.116 7.114 C 9.139 6.137 9.139 4.554 10.116 3.578 C 11.092 2.602 12.675 2.602 13.651 3.578 ZM 11.530 4.992 C 11.356 5.166 11.337 5.435 11.471 5.629 L 11.529 5.698 L 14.004 8.174 L 16.480 5.699 C 16.653 5.526 16.673 5.256 16.538 5.062 L 16.480 4.992 C 16.306 4.819 16.037 4.799 15.842 4.935 L 15.772 4.992 L 14.003 6.761 L 12.236 4.991 L 12.168 4.934 C 11.973 4.799 11.704 4.819 11.530 4.992 Z"),
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
        return _handHeartLine!!
    }

private var _handHeartLine: ImageVector? = null
