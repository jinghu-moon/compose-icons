package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleFive: ImageVector
    get() {
        if (_numberCircleFive != null) return _numberCircleFive!!
        _numberCircleFive = phosphorLightIcon(
            name = "NumberCircleFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 117.080 86.000 L 112.080 116.000 C 115.912 114.666 119.942 113.990 124.000 114.000 C 142.778 114.000 158.000 129.222 158.000 148.000 C 158.000 166.778 142.778 182.000 124.000 182.000 C 114.911 182.154 106.148 178.618 99.710 172.200 C 97.390 169.831 97.431 166.030 99.800 163.710 C 102.169 161.390 105.970 161.431 108.290 163.800 C 112.471 167.908 118.140 170.145 124.000 170.000 C 136.150 170.000 146.000 160.150 146.000 148.000 C 146.000 135.850 136.150 126.000 124.000 126.000 C 118.140 125.855 112.471 128.092 108.290 132.200 C 106.456 134.081 103.612 134.550 101.271 133.358 C 98.930 132.166 97.637 129.589 98.080 127.000 L 106.080 79.000 C 106.568 76.112 109.071 73.998 112.000 74.000 L 152.000 74.000 C 155.314 74.000 158.000 76.686 158.000 80.000 C 158.000 83.314 155.314 86.000 152.000 86.000 Z"),
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
        return _numberCircleFive!!
    }

private var _numberCircleFive: ImageVector? = null
