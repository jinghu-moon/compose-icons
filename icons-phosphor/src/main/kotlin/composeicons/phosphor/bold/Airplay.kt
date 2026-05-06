package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Airplay: ImageVector
    get() {
        if (_airplay != null) return _airplay!!
        _airplay = phosphorBoldIcon(
            name = "Airplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M137.11 152.19c-2.28-2.659-5.607-4.189-9.11-4.189-3.503 0-6.83 1.53-9.11 4.189l-48 56c-3.05 3.558-3.75 8.566-1.792 12.824 1.958 4.258 6.215 6.986 10.902 6.986h96c4.686-0 8.944-2.729 10.902-6.986 1.958-4.258 1.258-9.266-1.792-12.824ZM106.11 204 128 178.44 149.91 204ZM236 64v112c0 15.464-12.536 28-28 28h-4c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h4c2.209 0 4-1.791 4-4v-112c0-2.209-1.791-4-4-4h-160c-2.209 0-4 1.791-4 4v112c0 2.209 1.791 4 4 4h4c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-4C32.536 204 20 191.464 20 176v-112C20 48.536 32.536 36 48 36h160c15.464 0 28 12.536 28 28Z"),
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
        return _airplay!!
    }

private var _airplay: ImageVector? = null
