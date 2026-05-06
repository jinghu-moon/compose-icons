package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = phosphorDuotoneIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 80v88.89c0 3.927-3.183 7.11-7.11 7.11h-24.89v-64c0-4.418-3.582-8-8-8h-72L90.13 81.6C88.745 80.561 87.061 80 85.33 80h-21.33v-24c0-4.418 3.582-8 8-8h45.33c1.731 0 3.415 .561 4.8 1.6L152 72h72c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M224 64h-69.33L126.93 43.2C124.156 41.131 120.791 40.009 117.33 40h-45.33C63.163 40 56 47.163 56 56v16h-16C31.163 72 24 79.163 24 88v112c0 8.837 7.163 16 16 16h152.89c8.34-.011 15.099-6.77 15.11-15.11v-16.89h16.89c8.34-.011 15.099-6.77 15.11-15.11v-88.89c0-8.837-7.163-16-16-16ZM192 200h-152v-112h45.33l29.87 22.4c1.385 1.039 3.069 1.6 4.8 1.6h72ZM224 168h-16v-56c0-8.837-7.163-16-16-16h-69.33L94.93 75.2C92.156 73.131 88.791 72.009 85.33 72h-13.33v-16h45.33l29.87 22.4C148.585 79.439 150.269 80 152 80h72Z"),
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
        return _folders!!
    }

private var _folders: ImageVector? = null
