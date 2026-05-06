package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) return _tagChevron!!
        _tagChevron = phosphorLightIcon(
            name = "TagChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245 124.67 199.37 56.23C196.772 52.336 192.401 49.999 187.72 50h-155.72c-2.215-.003-4.251 1.214-5.297 3.166-1.046 1.952-.932 4.322 .297 6.164L72.79 128 27 196.67c-1.229 1.842-1.344 4.212-.297 6.164 1.046 1.952 3.083 3.169 5.297 3.166h155.72c4.681 .001 9.052-2.336 11.65-6.23L245 131.33c1.345-2.016 1.345-4.644 0-6.66ZM189.39 193.11c-.37 .555-.993 .889-1.66 .89h-144.52L85 131.33c1.345-2.016 1.345-4.644 0-6.66L43.21 62h144.51c.667 .001 1.29 .335 1.66 .89L232.79 128Z"),
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
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
