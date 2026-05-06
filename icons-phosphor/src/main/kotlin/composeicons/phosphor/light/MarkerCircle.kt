package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) return _markerCircle!!
        _markerCircle = phosphorLightIcon(
            name = "MarkerCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200.12 55.87C174.423 29.753 136.693 19.425 101.277 28.813 65.861 38.201 38.202 65.863 28.816 101.279c-9.386 35.417 .945 73.146 27.064 98.841 25.697 26.117 63.427 36.445 98.843 27.057 35.416-9.388 63.076-37.05 72.461-72.466 9.386-35.416-.945-73.146-27.064-98.841ZM86 207.64v-31.64c0-1.105 .895-2 2-2h80c1.105 0 2 .895 2 2v31.64c-26.297 13.812-57.703 13.812-84 0ZM104 142h48c1.105 0 2 .895 2 2v18h-52v-18c0-1.105 .895-2 2-2ZM115.54 130 126 79.59c.189-.932 1.009-1.602 1.96-1.602 .951 0 1.771 .67 1.96 1.602L140.46 130ZM191.64 191.64c-3.018 3.005-6.239 5.798-9.64 8.36v-24c0-7.732-6.268-14-14-14h-2v-18c.01-7.456-5.824-13.611-13.27-14l-11-52.9C140.386 70.598 134.659 65.935 128.02 65.935c-6.639 0-12.366 4.663-13.71 11.165l-11 52.9c-7.461 .368-13.319 6.53-13.31 14v18h-2c-7.732 0-14 6.268-14 14v24c-3.402-2.565-6.623-5.362-9.64-8.37C29.213 156.483 29.213 99.498 64.361 64.351c35.147-35.147 92.132-35.147 127.279 0 35.147 35.147 35.147 92.132 .001 127.279Z"),
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
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
