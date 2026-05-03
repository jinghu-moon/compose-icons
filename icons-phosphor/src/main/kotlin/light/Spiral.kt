package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = phosphorLightIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 246.000 144.000 C 246.000 147.314 243.314 150.000 240.000 150.000 C 236.686 150.000 234.000 147.314 234.000 144.000 C 233.939 89.901 190.099 46.061 136.000 46.000 C 86.317 46.055 46.055 86.317 46.000 136.000 C 46.055 181.265 82.735 217.945 128.000 218.000 C 168.849 217.950 201.950 184.849 202.000 144.000 C 201.956 107.567 172.433 78.044 136.000 78.000 C 103.983 78.039 78.039 103.983 78.000 136.000 C 78.033 163.601 100.399 185.967 128.000 186.000 C 151.196 186.000 170.000 167.196 170.000 144.000 C 170.000 125.222 154.778 110.000 136.000 110.000 C 121.641 110.000 110.000 121.641 110.000 136.000 C 110.000 145.941 118.059 154.000 128.000 154.000 C 133.523 154.000 138.000 149.523 138.000 144.000 C 138.000 142.895 137.105 142.000 136.000 142.000 C 132.686 142.000 130.000 139.314 130.000 136.000 C 130.000 132.686 132.686 130.000 136.000 130.000 C 143.732 130.000 150.000 136.268 150.000 144.000 C 150.000 156.150 140.150 166.000 128.000 166.000 C 111.431 166.000 98.000 152.569 98.000 136.000 C 98.000 115.013 115.013 98.000 136.000 98.000 C 161.391 98.033 181.967 118.609 182.000 144.000 C 181.967 173.810 157.810 197.967 128.000 198.000 C 93.774 197.961 66.039 170.226 66.000 136.000 C 66.044 97.358 97.358 66.044 136.000 66.000 C 179.058 66.050 213.950 100.942 214.000 144.000 C 213.945 191.474 175.474 229.945 128.000 230.000 C 76.110 229.939 34.061 187.890 34.000 136.000 C 34.066 79.694 79.694 34.066 136.000 34.000 C 196.722 34.072 245.928 83.278 246.000 144.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _spiral!!
    }

private var _spiral: ImageVector? = null
