package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) return _androidLogo!!
        _androidLogo = phosphorDuotoneIcon(
            name = "AndroidLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 232.000 160.000 L 232.000 184.000 C 232.000 188.418 228.418 192.000 224.000 192.000 L 32.000 192.000 C 27.582 192.000 24.000 188.418 24.000 184.000 L 24.000 161.130 C 24.000 103.650 70.150 56.200 127.630 56.000 C 155.277 55.902 181.825 66.815 201.408 86.330 C 220.992 105.844 232.000 132.353 232.000 160.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 176.000 148.000 C 176.000 154.627 170.627 160.000 164.000 160.000 C 157.373 160.000 152.000 154.627 152.000 148.000 C 152.000 141.373 157.373 136.000 164.000 136.000 C 170.627 136.000 176.000 141.373 176.000 148.000 ZM 92.000 136.000 C 85.373 136.000 80.000 141.373 80.000 148.000 C 80.000 154.627 85.373 160.000 92.000 160.000 C 98.627 160.000 104.000 154.627 104.000 148.000 C 104.000 141.373 98.627 136.000 92.000 136.000 ZM 240.000 160.000 L 240.000 184.000 C 240.000 192.837 232.837 200.000 224.000 200.000 L 32.000 200.000 C 23.163 200.000 16.000 192.837 16.000 184.000 L 16.000 161.130 C 15.971 129.962 28.774 100.157 51.400 78.720 L 26.340 53.660 C 23.214 50.534 23.214 45.466 26.340 42.340 C 29.466 39.214 34.534 39.214 37.660 42.340 L 63.820 68.500 C 102.310 41.229 153.804 41.157 192.370 68.320 L 218.370 42.320 C 221.496 39.194 226.564 39.194 229.690 42.320 C 232.816 45.446 232.816 50.514 229.690 53.640 L 204.820 78.500 C 205.570 79.210 206.320 79.930 207.060 80.670 C 228.217 101.637 240.083 130.213 240.000 160.000 ZM 224.000 160.000 C 224.000 106.981 181.019 64.000 128.000 64.000 L 127.660 64.000 C 74.910 64.180 32.000 107.750 32.000 161.130 L 32.000 184.000 L 224.000 184.000 Z"),
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
