package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Briefcase: ImageVector
    get() {
        if (_briefcase != null) return _briefcase!!
        _briefcase = phosphorLightIcon(
            name = "Briefcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M106 112c0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-32c-3.314 0-6-2.686-6-6ZM230 72v128c0 7.732-6.268 14-14 14h-176c-7.732 0-14-6.268-14-14v-128C26 64.268 32.268 58 40 58h42v-10C82 35.85 91.85 26 104 26h48c12.15 0 22 9.85 22 22v10h42c7.732 0 14 6.268 14 14ZM94 58h68v-10c0-5.523-4.477-10-10-10h-48C98.477 38 94 42.477 94 48ZM38 72v42.79c27.552 15.228 58.519 23.214 90 23.21 31.482 .005 62.45-7.985 90-23.22v-42.78c0-1.105-.895-2-2-2h-176c-1.105 0-2 .895-2 2ZM218 200v-71.63C190.129 142.585 159.287 149.998 128 150c-31.287 .003-62.129-7.406-90-21.62v71.62c0 1.105 .895 2 2 2h176c1.105 0 2-.895 2-2Z"),
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
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
