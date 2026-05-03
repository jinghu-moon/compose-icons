package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignCenterHorizontalSimple: ImageVector
    get() {
        if (_alignCenterHorizontalSimple != null) return _alignCenterHorizontalSimple!!
        _alignCenterHorizontalSimple = phosphorBoldIcon(
            name = "AlignCenterHorizontalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 76.000 L 140.000 76.000 L 140.000 48.000 C 140.000 41.373 134.627 36.000 128.000 36.000 C 121.373 36.000 116.000 41.373 116.000 48.000 L 116.000 76.000 L 48.000 76.000 C 36.954 76.000 28.000 84.954 28.000 96.000 L 28.000 160.000 C 28.000 171.046 36.954 180.000 48.000 180.000 L 116.000 180.000 L 116.000 208.000 C 116.000 214.627 121.373 220.000 128.000 220.000 C 134.627 220.000 140.000 214.627 140.000 208.000 L 140.000 180.000 L 208.000 180.000 C 219.046 180.000 228.000 171.046 228.000 160.000 L 228.000 96.000 C 228.000 84.954 219.046 76.000 208.000 76.000 ZM 204.000 156.000 L 52.000 156.000 L 52.000 100.000 L 204.000 100.000 Z"),
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
        return _alignCenterHorizontalSimple!!
    }

private var _alignCenterHorizontalSimple: ImageVector? = null
