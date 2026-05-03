package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = tablerFilledIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.004 2.000 C 16.946 2.000 20.292 4.503 20.854 8.444 C 21.353 11.709 20.579 15.041 18.691 17.752 C 17.766 19.102 16.571 20.245 15.181 21.108 C 13.199 22.298 10.805 22.298 8.808 21.100 C 7.426 20.240 6.238 19.103 5.319 17.760 C 3.422 15.054 2.644 11.720 3.148 8.454 C 3.712 4.504 7.058 2.000 12.004 2.000 ZM 13.917 16.600 C 13.811 16.357 13.613 16.166 13.366 16.069 C 13.119 15.972 12.843 15.977 12.600 16.083 L 12.454 16.138 C 12.108 16.248 11.733 16.228 11.400 16.083 L 11.290 16.043 C 10.782 15.887 10.242 16.155 10.058 16.653 C 9.875 17.152 10.113 17.706 10.600 17.917 C 11.493 18.307 12.507 18.307 13.400 17.917 C 13.643 17.811 13.834 17.613 13.931 17.366 C 14.028 17.119 14.023 16.843 13.917 16.600 ZM 8.613 10.210 C 8.196 9.887 7.600 9.944 7.251 10.340 C 6.903 10.735 6.921 11.334 7.293 11.707 L 9.293 13.707 L 9.387 13.790 C 9.804 14.113 10.400 14.056 10.749 13.660 C 11.097 13.265 11.079 12.666 10.707 12.293 L 8.707 10.293 ZM 16.707 10.293 C 16.316 9.903 15.684 9.903 15.293 10.293 L 13.293 12.293 L 13.210 12.387 C 12.887 12.804 12.944 13.400 13.340 13.749 C 13.735 14.097 14.334 14.079 14.707 13.707 L 16.707 11.707 L 16.790 11.613 C 17.099 11.215 17.063 10.649 16.707 10.293 Z"),
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
        return _alien!!
    }

private var _alien: ImageVector? = null
