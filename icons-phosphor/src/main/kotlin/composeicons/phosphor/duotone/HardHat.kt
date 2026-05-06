package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HardHat: ImageVector
    get() {
        if (_hardHat != null) return _hardHat!!
        _hardHat = phosphorDuotoneIcon(
            name = "HardHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 51.31v108.69h-64v-24C39.988 96.632 66.125 62.047 104 51.31ZM152 51.31v108.69h64v-24C216.012 96.632 189.875 62.047 152 51.31Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M224 152v-16C223.89 95.352 198.287 59.143 160 45.49v-5.49c0-8.837-7.163-16-16-16h-32c-8.837 0-16 7.163-16 16v5.49C57.713 59.143 32.11 95.352 32 136v16c-8.837 0-16 7.163-16 16v24c0 8.837 7.163 16 16 16h192c8.837 0 16-7.163 16-16v-24c0-8.837-7.163-16-16-16ZM208 136v16h-48v-89.33c29.094 12.799 47.91 41.545 48 73.33ZM144 40v112h-32v-112ZM48 136C48.09 104.215 66.906 75.469 96 62.67v89.33h-48ZM224 192h-192v-24h192v24Z"),
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
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
