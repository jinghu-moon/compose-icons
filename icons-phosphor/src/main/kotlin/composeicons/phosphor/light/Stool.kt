package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Stool: ImageVector
    get() {
        if (_stool != null) return _stool!!
        _stool = phosphorLightIcon(
            name = "Stool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198 64v-24c0-7.732-6.268-14-14-14h-112C64.268 26 58 32.268 58 40v24c0 7.732 6.268 14 14 14h9L58.07 223.06c-.25 1.574 .136 3.184 1.074 4.473 .938 1.289 2.351 2.152 3.926 2.397 1.573 .247 3.179-.141 4.466-1.078 1.287-.938 2.148-2.349 2.394-3.922L78 174h100l8 50.93c.516 3.275 3.59 5.511 6.865 4.995 3.275-.516 5.511-3.59 4.995-6.865L175 78h9c7.732 0 14-6.268 14-14ZM70 64v-24c0-1.105 .895-2 2-2h112c1.105 0 2 .895 2 2v24c0 1.105-.895 2-2 2h-112c-1.105 0-2-.895-2-2ZM176.14 162h-96.28L93.13 78h69.74Z"),
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
        return _stool!!
    }

private var _stool: ImageVector? = null
