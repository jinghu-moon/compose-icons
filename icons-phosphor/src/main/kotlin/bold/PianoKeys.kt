package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PianoKeys: ImageVector
    get() {
        if (_pianoKeys != null) return _pianoKeys!!
        _pianoKeys = phosphorBoldIcon(
            name = "PianoKeys",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 92.000 132.000 L 92.000 52.000 L 116.000 52.000 L 116.000 132.000 ZM 144.000 156.000 L 144.000 204.000 L 112.000 204.000 L 112.000 156.000 ZM 164.000 132.000 L 140.000 132.000 L 140.000 52.000 L 164.000 52.000 ZM 52.000 52.000 L 68.000 52.000 L 68.000 144.000 C 68.000 150.627 73.373 156.000 80.000 156.000 L 88.000 156.000 L 88.000 204.000 L 52.000 204.000 ZM 204.000 204.000 L 168.000 204.000 L 168.000 156.000 L 176.000 156.000 C 182.627 156.000 188.000 150.627 188.000 144.000 L 188.000 52.000 L 204.000 52.000 Z"),
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
        return _pianoKeys!!
    }

private var _pianoKeys: ImageVector? = null
