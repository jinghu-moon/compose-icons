package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Article: ImageVector
    get() {
        if (_article != null) return _article!!
        _article = phosphorBoldIcon(
            name = "Article",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-176C28.954 36 20 44.954 20 56v144c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-144C236 44.954 227.046 36 216 36ZM212 196h-168v-136h168ZM68 92C68 85.373 73.373 80 80 80h96c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-96C73.373 104 68 98.627 68 92ZM68 128c0-6.627 5.373-12 12-12h96c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12ZM68 164c0-6.627 5.373-12 12-12h96c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12Z"),
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
        return _article!!
    }

private var _article: ImageVector? = null
