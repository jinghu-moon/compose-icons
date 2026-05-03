package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareTwo: ImageVector
    get() {
        if (_numberSquareTwo != null) return _numberSquareTwo!!
        _numberSquareTwo = phosphorLightIcon(
            name = "NumberSquareTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 158.000 176.000 C 158.000 179.314 155.314 182.000 152.000 182.000 L 104.000 182.000 C 101.727 182.000 99.650 180.716 98.633 178.683 C 97.617 176.651 97.836 174.218 99.200 172.400 L 142.370 114.840 C 146.599 109.173 147.118 101.554 143.697 95.365 C 140.275 89.177 133.547 85.565 126.498 86.133 C 119.450 86.701 113.387 91.343 111.000 98.000 C 110.324 100.070 108.578 101.612 106.440 102.027 C 104.302 102.442 102.106 101.665 100.705 99.998 C 99.303 98.331 98.914 96.035 99.690 94.000 C 103.684 82.929 113.782 75.217 125.514 74.277 C 137.245 73.337 148.443 79.344 154.148 89.637 C 159.854 99.930 159.014 112.609 152.000 122.060 L 116.000 170.000 L 152.000 170.000 C 155.314 170.000 158.000 172.686 158.000 176.000 Z"),
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
        return _numberSquareTwo!!
    }

private var _numberSquareTwo: ImageVector? = null
