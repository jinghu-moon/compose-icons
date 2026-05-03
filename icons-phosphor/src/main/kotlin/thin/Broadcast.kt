package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Broadcast: ImageVector
    get() {
        if (_broadcast != null) return _broadcast!!
        _broadcast = phosphorThinIcon(
            name = "Broadcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 92.000 C 108.118 92.000 92.000 108.118 92.000 128.000 C 92.000 147.882 108.118 164.000 128.000 164.000 C 147.882 164.000 164.000 147.882 164.000 128.000 C 164.000 108.118 147.882 92.000 128.000 92.000 ZM 128.000 156.000 C 112.536 156.000 100.000 143.464 100.000 128.000 C 100.000 112.536 112.536 100.000 128.000 100.000 C 143.464 100.000 156.000 112.536 156.000 128.000 C 156.000 143.464 143.464 156.000 128.000 156.000 ZM 204.000 128.000 C 204.026 146.700 197.134 164.748 184.650 178.670 C 183.175 180.327 180.637 180.475 178.980 179.000 C 177.323 177.525 177.175 174.987 178.650 173.330 C 201.770 147.532 201.770 108.468 178.650 82.670 C 177.175 81.013 177.323 78.475 178.980 77.000 C 180.637 75.525 183.175 75.673 184.650 77.330 C 197.134 91.252 204.026 109.300 204.000 128.000 ZM 65.340 101.530 C 55.094 125.767 59.769 153.742 77.340 173.330 C 78.815 174.987 78.667 177.525 77.010 179.000 C 75.353 180.475 72.815 180.327 71.340 178.670 C 45.500 149.832 45.500 106.168 71.340 77.330 C 72.815 75.673 75.353 75.525 77.010 77.000 C 78.667 78.475 78.815 81.013 77.340 82.670 C 72.327 88.252 68.272 94.624 65.340 101.530 ZM 244.000 128.000 C 244.034 158.360 232.132 187.517 210.860 209.180 C 209.314 210.760 206.780 210.786 205.200 209.240 C 203.620 207.694 203.594 205.160 205.140 203.580 C 246.336 161.614 246.336 94.386 205.140 52.420 C 203.594 50.840 203.620 48.306 205.200 46.760 C 206.780 45.214 209.314 45.240 210.860 46.820 C 232.132 68.483 244.034 97.640 244.000 128.000 ZM 50.860 203.580 C 52.406 205.160 52.380 207.694 50.800 209.240 C 49.220 210.786 46.686 210.760 45.140 209.180 C 0.906 164.099 0.906 91.901 45.140 46.820 C 46.686 45.240 49.220 45.214 50.800 46.760 C 52.380 48.306 52.406 50.840 50.860 52.420 C 9.664 94.386 9.664 161.614 50.860 203.580 Z"),
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
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
