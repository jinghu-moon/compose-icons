package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TagSimple: ImageVector
    get() {
        if (_tagSimple != null) return _tagSimple!!
        _tagSimple = phosphorLightIcon(
            name = "TagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245 124.67 199.37 56.23C196.772 52.336 192.401 49.999 187.72 50h-147.72C32.268 50 26 56.268 26 64v128c0 7.732 6.268 14 14 14h147.72c4.681 .001 9.052-2.336 11.65-6.23L245 131.33c1.345-2.016 1.345-4.644 0-6.66ZM189.39 193.11c-.37 .555-.993 .889-1.66 .89h-147.73c-1.105 0-2-.895-2-2v-128c0-1.105 .895-2 2-2h147.72c.667 .001 1.29 .335 1.66 .89L232.79 128Z"),
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
        return _tagSimple!!
    }

private var _tagSimple: ImageVector? = null
