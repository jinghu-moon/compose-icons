package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Plug: ImageVector
    get() {
        if (_plug != null) return _plug!!
        _plug = phosphorLightIcon(
            name = "Plug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.24 67.76c-2.343-2.34-6.137-2.34-8.48 0L192 103.51 152.49 64 188.24 28.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L144 55.51 116.24 27.76c-1.496-1.605-3.748-2.266-5.874-1.723-2.126 .543-3.786 2.203-4.329 4.329-.543 2.126 .118 4.379 1.723 5.874L115.51 44 61.13 98.38c-7.129 7.127-11.135 16.794-11.135 26.875 0 10.081 4.005 19.748 11.135 26.875l17.13 17.12L27.76 219.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723L86.75 177.74l17.13 17.13c14.84 14.84 38.9 14.84 53.74 0L212 140.49l7.76 7.75c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333L200.49 112 236.24 76.24c2.34-2.343 2.34-6.137 0-8.48ZM149.13 186.38c-4.876 4.876-11.489 7.615-18.385 7.615-6.896 0-13.509-2.739-18.385-7.615L69.62 143.64c-4.876-4.876-7.615-11.489-7.615-18.385 0-6.896 2.739-13.509 7.615-18.385L124 52.49 203.51 132Z"),
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
        return _plug!!
    }

private var _plug: ImageVector? = null
