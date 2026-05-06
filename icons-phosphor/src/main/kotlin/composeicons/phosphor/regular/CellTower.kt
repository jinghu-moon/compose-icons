package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CellTower: ImageVector
    get() {
        if (_cellTower != null) return _cellTower!!
        _cellTower = phosphorRegularIcon(
            name = "CellTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M135.16 84.42C133.807 81.705 131.034 79.989 128 79.989c-3.034 0-5.807 1.716-7.16 4.431l-72 144c-1.977 3.952-.377 8.758 3.575 10.735 3.952 1.977 8.758 .377 10.735-3.575L77 208h102.1l13.79 27.58c1.348 2.695 4.097 4.403 7.11 4.42 2.772-.001 5.346-1.438 6.803-3.797 1.456-2.359 1.588-5.304 .347-7.783ZM128 105.89 155.06 160h-54.12ZM85 192l8-16h70.1l8 16ZM159.54 93.74C161.793 81.147 156.329 68.423 145.646 61.384c-10.682-7.039-24.53-7.039-35.213 0C99.751 68.423 94.287 81.147 96.54 93.74c.581 2.842-.422 5.776-2.622 7.668-2.2 1.892-5.251 2.444-7.974 1.444-2.723-1-4.692-3.396-5.144-6.262C77.372 77.682 85.551 58.551 101.589 47.966c16.038-10.585 36.844-10.585 52.882 0 16.038 10.585 24.217 29.716 20.789 48.624-.686 3.804-3.994 6.574-7.86 6.58-.479-.004-.958-.048-1.43-.13-2.094-.37-3.955-1.559-5.171-3.304-1.216-1.745-1.687-3.903-1.309-5.996ZM64.15 136.21C39.255 103.232 43.571 56.721 74.108 28.887c30.537-27.835 77.247-27.835 107.784 0 30.537 27.835 34.852 74.345 9.958 107.323-2.689 3.445-7.646 4.094-11.132 1.458-3.486-2.636-4.211-7.582-1.628-11.108 19.906-26.384 16.448-63.586-7.98-85.849-24.428-22.263-61.791-22.263-86.219 0C60.462 62.974 57.004 100.176 76.91 126.56c2.583 3.526 1.858 8.472-1.628 11.108-3.486 2.636-8.442 1.987-11.132-1.458Z"),
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
        return _cellTower!!
    }

private var _cellTower: ImageVector? = null
