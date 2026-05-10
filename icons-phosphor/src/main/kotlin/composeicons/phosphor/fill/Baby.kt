package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = phosphorFillIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134.16 24.1c-1.425-.075-2.781 .615-3.56 1.81C120.3 41.48 120 55.79 120 56c.01 2.411 1.106 4.689 2.984 6.201 1.878 1.512 4.338 2.095 6.696 1.589 3.742-.896 6.365-4.263 6.32-8.11 .077-2.212 1.067-4.293 2.735-5.748 1.667-1.455 3.863-2.155 6.065-1.932 4.16 .483 7.274 4.043 7.2 8.23-.075 13.255-10.88 23.94-24.135 23.865C114.61 80.02 103.925 69.215 104 55.96c0-.63 .09-10.78 5.44-24 .552-1.379 .295-2.95-.668-4.081-.963-1.131-2.473-1.635-3.922-1.309C56.233 37.738 22.358 81.806 24.07 131.66 26 186.72 71.23 231 126.32 231.9c56.524 .866 103.388-43.577 105.519-100.067C233.97 75.343 190.588 27.496 134.16 24.1ZM80 127.91c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM160.27 182.68c-19.752 12.313-44.788 12.313-64.54 0-3.739-2.358-4.858-7.301-2.5-11.04 2.358-3.739 7.301-4.858 11.04-2.5 14.534 9.02 32.926 9.02 47.46 0 3.739-2.358 8.682-1.239 11.04 2.5 2.358 3.739 1.239 8.682-2.5 11.04ZM164 139.91c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _baby!!
    }

private var _baby: ImageVector? = null
