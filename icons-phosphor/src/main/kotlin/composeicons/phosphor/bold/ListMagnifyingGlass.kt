package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListMagnifyingGlass: ImageVector
    get() {
        if (_listMagnifyingGlass != null) return _listMagnifyingGlass!!
        _listMagnifyingGlass = phosphorBoldIcon(
            name = "ListMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M28 64C28 57.373 33.373 52 40 52h176c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-176C33.373 76 28 70.627 28 64ZM40 140h64c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-64c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM120 180h-80c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h80c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM240.49 200.49c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L205.41 182.41c-19.176 10.693-43.3 5.613-56.535-11.905-13.236-17.518-11.531-42.112 3.994-57.637 15.525-15.525 40.119-17.229 57.637-3.994 17.518 13.236 22.598 37.36 11.905 56.535l18.08 18.07c2.263 2.252 3.534 5.313 3.534 8.505 0 3.192-1.272 6.253-3.534 8.505ZM184 164c11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20Z"),
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
        return _listMagnifyingGlass!!
    }

private var _listMagnifyingGlass: ImageVector? = null
