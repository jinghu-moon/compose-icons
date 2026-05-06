package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) return _personSimple!!
        _personSimple = phosphorLightIcon(
            name = "PersonSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 78c16.569 0 30-13.431 30-30C158 31.431 144.569 18 128 18 111.431 18 98 31.431 98 48c0 16.569 13.431 30 30 30ZM128 30c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM229.14 131.09c-1.724 2.82-5.404 3.714-8.23 2-.37-.21-36.49-21.43-86.91-23v39.61L196.48 220c2.209 2.485 1.985 6.291-.5 8.5-2.485 2.209-6.291 1.985-8.5-.5L128 161 68.48 228c-2.209 2.485-6.015 2.709-8.5 .5-2.485-2.209-2.709-6.015-.5-8.5L122 149.72v-39.61c-50.42 1.6-86.55 22.82-86.92 23-2.836 1.631-6.456 .69-8.138-2.115-1.682-2.806-.807-6.442 1.968-8.175C30.6 121.84 71 98 128 98c57 0 97.39 23.84 99.09 24.86 2.837 1.708 3.755 5.391 2.05 8.23Z"),
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
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
