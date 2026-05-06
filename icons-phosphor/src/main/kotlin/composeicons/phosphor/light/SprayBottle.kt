package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SprayBottle: ImageVector
    get() {
        if (_sprayBottle != null) return _sprayBottle!!
        _sprayBottle = phosphorLightIcon(
            name = "SprayBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 78c3.314 0 6-2.686 6-6C205.967 42.19 181.81 18.033 152 18h-72C72.268 18 66 24.268 66 32v48c0 14.359-11.641 26-26 26-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 20.987 0 38-17.013 38-38v-2h36v26.62c.018 7.902-3.577 15.379-9.76 20.3l-16 12.79C79.212 144.907 73.968 155.835 74 167.38v56.62c0 7.732 6.268 14 14 14h104c7.732 0 14-6.268 14-14v-12.53C206.009 164.654 193.796 118.648 170.57 78ZM78 32c0-1.105 .895-2 2-2h72c20.869 .025 38.563 15.349 41.57 36h-115.57ZM194 211.47v12.53c0 1.105-.895 2-2 2h-104c-1.105 0-2-.895-2-2v-56.62c-.018-7.902 3.577-15.379 9.76-20.3l16-12.79c9.028-7.197 14.272-18.125 14.24-29.67v-26.62h30.64c24.449 40.226 37.373 86.397 37.36 133.47Z"),
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
        return _sprayBottle!!
    }

private var _sprayBottle: ImageVector? = null
