package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Vibrate: ImageVector
    get() {
        if (_vibrate != null) return _vibrate!!
        _vibrate = phosphorDuotoneIcon(
            name = "Vibrate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 56v144c0 8.837-7.163 16-16 16h-64c-8.837 0-16-7.163-16-16v-144C80 47.163 87.163 40 96 40h64c8.837 0 16 7.163 16 16Z"),
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
                pathData = parseSvgPathData("M160 32h-64C82.745 32 72 42.745 72 56v144c0 13.255 10.745 24 24 24h64c13.255 0 24-10.745 24-24v-144C184 42.745 173.255 32 160 32ZM168 200c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8v-144c0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8ZM216 88v80c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM248 104v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM56 88v80c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM24 104v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _vibrate!!
    }

private var _vibrate: ImageVector? = null
