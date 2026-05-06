package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = phosphorThinIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 144c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4C235.939 88.797 191.203 44.061 136 44 85.213 44.055 44.055 85.213 44 136c.05 46.371 37.629 83.95 84 84 41.955-.044 75.956-34.045 76-76C203.961 106.461 173.539 76.039 136 76c-33.121 .039-59.961 26.879-60 60 .033 28.705 23.295 51.967 52 52 24.289-.028 43.972-19.711 44-44 0-19.882-16.118-36-36-36-15.464 0-28 12.536-28 28 0 11.046 8.954 20 20 20 6.627 0 12-5.373 12-12 0-2.209-1.791-4-4-4-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 6.627 0 12 5.373 12 12 0 11.046-8.954 20-20 20-15.464 0-28-12.536-28-28 0-19.882 16.118-36 36-36 24.289 .028 43.972 19.711 44 44-.033 28.705-23.295 51.967-52 52C94.879 195.961 68.039 169.121 68 136 68.039 98.461 98.461 68.039 136 68c41.955 .044 75.956 34.045 76 76-.05 46.371-37.629 83.95-84 84C77.213 227.945 36.055 186.787 36 136 36.061 80.797 80.797 36.061 136 36c59.619 .066 107.934 48.381 108 108Z"),
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
        return _spiral!!
    }

private var _spiral: ImageVector? = null
