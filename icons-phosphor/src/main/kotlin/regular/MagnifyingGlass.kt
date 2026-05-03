package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingGlass != null) return _magnifyingGlass!!
        _magnifyingGlass = phosphorRegularIcon(
            name = "MagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.660 218.340 L 179.590 168.280 C 209.738 132.086 206.085 78.581 171.297 46.820 C 136.510 15.059 82.894 16.277 49.586 49.586 C 16.277 82.894 15.059 136.510 46.820 171.297 C 78.581 206.085 132.086 209.738 168.280 179.590 L 218.340 229.660 C 221.466 232.786 226.534 232.786 229.660 229.660 C 232.786 226.534 232.786 221.466 229.660 218.340 ZM 40.000 112.000 C 40.000 72.235 72.235 40.000 112.000 40.000 C 151.764 40.000 184.000 72.235 184.000 112.000 C 184.000 151.764 151.764 184.000 112.000 184.000 C 72.254 183.956 40.044 151.746 40.000 112.000 Z"),
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
