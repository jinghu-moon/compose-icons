package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bulldozer: ImageVector
    get() {
        if (_bulldozer != null) return _bulldozer!!
        _bulldozer = phosphorLightIcon(
            name = "Bulldozer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 202h-8c-5.523 0-10-4.477-10-10v-32c0-5.523 4.477-10 10-10h8c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-8c-12.15 0-22 9.85-22 22v10h-20.48c-2.73-16.905-16.409-29.908-33.43-31.78L127.59 50.61C125.415 45.396 120.319 42 114.67 42h-90.67C16.268 42 10 48.268 10 56v96.72C1.119 164.177-.469 179.689 5.904 192.708 12.278 205.728 25.504 213.987 40 214h120c18.662-.023 34.553-13.576 37.52-32h20.48v10c0 12.15 9.85 22 22 22h8c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM116.51 55.23 151 138h-89v-84h52.67c.805 .002 1.53 .487 1.84 1.23ZM24 54h26v84h-10c-6.284-.006-12.47 1.555-18 4.54v-86.54c0-1.105 .895-2 2-2ZM160 202h-120C25.641 202 14 190.359 14 176c0-14.359 11.641-26 26-26h120c14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26ZM166 176c0 3.314-2.686 6-6 6h-120c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h120c3.314 0 6 2.686 6 6Z"),
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
        return _bulldozer!!
    }

private var _bulldozer: ImageVector? = null
