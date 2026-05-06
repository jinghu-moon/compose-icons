package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PlugsConnected: ImageVector
    get() {
        if (_plugsConnected != null) return _plugsConnected!!
        _plugsConnected = phosphorLightIcon(
            name = "PlugsConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.24 19.76c-2.343-2.34-6.137-2.34-8.48 0L173.94 73.57l-6.79-6.78c-11.715-11.711-30.705-11.711-42.42 0L100 91.51 92.24 83.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L91.51 100 66.79 124.73c-11.711 11.715-11.711 30.705 0 42.42l6.78 6.79L19.76 227.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723L82.06 182.43l6.79 6.78c11.715 11.711 30.705 11.711 42.42 0L156 164.49l7.76 7.75c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333L164.49 156l24.72-24.73c11.711-11.715 11.711-30.705 0-42.42l-6.78-6.79L236.24 28.24c2.34-2.343 2.34-6.137 0-8.48ZM122.79 180.76c-3.376 3.377-7.955 5.274-12.73 5.274-4.775 0-9.354-1.897-12.73-5.274L75.27 158.67c-3.377-3.376-5.274-7.955-5.274-12.73 0-4.775 1.897-9.354 5.274-12.73L100 108.49 147.51 156ZM180.73 122.82 156 147.51 108.49 100 133.21 75.27c3.376-3.377 7.955-5.274 12.73-5.274 4.775 0 9.354 1.897 12.73 5.274l22.06 22.06c3.377 3.376 5.274 7.955 5.274 12.73 0 4.775-1.897 9.354-5.274 12.73ZM90.43 34.23c-1.201-3.069 .298-6.532 3.357-7.757 3.059-1.225 6.534 .247 7.783 3.297l8 20c.816 1.994 .501 4.273-.827 5.97-1.328 1.697-3.463 2.552-5.595 2.24-2.132-.312-3.933-1.744-4.718-3.75ZM26.43 93.77c1.232-3.076 4.724-4.571 7.8-3.34l20 8c2.007 .785 3.438 2.586 3.75 4.718 .312 2.132-.543 4.268-2.24 5.595-1.697 1.328-3.976 1.643-5.97 .827l-20-8c-3.076-1.232-4.571-4.724-3.34-7.8ZM229.57 162.23c-1.232 3.076-4.724 4.571-7.8 3.34l-20-8c-3.05-1.249-4.521-4.723-3.297-7.783 1.225-3.059 4.688-4.558 7.757-3.357l20 8c3.076 1.232 4.571 4.724 3.34 7.8ZM165.57 221.77c.816 1.994 .501 4.273-.827 5.97-1.328 1.697-3.463 2.552-5.595 2.24-2.132-.312-3.933-1.744-4.718-3.75l-8-20c-1.201-3.069 .298-6.532 3.357-7.757 3.059-1.225 6.534 .247 7.783 3.297Z"),
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
        return _plugsConnected!!
    }

private var _plugsConnected: ImageVector? = null
