package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Trademark: ImageVector
    get() {
        if (_trademark != null) return _trademark!!
        _trademark = phosphorLightIcon(
            name = "Trademark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 110.000 104.000 C 110.000 107.314 107.314 110.000 104.000 110.000 L 94.000 110.000 L 94.000 152.000 C 94.000 155.314 91.314 158.000 88.000 158.000 C 84.686 158.000 82.000 155.314 82.000 152.000 L 82.000 110.000 L 72.000 110.000 C 68.686 110.000 66.000 107.314 66.000 104.000 C 66.000 100.686 68.686 98.000 72.000 98.000 L 104.000 98.000 C 107.314 98.000 110.000 100.686 110.000 104.000 ZM 190.000 104.000 L 190.000 152.000 C 190.000 155.314 187.314 158.000 184.000 158.000 C 180.686 158.000 178.000 155.314 178.000 152.000 L 178.000 120.000 L 160.520 140.000 C 159.381 141.292 157.742 142.031 156.020 142.031 C 154.298 142.031 152.659 141.292 151.520 140.000 L 134.000 120.000 L 134.000 152.000 C 134.000 155.314 131.314 158.000 128.000 158.000 C 124.686 158.000 122.000 155.314 122.000 152.000 L 122.000 104.000 C 121.977 101.489 123.520 99.230 125.867 98.337 C 128.214 97.445 130.869 98.108 132.520 100.000 L 156.000 126.890 L 179.480 100.050 C 181.125 98.165 183.767 97.499 186.109 98.379 C 188.451 99.258 190.002 101.498 190.000 104.000 Z"),
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
        return _trademark!!
    }

private var _trademark: ImageVector? = null
