package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MagnifyingGlassPlus: ImageVector
    get() {
        if (_magnifyingGlassPlus != null) return _magnifyingGlassPlus!!
        _magnifyingGlassPlus = phosphorThinIcon(
            name = "MagnifyingGlassPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 112c0 2.209-1.791 4-4 4h-28v28c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-28h-28c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h28v-28c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v28h28c2.209 0 4 1.791 4 4ZM226.83 226.83c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L168.47 174.13C134.678 204.848 82.547 202.986 51.033 169.935 19.52 136.884 20.14 84.724 52.432 52.432 84.724 20.14 136.884 19.52 169.935 51.033c33.051 31.514 34.913 83.645 4.195 117.437l52.7 52.7c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83ZM112 188c41.974 0 76-34.026 76-76C188 70.026 153.974 36 112 36 70.026 36 36 70.026 36 112c.044 41.955 34.045 75.956 76 76Z"),
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
        return _magnifyingGlassPlus!!
    }

private var _magnifyingGlassPlus: ImageVector? = null
