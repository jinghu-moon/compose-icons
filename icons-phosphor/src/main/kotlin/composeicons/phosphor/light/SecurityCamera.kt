package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SecurityCamera: ImageVector
    get() {
        if (_securityCamera != null) return _securityCamera!!
        _securityCamera = phosphorLightIcon(
            name = "SecurityCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 138c-3.314 0-6 2.686-6 6v18h-46.69c-.53-.002-1.037-.214-1.41-.59L174.14 141.66 225.9 89.9c2.626-2.626 4.101-6.187 4.101-9.9 0-3.713-1.475-7.274-4.101-9.9l-56-56c-2.626-2.629-6.189-4.106-9.905-4.106-3.716 0-7.279 1.477-9.905 4.106L4.34 160.35c-2.283 2.289-2.965 5.728-1.726 8.714 1.238 2.987 4.153 4.934 7.386 4.936h40.2l35.9 35.9c2.626 2.626 6.187 4.101 9.9 4.101 3.713 0 7.274-1.475 9.9-4.101l59.76-59.76 19.75 19.76c2.622 2.631 6.186 4.107 9.9 4.1h46.69v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6ZM158.59 22.59c.78-.775 2.04-.775 2.82 0l14.1 14.1L50.2 162h-30.56ZM97.41 201.41c-.78 .775-2.04 .775-2.82 0L61.17 168 184 45.17l33.41 33.42c.775 .78 .775 2.04 0 2.82Z"),
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
        return _securityCamera!!
    }

private var _securityCamera: ImageVector? = null
