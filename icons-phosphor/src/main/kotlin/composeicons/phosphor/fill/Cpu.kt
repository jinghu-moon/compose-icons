package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cpu: ImageVector
    get() {
        if (_cpu != null) return _cpu!!
        _cpu = phosphorFillIcon(
            name = "Cpu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 104h48v48h-48ZM240 152c0 4.418-3.582 8-8 8h-16v40c0 8.837-7.163 16-16 16h-40v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-32v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-40c-8.837 0-16-7.163-16-16v-40h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-32h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-40C40 47.163 47.163 40 56 40h40v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h32v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h40c8.837 0 16 7.163 16 16v40h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16v32h16c4.418 0 8 3.582 8 8ZM168 96c0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8v64c0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8Z"),
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
        return _cpu!!
    }

private var _cpu: ImageVector? = null
