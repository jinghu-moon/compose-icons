package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) return _circleHalfTilt!!
        _circleHalfTilt = phosphorLightIcon(
            name = "CircleHalfTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200.12 55.88C174.423 29.763 136.693 19.435 101.277 28.823 65.861 38.211 38.202 65.873 28.816 101.289c-9.386 35.416 .945 73.146 27.064 98.841 25.697 26.117 63.427 36.445 98.843 27.057 35.416-9.388 63.076-37.05 72.461-72.466 9.386-35.417-.945-73.146-27.064-98.841ZM90 209.62C82.3 206.02 75.152 201.343 68.77 195.73L90 174.49ZM122 217.78c-6.78-.435-13.49-1.636-20-3.58v-51.71l20-20ZM154 214.2c-6.51 1.946-13.219 3.147-20 3.58v-87.29l20-20ZM186 196.8c-6.066 5.147-12.792 9.462-20 12.83v-111.14l20-20ZM60.27 187.24C29.05 151.583 30.832 97.825 64.343 64.313 97.855 30.802 151.613 29.02 187.27 60.24ZM198 184.57v-113.14c26.668 32.999 26.668 80.141 0 113.14Z"),
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
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
