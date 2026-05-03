package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Note: ImageVector
    get() {
        if (_note != null) return _note!!
        _note = phosphorBoldIcon(
            name = "Note",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 84.000 108.000 C 84.000 101.373 89.373 96.000 96.000 96.000 L 160.000 96.000 C 166.627 96.000 172.000 101.373 172.000 108.000 C 172.000 114.627 166.627 120.000 160.000 120.000 L 96.000 120.000 C 89.373 120.000 84.000 114.627 84.000 108.000 ZM 116.000 136.000 L 96.000 136.000 C 89.373 136.000 84.000 141.373 84.000 148.000 C 84.000 154.627 89.373 160.000 96.000 160.000 L 116.000 160.000 C 122.627 160.000 128.000 154.627 128.000 148.000 C 128.000 141.373 122.627 136.000 116.000 136.000 ZM 228.000 48.000 L 228.000 156.690 C 228.014 161.997 225.904 167.089 222.140 170.830 L 170.830 222.140 C 167.089 225.904 161.997 228.014 156.690 228.000 L 48.000 228.000 C 36.954 228.000 28.000 219.046 28.000 208.000 L 28.000 48.000 C 28.000 36.954 36.954 28.000 48.000 28.000 L 208.000 28.000 C 219.046 28.000 228.000 36.954 228.000 48.000 ZM 52.000 204.000 L 144.000 204.000 L 144.000 156.000 C 144.000 149.373 149.373 144.000 156.000 144.000 L 204.000 144.000 L 204.000 52.000 L 52.000 52.000 ZM 191.000 168.000 L 168.000 168.000 L 168.000 191.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _note!!
    }

private var _note: ImageVector? = null
