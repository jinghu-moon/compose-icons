package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UploadSimple: ImageVector
    get() {
        if (_uploadSimple != null) return _uploadSimple!!
        _uploadSimple = phosphorBoldIcon(
            name = "UploadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 144.000 L 228.000 208.000 C 228.000 214.627 222.627 220.000 216.000 220.000 L 40.000 220.000 C 33.373 220.000 28.000 214.627 28.000 208.000 L 28.000 144.000 C 28.000 137.373 33.373 132.000 40.000 132.000 C 46.627 132.000 52.000 137.373 52.000 144.000 L 52.000 196.000 L 204.000 196.000 L 204.000 144.000 C 204.000 137.373 209.373 132.000 216.000 132.000 C 222.627 132.000 228.000 137.373 228.000 144.000 ZM 96.490 80.490 L 116.000 61.000 L 116.000 144.000 C 116.000 150.627 121.373 156.000 128.000 156.000 C 134.627 156.000 140.000 150.627 140.000 144.000 L 140.000 61.000 L 159.510 80.520 C 164.204 85.214 171.816 85.214 176.510 80.520 C 181.204 75.826 181.204 68.214 176.510 63.520 L 136.510 23.520 C 134.258 21.261 131.200 19.991 128.010 19.991 C 124.820 19.991 121.762 21.261 119.510 23.520 L 79.510 63.520 C 74.816 68.214 74.816 75.826 79.510 80.520 C 84.204 85.214 91.816 85.214 96.510 80.520 Z"),
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
        return _uploadSimple!!
    }

private var _uploadSimple: ImageVector? = null
