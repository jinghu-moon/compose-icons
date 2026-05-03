package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Gif: ImageVector
    get() {
        if (_gif != null) return _gif!!
        _gif = phosphorLightIcon(
            name = "Gif",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 142.000 72.000 L 142.000 184.000 C 142.000 187.314 139.314 190.000 136.000 190.000 C 132.686 190.000 130.000 187.314 130.000 184.000 L 130.000 72.000 C 130.000 68.686 132.686 66.000 136.000 66.000 C 139.314 66.000 142.000 68.686 142.000 72.000 ZM 232.000 66.000 L 176.000 66.000 C 172.686 66.000 170.000 68.686 170.000 72.000 L 170.000 184.000 C 170.000 187.314 172.686 190.000 176.000 190.000 C 179.314 190.000 182.000 187.314 182.000 184.000 L 182.000 134.000 L 224.000 134.000 C 227.314 134.000 230.000 131.314 230.000 128.000 C 230.000 124.686 227.314 122.000 224.000 122.000 L 182.000 122.000 L 182.000 78.000 L 232.000 78.000 C 235.314 78.000 238.000 75.314 238.000 72.000 C 238.000 68.686 235.314 66.000 232.000 66.000 ZM 96.000 122.000 L 72.000 122.000 C 68.686 122.000 66.000 124.686 66.000 128.000 C 66.000 131.314 68.686 134.000 72.000 134.000 L 90.000 134.000 L 90.000 152.000 C 90.000 166.359 78.359 178.000 64.000 178.000 C 49.641 178.000 38.000 166.359 38.000 152.000 L 38.000 104.000 C 38.000 89.641 49.641 78.000 64.000 78.000 C 76.070 78.000 87.330 86.380 90.190 97.500 C 91.018 100.709 94.291 102.638 97.500 101.810 C 100.709 100.982 102.638 97.709 101.810 94.500 C 97.560 78.000 81.660 66.000 64.000 66.000 C 43.013 66.000 26.000 83.013 26.000 104.000 L 26.000 152.000 C 26.000 172.987 43.013 190.000 64.000 190.000 C 84.987 190.000 102.000 172.987 102.000 152.000 L 102.000 128.000 C 102.000 124.686 99.314 122.000 96.000 122.000 Z"),
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
        return _gif!!
    }

private var _gif: ImageVector? = null
