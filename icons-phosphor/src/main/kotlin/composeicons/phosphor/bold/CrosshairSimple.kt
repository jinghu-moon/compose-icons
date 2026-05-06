package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) return _crosshairSimple!!
        _crosshairSimple = phosphorBoldIcon(
            name = "CrosshairSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM140 211.13v-27.13c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v27.13C79.173 205.751 50.249 176.827 44.87 140h27.13c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-27.13C50.249 79.173 79.173 50.249 116 44.87v27.13c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-27.13c36.827 5.379 65.751 34.303 71.13 71.13h-27.13c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h27.13c-5.379 36.827-34.303 65.751-71.13 71.13Z"),
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
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
