package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = phosphorLightIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 138c-3.314 0-6 2.686-6 6 0 26.09-15 31.52-39.58 38.21C158 185.6 143.79 189.47 134 199.16v-73.16h34c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-34v-28.6c15.09-3.08 25.396-17.086 23.848-32.409C156.3 37.668 143.401 26.006 128 26.006c-15.401 0-28.3 11.662-29.848 26.985C96.604 68.314 106.91 82.32 122 85.4v28.6h-34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h34v73.16C112.21 189.47 98 185.6 85.58 182.21 61 175.52 46 170.09 46 144c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6 0 36.58 26.85 43.91 48.42 49.79C107 200.48 122 205.91 122 232c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6 0-26.09 15-31.52 39.58-38.21C195.15 187.91 222 180.58 222 144c0-3.314-2.686-6-6-6ZM110 56c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18Z"),
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
