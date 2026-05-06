package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) return _dropHalfBottom!!
        _dropHalfBottom = phosphorThinIcon(
            name = "DropHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M171 50.37C158.861 36.349 145.2 23.722 130.27 12.72c-1.376-.961-3.204-.961-4.58 0C110.774 23.724 97.127 36.351 85 50.37 58.17 81.21 44 113.58 44 144c0 46.392 37.608 84 84 84 46.392 0 84-37.608 84-84C212 113.58 197.83 81.21 171 50.37ZM189.91 188h-123.82C60.904 180.735 57.044 172.61 54.69 164h146.62c-2.354 8.61-6.214 16.735-11.4 24ZM53 156c-.653-3.967-.987-7.98-1-12 .005-4.013 .269-8.021 .79-12h150.42c.521 3.979 .785 7.987 .79 12-.013 4.02-.347 8.033-1 12ZM90.9 55.77C102.073 42.968 114.501 31.32 128 21c13.5 10.333 25.929 21.994 37.1 34.81 14.37 16.55 31 40.61 36.77 68.23h-147.74C59.93 96.38 76.53 72.32 90.9 55.77ZM128 220c-20.977 .007-41.018-8.683-55.35-24h110.7C169.018 211.317 148.977 220.007 128 220Z"),
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
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
