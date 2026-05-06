package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hospital: ImageVector
    get() {
        if (_hospital != null) return _hospital!!
        _hospital = phosphorLightIcon(
            name = "Hospital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 210h-10v-82c0-7.732-6.268-14-14-14h-58v-66c0-7.732-6.268-14-14-14h-96C48.268 34 42 40.268 42 48v162h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h216c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM224 126c1.105 0 2 .895 2 2v82h-60v-84ZM54 48c0-1.105 .895-2 2-2h96c1.105 0 2 .895 2 2v162h-20v-50c0-3.314-2.686-6-6-6h-48c-3.314 0-6 2.686-6 6v50h-20ZM122 210h-36v-44h36ZM74 96c0-3.314 2.686-6 6-6h18v-18c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v18h18c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-18v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-18c-3.314 0-6-2.686-6-6Z"),
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
        return _hospital!!
    }

private var _hospital: ImageVector? = null
