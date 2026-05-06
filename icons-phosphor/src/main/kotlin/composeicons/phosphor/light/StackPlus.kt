package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StackPlus: ImageVector
    get() {
        if (_stackPlus != null) return _stackPlus!!
        _stackPlus = phosphorLightIcon(
            name = "StackPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 200c0 3.314-2.686 6-6 6h-18v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-18c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h18v-18c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v18h18c3.314 0 6 2.686 6 6ZM221 122.82l-93 54.23L35 122.82c-2.832-1.391-6.257-.352-7.838 2.378-1.581 2.73-.778 6.218 1.838 7.982l96 56c1.856 1.072 4.144 1.072 6 0l96-56c2.616-1.764 3.419-5.252 1.838-7.982-1.581-2.73-5.006-3.769-7.838-2.378ZM26 80c.006-2.138 1.149-4.111 3-5.18l96-56c1.856-1.072 4.144-1.072 6 0l96 56c1.841 1.076 2.972 3.048 2.972 5.18 0 2.132-1.131 4.104-2.972 5.18l-96 56c-1.856 1.072-4.144 1.072-6 0L29 85.18C27.149 84.111 26.006 82.138 26 80ZM43.91 80 128 129.05 212.09 80 128 31ZM141 217.48l-13 7.57L35 170.82c-2.832-1.391-6.257-.352-7.838 2.378-1.581 2.73-.778 6.218 1.838 7.982l96 56c1.856 1.072 4.144 1.072 6 0l16-9.33c2.659-1.747 3.492-5.266 1.899-8.019-1.593-2.754-5.059-3.785-7.899-2.351Z"),
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
        return _stackPlus!!
    }

private var _stackPlus: ImageVector? = null
