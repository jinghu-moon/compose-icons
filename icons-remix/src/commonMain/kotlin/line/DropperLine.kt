package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DropperLine: ImageVector
    get() {
        if (_dropperLine != null) return _dropperLine!!
        _dropperLine = remixIcon(
            name = "DropperLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.778 4.222 C 20.559 5.003 20.559 6.269 19.778 7.050 L 16.950 9.878 L 14.121 7.050 L 16.950 4.222 C 17.731 3.441 18.997 3.441 19.778 4.222 ZM 21.192 2.807 C 19.630 1.245 17.098 1.245 15.535 2.807 L 12.707 5.636 L 12.354 5.283 C 11.963 4.892 11.330 4.892 10.939 5.283 C 10.549 5.673 10.549 6.306 10.939 6.697 L 11.293 7.050 L 5.078 13.265 C 4.520 13.823 4.139 14.535 3.984 15.309 L 3.633 17.063 C 3.556 17.450 3.366 17.806 3.087 18.085 L 2.101 19.071 C 1.710 19.462 1.710 20.095 2.101 20.486 L 3.515 21.900 C 3.905 22.290 4.538 22.290 4.929 21.900 L 5.915 20.914 C 6.194 20.635 6.550 20.444 6.937 20.367 L 8.691 20.016 C 9.465 19.861 10.177 19.480 10.735 18.922 L 16.950 12.707 L 17.303 13.061 C 17.694 13.451 18.327 13.451 18.718 13.061 C 19.108 12.670 19.108 12.037 18.718 11.647 L 18.364 11.293 L 21.192 8.464 C 22.754 6.902 22.754 4.370 21.192 2.807 ZM 12.707 8.465 L 15.535 11.293 L 9.321 17.508 C 9.042 17.787 8.686 17.977 8.299 18.055 L 6.545 18.406 C 5.770 18.560 5.059 18.941 4.501 19.500 C 5.059 18.941 5.440 18.230 5.595 17.455 L 5.945 15.701 C 6.023 15.314 6.213 14.959 6.492 14.679 L 12.707 8.465 Z"),
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
        return _dropperLine!!
    }

private var _dropperLine: ImageVector? = null
