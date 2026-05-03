package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = phosphorBoldIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 234.380 210.000 C 220.670 185.937 199.261 167.188 173.600 156.770 C 199.770 137.142 210.445 102.971 200.100 71.937 C 189.755 40.903 160.713 19.970 128.000 19.970 C 95.287 19.970 66.245 40.903 55.900 71.937 C 45.555 102.971 56.230 137.142 82.400 156.770 C 56.739 167.188 35.330 185.937 21.620 210.000 C 19.307 213.719 19.204 218.404 21.352 222.221 C 23.499 226.039 27.556 228.383 31.936 228.337 C 36.316 228.291 40.323 225.862 42.390 222.000 C 60.510 190.680 92.510 172.000 128.000 172.000 C 163.490 172.000 195.490 190.690 213.610 222.000 C 217.030 227.499 224.196 229.293 229.803 226.053 C 235.410 222.814 237.436 215.709 234.380 210.000 ZM 76.000 96.000 C 76.000 67.281 99.281 44.000 128.000 44.000 C 156.719 44.000 180.000 67.281 180.000 96.000 C 180.000 124.719 156.719 148.000 128.000 148.000 C 99.295 147.967 76.033 124.705 76.000 96.000 Z"),
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
        return _user!!
    }

private var _user: ImageVector? = null
