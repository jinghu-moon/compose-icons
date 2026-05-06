package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Stamp: ImageVector
    get() {
        if (_stamp != null) return _stamp!!
        _stamp = phosphorBoldIcon(
            name = "Stamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 224c0 6.627-5.373 12-12 12h-176c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h176c6.627 0 12 5.373 12 12ZM228 144v32c0 11.046-8.954 20-20 20h-160C36.954 196 28 187.046 28 176v-32c0-11.046 8.954-20 20-20h48L83.55 54.33C81.676 43.839 84.547 33.057 91.389 24.886 98.232 16.716 108.343 11.997 119 12h18c10.655-0 20.764 4.72 27.604 12.89 6.84 8.17 9.71 18.951 7.836 29.44L160 124h48c11.046 0 20 8.954 20 20ZM107.17 50.11 120.37 124h15.26L148.83 50.11c.625-3.499-.334-7.096-2.617-9.82C143.929 37.566 140.555 35.995 137 36h-18c-3.553-.002-6.924 1.57-9.206 4.294-2.282 2.724-3.239 6.318-2.614 9.816ZM204 148h-152v24h152Z"),
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
        return _stamp!!
    }

private var _stamp: ImageVector? = null
