package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = phosphorBoldIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M28 64C28 57.373 33.373 52 40 52h176c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-176C33.373 76 28 70.627 28 64ZM40 140h116c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-116c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM108 180h-68c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h68c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM251.49 127.45c-1.924 6.328-8.606 9.907-14.94 8L212 128.13v63.87c0 15.681-10.15 29.559-25.095 34.31-14.945 4.75-31.245-.72-40.299-13.523-9.054-12.804-8.778-29.995 .682-42.502 9.46-12.507 25.927-17.451 40.712-12.224v-46.06c.001-3.793 1.795-7.362 4.839-9.626 3.044-2.263 6.978-2.955 10.611-1.864l40 12c6.345 1.907 9.943 8.594 8.04 14.94ZM188 192c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12Z"),
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
        return _playlist!!
    }

private var _playlist: ImageVector? = null
