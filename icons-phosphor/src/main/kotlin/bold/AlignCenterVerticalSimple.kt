package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignCenterVerticalSimple: ImageVector
    get() {
        if (_alignCenterVerticalSimple != null) return _alignCenterVerticalSimple!!
        _alignCenterVerticalSimple = phosphorBoldIcon(
            name = "AlignCenterVerticalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 116.000 L 180.000 116.000 L 180.000 48.000 C 180.000 36.954 171.046 28.000 160.000 28.000 L 96.000 28.000 C 84.954 28.000 76.000 36.954 76.000 48.000 L 76.000 116.000 L 48.000 116.000 C 41.373 116.000 36.000 121.373 36.000 128.000 C 36.000 134.627 41.373 140.000 48.000 140.000 L 76.000 140.000 L 76.000 208.000 C 76.000 219.046 84.954 228.000 96.000 228.000 L 160.000 228.000 C 171.046 228.000 180.000 219.046 180.000 208.000 L 180.000 140.000 L 208.000 140.000 C 214.627 140.000 220.000 134.627 220.000 128.000 C 220.000 121.373 214.627 116.000 208.000 116.000 ZM 156.000 204.000 L 100.000 204.000 L 100.000 52.000 L 156.000 52.000 Z"),
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
        return _alignCenterVerticalSimple!!
    }

private var _alignCenterVerticalSimple: ImageVector? = null
