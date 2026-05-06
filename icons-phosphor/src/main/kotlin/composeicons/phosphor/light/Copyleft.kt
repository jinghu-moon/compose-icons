package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Copyleft: ImageVector
    get() {
        if (_copyleft != null) return _copyleft!!
        _copyleft = phosphorLightIcon(
            name = "Copyleft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM174 128c.004 19.802-12.664 37.384-31.449 43.648-18.785 6.264-39.47-.197-51.351-16.038-1.991-2.651-1.456-6.414 1.195-8.405 2.651-1.991 6.414-1.456 8.405 1.195 8.781 11.708 24.068 16.483 37.952 11.855C152.635 155.627 162 142.635 162 128c0-14.635-9.365-27.627-23.248-32.255-13.884-4.628-29.171 .148-37.952 11.855-1.991 2.651-5.754 3.186-8.405 1.195-2.651-1.991-3.186-5.754-1.195-8.405C103.081 84.549 123.766 78.088 142.551 84.352 161.336 90.616 174.004 108.198 174 128Z"),
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
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
