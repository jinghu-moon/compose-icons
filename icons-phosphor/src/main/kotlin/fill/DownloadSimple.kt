package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DownloadSimple: ImageVector
    get() {
        if (_downloadSimple != null) return _downloadSimple!!
        _downloadSimple = phosphorFillIcon(
            name = "DownloadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 144.000 L 224.000 208.000 C 224.000 212.418 220.418 216.000 216.000 216.000 L 40.000 216.000 C 35.582 216.000 32.000 212.418 32.000 208.000 L 32.000 144.000 C 32.000 139.582 35.582 136.000 40.000 136.000 C 44.418 136.000 48.000 139.582 48.000 144.000 L 48.000 200.000 L 208.000 200.000 L 208.000 144.000 C 208.000 139.582 211.582 136.000 216.000 136.000 C 220.418 136.000 224.000 139.582 224.000 144.000 ZM 122.340 149.660 C 123.841 151.162 125.877 152.006 128.000 152.006 C 130.123 152.006 132.159 151.162 133.660 149.660 L 173.660 109.660 C 175.951 107.372 176.636 103.929 175.397 100.938 C 174.158 97.947 171.238 95.997 168.000 96.000 L 136.000 96.000 L 136.000 32.000 C 136.000 27.582 132.418 24.000 128.000 24.000 C 123.582 24.000 120.000 27.582 120.000 32.000 L 120.000 96.000 L 88.000 96.000 C 84.762 95.997 81.842 97.947 80.603 100.938 C 79.364 103.929 80.049 107.372 82.340 109.660 Z"),
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
