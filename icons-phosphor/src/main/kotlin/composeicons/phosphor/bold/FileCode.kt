package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileCode: ImageVector
    get() {
        if (_fileCode != null) return _fileCode!!
        _fileCode = phosphorBoldIcon(
            name = "FileCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180.49 143.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-24 24c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L155 152 139.48 136.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0ZM116.49 119.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529l-24 24c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l24 24c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L101 152l15.52-15.51c2.249-2.255 3.51-5.311 3.504-8.496-.006-3.185-1.277-6.237-3.534-8.484ZM220 88v128c0 11.046-8.954 20-20 20h-144C44.954 236 36 227.046 36 216v-176C36 28.954 44.954 20 56 20h96c3.185 0 6.239 1.266 8.49 3.52l56 56c2.247 2.25 3.51 5.3 3.51 8.48ZM160 57v23h23ZM196 212v-108h-48c-6.627 0-12-5.373-12-12v-48h-76v168Z"),
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
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
