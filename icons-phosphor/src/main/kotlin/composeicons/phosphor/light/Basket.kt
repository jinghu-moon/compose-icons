package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Basket: ImageVector
    get() {
        if (_basket != null) return _basket!!
        _basket = phosphorLightIcon(
            name = "Basket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134 120v56c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-56c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM174.83 119.4l-5.6 56c-.168 1.588 .305 3.178 1.313 4.417 1.008 1.239 2.468 2.025 4.057 2.184h.61c3.093 .016 5.691-2.323 6-5.4l5.6-56c.331-3.297-2.073-6.239-5.37-6.57-3.297-.331-6.239 2.073-6.57 5.37ZM81.17 119.4c-.331-3.297-3.273-5.701-6.57-5.37-3.297 .331-5.701 3.273-5.37 6.57l5.6 56c.309 3.077 2.907 5.415 6 5.4h.61c1.583-.159 3.039-.941 4.046-2.173 1.007-1.232 1.483-2.814 1.324-4.397ZM238 88.79 222.87 201.85c-.927 6.953-6.856 12.146-13.87 12.15h-162c-7.014-.004-12.943-5.197-13.87-12.15L18.05 88.79c-.228-1.714 .295-3.444 1.435-4.744C20.625 82.745 22.271 81.999 24 82h45.28L123.48 20.05c1.139-1.292 2.778-2.031 4.5-2.031 1.722 0 3.361 .74 4.5 2.031l54.2 62h45.32c1.728-.013 3.378 .719 4.527 2.01 1.149 1.291 1.686 3.015 1.473 4.73ZM85.22 82h85.56L128 33.11ZM225.15 94h-194.3L45 200.26c.131 1.002 .989 1.749 2 1.74h162c1.011 .009 1.869-.738 2-1.74Z"),
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
        return _basket!!
    }

private var _basket: ImageVector? = null
