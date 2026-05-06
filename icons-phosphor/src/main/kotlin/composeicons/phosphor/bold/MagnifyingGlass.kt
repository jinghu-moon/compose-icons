package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingGlass != null) return _magnifyingGlass!!
        _magnifyingGlass = phosphorBoldIcon(
            name = "MagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.49 215.51 185 168C214.55 129.493 209.151 74.664 172.658 42.66 136.166 10.656 81.101 12.458 46.78 46.78 12.458 81.101 10.656 136.166 42.66 172.658 74.664 209.151 129.493 214.55 168 185l47.53 47.54c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17ZM44 112C44 74.445 74.445 44 112 44c37.555 0 68 30.445 68 68 0 37.555-30.445 68-68 68C74.461 179.961 44.039 149.539 44 112Z"),
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
