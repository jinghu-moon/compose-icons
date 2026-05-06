package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignRightSimple: ImageVector
    get() {
        if (_alignRightSimple != null) return _alignRightSimple!!
        _alignRightSimple = phosphorLightIcon(
            name = "AlignRightSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 56v144c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-144c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM198 96v64c0 7.732-6.268 14-14 14h-152c-7.732 0-14-6.268-14-14v-64C18 88.268 24.268 82 32 82h152c7.732 0 14 6.268 14 14ZM186 96c0-1.105-.895-2-2-2h-152c-1.105 0-2 .895-2 2v64c0 1.105 .895 2 2 2h152c1.105 0 2-.895 2-2Z"),
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
        return _alignRightSimple!!
    }

private var _alignRightSimple: ImageVector? = null
