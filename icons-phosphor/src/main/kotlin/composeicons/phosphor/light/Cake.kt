package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cake: ImageVector
    get() {
        if (_cake != null) return _cake!!
        _cake = phosphorLightIcon(
            name = "Cake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 112C230 99.85 220.15 90 208 90h-74v-12.6C147.959 74.531 157.984 62.251 158 48 158 21.1 132.42 3.73 131.33 3c-2.016-1.345-4.644-1.345-6.66 0C123.58 3.73 98 21.1 98 48c.016 14.251 10.041 26.531 24 29.4v12.6h-74C35.85 90 26 99.85 26 112v23.33c.007 8.522 2.818 16.805 8 23.57v41.1c0 12.15 9.85 22 22 22h144c12.15 0 22-9.85 22-22v-41.1c5.182-6.765 7.993-15.048 8-23.57ZM110 48c0-15.4 12-27.41 18-32.44 6 5 18 17 18 32.44 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18ZM38 112c0-5.523 4.477-10 10-10h160c5.523 0 10 4.477 10 10v23.33c0 14.32-11.33 26.28-25.26 26.66-7.021 .2-13.825-2.449-18.861-7.345C168.842 149.749 166 143.024 166 136c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6 0 14.359-11.641 26-26 26-14.359 0-26-11.641-26-26 0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6 .003 7.026-2.838 13.754-7.875 18.651-5.037 4.898-11.842 7.549-18.865 7.349C49.33 161.61 38 149.65 38 135.33ZM200 210h-144c-5.523 0-10-4.477-10-10v-30.69c5.185 2.909 10.997 4.518 16.94 4.69 10.267 .305 20.216-3.58 27.56-10.76 2.08-2.034 3.925-4.294 5.5-6.74 6.986 10.908 19.047 17.506 32 17.506 12.953 0 25.014-6.598 32-17.506 1.581 2.447 3.433 4.708 5.52 6.74 7.074 6.921 16.584 10.785 26.48 10.76h1.07c5.939-.174 11.748-1.783 16.93-4.69v30.69c0 5.523-4.477 10-10 10Z"),
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
        return _cake!!
    }

private var _cake: ImageVector? = null
