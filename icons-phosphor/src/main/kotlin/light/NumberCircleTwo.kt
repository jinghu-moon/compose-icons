package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) return _numberCircleTwo!!
        _numberCircleTwo = phosphorLightIcon(
            name = "NumberCircleTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 152.000 122.050 L 116.000 170.050 L 152.000 170.050 C 155.314 170.050 158.000 172.736 158.000 176.050 C 158.000 179.364 155.314 182.050 152.000 182.050 L 104.000 182.050 C 101.727 182.050 99.650 180.766 98.633 178.733 C 97.617 176.701 97.836 174.268 99.200 172.450 L 142.370 114.890 C 146.569 109.225 147.073 101.629 143.659 95.459 C 140.245 89.288 133.543 85.679 126.512 86.227 C 119.482 86.774 113.418 91.376 111.000 98.000 C 110.324 100.070 108.578 101.612 106.440 102.027 C 104.302 102.442 102.106 101.665 100.705 99.998 C 99.303 98.331 98.914 96.035 99.690 94.000 C 103.678 82.923 113.776 75.202 125.511 74.258 C 137.246 73.314 148.448 79.321 154.156 89.618 C 159.863 99.915 159.020 112.599 152.000 122.050 Z"),
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
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
