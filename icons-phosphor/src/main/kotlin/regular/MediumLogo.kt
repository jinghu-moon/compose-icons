package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) return _mediumLogo!!
        _mediumLogo = phosphorRegularIcon(
            name = "MediumLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 72.000 64.000 C 36.654 64.000 8.000 92.654 8.000 128.000 C 8.000 163.346 36.654 192.000 72.000 192.000 C 107.346 192.000 136.000 163.346 136.000 128.000 C 135.961 92.670 107.330 64.039 72.000 64.000 ZM 72.000 176.000 C 45.490 176.000 24.000 154.510 24.000 128.000 C 24.000 101.490 45.490 80.000 72.000 80.000 C 98.510 80.000 120.000 101.490 120.000 128.000 C 119.972 154.498 98.498 175.972 72.000 176.000 ZM 184.000 64.000 C 178.320 64.000 167.600 66.760 159.680 85.250 C 154.730 96.800 152.000 112.000 152.000 128.000 C 152.000 144.000 154.730 159.200 159.680 170.750 C 167.600 189.240 178.320 192.000 184.000 192.000 C 189.680 192.000 200.400 189.240 208.320 170.750 C 213.270 159.200 216.000 144.000 216.000 128.000 C 216.000 112.000 213.270 96.800 208.320 85.250 C 200.400 66.760 189.680 64.000 184.000 64.000 ZM 184.000 176.000 C 178.360 176.000 168.000 157.780 168.000 128.000 C 168.000 98.220 178.360 80.000 184.000 80.000 C 189.640 80.000 200.000 98.220 200.000 128.000 C 200.000 157.780 189.640 176.000 184.000 176.000 ZM 248.000 72.000 L 248.000 184.000 C 248.000 188.418 244.418 192.000 240.000 192.000 C 235.582 192.000 232.000 188.418 232.000 184.000 L 232.000 72.000 C 232.000 67.582 235.582 64.000 240.000 64.000 C 244.418 64.000 248.000 67.582 248.000 72.000 Z"),
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
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
