package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ColorFilterFill: ImageVector
    get() {
        if (_colorFilterFill != null) return _colorFilterFill!!
        _colorFilterFill = remixIcon(
            name = "ColorFilterFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.572 8.027 C 16.847 7.408 17.000 6.722 17.000 6.000 C 17.000 3.239 14.761 1.000 12.000 1.000 C 9.238 1.000 7.000 3.239 7.000 6.000 C 7.000 8.583 8.958 10.708 11.470 10.972 C 12.686 9.240 14.576 8.208 16.572 8.027 ZM 13.154 17.946 C 13.996 16.128 14.047 13.974 13.155 12.055 C 14.640 10.012 17.459 9.379 19.696 10.670 L 19.696 10.670 C 22.087 12.051 22.906 15.109 21.526 17.500 C 20.145 19.892 17.087 20.711 14.696 19.330 C 14.071 18.969 13.553 18.494 13.154 17.946 ZM 6.273 10.027 C 7.427 11.665 9.267 12.786 11.375 12.973 C 12.402 15.281 11.540 18.039 9.304 19.330 C 6.912 20.711 3.854 19.891 2.473 17.500 C 1.093 15.108 1.912 12.050 4.304 10.670 C 4.929 10.309 5.599 10.098 6.273 10.027 Z"),
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
        return _colorFilterFill!!
    }

private var _colorFilterFill: ImageVector? = null
