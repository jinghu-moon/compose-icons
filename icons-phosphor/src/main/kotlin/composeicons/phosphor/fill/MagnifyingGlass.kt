package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingGlass != null) return _magnifyingGlass!!
        _magnifyingGlass = phosphorFillIcon(
            name = "MagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 112c0 30.928-25.072 56-56 56C81.072 168 56 142.928 56 112 56 81.072 81.072 56 112 56c30.928 0 56 25.072 56 56ZM229.66 229.66c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346L168.28 179.59C132.115 209.677 78.682 205.999 46.981 171.24 15.279 136.482 16.522 82.937 49.802 49.687 83.082 16.437 136.627 15.241 171.358 46.974c34.73 31.732 38.361 85.168 8.242 121.306l50.06 50.06c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66ZM112 184c39.764 0 72-32.236 72-72C184 72.235 151.764 40 112 40 72.235 40 40 72.235 40 112c.044 39.746 32.254 71.956 72 72Z"),
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
        return _magnifyingGlass!!
    }

private var _magnifyingGlass: ImageVector? = null
