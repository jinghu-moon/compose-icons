package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignLeftSimple: ImageVector
    get() {
        if (_alignLeftSimple != null) return _alignLeftSimple!!
        _alignLeftSimple = phosphorLightIcon(
            name = "AlignLeftSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M38 56v144c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-144c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM238 96v64c0 7.732-6.268 14-14 14h-152c-7.732 0-14-6.268-14-14v-64C58 88.268 64.268 82 72 82h152c7.732 0 14 6.268 14 14ZM226 96c0-1.105-.895-2-2-2h-152c-1.105 0-2 .895-2 2v64c0 1.105 .895 2 2 2h152c1.105 0 2-.895 2-2Z"),
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
        return _alignLeftSimple!!
    }

private var _alignLeftSimple: ImageVector? = null
