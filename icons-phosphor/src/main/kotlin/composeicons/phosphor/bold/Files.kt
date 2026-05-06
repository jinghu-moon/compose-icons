package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = phosphorBoldIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.49 59.51l-40-40C178.238 17.26 175.184 15.997 172 16h-80C80.954 16 72 24.954 72 36v20h-16C44.954 56 36 64.954 36 76v140c0 11.046 8.954 20 20 20h108c11.046 0 20-8.954 20-20v-20h20c11.046 0 20-8.954 20-20v-108c.003-3.184-1.26-6.238-3.51-8.49ZM160 212h-100v-132h67l33 33ZM200 172h-16v-64c.003-3.184-1.26-6.238-3.51-8.49l-40-40C138.238 57.26 135.184 55.997 132 56h-36v-16h71l33 33ZM144 144c0 6.627-5.373 12-12 12h-44c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h44c6.627 0 12 5.373 12 12ZM144 184c0 6.627-5.373 12-12 12h-44c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h44c6.627 0 12 5.373 12 12Z"),
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
