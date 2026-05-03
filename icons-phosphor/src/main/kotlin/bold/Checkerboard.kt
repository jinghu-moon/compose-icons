package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Checkerboard: ImageVector
    get() {
        if (_checkerboard != null) return _checkerboard!!
        _checkerboard = phosphorBoldIcon(
            name = "Checkerboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 ZM 193.000 116.000 L 140.000 63.000 L 140.000 52.000 L 151.000 52.000 L 204.000 105.000 L 204.000 116.000 ZM 140.000 97.000 L 159.000 116.000 L 140.000 116.000 ZM 204.000 71.000 L 185.000 52.000 L 204.000 52.000 ZM 116.000 52.000 L 116.000 68.000 L 116.000 68.000 L 116.000 116.000 L 52.000 116.000 L 52.000 52.000 ZM 105.000 204.000 L 52.000 151.000 L 52.000 140.000 L 63.000 140.000 L 116.000 193.000 L 116.000 204.000 ZM 116.000 159.000 L 97.000 140.000 L 116.000 140.000 ZM 52.000 185.000 L 71.000 204.000 L 52.000 204.000 ZM 140.000 204.000 L 140.000 188.000 L 140.000 188.000 L 140.000 140.000 L 204.000 140.000 L 204.000 204.000 Z"),
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
        return _checkerboard!!
    }

private var _checkerboard: ImageVector? = null
