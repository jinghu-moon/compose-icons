package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = phosphorThinIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 108h-14.34L189.17 71.51C186.924 69.256 183.872 67.992 180.69 68h-44.69v-32h28c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h28v32h-64C57.373 68 52 73.373 52 80v56h-32v-28c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v64c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-28h32v24.69c-.008 3.182 1.256 6.234 3.51 8.48l39.32 39.32c2.246 2.254 5.298 3.518 8.48 3.51h77.38c3.182 .008 6.234-1.256 8.48-3.51L225.66 180h14.34c6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12ZM244 168c0 2.209-1.791 4-4 4h-16c-1.061-.001-2.079 .42-2.83 1.17l-37.66 37.66c-.748 .748-1.762 1.168-2.82 1.17h-77.38c-1.058-.002-2.072-.422-2.82-1.17L61.17 171.51c-.748-.748-1.168-1.762-1.17-2.82v-88.69c0-2.209 1.791-4 4-4h116.69c1.058 .002 2.072 .422 2.82 1.17l37.66 37.66c.751 .75 1.769 1.171 2.83 1.17h16c2.209 0 4 1.791 4 4Z"),
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
        return _engine!!
    }

private var _engine: ImageVector? = null
