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
                pathData = parseSvgPathData("M 168.000 112.000 C 168.000 142.928 142.928 168.000 112.000 168.000 C 81.072 168.000 56.000 142.928 56.000 112.000 C 56.000 81.072 81.072 56.000 112.000 56.000 C 142.928 56.000 168.000 81.072 168.000 112.000 ZM 229.660 229.660 C 228.159 231.162 226.123 232.006 224.000 232.006 C 221.877 232.006 219.841 231.162 218.340 229.660 L 168.280 179.590 C 132.115 209.677 78.682 205.999 46.981 171.240 C 15.279 136.482 16.522 82.937 49.802 49.687 C 83.082 16.437 136.627 15.241 171.358 46.974 C 206.088 78.706 209.719 132.142 179.600 168.280 L 229.660 218.340 C 231.162 219.841 232.006 221.877 232.006 224.000 C 232.006 226.123 231.162 228.159 229.660 229.660 ZM 112.000 184.000 C 151.764 184.000 184.000 151.764 184.000 112.000 C 184.000 72.235 151.764 40.000 112.000 40.000 C 72.235 40.000 40.000 72.235 40.000 112.000 C 40.044 151.746 72.254 183.956 112.000 184.000 Z"),
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
