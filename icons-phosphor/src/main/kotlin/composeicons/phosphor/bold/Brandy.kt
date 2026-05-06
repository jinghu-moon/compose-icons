package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Brandy: ImageVector
    get() {
        if (_brandy != null) return _brandy!!
        _brandy = phosphorBoldIcon(
            name = "Brandy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 88h0c.024-19.37-5.599-38.326-16.18-54.55-2.204-3.383-5.962-5.432-10-5.45h-147.59c-4.038 .018-7.796 2.067-10 5.45C33.631 49.668 27.991 68.625 28 88h0c.066 50.563 37.811 93.146 88 99.28v24.72h-28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h80c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-28v-24.72C190.189 181.146 227.934 138.563 228 88ZM61.05 52h133.95c4.034 7.486 6.772 15.601 8.1 24h-150.1c1.312-8.396 4.034-16.511 8.05-24ZM128.05 164C90.745 163.927 58.99 136.829 53.05 100h149.95c-5.94 36.829-37.695 63.927-75 64Z"),
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
        return _brandy!!
    }

private var _brandy: ImageVector? = null
