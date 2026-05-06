package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberEight: ImageVector
    get() {
        if (_numberEight != null) return _numberEight!!
        _numberEight = phosphorLightIcon(
            name = "NumberEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M151.62 119.45c17.751-10.622 26.228-31.786 20.718-51.725C166.828 47.786 148.686 33.977 128 33.977c-20.686 0-38.828 13.808-44.338 33.747-5.51 19.939 2.967 41.103 20.718 51.725C81.76 130.453 69.732 155.617 75.378 180.129c5.645 24.513 27.468 41.881 52.622 41.881 25.154 0 46.977-17.368 52.622-41.881 5.645-24.513-6.382-49.677-29.002-60.679ZM94 80C94 61.222 109.222 46 128 46c18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34C109.222 114 94 98.778 94 80ZM128 210C104.804 210 86 191.196 86 168c0-23.196 18.804-42 42-42 23.196 0 42 18.804 42 42 0 23.196-18.804 42-42 42Z"),
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
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
