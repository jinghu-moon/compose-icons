package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Plugs: ImageVector
    get() {
        if (_plugs != null) return _plugs!!
        _plugs = phosphorLightIcon(
            name = "Plugs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148.24 139.76c-2.343-2.34-6.137-2.34-8.48 0L120 159.51 96.49 136l19.75-19.76c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L88 127.51 68.24 107.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L67.51 124 42.79 148.73c-11.711 11.715-11.711 30.705 0 42.42l6.78 6.79L19.76 227.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723L58.06 206.43l6.79 6.78c11.715 11.711 30.705 11.711 42.42 0L132 188.49l7.76 7.75c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333L128.49 168l19.75-19.76c2.34-2.343 2.34-6.137 0-8.48ZM98.79 204.76c-3.376 3.377-7.955 5.274-12.73 5.274-4.775 0-9.354-1.897-12.73-5.274L51.27 182.67c-3.377-3.376-5.274-7.955-5.274-12.73 0-4.775 1.897-9.354 5.274-12.73L76 132.49 123.51 180ZM236.24 19.76c-2.343-2.34-6.137-2.34-8.48 0L197.94 49.57l-6.79-6.78c-11.715-11.711-30.705-11.711-42.42 0L124 67.51l-7.76-7.75c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333l80 80c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333L188.49 132l24.72-24.73c11.711-11.715 11.711-30.705 0-42.42l-6.78-6.79L236.24 28.24c2.34-2.343 2.34-6.137 0-8.48ZM204.73 98.76 180 123.51 132.49 76 157.21 51.27c3.376-3.377 7.955-5.274 12.73-5.274 4.775 0 9.354 1.897 12.73 5.274l22.06 22.06c3.377 3.376 5.274 7.955 5.274 12.73 0 4.775-1.897 9.354-5.274 12.73Z"),
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
        return _plugs!!
    }

private var _plugs: ImageVector? = null
