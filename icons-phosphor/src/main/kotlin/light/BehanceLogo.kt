package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) return _behanceLogo!!
        _behanceLogo = phosphorLightIcon(
            name = "BehanceLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 112.150 122.360 C 124.249 112.900 129.014 96.807 124.016 82.285 C 119.018 67.763 105.358 58.010 90.000 58.000 L 32.000 58.000 C 28.686 58.000 26.000 60.686 26.000 64.000 L 26.000 192.000 C 26.000 195.314 28.686 198.000 32.000 198.000 L 94.000 198.000 C 112.492 197.995 128.571 185.315 132.886 167.333 C 137.201 149.351 128.627 130.756 112.150 122.360 ZM 38.000 70.000 L 90.000 70.000 C 103.255 70.000 114.000 80.745 114.000 94.000 C 114.000 107.255 103.255 118.000 90.000 118.000 L 38.000 118.000 ZM 94.000 186.000 L 38.000 186.000 L 38.000 130.000 L 94.000 130.000 C 109.464 130.000 122.000 142.536 122.000 158.000 C 122.000 173.464 109.464 186.000 94.000 186.000 ZM 162.000 80.000 C 162.000 76.686 164.686 74.000 168.000 74.000 L 232.000 74.000 C 235.314 74.000 238.000 76.686 238.000 80.000 C 238.000 83.314 235.314 86.000 232.000 86.000 L 168.000 86.000 C 164.686 86.000 162.000 83.314 162.000 80.000 ZM 200.000 106.000 C 178.371 106.004 159.665 121.075 155.062 142.209 C 150.458 163.343 161.200 184.830 180.868 193.829 C 200.536 202.829 223.818 196.910 236.800 179.610 C 238.791 176.959 238.256 173.196 235.605 171.205 C 232.954 169.214 229.191 169.749 227.200 172.400 C 219.081 183.228 205.313 188.210 192.145 185.085 C 178.977 181.959 168.917 171.322 166.530 158.000 L 240.000 158.000 C 243.314 158.000 246.000 155.314 246.000 152.000 C 245.967 126.609 225.391 106.033 200.000 106.000 ZM 166.530 146.000 C 169.427 129.786 183.529 117.980 200.000 117.980 C 216.471 117.980 230.573 129.786 233.470 146.000 Z"),
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
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
