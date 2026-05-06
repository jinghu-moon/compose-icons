package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListMagnifyingGlass: ImageVector
    get() {
        if (_listMagnifyingGlass != null) return _listMagnifyingGlass!!
        _listMagnifyingGlass = phosphorLightIcon(
            name = "ListMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M34 64c0-3.314 2.686-6 6-6h176c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-176c-3.314 0-6-2.686-6-6ZM40 134h72c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-72c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM128 186h-88c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h88c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM236.24 196.24c-2.343 2.34-6.137 2.34-8.48 0L206.27 174.76c-16.076 11.648-38.405 8.983-51.288-6.122-12.883-15.104-11.993-37.574 2.045-51.611 14.038-14.038 36.507-14.928 51.611-2.045 15.104 12.883 17.769 35.212 6.122 51.288l21.48 21.49c2.34 2.343 2.34 6.137 0 8.48ZM184 170c14.359 0 26-11.641 26-26 0-14.359-11.641-26-26-26-14.359 0-26 11.641-26 26 0 14.359 11.641 26 26 26Z"),
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
        return _listMagnifyingGlass!!
    }

private var _listMagnifyingGlass: ImageVector? = null
