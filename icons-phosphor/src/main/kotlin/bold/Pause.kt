package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pause: ImageVector
    get() {
        if (_pause != null) return _pause!!
        _pause = phosphorBoldIcon(
            name = "Pause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 28.000 L 160.000 28.000 C 148.954 28.000 140.000 36.954 140.000 48.000 L 140.000 208.000 C 140.000 219.046 148.954 228.000 160.000 228.000 L 200.000 228.000 C 211.046 228.000 220.000 219.046 220.000 208.000 L 220.000 48.000 C 220.000 36.954 211.046 28.000 200.000 28.000 ZM 196.000 204.000 L 164.000 204.000 L 164.000 52.000 L 196.000 52.000 ZM 96.000 28.000 L 56.000 28.000 C 44.954 28.000 36.000 36.954 36.000 48.000 L 36.000 208.000 C 36.000 219.046 44.954 228.000 56.000 228.000 L 96.000 228.000 C 107.046 228.000 116.000 219.046 116.000 208.000 L 116.000 48.000 C 116.000 36.954 107.046 28.000 96.000 28.000 ZM 92.000 204.000 L 60.000 204.000 L 60.000 52.000 L 92.000 52.000 Z"),
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
        return _pause!!
    }

private var _pause: ImageVector? = null
