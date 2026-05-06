package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Coffee: ImageVector
    get() {
        if (_coffee != null) return _coffee!!
        _coffee = phosphorDuotoneIcon(
            name = "Coffee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 88v48c.007 34.402-20.033 65.653-51.3 80h-73.4C52.033 201.653 31.993 170.402 32 136v-48Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M80 56v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM120 64c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8ZM152 64c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8ZM248 120v8c-.007 21.12-16.431 38.595-37.51 39.91-5.457 15.436-14.748 29.231-27 40.09h24.51c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24.54C35.894 189.759 24.048 163.55 24 136v-48c0-4.418 3.582-8 8-8h176c22.091 0 40 17.909 40 40ZM200 96h-160v40c.063 30.645 17.569 58.581 45.12 72h69.76C182.431 194.581 199.937 166.645 200 136ZM232 120c-.003-10.168-6.413-19.231-16-22.62v38.62c-.006 5.024-.407 10.039-1.2 15 10.194-3.012 17.193-12.37 17.2-23Z"),
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
        return _coffee!!
    }

private var _coffee: ImageVector? = null
