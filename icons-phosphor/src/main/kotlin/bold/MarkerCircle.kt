package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) return _markerCircle!!
        _markerCircle = phosphorBoldIcon(
            name = "MarkerCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.370 51.600 C 167.920 15.125 110.780 9.480 67.897 38.117 C 25.015 66.755 8.335 121.697 28.060 169.341 C 47.785 216.985 98.419 244.059 148.995 234.004 C 199.571 223.949 235.999 179.565 236.000 128.000 C 235.999 99.348 224.623 71.868 204.370 51.600 ZM 108.000 140.000 L 148.000 140.000 L 148.000 156.000 L 108.000 156.000 ZM 92.000 203.920 L 92.000 180.000 L 164.000 180.000 L 164.000 203.900 C 141.209 214.667 114.797 214.674 92.000 203.920 ZM 188.000 186.790 L 188.000 176.000 C 188.002 166.495 181.313 158.301 172.000 156.400 L 172.000 136.000 C 171.993 126.944 165.901 119.022 157.150 116.690 L 147.270 81.200 C 144.865 72.544 136.984 66.554 128.000 66.554 C 119.016 66.554 111.135 72.544 108.730 81.200 L 98.850 116.690 C 90.099 119.022 84.007 126.944 84.000 136.000 L 84.000 156.420 C 74.694 158.320 68.008 166.502 68.000 176.000 L 68.000 186.770 C 35.688 153.792 36.048 100.919 68.805 68.384 C 101.563 35.848 154.437 35.848 187.195 68.384 C 219.952 100.919 220.312 153.792 188.000 186.770 Z"),
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
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
