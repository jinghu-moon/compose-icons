package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) return _cloudFog!!
        _cloudFog = phosphorThinIcon(
            name = "CloudFog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 204.000 L 72.000 204.000 C 69.791 204.000 68.000 202.209 68.000 200.000 C 68.000 197.791 69.791 196.000 72.000 196.000 L 120.000 196.000 C 122.209 196.000 124.000 197.791 124.000 200.000 C 124.000 202.209 122.209 204.000 120.000 204.000 ZM 184.000 196.000 L 160.000 196.000 C 157.791 196.000 156.000 197.791 156.000 200.000 C 156.000 202.209 157.791 204.000 160.000 204.000 L 184.000 204.000 C 186.209 204.000 188.000 202.209 188.000 200.000 C 188.000 197.791 186.209 196.000 184.000 196.000 ZM 160.000 228.000 L 104.000 228.000 C 101.791 228.000 100.000 229.791 100.000 232.000 C 100.000 234.209 101.791 236.000 104.000 236.000 L 160.000 236.000 C 162.209 236.000 164.000 234.209 164.000 232.000 C 164.000 229.791 162.209 228.000 160.000 228.000 ZM 228.000 100.000 C 227.956 139.746 195.746 171.956 156.000 172.000 L 76.000 172.000 C 57.470 171.984 40.604 161.303 32.668 144.558 C 24.731 127.813 27.142 107.996 38.862 93.642 C 50.581 79.289 69.516 72.963 87.510 77.390 C 98.646 43.839 132.471 23.315 167.373 28.932 C 202.275 34.549 227.953 64.649 228.000 100.000 ZM 220.000 100.000 C 219.921 65.412 192.399 37.133 157.826 36.114 C 123.253 35.096 94.115 61.707 92.000 96.230 C 91.873 98.439 89.979 100.127 87.770 100.000 C 85.561 99.873 83.873 97.979 84.000 95.770 C 84.206 92.189 84.681 88.629 85.420 85.120 C 70.428 81.496 54.687 86.814 44.966 98.789 C 35.244 110.764 33.274 127.261 39.902 141.189 C 46.530 155.116 60.576 163.992 76.000 164.000 L 156.000 164.000 C 191.330 163.961 219.961 135.330 220.000 100.000 Z"),
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
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
