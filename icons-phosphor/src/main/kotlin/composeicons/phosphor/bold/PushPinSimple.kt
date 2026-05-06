package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PushPinSimple: ImageVector
    get() {
        if (_pushPinSimple != null) return _pushPinSimple!!
        _pushPinSimple = phosphorBoldIcon(
            name = "PushPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 164h-5.93L190.3 52h1.7c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-128C57.373 28 52 33.373 52 40c0 6.627 5.373 12 12 12h1.7L45.93 164h-5.93c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h76v52c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-52h76c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM90.07 52h75.86l19.77 112h-115.4Z"),
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
        return _pushPinSimple!!
    }

private var _pushPinSimple: ImageVector? = null
