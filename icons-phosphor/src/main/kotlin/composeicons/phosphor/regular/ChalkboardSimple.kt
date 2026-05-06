package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChalkboardSimple: ImageVector
    get() {
        if (_chalkboardSimple != null) return _chalkboardSimple!!
        _chalkboardSimple = phosphorRegularIcon(
            name = "ChalkboardSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 192h-8v-24c0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8v24h-112v-136h176v80c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-80c0-8.837-7.163-16-16-16h-176C31.163 40 24 47.163 24 56v136h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h224c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM168 176h48v16h-48Z"),
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
        return _chalkboardSimple!!
    }

private var _chalkboardSimple: ImageVector? = null
