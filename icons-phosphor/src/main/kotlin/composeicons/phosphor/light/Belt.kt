package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Belt: ImageVector
    get() {
        if (_belt != null) return _belt!!
        _belt = phosphorLightIcon(
            name = "Belt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 162h-58v-68h58c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-59.37C186.315 77.12 181.401 74.007 176 74h-64c-5.401 .007-10.315 3.12-12.63 8h-37.37v-2c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v2h-42C4.686 82 2 84.686 2 88c0 3.314 2.686 6 6 6h42v68h-42c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h42v2c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-2h37.37c2.315 4.88 7.229 7.993 12.63 8h64c5.401-.007 10.315-3.12 12.63-8h59.37c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM62 94h36v68h-36ZM176 170h-64c-1.105 0-2-.895-2-2v-80c0-1.105 .895-2 2-2h64c1.105 0 2 .895 2 2v34h-34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h34v34c0 1.105-.895 2-2 2Z"),
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
        return _belt!!
    }

private var _belt: ImageVector? = null
