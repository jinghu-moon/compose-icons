package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = phosphorBoldIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M250.18 105.17 186.71 41.25C147.631 2.252 84.359 2.252 45.28 41.25l-.13 .14L31.37 55.61c-4.612 4.761-4.491 12.358 .27 16.97 4.761 4.612 12.358 4.491 16.97-.27L62.32 58.16c4.539-4.537 9.636-8.479 15.17-11.73L119 88 25.85 181.16c-3.752 3.751-5.861 8.839-5.861 14.145 0 5.306 2.108 10.394 5.861 14.145l20.69 20.69c7.81 7.808 20.47 7.808 28.28 0L168 137l1.51 1.51h0l23.65 23.66c3.751 3.752 8.839 5.861 14.145 5.861 5.306 0 10.394-2.108 14.145-5.861l28.69-28.7c3.761-3.746 5.878-8.834 5.886-14.142 .008-5.308-2.095-10.402-5.846-14.158ZM60.68 210.34l-15-15L108 133l15 15ZM140 131 125 116 144.51 96.49c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5L102.24 37.24c24.567-4.54 49.795 3.294 67.47 20.95l31.44 31.67L178 113l-1.51-1.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529ZM207.32 142.31 195 130l23.09-23.09 12.3 12.39Z"),
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
        return _hammer!!
    }

private var _hammer: ImageVector? = null
