package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) return _crownSimple!!
        _crownSimple = phosphorFillIcon(
            name = "CrownSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 239.750 90.810 C 239.750 90.920 239.750 91.020 239.680 91.130 L 217.000 195.000 C 215.560 202.545 208.961 208.002 201.280 208.000 L 54.710 208.000 C 47.033 207.997 40.440 202.541 39.000 195.000 L 16.320 91.130 C 16.320 91.020 16.270 90.920 16.250 90.810 C 14.974 83.742 18.564 76.691 25.030 73.564 C 31.495 70.437 39.252 72.002 44.000 77.390 L 77.670 113.680 L 113.470 33.390 C 113.472 33.357 113.472 33.323 113.470 33.290 C 116.084 27.620 121.757 23.989 128.000 23.989 C 134.243 23.989 139.916 27.620 142.530 33.290 C 142.528 33.323 142.528 33.357 142.530 33.390 L 178.330 113.680 L 212.000 77.390 C 216.757 72.043 224.487 70.505 230.928 73.624 C 237.370 76.744 240.956 83.762 239.710 90.810 Z"),
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
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
