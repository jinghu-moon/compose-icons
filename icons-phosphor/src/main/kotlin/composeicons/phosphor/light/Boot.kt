package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Boot: ImageVector
    get() {
        if (_boot != null) return _boot!!
        _boot = phosphorLightIcon(
            name = "Boot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 114h-34v-58c0-7.732-6.268-14-14-14h-112c-1.976 .001-3.825 .974-4.944 2.602-1.119 1.628-1.364 3.703-.656 5.548 9 23.44 11.13 76.92-.17 116.19-.151 .54-.229 1.099-.23 1.66v32c0 7.732 6.268 14 14 14h26.11c2.173-.001 4.316-.507 6.26-1.48L85 206.21c.279-.139 .588-.211 .9-.21h16.22c.312-.001 .621 .071 .9 .21l12.62 6.31c1.944 .973 4.087 1.479 6.26 1.48h28.22c2.173-.001 4.316-.507 6.26-1.48L169 206.21c.279-.139 .588-.211 .9-.21h16.22c.312-.001 .621 .071 .9 .21l12.62 6.31c1.944 .973 4.087 1.479 6.26 1.48h26.1c7.732 0 14-6.268 14-14v-32c-.033-29.81-24.19-53.967-54-54ZM40.27 54h103.73c1.105 0 2 .895 2 2v26h-34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h34v20h-34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h80c20.867 .026 38.558 15.35 41.56 36h-193.81c7.36-31.56 8.96-77.69 .52-108ZM234 200c0 1.105-.895 2-2 2h-26.11c-.312 .001-.621-.071-.9-.21l-12.62-6.31c-1.944-.973-4.087-1.479-6.26-1.48h-16.22c-2.173 .001-4.316 .507-6.26 1.48L151 201.79c-.279 .139-.588 .211-.9 .21h-28.21c-.312 .001-.621-.071-.9-.21l-12.62-6.31c-1.944-.973-4.087-1.479-6.26-1.48h-16.22c-2.173 .001-4.316 .507-6.26 1.48L67 201.79c-.279 .139-.588 .211-.9 .21h-26.1c-1.105 0-2-.895-2-2v-26h196Z"),
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
        return _boot!!
    }

private var _boot: ImageVector? = null
