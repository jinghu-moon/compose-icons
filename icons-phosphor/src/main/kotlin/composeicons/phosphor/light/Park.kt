package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Park: ImageVector
    get() {
        if (_park != null) return _park!!
        _park = phosphorLightIcon(
            name = "Park",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 194h-34v-28h26c1.849 0 3.594-.852 4.731-2.309 1.137-1.457 1.539-3.358 1.089-5.151l-32-128c-.669-2.669-3.068-4.541-5.82-4.541-2.752 0-5.151 1.872-5.82 4.541l-32 128c-.45 1.793-.048 3.693 1.089 5.151 1.137 1.457 2.882 2.309 4.731 2.309h26v28h-68v-20h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-10v-20h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-88c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10v20h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10v20h-26c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h208c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM192 56.74 216.32 154h-48.64ZM62 142h44v20h-44ZM62 174h44v20h-44ZM116 94c14.359 0 26-11.641 26-26C142 53.641 130.359 42 116 42 101.641 42 90 53.641 90 68c0 14.359 11.641 26 26 26ZM116 54c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14Z"),
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
        return _park!!
    }

private var _park: ImageVector? = null
