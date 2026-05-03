package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) return _androidLogo!!
        _androidLogo = phosphorRegularIcon(
            name = "AndroidLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 148.000 C 176.000 154.627 170.627 160.000 164.000 160.000 C 157.373 160.000 152.000 154.627 152.000 148.000 C 152.000 141.373 157.373 136.000 164.000 136.000 C 170.627 136.000 176.000 141.373 176.000 148.000 ZM 92.000 136.000 C 85.373 136.000 80.000 141.373 80.000 148.000 C 80.000 154.627 85.373 160.000 92.000 160.000 C 98.627 160.000 104.000 154.627 104.000 148.000 C 104.000 141.373 98.627 136.000 92.000 136.000 ZM 240.000 160.000 L 240.000 184.000 C 240.000 192.837 232.837 200.000 224.000 200.000 L 32.000 200.000 C 23.163 200.000 16.000 192.837 16.000 184.000 L 16.000 161.130 C 15.971 129.962 28.774 100.157 51.400 78.720 L 26.340 53.660 C 23.214 50.534 23.214 45.466 26.340 42.340 C 29.466 39.214 34.534 39.214 37.660 42.340 L 63.820 68.500 C 102.311 41.235 153.799 41.159 192.370 68.310 L 218.370 42.310 C 221.496 39.184 226.564 39.184 229.690 42.310 C 232.816 45.436 232.816 50.504 229.690 53.630 L 204.820 78.500 C 205.570 79.210 206.320 79.930 207.060 80.670 C 228.217 101.637 240.083 130.213 240.000 160.000 ZM 224.000 160.000 C 224.000 106.981 181.019 64.000 128.000 64.000 L 127.660 64.000 C 74.910 64.180 32.000 107.750 32.000 161.130 L 32.000 184.000 L 224.000 184.000 Z"),
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
