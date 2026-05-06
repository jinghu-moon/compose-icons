package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileImage: ImageVector
    get() {
        if (_fileImage != null) return _fileImage!!
        _fileImage = phosphorFillIcon(
            name = "FileImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M158.66 219.56c1.638 2.455 1.791 5.614 .398 8.216-1.393 2.602-4.106 4.226-7.058 4.224h-128c-2.928 .001-5.622-1.597-7.025-4.167-1.403-2.57-1.29-5.701 .295-8.163l36-56c1.472-2.29 4.008-3.675 6.73-3.675 2.722 0 5.258 1.385 6.73 3.675l9.76 15.18L97.34 147.56c1.483-2.229 3.983-3.568 6.66-3.568 2.677 0 5.177 1.339 6.66 3.568ZM216 88v128c0 8.837-7.163 16-16 16h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8v-120h-48c-4.418 0-8-3.582-8-8v-48h-88v88c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-88C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66ZM160 80h28.69L160 51.31Z"),
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
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
