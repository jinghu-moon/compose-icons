package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ExclamationMark: ImageVector
    get() {
        if (_exclamationMark != null) return _exclamationMark!!
        _exclamationMark = phosphorBoldIcon(
            name = "ExclamationMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 148.000 200.000 C 148.000 211.046 139.046 220.000 128.000 220.000 C 116.954 220.000 108.000 211.046 108.000 200.000 C 108.000 188.954 116.954 180.000 128.000 180.000 C 139.046 180.000 148.000 188.954 148.000 200.000 ZM 128.000 160.000 C 134.627 160.000 140.000 154.627 140.000 148.000 L 140.000 48.000 C 140.000 41.373 134.627 36.000 128.000 36.000 C 121.373 36.000 116.000 41.373 116.000 48.000 L 116.000 148.000 C 116.000 154.627 121.373 160.000 128.000 160.000 Z"),
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
        return _exclamationMark!!
    }

private var _exclamationMark: ImageVector? = null
