package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PenNib: ImageVector
    get() {
        if (_penNib != null) return _penNib!!
        _penNib = phosphorLightIcon(
            name = "PenNib",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 92.68c.007-3.714-1.469-7.278-4.1-9.9L173.21 14.1c-2.626-2.626-6.187-4.101-9.9-4.101-3.713 0-7.274 1.475-9.9 4.101L124.68 42.83 66.22 64.76c-4.682 1.753-8.075 5.869-8.9 10.8L34.08 215c-.294 1.742 .194 3.525 1.335 4.874 1.141 1.349 2.818 2.127 4.585 2.126 .335-.001 .669-.028 1-.08L180.44 198.68c4.935-.822 9.056-4.215 10.81-8.9l21.92-58.46 28.74-28.74c2.629-2.622 4.102-6.187 4.09-9.9ZM180 185.57c-.25 .668-.837 1.151-1.54 1.27L57.49 207l52.87-52.88c11.228 6.925 25.862 4.345 34.044-6.003 8.182-10.348 7.318-25.183-2.01-34.511-9.328-9.328-24.163-10.192-34.511-2.01-10.348 8.182-12.928 22.816-6.003 34.044L49 198.53l20.17-121c.12-.697 .599-1.279 1.26-1.53L126.49 55 201 129.51ZM110 132c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14ZM233.41 94.1 208 119.51 136.48 48 161.9 22.58c.375-.376 .884-.587 1.415-.587 .531 0 1.04 .211 1.415 .587l68.68 68.69c.376 .375 .587 .884 .587 1.415 0 .531-.211 1.04-.587 1.415Z"),
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
        return _penNib!!
    }

private var _penNib: ImageVector? = null
