package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Compass: ImageVector
    get() {
        if (_compass != null) return _compass!!
        _compass = phosphorLightIcon(
            name = "Compass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM173.32 74.63l-64 32c-1.165 .581-2.109 1.525-2.69 2.69l-32 64c-.929 1.86-.828 4.069 .266 5.837 1.094 1.768 3.025 2.844 5.104 2.843 .93-.002 1.847-.217 2.68-.63l64-32c1.165-.581 2.109-1.525 2.69-2.69l32-64c1.155-2.31 .702-5.1-1.124-6.926-1.826-1.826-4.616-2.279-6.926-1.124ZM139.53 139.53 93.42 162.58l23-46.11 46.11-23Z"),
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
        return _compass!!
    }

private var _compass: ImageVector? = null
