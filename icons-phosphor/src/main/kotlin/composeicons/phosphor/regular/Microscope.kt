package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = phosphorRegularIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 208h-20.06c20.724-25.184 25.83-59.761 13.269-89.859C204.648 88.042 176.478 67.352 144 64.37v-32.37c0-8.837-7.163-16-16-16h-48C71.163 16 64 23.163 64 32v104c0 8.837 7.163 16 16 16h48c8.837 0 16-7.163 16-16v-55.54c28.86 3.235 52.951 23.491 61.093 51.367 8.142 27.876-1.261 57.914-23.843 76.173h-149.25c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h192c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM128 136h-48v-104h48v104ZM72 184c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
