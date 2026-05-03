package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) return _trainRegional!!
        _trainRegional = phosphorThinIcon(
            name = "TrainRegional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 219.860 119.000 L 197.470 36.840 C 196.045 31.619 191.302 27.998 185.890 28.000 L 70.110 28.000 C 64.698 27.998 59.955 31.619 58.530 36.840 L 36.140 119.000 C 35.950 119.687 35.950 120.413 36.140 121.100 L 58.530 203.210 C 59.974 208.411 64.712 212.008 70.110 212.000 L 88.000 212.000 L 68.800 237.600 C 67.475 239.367 67.833 241.875 69.600 243.200 C 71.367 244.525 73.875 244.167 75.200 242.400 L 98.000 212.000 L 158.000 212.000 L 180.800 242.400 C 182.125 244.167 184.633 244.525 186.400 243.200 C 188.167 241.875 188.525 239.367 187.200 237.600 L 168.000 212.000 L 185.890 212.000 C 191.302 212.002 196.045 208.381 197.470 203.160 L 219.860 121.050 C 220.041 120.379 220.041 119.671 219.860 119.000 ZM 66.250 39.000 C 66.705 37.239 68.291 36.006 70.110 36.000 L 185.890 36.000 C 187.709 36.006 189.295 37.239 189.750 39.000 L 211.000 116.840 L 128.000 131.930 L 45.000 116.840 ZM 66.250 201.100 L 45.530 125.100 L 124.000 139.340 L 124.000 204.000 L 70.110 204.000 C 68.305 204.000 66.724 202.792 66.250 201.050 ZM 189.750 201.100 C 189.276 202.842 187.695 204.050 185.890 204.050 L 132.000 204.050 L 132.000 139.340 L 210.470 125.070 ZM 92.000 88.000 C 92.000 85.791 93.791 84.000 96.000 84.000 L 160.000 84.000 C 162.209 84.000 164.000 85.791 164.000 88.000 C 164.000 90.209 162.209 92.000 160.000 92.000 L 96.000 92.000 C 93.791 92.000 92.000 90.209 92.000 88.000 Z"),
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
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
