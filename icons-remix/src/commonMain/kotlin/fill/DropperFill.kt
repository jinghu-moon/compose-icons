package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DropperFill: ImageVector
    get() {
        if (_dropperFill != null) return _dropperFill!!
        _dropperFill = remixIcon(
            name = "DropperFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.535 2.807 C 17.098 1.245 19.630 1.245 21.192 2.807 C 22.754 4.370 22.754 6.902 21.192 8.464 L 18.364 11.293 L 18.718 11.647 C 19.108 12.037 19.108 12.670 18.718 13.061 C 18.327 13.451 17.694 13.451 17.303 13.061 L 16.950 12.707 L 10.735 18.922 C 10.177 19.480 9.465 19.861 8.691 20.016 L 6.937 20.367 C 6.550 20.444 6.194 20.635 5.915 20.914 L 4.929 21.900 C 4.538 22.290 3.905 22.290 3.515 21.900 L 2.101 20.486 C 1.710 20.095 1.710 19.462 2.101 19.071 L 3.087 18.085 C 3.366 17.806 3.556 17.450 3.633 17.063 L 3.984 15.309 C 4.139 14.535 4.520 13.823 5.078 13.265 L 11.293 7.050 L 10.939 6.697 C 10.549 6.306 10.549 5.673 10.939 5.283 C 11.330 4.892 11.963 4.892 12.354 5.283 L 12.707 5.636 L 15.535 2.807 ZM 12.707 8.465 L 6.492 14.679 C 6.213 14.959 6.023 15.314 5.945 15.701 L 5.595 17.455 C 5.440 18.230 5.059 18.941 4.501 19.500 C 5.059 18.941 5.770 18.560 6.545 18.406 L 8.299 18.055 C 8.686 17.977 9.042 17.787 9.321 17.508 L 15.535 11.293 L 12.707 8.465 Z"),
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
        return _dropperFill!!
    }

private var _dropperFill: ImageVector? = null
