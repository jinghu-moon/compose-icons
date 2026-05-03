package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DownloadSimple: ImageVector
    get() {
        if (_downloadSimple != null) return _downloadSimple!!
        _downloadSimple = phosphorBoldIcon(
            name = "DownloadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 144.000 L 228.000 208.000 C 228.000 214.627 222.627 220.000 216.000 220.000 L 40.000 220.000 C 33.373 220.000 28.000 214.627 28.000 208.000 L 28.000 144.000 C 28.000 137.373 33.373 132.000 40.000 132.000 C 46.627 132.000 52.000 137.373 52.000 144.000 L 52.000 196.000 L 204.000 196.000 L 204.000 144.000 C 204.000 137.373 209.373 132.000 216.000 132.000 C 222.627 132.000 228.000 137.373 228.000 144.000 ZM 119.510 152.490 C 121.762 154.749 124.820 156.019 128.010 156.019 C 131.200 156.019 134.258 154.749 136.510 152.490 L 176.510 112.490 C 181.204 107.796 181.204 100.184 176.510 95.490 C 171.816 90.796 164.204 90.796 159.510 95.490 L 140.000 115.000 L 140.000 32.000 C 140.000 25.373 134.627 20.000 128.000 20.000 C 121.373 20.000 116.000 25.373 116.000 32.000 L 116.000 115.000 L 96.490 95.510 C 91.796 90.816 84.184 90.816 79.490 95.510 C 74.796 100.204 74.796 107.816 79.490 112.510 Z"),
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
