package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) return _cloudSnow!!
        _cloudSnow = phosphorLightIcon(
            name = "CloudSnow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 86.000 196.000 C 86.000 201.523 81.523 206.000 76.000 206.000 C 70.477 206.000 66.000 201.523 66.000 196.000 C 66.000 190.477 70.477 186.000 76.000 186.000 C 81.523 186.000 86.000 190.477 86.000 196.000 ZM 116.000 202.000 C 110.477 202.000 106.000 206.477 106.000 212.000 C 106.000 217.523 110.477 222.000 116.000 222.000 C 121.523 222.000 126.000 217.523 126.000 212.000 C 126.000 206.477 121.523 202.000 116.000 202.000 ZM 164.000 186.000 C 158.477 186.000 154.000 190.477 154.000 196.000 C 154.000 201.523 158.477 206.000 164.000 206.000 C 169.523 206.000 174.000 201.523 174.000 196.000 C 174.000 190.477 169.523 186.000 164.000 186.000 ZM 68.000 226.000 C 62.477 226.000 58.000 230.477 58.000 236.000 C 58.000 241.523 62.477 246.000 68.000 246.000 C 73.523 246.000 78.000 241.523 78.000 236.000 C 78.000 230.477 73.523 226.000 68.000 226.000 ZM 156.000 226.000 C 150.477 226.000 146.000 230.477 146.000 236.000 C 146.000 241.523 150.477 246.000 156.000 246.000 C 161.523 246.000 166.000 241.523 166.000 236.000 C 166.000 230.477 161.523 226.000 156.000 226.000 ZM 230.000 92.000 C 229.950 132.849 196.849 165.950 156.000 166.000 L 76.000 166.000 C 56.969 165.904 39.644 155.012 31.307 137.905 C 22.969 120.797 25.067 100.440 36.717 85.392 C 48.367 70.344 67.550 63.214 86.200 67.000 C 98.369 33.116 133.138 12.887 168.609 19.054 C 204.079 25.221 229.981 55.997 230.000 92.000 ZM 218.000 92.000 C 217.891 58.515 191.237 31.154 157.766 30.169 C 124.296 29.184 96.078 54.929 94.000 88.350 C 93.807 91.664 90.964 94.193 87.650 94.000 C 84.336 93.807 81.807 90.964 82.000 87.650 C 82.177 84.631 82.534 81.626 83.070 78.650 C 68.907 75.996 54.462 81.582 45.768 93.072 C 37.074 104.563 35.627 119.983 42.032 132.890 C 48.437 145.798 61.591 153.973 76.000 154.000 L 156.000 154.000 C 190.226 153.961 217.961 126.226 218.000 92.000 Z"),
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
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null
