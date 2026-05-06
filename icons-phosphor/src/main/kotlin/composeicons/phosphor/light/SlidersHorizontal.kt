package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) return _slidersHorizontal!!
        _slidersHorizontal = phosphorLightIcon(
            name = "SlidersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M40 86h34.6c2.839 13.982 15.133 24.03 29.4 24.03 14.267 0 26.561-10.048 29.4-24.03h82.6c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-82.6C130.561 60.018 118.267 49.97 104 49.97 89.733 49.97 77.439 60.018 74.6 74h-34.6c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM104 62c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18C94.059 98 86 89.941 86 80c0-9.941 8.059-18 18-18ZM216 170h-18.6C194.561 156.018 182.267 145.97 168 145.97c-14.267 0-26.561 10.048-29.4 24.03h-98.6c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h98.6c2.839 13.982 15.133 24.03 29.4 24.03 14.267 0 26.561-10.048 29.4-24.03h18.6c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM168 194c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18Z"),
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
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
