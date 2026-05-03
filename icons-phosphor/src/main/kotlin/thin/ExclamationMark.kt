package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ExclamationMark: ImageVector
    get() {
        if (_exclamationMark != null) return _exclamationMark!!
        _exclamationMark = phosphorThinIcon(
            name = "ExclamationMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 140.000 200.000 C 140.000 206.627 134.627 212.000 128.000 212.000 C 121.373 212.000 116.000 206.627 116.000 200.000 C 116.000 193.373 121.373 188.000 128.000 188.000 C 134.627 188.000 140.000 193.373 140.000 200.000 ZM 128.000 156.000 C 130.209 156.000 132.000 154.209 132.000 152.000 L 132.000 48.000 C 132.000 45.791 130.209 44.000 128.000 44.000 C 125.791 44.000 124.000 45.791 124.000 48.000 L 124.000 152.000 C 124.000 154.209 125.791 156.000 128.000 156.000 Z"),
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
