package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TrainWifiFill: ImageVector
    get() {
        if (_trainWifiFill != null) return _trainWifiFill!!
        _trainWifiFill = remixIcon(
            name = "TrainWifiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.498 3.000 C 12.177 3.770 12.000 4.614 12.000 5.500 C 12.000 6.016 12.060 6.518 12.174 7.000 L 5.000 7.000 L 5.000 11.000 L 15.035 11.000 C 16.038 11.634 17.226 12.000 18.500 12.000 C 19.386 12.000 20.231 11.823 21.001 11.502 L 21.000 18.000 C 21.000 19.105 20.105 20.000 19.000 20.000 L 17.200 20.000 L 19.000 21.500 L 19.000 22.000 L 5.000 22.000 L 5.000 21.500 L 6.800 20.000 L 5.000 20.000 C 3.895 20.000 3.000 19.105 3.000 18.000 L 3.000 7.000 C 3.000 4.791 4.791 3.000 7.000 3.000 L 12.498 3.000 ZM 12.000 14.000 C 10.895 14.000 10.000 14.895 10.000 16.000 C 10.000 17.105 10.895 18.000 12.000 18.000 C 13.105 18.000 14.000 17.105 14.000 16.000 C 14.000 14.895 13.105 14.000 12.000 14.000 ZM 18.500 1.000 C 20.985 1.000 23.000 3.015 23.000 5.500 C 23.000 7.985 20.985 10.000 18.500 10.000 C 16.015 10.000 14.000 7.985 14.000 5.500 C 14.000 3.015 16.015 1.000 18.500 1.000 ZM 18.500 6.167 C 18.009 6.167 17.559 6.344 17.211 6.637 L 17.086 6.752 L 18.500 8.167 L 19.913 6.752 C 19.551 6.390 19.052 6.167 18.500 6.167 ZM 18.500 3.500 C 17.297 3.500 16.200 3.955 15.372 4.703 L 15.199 4.868 L 16.143 5.810 C 16.746 5.206 17.579 4.833 18.500 4.833 C 19.344 4.833 20.114 5.147 20.701 5.664 L 20.857 5.810 L 21.800 4.867 C 20.955 4.022 19.788 3.500 18.500 3.500 Z"),
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
        return _trainWifiFill!!
    }

private var _trainWifiFill: ImageVector? = null
