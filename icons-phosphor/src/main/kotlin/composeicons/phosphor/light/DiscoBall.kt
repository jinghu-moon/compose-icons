package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DiscoBall: ImageVector
    get() {
        if (_discoBall != null) return _discoBall!!
        _discoBall = phosphorLightIcon(
            name = "DiscoBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M118 66.23v-50.23c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v50.23C59.785 69.462 24.435 108.722 26.052 155.022c1.617 46.3 39.619 82.998 85.948 82.998 46.328 0 84.331-36.698 85.948-82.998C199.565 108.722 164.215 69.462 118 66.23ZM185.74 146h-35.87c-1.3-32.59-13-54.15-22.36-66.35 31.895 6.894 55.534 33.83 58.23 66.35ZM86.14 158h51.72c-1.63 37.69-18.33 58.46-25.86 66C104.46 216.45 87.77 195.67 86.14 158ZM86.14 146C87.77 108.31 104.47 87.54 112 80c7.54 7.51 24.23 28.29 25.86 66ZM96.49 79.65C87.11 91.85 75.43 113.41 74.13 146h-35.87C40.956 113.48 64.595 86.544 96.49 79.65ZM38.26 158h35.87c1.3 32.59 13 54.15 22.36 66.35C64.595 217.456 40.956 190.52 38.26 158ZM127.51 224.35c9.38-12.2 21.06-33.76 22.36-66.35h35.87c-2.696 32.52-26.335 59.456-58.23 66.35ZM254 88c0 3.314-2.686 6-6 6h-10v10c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-10h-10c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h10v-10c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v10h10c3.314 0 6 2.686 6 6ZM208 46h-18v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-18c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h18v-18c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v18h18c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6Z"),
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
        return _discoBall!!
    }

private var _discoBall: ImageVector? = null
