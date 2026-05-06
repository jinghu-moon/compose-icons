package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.QrCode: ImageVector
    get() {
        if (_qrCode != null) return _qrCode!!
        _qrCode = phosphorDuotoneIcon(
            name = "QrCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112 56v48c0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8ZM104 144h-48c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8ZM200 48h-48c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8Z"),
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
                pathData = parseSvgPathData("M104 40h-48C47.163 40 40 47.163 40 56v48c0 8.837 7.163 16 16 16h48c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16ZM104 104h-48v-48h48v48ZM104 136h-48c-8.837 0-16 7.163-16 16v48c0 8.837 7.163 16 16 16h48c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16ZM104 200h-48v-48h48v48ZM200 40h-48c-8.837 0-16 7.163-16 16v48c0 8.837 7.163 16 16 16h48c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16ZM200 104h-48v-48h48v48ZM136 176v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM216 160c0 4.418-3.582 8-8 8h-24v40c0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24v-56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8h24c4.418 0 8 3.582 8 8ZM216 192v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _qrCode!!
    }

private var _qrCode: ImageVector? = null
