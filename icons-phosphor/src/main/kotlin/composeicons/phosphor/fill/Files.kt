package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = phosphorFillIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 66.34l-40-40C172.158 24.84 170.122 23.998 168 24h-80C79.163 24 72 31.163 72 40v16h-16C47.163 56 40 63.163 40 72v144c0 8.837 7.163 16 16 16h112c8.837 0 16-7.163 16-16v-16h16c8.837 0 16-7.163 16-16v-112c.002-2.122-.84-4.158-2.34-5.66ZM136 192h-48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM136 160h-48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM200 184h-16v-80c.002-2.122-.84-4.158-2.34-5.66l-40-40C140.158 56.84 138.122 55.998 136 56h-48v-16h76.69L200 75.31Z"),
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
        return _files!!
    }

private var _files: ImageVector? = null
