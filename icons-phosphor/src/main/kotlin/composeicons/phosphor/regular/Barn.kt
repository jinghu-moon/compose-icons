package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Barn: ImageVector
    get() {
        if (_barn != null) return _barn!!
        _barn = phosphorRegularIcon(
            name = "Barn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 192h-8v-61.43l1.49 2.08c1.604 2.468 4.434 3.856 7.367 3.613 2.933-.243 5.497-2.076 6.673-4.774 1.177-2.698 .777-5.824-1.04-8.139l-40-56c-.548-.759-1.225-1.415-2-1.94L137 18.77l-.1-.07c-5.377-3.587-12.383-3.587-17.76 0l-.1 .07L51.45 65.42c-.775 .525-1.452 1.181-2 1.94l-40 56c-1.818 2.315-2.217 5.441-1.04 8.139 1.177 2.698 3.74 4.532 6.673 4.774 2.933 .243 5.763-1.145 7.367-3.613L24 130.57v61.43h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h224c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM40 108.17 61.7 77.79 128 32l66.3 45.78L216 108.17v83.83h-24v-72c0-4.418-3.582-8-8-8h-112c-4.418 0-8 3.582-8 8v72h-24ZM128 150.17 97 128h62ZM176 135.55v48.91L141.76 160ZM114.24 160 80 184.46v-48.91ZM128 169.83 159 192h-62ZM104 88c0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8Z"),
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
        return _barn!!
    }

private var _barn: ImageVector? = null
