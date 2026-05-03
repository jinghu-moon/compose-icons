package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) return _windowsLogo!!
        _windowsLogo = phosphorDuotoneIcon(
            name = "WindowsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 128.000 144.000 L 208.000 144.000 L 208.000 216.000 L 128.000 201.450 ZM 32.000 184.000 L 96.000 195.640 L 96.000 144.000 L 32.000 144.000 ZM 128.000 54.550 L 128.000 112.000 L 208.000 112.000 L 208.000 40.000 ZM 32.000 112.000 L 96.000 112.000 L 96.000 60.360 L 32.000 72.000 Z"),
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
        pathData = parseSvgPathData("M 208.000 136.000 L 128.000 136.000 C 123.582 136.000 120.000 139.582 120.000 144.000 L 120.000 201.450 C 119.996 205.320 122.762 208.638 126.570 209.330 L 206.570 223.870 C 207.042 223.958 207.520 224.002 208.000 224.000 C 212.418 224.000 216.000 220.418 216.000 216.000 L 216.000 144.000 C 216.000 139.582 212.418 136.000 208.000 136.000 ZM 200.000 206.410 L 136.000 194.780 L 136.000 152.000 L 200.000 152.000 ZM 96.000 136.000 L 32.000 136.000 C 27.582 136.000 24.000 139.582 24.000 144.000 L 24.000 184.000 C 24.001 187.866 26.766 191.179 30.570 191.870 L 94.570 203.510 C 95.042 203.593 95.521 203.637 96.000 203.640 C 100.418 203.640 104.000 200.058 104.000 195.640 L 104.000 144.000 C 104.000 139.582 100.418 136.000 96.000 136.000 ZM 88.000 186.050 L 40.000 177.320 L 40.000 152.000 L 88.000 152.000 ZM 213.130 33.860 C 211.308 32.339 208.905 31.705 206.570 32.130 L 126.570 46.680 C 122.766 47.371 120.001 50.684 120.000 54.550 L 120.000 112.000 C 120.000 116.418 123.582 120.000 128.000 120.000 L 208.000 120.000 C 212.418 120.000 216.000 116.418 216.000 112.000 L 216.000 40.000 C 216.000 37.629 214.949 35.380 213.130 33.860 ZM 200.000 104.000 L 136.000 104.000 L 136.000 61.220 L 200.000 49.590 ZM 101.130 54.220 C 99.308 52.699 96.905 52.065 94.570 52.490 L 30.570 64.130 C 26.766 64.821 24.001 68.134 24.000 72.000 L 24.000 112.000 C 24.000 116.418 27.582 120.000 32.000 120.000 L 96.000 120.000 C 100.418 120.000 104.000 116.418 104.000 112.000 L 104.000 60.360 C 104.000 57.989 102.949 55.740 101.130 54.220 ZM 88.000 104.000 L 40.000 104.000 L 40.000 78.680 L 88.000 70.000 Z"),
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
        return _windowsLogo!!
    }

private var _windowsLogo: ImageVector? = null
