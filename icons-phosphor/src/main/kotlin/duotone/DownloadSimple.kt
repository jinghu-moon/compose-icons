package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DownloadSimple: ImageVector
    get() {
        if (_downloadSimple != null) return _downloadSimple!!
        _downloadSimple = phosphorDuotoneIcon(
            name = "DownloadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 48.000 L 216.000 208.000 L 40.000 208.000 L 40.000 48.000 C 40.000 39.163 47.163 32.000 56.000 32.000 L 200.000 32.000 C 208.837 32.000 216.000 39.163 216.000 48.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 144.000 L 224.000 208.000 C 224.000 212.418 220.418 216.000 216.000 216.000 L 40.000 216.000 C 35.582 216.000 32.000 212.418 32.000 208.000 L 32.000 144.000 C 32.000 139.582 35.582 136.000 40.000 136.000 C 44.418 136.000 48.000 139.582 48.000 144.000 L 48.000 200.000 L 208.000 200.000 L 208.000 144.000 C 208.000 139.582 211.582 136.000 216.000 136.000 C 220.418 136.000 224.000 139.582 224.000 144.000 ZM 122.340 149.660 C 123.841 151.162 125.877 152.006 128.000 152.006 C 130.123 152.006 132.159 151.162 133.660 149.660 L 173.660 109.660 C 176.786 106.534 176.786 101.466 173.660 98.340 C 170.534 95.214 165.466 95.214 162.340 98.340 L 136.000 124.690 L 136.000 32.000 C 136.000 27.582 132.418 24.000 128.000 24.000 C 123.582 24.000 120.000 27.582 120.000 32.000 L 120.000 124.690 L 93.660 98.340 C 90.534 95.214 85.466 95.214 82.340 98.340 C 79.214 101.466 79.214 106.534 82.340 109.660 Z"),
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
        return _downloadSimple!!
    }

private var _downloadSimple: ImageVector? = null
