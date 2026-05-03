package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) return _androidLogo!!
        _androidLogo = phosphorFillIcon(
            name = "AndroidLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 207.060 80.670 C 206.320 79.930 205.570 79.210 204.820 78.500 L 229.660 53.660 C 232.786 50.534 232.786 45.466 229.660 42.340 C 226.534 39.214 221.466 39.214 218.340 42.340 L 192.340 68.340 C 153.769 41.189 102.281 41.265 63.790 68.530 L 37.660 42.340 C 34.534 39.214 29.466 39.214 26.340 42.340 C 23.214 45.466 23.214 50.534 26.340 53.660 L 51.400 78.720 C 28.774 100.157 15.971 129.962 16.000 161.130 L 16.000 184.000 C 16.000 192.837 23.163 200.000 32.000 200.000 L 224.000 200.000 C 232.837 200.000 240.000 192.837 240.000 184.000 L 240.000 160.000 C 240.083 130.213 228.217 101.637 207.060 80.670 ZM 92.000 160.000 C 85.373 160.000 80.000 154.627 80.000 148.000 C 80.000 141.373 85.373 136.000 92.000 136.000 C 98.627 136.000 104.000 141.373 104.000 148.000 C 104.000 154.627 98.627 160.000 92.000 160.000 ZM 164.000 160.000 C 157.373 160.000 152.000 154.627 152.000 148.000 C 152.000 141.373 157.373 136.000 164.000 136.000 C 170.627 136.000 176.000 141.373 176.000 148.000 C 176.000 154.627 170.627 160.000 164.000 160.000 Z"),
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
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
