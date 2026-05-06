package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Broadcast: ImageVector
    get() {
        if (_broadcast != null) return _broadcast!!
        _broadcast = phosphorBoldIcon(
            name = "Broadcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 84c-24.301 0-44 19.699-44 44 0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44C171.972 103.711 152.289 84.028 128 84ZM128 148c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM205.39 160.7c-3.608 8.529-8.602 16.402-14.78 23.3-4.418 4.94-12.005 5.363-16.945 .945-4.94-4.418-5.363-12.005-.945-16.945 20.408-22.762 20.408-57.238 0-80-4.418-4.94-3.995-12.527 .945-16.945 4.94-4.418 12.527-3.995 16.945 .945 21.654 24.226 27.409 58.762 14.78 88.7ZM83.28 168c4.418 4.94 3.995 12.527-.945 16.945-4.94 4.418-12.527 3.995-16.945-.945C36.843 152.124 36.843 103.876 65.39 72c4.418-4.94 12.005-5.363 16.945-.945 4.94 4.418 5.363 12.005 .945 16.945-20.408 22.762-20.408 57.238 0 80ZM252 128c.039 32.456-12.687 63.625-35.43 86.78-2.959 3.234-7.447 4.596-11.705 3.555-4.258-1.042-7.609-4.322-8.741-8.557-1.132-4.235 .135-8.75 3.305-11.777 38.178-38.858 38.178-101.142 0-140-4.639-4.733-4.563-12.331 .17-16.97 4.733-4.639 12.331-4.563 16.97 .17C239.318 64.36 252.044 95.537 252 128ZM56.57 198c4.639 4.733 4.563 12.331-.17 16.97-4.733 4.639-12.331 4.563-16.97-.17C-7.864 166.612-7.864 89.428 39.43 41.24c4.691-4.359 11.979-4.266 16.558 .211 4.579 4.477 4.835 11.761 .582 16.549-38.178 38.858-38.178 101.142 0 140Z"),
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
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
