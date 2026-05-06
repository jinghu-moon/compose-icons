package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = phosphorDuotoneIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 64v128h-128v-128Z"),
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
                pathData = parseSvgPathData("M240 192c0 4.418-3.582 8-8 8h-32v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32h-120c-4.418 0-8-3.582-8-8v-120h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v160h160c4.418 0 8 3.582 8 8ZM96 72h88v88c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-96c0-4.418-3.582-8-8-8h-96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8Z"),
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
        return _crop!!
    }

private var _crop: ImageVector? = null
