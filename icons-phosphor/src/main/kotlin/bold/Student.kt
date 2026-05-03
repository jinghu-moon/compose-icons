package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Student: ImageVector
    get() {
        if (_student != null) return _student!!
        _student = phosphorBoldIcon(
            name = "Student",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.790 52.620 L 131.790 20.620 C 129.331 19.790 126.669 19.790 124.210 20.620 L 28.210 52.620 C 23.522 54.173 20.264 58.439 20.000 63.370 C 19.989 63.580 19.989 63.790 20.000 64.000 L 20.000 144.000 C 20.000 150.627 25.373 156.000 32.000 156.000 C 38.627 156.000 44.000 150.627 44.000 144.000 L 44.000 80.650 L 67.710 88.550 C 52.526 117.615 60.276 153.378 86.130 173.550 C 69.734 181.635 55.858 194.045 46.000 209.440 C 43.584 213.031 43.289 217.645 45.228 221.514 C 47.166 225.384 51.039 227.910 55.361 228.124 C 59.684 228.339 63.788 226.209 66.100 222.550 C 80.370 200.590 103.000 188.000 128.000 188.000 C 153.000 188.000 175.630 200.590 189.950 222.550 C 192.262 226.209 196.366 228.339 200.689 228.124 C 205.011 227.910 208.884 225.384 210.822 221.514 C 212.761 217.645 212.466 213.031 210.050 209.440 C 200.182 194.027 186.288 181.606 169.870 173.520 C 195.724 153.348 203.474 117.585 188.290 88.520 L 227.790 75.350 C 232.684 73.713 235.983 69.130 235.983 63.970 C 235.983 58.810 232.684 54.227 227.790 52.590 ZM 128.000 44.620 L 186.050 64.000 L 128.000 83.350 L 70.000 64.000 ZM 172.000 120.000 C 172.004 138.745 160.131 155.433 142.422 161.577 C 124.713 167.722 105.056 161.972 93.450 147.253 C 81.843 132.534 80.836 112.078 90.940 96.290 L 124.210 107.380 C 126.669 108.207 129.331 108.207 131.790 107.380 L 165.060 96.290 C 169.598 103.365 172.007 111.595 172.000 120.000 Z"),
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
        return _student!!
    }

private var _student: ImageVector? = null
