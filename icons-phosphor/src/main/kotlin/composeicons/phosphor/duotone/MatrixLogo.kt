package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MatrixLogo: ImageVector
    get() {
        if (_matrixLogo != null) return _matrixLogo!!
        _matrixLogo = phosphorDuotoneIcon(
            name = "MatrixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40v176h-176v-176Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M72 216c0 4.418-3.582 8-8 8h-24c-4.418 0-8-3.582-8-8v-176c0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16v160h16c4.418 0 8 3.582 8 8ZM216 32h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v160h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c4.418 0 8-3.582 8-8v-176c0-4.418-3.582-8-8-8ZM184 120c-.015-13.302-8.258-25.208-20.703-29.904C150.851 85.4 136.798 88.893 128 98.87 117.74 87.177 100.546 84.579 87.29 92.72 85.739 89.288 82.004 87.403 78.322 88.193 74.64 88.983 72.007 92.234 72 96v64c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8Z"),
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
