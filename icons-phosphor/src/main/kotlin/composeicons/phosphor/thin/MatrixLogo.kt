package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MatrixLogo: ImageVector
    get() {
        if (_matrixLogo != null) return _matrixLogo!!
        _matrixLogo = phosphorThinIcon(
            name = "MatrixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 44v168h20c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4v-176c0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM216 36h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v168h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h24c2.209 0 4-1.791 4-4v-176c0-2.209-1.791-4-4-4ZM152 92c-9.833 .005-18.943 5.167-24 13.6C123.534 98.17 115.879 93.227 107.269 92.216 98.659 91.204 90.067 94.238 84 100.43v-4.43c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v64c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-40c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20v40c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-40c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20v40c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-40C180 104.536 167.464 92 152 92Z"),
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
        return _matrixLogo!!
    }

private var _matrixLogo: ImageVector? = null
