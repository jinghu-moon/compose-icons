package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GridNine: ImageVector
    get() {
        if (_gridNine != null) return _gridNine!!
        _gridNine = phosphorLightIcon(
            name = "GridNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 50h-176C32.268 50 26 56.268 26 64v128c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-128c0-7.732-6.268-14-14-14ZM102 146v-36h52v36ZM154 158v36h-52v-36ZM38 110h52v36h-52ZM102 98v-36h52v36ZM166 110h52v36h-52ZM218 64v34h-52v-36h50c1.105 0 2 .895 2 2ZM40 62h50v36h-52v-34c0-1.105 .895-2 2-2ZM38 192v-34h52v36h-50c-1.105 0-2-.895-2-2ZM216 194h-50v-36h52v34c0 1.105-.895 2-2 2Z"),
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
        return _gridNine!!
    }

private var _gridNine: ImageVector? = null
