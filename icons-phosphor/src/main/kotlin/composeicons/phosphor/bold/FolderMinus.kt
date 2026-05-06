package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderMinus: ImageVector
    get() {
        if (_folderMinus != null) return _folderMinus!!
        _folderMinus = phosphorBoldIcon(
            name = "FolderMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 144c0-6.627 5.373-12 12-12h48c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-48c-6.627 0-12-5.373-12-12ZM236 88v112.89c-.011 10.55-8.56 19.099-19.11 19.11h-177.51C28.684 219.983 20.017 211.316 20 200.62v-148.62C20 40.954 28.954 32 40 32h52.41c5.73-.016 11.192 2.428 15 6.71l26 29.29h82.59c11.046 0 20 8.954 20 20ZM44 68h57.28L90.61 56h-46.61ZM212 92h-168v104h168Z"),
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
        return _folderMinus!!
    }

private var _folderMinus: ImageVector? = null
