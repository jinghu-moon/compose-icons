package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ColorFilterAiFill: ImageVector
    get() {
        if (_colorFilterAiFill != null) return _colorFilterAiFill!!
        _colorFilterAiFill = remixIcon(
            name = "ColorFilterAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.511 7.300 C 15.896 7.468 16.281 7.635 16.663 7.806 C 16.635 7.881 16.604 7.955 16.572 8.027 C 14.576 8.208 12.686 9.240 11.470 10.972 C 8.958 10.708 7.000 8.583 7.000 6.000 C 7.000 3.239 9.238 1.000 12.000 1.000 C 13.459 1.000 14.773 1.625 15.687 2.623 C 14.705 3.051 14.000 3.896 14.000 5.000 C 14.000 5.994 14.601 6.904 15.511 7.300 ZM 13.154 17.946 C 13.996 16.128 14.047 13.974 13.155 12.055 C 14.640 10.012 17.459 9.379 19.696 10.670 C 22.087 12.051 22.906 15.109 21.526 17.500 C 20.145 19.892 17.087 20.711 14.696 19.330 C 14.071 18.969 13.553 18.494 13.154 17.946 ZM 6.273 10.027 C 7.427 11.665 9.267 12.786 11.375 12.973 C 12.402 15.281 11.540 18.039 9.304 19.330 C 6.912 20.711 3.854 19.891 2.473 17.500 C 1.093 15.108 1.912 12.050 4.304 10.670 C 4.929 10.309 5.599 10.098 6.273 10.027 ZM 16.876 5.713 L 16.311 5.467 C 15.896 5.286 15.896 4.714 16.311 4.533 L 16.876 4.287 C 17.885 3.847 18.688 3.055 19.127 2.068 L 19.465 1.308 C 19.648 0.897 20.246 0.897 20.428 1.308 L 20.747 2.025 C 21.198 3.038 22.031 3.844 23.074 4.276 L 23.670 4.529 C 24.096 4.706 24.096 5.294 23.670 5.471 L 23.074 5.724 C 22.031 6.156 21.198 6.962 20.747 7.975 L 20.428 8.692 C 20.246 9.103 19.648 9.103 19.465 8.692 L 19.127 7.932 C 18.688 6.945 17.885 6.153 16.876 5.713 Z"),
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
        return _colorFilterAiFill!!
    }

private var _colorFilterAiFill: ImageVector? = null
