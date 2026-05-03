package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DevToLogo: ImageVector
    get() {
        if (_devToLogo != null) return _devToLogo!!
        _devToLogo = phosphorFillIcon(
            name = "DevToLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 80.000 120.000 L 80.000 136.000 C 80.000 144.837 72.837 152.000 64.000 152.000 L 64.000 104.000 C 72.837 104.000 80.000 111.163 80.000 120.000 ZM 248.000 72.000 L 248.000 184.000 C 248.000 192.837 240.837 200.000 232.000 200.000 L 24.000 200.000 C 15.163 200.000 8.000 192.837 8.000 184.000 L 8.000 72.000 C 8.000 63.163 15.163 56.000 24.000 56.000 L 232.000 56.000 C 240.837 56.000 248.000 63.163 248.000 72.000 ZM 96.000 120.000 C 96.000 102.327 81.673 88.000 64.000 88.000 L 56.000 88.000 C 51.582 88.000 48.000 91.582 48.000 96.000 L 48.000 160.000 C 48.000 164.418 51.582 168.000 56.000 168.000 L 64.000 168.000 C 81.673 168.000 96.000 153.673 96.000 136.000 ZM 128.000 120.000 L 128.000 104.000 L 144.000 104.000 C 148.418 104.000 152.000 100.418 152.000 96.000 C 152.000 91.582 148.418 88.000 144.000 88.000 L 120.000 88.000 C 115.582 88.000 112.000 91.582 112.000 96.000 L 112.000 160.000 C 112.000 164.418 115.582 168.000 120.000 168.000 L 144.000 168.000 C 148.418 168.000 152.000 164.418 152.000 160.000 C 152.000 155.582 148.418 152.000 144.000 152.000 L 128.000 152.000 L 128.000 136.000 L 136.000 136.000 C 140.418 136.000 144.000 132.418 144.000 128.000 C 144.000 123.582 140.418 120.000 136.000 120.000 ZM 210.170 88.300 C 205.917 87.102 201.498 89.577 200.300 93.830 L 190.000 130.450 L 179.700 93.830 C 178.487 89.595 174.079 87.137 169.839 88.332 C 165.599 89.527 163.123 93.925 164.300 98.170 L 182.300 162.170 C 183.272 165.618 186.418 168.000 190.000 168.000 C 193.582 168.000 196.728 165.618 197.700 162.170 L 215.700 98.170 C 216.898 93.917 214.423 89.498 210.170 88.300 Z"),
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
        return _devToLogo!!
    }

private var _devToLogo: ImageVector? = null
