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
                pathData = parseSvgPathData("M229.66 218.34 179.59 168.28C209.738 132.086 206.085 78.581 171.297 46.82 136.51 15.059 82.894 16.277 49.586 49.586 16.277 82.894 15.059 136.51 46.82 171.297c31.761 34.787 85.266 38.44 121.46 8.293l50.06 50.07c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32ZM40 112C40 72.235 72.235 40 112 40c39.764 0 72 32.235 72 72 0 39.764-32.236 72-72 72C72.254 183.956 40.044 151.746 40 112Z"),
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
