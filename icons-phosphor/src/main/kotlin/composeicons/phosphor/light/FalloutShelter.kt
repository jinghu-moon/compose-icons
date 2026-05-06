package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) return _falloutShelter!!
        _falloutShelter = phosphorLightIcon(
            name = "FalloutShelter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM197.29 125.17C196.246 123.219 194.213 122 192 122h-52.79L165 83.33c1.229-1.842 1.344-4.212 .297-6.164C164.251 75.214 162.215 73.997 160 74h-64c-2.215-.003-4.251 1.214-5.297 3.166-1.046 1.952-.932 4.322 .297 6.164L116.79 122h-52.79c-2.215-.003-4.251 1.214-5.297 3.166-1.046 1.952-.932 4.322 .297 6.164l32 48c1.112 1.676 2.989 2.683 5 2.683 2.011 0 3.888-1.008 5-2.683l27-40.51 27 40.51c1.112 1.676 2.989 2.683 5 2.683 2.011 0 3.888-1.008 5-2.683l32-48c1.225-1.843 1.337-4.21 .29-6.16ZM148.79 86 128 117.18 107.21 86ZM96 165.18 75.21 134h41.58ZM160 165.18 139.21 134h41.58Z"),
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
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
