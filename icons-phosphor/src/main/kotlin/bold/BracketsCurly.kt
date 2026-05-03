package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) return _bracketsCurly!!
        _bracketsCurly = phosphorBoldIcon(
            name = "BracketsCurly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 54.800 119.490 C 53.311 122.594 51.374 125.461 49.050 128.000 C 51.374 130.539 53.311 133.406 54.800 136.510 C 60.000 147.240 60.000 159.830 60.000 172.000 C 60.000 197.940 61.840 204.000 80.000 204.000 C 86.627 204.000 92.000 209.373 92.000 216.000 C 92.000 222.627 86.627 228.000 80.000 228.000 C 60.860 228.000 47.800 221.100 41.200 207.490 C 36.000 196.760 36.000 184.170 36.000 172.000 C 36.000 146.060 34.160 140.000 16.000 140.000 C 9.373 140.000 4.000 134.627 4.000 128.000 C 4.000 121.373 9.373 116.000 16.000 116.000 C 34.160 116.000 36.000 109.940 36.000 84.000 C 36.000 71.830 36.000 59.240 41.200 48.510 C 47.800 34.900 60.860 28.000 80.000 28.000 C 86.627 28.000 92.000 33.373 92.000 40.000 C 92.000 46.627 86.627 52.000 80.000 52.000 C 61.840 52.000 60.000 58.060 60.000 84.000 C 60.000 96.170 60.000 108.760 54.800 119.490 ZM 240.000 116.000 C 221.840 116.000 220.000 109.940 220.000 84.000 C 220.000 71.830 220.000 59.240 214.800 48.510 C 208.200 34.900 195.140 28.000 176.000 28.000 C 169.373 28.000 164.000 33.373 164.000 40.000 C 164.000 46.627 169.373 52.000 176.000 52.000 C 194.160 52.000 196.000 58.060 196.000 84.000 C 196.000 96.170 196.000 108.760 201.200 119.490 C 202.704 122.597 204.658 125.464 207.000 128.000 C 204.676 130.539 202.739 133.406 201.250 136.510 C 196.000 147.240 196.000 159.830 196.000 172.000 C 196.000 197.940 194.160 204.000 176.000 204.000 C 169.373 204.000 164.000 209.373 164.000 216.000 C 164.000 222.627 169.373 228.000 176.000 228.000 C 195.140 228.000 208.200 221.100 214.800 207.490 C 220.000 196.760 220.000 184.170 220.000 172.000 C 220.000 146.060 221.840 140.000 240.000 140.000 C 246.627 140.000 252.000 134.627 252.000 128.000 C 252.000 121.373 246.627 116.000 240.000 116.000 Z"),
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
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
