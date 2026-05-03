package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) return _cloudSnow!!
        _cloudSnow = phosphorBoldIcon(
            name = "CloudSnow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 208.000 C 184.000 216.837 176.837 224.000 168.000 224.000 C 159.163 224.000 152.000 216.837 152.000 208.000 C 152.000 199.163 159.163 192.000 168.000 192.000 C 176.837 192.000 184.000 199.163 184.000 208.000 ZM 120.000 192.000 C 111.163 192.000 104.000 199.163 104.000 208.000 C 104.000 216.837 111.163 224.000 120.000 224.000 C 128.837 224.000 136.000 216.837 136.000 208.000 C 136.000 199.163 128.837 192.000 120.000 192.000 ZM 72.000 192.000 C 63.163 192.000 56.000 199.163 56.000 208.000 C 56.000 216.837 63.163 224.000 72.000 224.000 C 80.837 224.000 88.000 216.837 88.000 208.000 C 88.000 199.163 80.837 192.000 72.000 192.000 ZM 236.000 92.000 C 235.950 136.162 200.162 171.950 156.000 172.000 L 76.000 172.000 C 45.072 172.000 20.000 146.928 20.000 116.000 C 20.000 85.072 45.072 60.000 76.000 60.000 C 78.135 60.000 80.268 60.120 82.390 60.360 C 97.430 25.496 134.886 5.986 172.075 13.646 C 209.265 21.306 235.962 54.030 236.000 92.000 ZM 212.000 92.000 C 211.817 61.816 187.768 37.196 157.597 36.305 C 127.426 35.413 101.965 58.570 100.000 88.690 C 99.619 95.317 93.937 100.381 87.310 100.000 C 80.683 99.619 75.619 93.937 76.000 87.310 C 76.060 86.200 76.150 85.100 76.260 84.000 L 76.000 84.000 C 58.327 84.000 44.000 98.327 44.000 116.000 C 44.000 133.673 58.327 148.000 76.000 148.000 L 156.000 148.000 C 186.914 147.967 211.967 122.914 212.000 92.000 Z"),
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
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null
