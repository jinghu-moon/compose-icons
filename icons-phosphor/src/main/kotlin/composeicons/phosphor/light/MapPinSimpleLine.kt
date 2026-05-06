package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinSimpleLine: ImageVector
    get() {
        if (_mapPinSimpleLine != null) return _mapPinSimpleLine!!
        _mapPinSimpleLine = phosphorLightIcon(
            name = "MapPinSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 210h-82v-76.34c28.479-3.184 49.511-28.059 47.916-56.67C180.322 48.378 156.656 25.994 128 25.994c-28.656 0-52.322 22.384-53.916 50.995-1.594 28.612 19.438 53.486 47.916 56.67v76.34h-82c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h176c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM86 80C86 56.804 104.804 38 128 38c23.196 0 42 18.804 42 42 0 23.196-18.804 42-42 42C104.804 122 86 103.196 86 80Z"),
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
        return _mapPinSimpleLine!!
    }

private var _mapPinSimpleLine: ImageVector? = null
