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
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 128.000 70.000 C 95.983 70.039 70.039 95.983 70.000 128.000 C 70.000 131.314 67.314 134.000 64.000 134.000 C 60.686 134.000 58.000 131.314 58.000 128.000 C 58.044 89.358 89.358 58.044 128.000 58.000 C 131.314 58.000 134.000 60.686 134.000 64.000 C 134.000 67.314 131.314 70.000 128.000 70.000 ZM 198.000 128.000 C 197.956 166.642 166.642 197.956 128.000 198.000 C 124.686 198.000 122.000 195.314 122.000 192.000 C 122.000 188.686 124.686 186.000 128.000 186.000 C 160.017 185.961 185.961 160.017 186.000 128.000 C 186.000 124.686 188.686 122.000 192.000 122.000 C 195.314 122.000 198.000 124.686 198.000 128.000 ZM 158.000 128.000 C 158.000 111.431 144.569 98.000 128.000 98.000 C 111.431 98.000 98.000 111.431 98.000 128.000 C 98.000 144.569 111.431 158.000 128.000 158.000 C 144.569 158.000 158.000 144.569 158.000 128.000 ZM 110.000 128.000 C 110.000 118.059 118.059 110.000 128.000 110.000 C 137.941 110.000 146.000 118.059 146.000 128.000 C 146.000 137.941 137.941 146.000 128.000 146.000 C 118.059 146.000 110.000 137.941 110.000 128.000 Z"),
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
