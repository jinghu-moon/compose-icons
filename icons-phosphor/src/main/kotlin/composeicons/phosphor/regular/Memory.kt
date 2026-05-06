package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Memory: ImageVector
    get() {
        if (_memory != null) return _memory!!
        _memory = phosphorRegularIcon(
            name = "Memory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 56h-208C15.163 56 8 63.163 8 72v128c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-128c0-8.837-7.163-16-16-16ZM24 72h208v96h-208ZM112 152c4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8ZM56 104h48v32h-48ZM144 152h64c4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8ZM152 104h48v32h-48Z"),
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
        return _memory!!
    }

private var _memory: ImageVector? = null
