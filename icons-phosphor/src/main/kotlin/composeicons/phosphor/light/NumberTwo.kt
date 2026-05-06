package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) return _numberTwo!!
        _numberTwo = phosphorLightIcon(
            name = "NumberTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174 208c0 3.314-2.686 6-6 6h-80c-2.273 0-4.35-1.284-5.367-3.317-1.016-2.033-.797-4.465 .567-6.283l72-95.92c8.281-10.982 9.13-25.871 2.151-37.723C150.372 58.905 136.94 52.425 123.32 54.34c-11.713 1.643-21.738 9.239-26.49 20.07-1.328 3.038-4.867 4.423-7.905 3.095C85.887 76.177 84.502 72.638 85.83 69.6c1.445-3.293 3.267-6.407 5.43-9.28 15.29-20.291 44.134-24.345 64.425-9.055 20.291 15.29 24.345 44.134 9.055 64.425L100 202h68c3.314 0 6 2.686 6 6Z"),
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
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
