package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) return _clipboardText!!
        _clipboardText = phosphorBoldIcon(
            name = "ClipboardText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 164.000 C 172.000 170.627 166.627 176.000 160.000 176.000 L 96.000 176.000 C 89.373 176.000 84.000 170.627 84.000 164.000 C 84.000 157.373 89.373 152.000 96.000 152.000 L 160.000 152.000 C 166.627 152.000 172.000 157.373 172.000 164.000 ZM 160.000 112.000 L 96.000 112.000 C 89.373 112.000 84.000 117.373 84.000 124.000 C 84.000 130.627 89.373 136.000 96.000 136.000 L 160.000 136.000 C 166.627 136.000 172.000 130.627 172.000 124.000 C 172.000 117.373 166.627 112.000 160.000 112.000 ZM 220.000 48.000 L 220.000 216.000 C 220.000 227.046 211.046 236.000 200.000 236.000 L 56.000 236.000 C 44.954 236.000 36.000 227.046 36.000 216.000 L 36.000 48.000 C 36.000 36.954 44.954 28.000 56.000 28.000 L 90.530 28.000 C 100.316 17.781 113.851 12.002 128.000 12.002 C 142.149 12.002 155.684 17.781 165.470 28.000 L 200.000 28.000 C 211.046 28.000 220.000 36.954 220.000 48.000 ZM 100.290 60.000 L 155.710 60.000 C 153.713 46.233 141.911 36.019 128.000 36.019 C 114.089 36.019 102.287 46.233 100.290 60.000 ZM 196.000 52.000 L 178.590 52.000 C 179.524 55.932 179.997 59.959 180.000 64.000 L 180.000 72.000 C 180.000 78.627 174.627 84.000 168.000 84.000 L 88.000 84.000 C 81.373 84.000 76.000 78.627 76.000 72.000 L 76.000 64.000 C 76.003 59.959 76.476 55.932 77.410 52.000 L 60.000 52.000 L 60.000 212.000 L 196.000 212.000 Z"),
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
        return _clipboardText!!
    }

private var _clipboardText: ImageVector? = null
