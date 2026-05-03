package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) return _cloudSnow!!
        _cloudSnow = phosphorThinIcon(
            name = "CloudSnow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 84.000 196.000 C 84.000 200.418 80.418 204.000 76.000 204.000 C 71.582 204.000 68.000 200.418 68.000 196.000 C 68.000 191.582 71.582 188.000 76.000 188.000 C 80.418 188.000 84.000 191.582 84.000 196.000 ZM 116.000 204.000 C 111.582 204.000 108.000 207.582 108.000 212.000 C 108.000 216.418 111.582 220.000 116.000 220.000 C 120.418 220.000 124.000 216.418 124.000 212.000 C 124.000 207.582 120.418 204.000 116.000 204.000 ZM 164.000 188.000 C 159.582 188.000 156.000 191.582 156.000 196.000 C 156.000 200.418 159.582 204.000 164.000 204.000 C 168.418 204.000 172.000 200.418 172.000 196.000 C 172.000 191.582 168.418 188.000 164.000 188.000 ZM 68.000 228.000 C 63.582 228.000 60.000 231.582 60.000 236.000 C 60.000 240.418 63.582 244.000 68.000 244.000 C 72.418 244.000 76.000 240.418 76.000 236.000 C 76.000 231.582 72.418 228.000 68.000 228.000 ZM 156.000 228.000 C 151.582 228.000 148.000 231.582 148.000 236.000 C 148.000 240.418 151.582 244.000 156.000 244.000 C 160.418 244.000 164.000 240.418 164.000 236.000 C 164.000 231.582 160.418 228.000 156.000 228.000 ZM 228.000 92.000 C 227.956 131.746 195.746 163.956 156.000 164.000 L 76.000 164.000 C 57.470 163.984 40.604 153.303 32.668 136.558 C 24.731 119.813 27.142 99.996 38.862 85.642 C 50.581 71.289 69.516 64.963 87.510 69.390 C 98.646 35.839 132.471 15.315 167.373 20.932 C 202.275 26.549 227.953 56.649 228.000 92.000 ZM 220.000 92.000 C 219.921 57.412 192.399 29.133 157.826 28.114 C 123.253 27.096 94.115 53.707 92.000 88.230 C 91.873 90.439 89.979 92.127 87.770 92.000 C 85.561 91.873 83.873 89.979 84.000 87.770 C 84.206 84.189 84.681 80.629 85.420 77.120 C 70.428 73.496 54.687 78.814 44.966 90.789 C 35.244 102.764 33.274 119.261 39.902 133.189 C 46.530 147.116 60.576 155.992 76.000 156.000 L 156.000 156.000 C 191.330 155.961 219.961 127.330 220.000 92.000 Z"),
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
