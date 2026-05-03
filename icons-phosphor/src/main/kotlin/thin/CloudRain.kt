package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) return _cloudRain!!
        _cloudRain = phosphorThinIcon(
            name = "CloudRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 155.330 194.220 L 123.330 242.220 C 122.104 244.059 119.619 244.556 117.780 243.330 C 115.941 242.104 115.444 239.619 116.670 237.780 L 148.670 189.780 C 149.896 187.941 152.381 187.444 154.220 188.670 C 156.059 189.896 156.556 192.381 155.330 194.220 ZM 228.000 92.000 C 227.956 131.746 195.746 163.956 156.000 164.000 L 130.140 164.000 L 99.330 210.220 C 98.104 212.059 95.619 212.556 93.780 211.330 C 91.941 210.104 91.444 207.619 92.670 205.780 L 120.530 164.000 L 76.000 164.000 C 57.470 163.984 40.604 153.303 32.668 136.558 C 24.731 119.813 27.142 99.996 38.862 85.642 C 50.581 71.289 69.516 64.963 87.510 69.390 C 98.646 35.839 132.471 15.315 167.373 20.932 C 202.275 26.549 227.953 56.649 228.000 92.000 ZM 220.000 92.000 C 219.921 57.412 192.399 29.133 157.826 28.114 C 123.253 27.096 94.115 53.707 92.000 88.230 C 91.873 90.439 89.979 92.127 87.770 92.000 C 85.561 91.873 83.873 89.979 84.000 87.770 C 84.206 84.189 84.681 80.629 85.420 77.120 C 70.428 73.496 54.687 78.814 44.966 90.789 C 35.244 102.764 33.274 119.261 39.902 133.189 C 46.530 147.116 60.576 155.992 76.000 156.000 L 156.000 156.000 C 191.330 155.961 219.961 127.330 220.000 92.000 Z"),
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
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
