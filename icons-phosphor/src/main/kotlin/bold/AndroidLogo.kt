package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) return _androidLogo!!
        _androidLogo = phosphorBoldIcon(
            name = "AndroidLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 148.000 C 180.000 156.837 172.837 164.000 164.000 164.000 C 155.163 164.000 148.000 156.837 148.000 148.000 C 148.000 139.163 155.163 132.000 164.000 132.000 C 172.837 132.000 180.000 139.163 180.000 148.000 ZM 92.000 132.000 C 83.163 132.000 76.000 139.163 76.000 148.000 C 76.000 156.837 83.163 164.000 92.000 164.000 C 100.837 164.000 108.000 156.837 108.000 148.000 C 108.000 139.163 100.837 132.000 92.000 132.000 ZM 244.000 160.000 L 244.000 184.000 C 244.000 195.046 235.046 204.000 224.000 204.000 L 32.000 204.000 C 20.954 204.000 12.000 195.046 12.000 184.000 L 12.000 161.130 C 11.969 130.286 24.083 100.671 45.720 78.690 L 23.510 56.490 C 18.816 51.796 18.816 44.184 23.510 39.490 C 28.204 34.796 35.816 34.796 40.510 39.490 L 64.300 63.330 C 83.030 50.790 105.049 44.065 127.590 44.000 L 128.000 44.000 C 150.718 43.938 172.948 50.597 191.890 63.140 L 215.510 39.510 C 220.204 34.816 227.816 34.816 232.510 39.510 C 237.204 44.204 237.204 51.816 232.510 56.510 L 210.510 78.510 C 232.032 100.162 244.077 129.472 244.000 160.000 ZM 220.000 160.000 C 220.000 135.543 210.262 112.092 192.937 94.829 C 175.612 77.566 152.127 67.912 127.670 68.000 C 77.120 68.180 36.000 110.000 36.000 161.130 L 36.000 180.000 L 220.000 180.000 Z"),
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
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
