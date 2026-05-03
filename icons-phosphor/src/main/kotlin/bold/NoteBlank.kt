package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NoteBlank: ImageVector
    get() {
        if (_noteBlank != null) return _noteBlank!!
        _noteBlank = phosphorBoldIcon(
            name = "NoteBlank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 156.690 228.000 C 161.997 228.014 167.089 225.904 170.830 222.140 L 222.140 170.830 C 225.904 167.089 228.014 161.997 228.000 156.690 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 52.000 52.000 L 204.000 52.000 L 204.000 144.000 L 156.000 144.000 C 149.373 144.000 144.000 149.373 144.000 156.000 L 144.000 204.000 L 52.000 204.000 ZM 168.000 191.000 L 168.000 168.000 L 191.000 168.000 Z"),
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
        return _noteBlank!!
    }

private var _noteBlank: ImageVector? = null
