package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VinylRecord: ImageVector
    get() {
        if (_vinylRecord != null) return _vinylRecord!!
        _vinylRecord = phosphorLightIcon(
            name = "VinylRecord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM128 70C95.983 70.039 70.039 95.983 70 128c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6C58.044 89.358 89.358 58.044 128 58c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6ZM198 128c-.044 38.642-31.358 69.956-70 70-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 32.017-.039 57.961-25.983 58-58 0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM158 128C158 111.431 144.569 98 128 98c-16.569 0-30 13.431-30 30 0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30ZM110 128c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18Z"),
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
        return _vinylRecord!!
    }

private var _vinylRecord: ImageVector? = null
