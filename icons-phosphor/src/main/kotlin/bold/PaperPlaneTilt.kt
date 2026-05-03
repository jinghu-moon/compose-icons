package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) return _paperPlaneTilt!!
        _paperPlaneTilt = phosphorBoldIcon(
            name = "PaperPlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.140 25.860 C 225.022 20.741 217.537 18.786 210.570 20.750 L 210.350 20.820 L 18.440 79.000 C 10.472 81.311 4.758 88.302 4.078 96.571 C 3.399 104.840 7.896 112.669 15.380 116.250 L 99.000 157.000 L 139.710 240.650 C 142.988 247.620 150.008 252.058 157.710 252.030 C 158.280 252.030 158.860 252.030 159.440 251.960 C 167.736 251.321 174.749 245.570 177.000 237.560 L 235.180 45.650 C 235.209 45.579 235.233 45.505 235.250 45.430 C 237.214 38.463 235.259 30.978 230.140 25.860 ZM 156.910 221.070 L 122.540 150.430 L 168.540 104.480 C 173.234 99.786 173.234 92.174 168.540 87.480 C 163.846 82.786 156.234 82.786 151.540 87.480 L 105.540 133.480 L 34.930 99.090 L 210.000 46.000 Z"),
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
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
