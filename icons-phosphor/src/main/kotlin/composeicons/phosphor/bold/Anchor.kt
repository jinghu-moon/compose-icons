package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = phosphorBoldIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 132c-6.627 0-12 5.373-12 12 0 21.86-11.41 25.95-35.16 32.42-9.12 2.49-19.61 5.36-28.84 10.69v-55.11h28c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-28v-18.06c16.531-5.844 26.446-22.748 23.482-40.029C160.517 32.63 145.533 19.999 128 19.999c-17.533 0-32.517 12.632-35.482 29.912C89.554 67.192 99.469 84.096 116 89.94v18.06h-28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h28v55.11c-9.23-5.33-19.72-8.2-28.84-10.69C63.41 170 52 165.86 52 144c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 41.17 30.54 49.5 52.84 55.58C104.59 206.05 116 210.14 116 232c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-21.86 11.41-25.95 35.16-32.42C197.46 193.5 228 185.17 228 144c0-6.627-5.373-12-12-12ZM128 44c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12Z"),
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
        return _anchor!!
    }

private var _anchor: ImageVector? = null
