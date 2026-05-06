package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = phosphorFillIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 216c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h149.25c22.582-18.259 31.985-48.297 23.843-76.173C196.951 103.951 172.86 83.695 144 80.46v55.54c0 8.837-7.163 16-16 16h-48c-8.837 0-16-7.163-16-16v-104C64 23.163 71.163 16 80 16h48c8.837 0 16 7.163 16 16v32.37c32.478 2.982 60.648 23.672 73.209 53.771 12.561 30.099 7.455 64.675-13.269 89.859h20.06c4.418 0 8 3.582 8 8ZM136 184c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8Z"),
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
        return _microscope!!
    }

private var _microscope: ImageVector? = null
