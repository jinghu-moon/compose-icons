package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) return _lighthouse!!
        _lighthouse = phosphorThinIcon(
            name = "Lighthouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 84c-2.209 0-4 1.791-4 4v20h-18.77L180 55.6c-.102-1.005-.581-1.934-1.34-2.6L135.78 14.87l-.1-.09c-4.449-3.706-10.911-3.706-15.36 0l-.1 .09L77.34 53c-.759 .666-1.238 1.595-1.34 2.6L70.77 108h-18.77v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v24c0 2.209 1.791 4 4 4h22l-9.92 98.86c-.321 3.361 .789 6.702 3.058 9.203 2.269 2.501 5.486 3.93 8.862 3.937h112c3.384-.001 6.61-1.431 8.883-3.937 2.274-2.506 3.384-5.855 3.057-9.223L186 116h22c2.209 0 4-1.791 4-4v-24c0-2.209-1.791-4-4-4ZM125.48 20.89c1.461-1.17 3.539-1.17 5 0l35 31.11h-75ZM83.62 60h88.76l4.81 48h-45.19v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-45.19ZM187 218.69c-.763 .851-1.857 1.329-3 1.31h-112c-1.126 .005-2.202-.466-2.964-1.296-.761-.83-1.138-1.942-1.036-3.064L72.39 172h111.22L188 215.62c.122 1.119-.242 2.237-1 3.07ZM182.81 164h-109.62L78 116h100Z"),
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
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
