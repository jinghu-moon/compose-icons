package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FolderSimple: ImageVector
    get() {
        if (_folderSimple != null) return _folderSimple!!
        _folderSimple = phosphorDuotoneIcon(
            name = "FolderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 88v112.89c0 3.927-3.183 7.11-7.11 7.11h-176.89c-4.418 0-8-3.582-8-8v-136c0-4.418 3.582-8 8-8h53.33c1.731 0 3.415 .561 4.8 1.6L128 80h88c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M216 72h-85.33L102.93 51.2C100.156 49.131 96.791 48.009 93.33 48h-53.33C31.163 48 24 55.163 24 64v136c0 8.837 7.163 16 16 16h176.89c8.34-.011 15.099-6.77 15.11-15.11v-112.89c0-8.837-7.163-16-16-16ZM216 200h-176v-136h53.33l29.87 22.4C124.585 87.439 126.269 88 128 88h88Z"),
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
        return _folderSimple!!
    }

private var _folderSimple: ImageVector? = null
