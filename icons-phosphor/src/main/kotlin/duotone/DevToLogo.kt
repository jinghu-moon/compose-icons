package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DevToLogo: ImageVector
    get() {
        if (_devToLogo != null) return _devToLogo!!
        _devToLogo = phosphorDuotoneIcon(
            name = "DevToLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 240.000 72.000 L 240.000 184.000 C 240.000 188.418 236.418 192.000 232.000 192.000 L 24.000 192.000 C 19.582 192.000 16.000 188.418 16.000 184.000 L 16.000 72.000 C 16.000 67.582 19.582 64.000 24.000 64.000 L 232.000 64.000 C 236.418 64.000 240.000 67.582 240.000 72.000 Z"),
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
        pathData = parseSvgPathData("M 232.000 56.000 L 24.000 56.000 C 15.163 56.000 8.000 63.163 8.000 72.000 L 8.000 184.000 C 8.000 192.837 15.163 200.000 24.000 200.000 L 232.000 200.000 C 240.837 200.000 248.000 192.837 248.000 184.000 L 248.000 72.000 C 248.000 63.163 240.837 56.000 232.000 56.000 ZM 232.000 184.000 L 24.000 184.000 L 24.000 72.000 L 232.000 72.000 L 232.000 184.000 ZM 128.000 104.000 L 128.000 120.000 L 136.000 120.000 C 140.418 120.000 144.000 123.582 144.000 128.000 C 144.000 132.418 140.418 136.000 136.000 136.000 L 128.000 136.000 L 128.000 152.000 L 144.000 152.000 C 148.418 152.000 152.000 155.582 152.000 160.000 C 152.000 164.418 148.418 168.000 144.000 168.000 L 120.000 168.000 C 115.582 168.000 112.000 164.418 112.000 160.000 L 112.000 96.000 C 112.000 91.582 115.582 88.000 120.000 88.000 L 144.000 88.000 C 148.418 88.000 152.000 91.582 152.000 96.000 C 152.000 100.418 148.418 104.000 144.000 104.000 ZM 215.700 98.170 L 197.700 162.170 C 196.728 165.618 193.582 168.000 190.000 168.000 C 186.418 168.000 183.272 165.618 182.300 162.170 L 164.300 98.170 C 163.123 93.925 165.599 89.527 169.839 88.332 C 174.079 87.137 178.487 89.595 179.700 93.830 L 190.000 130.450 L 200.300 93.830 C 201.066 91.068 203.251 88.927 206.028 88.217 C 208.804 87.507 211.749 88.337 213.746 90.393 C 215.743 92.448 216.489 95.415 215.700 98.170 ZM 64.000 88.000 L 56.000 88.000 C 51.582 88.000 48.000 91.582 48.000 96.000 L 48.000 160.000 C 48.000 164.418 51.582 168.000 56.000 168.000 L 64.000 168.000 C 81.673 168.000 96.000 153.673 96.000 136.000 L 96.000 120.000 C 96.000 102.327 81.673 88.000 64.000 88.000 ZM 80.000 136.000 C 80.000 144.837 72.837 152.000 64.000 152.000 L 64.000 104.000 C 72.837 104.000 80.000 111.163 80.000 120.000 Z"),
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
