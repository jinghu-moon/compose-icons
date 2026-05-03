package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) return _castleTurret!!
        _castleTurret = phosphorLightIcon(
            name = "CastleTurret",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 218.000 L 198.000 218.000 L 198.000 114.490 L 209.900 102.580 C 212.532 99.963 214.009 96.402 214.000 92.690 L 214.000 48.000 C 214.000 40.268 207.732 34.000 200.000 34.000 L 176.000 34.000 C 172.686 34.000 170.000 36.686 170.000 40.000 L 170.000 66.000 L 150.000 66.000 L 150.000 40.000 C 150.000 36.686 147.314 34.000 144.000 34.000 L 112.000 34.000 C 108.686 34.000 106.000 36.686 106.000 40.000 L 106.000 66.000 L 86.000 66.000 L 86.000 40.000 C 86.000 36.686 83.314 34.000 80.000 34.000 L 56.000 34.000 C 48.268 34.000 42.000 40.268 42.000 48.000 L 42.000 92.690 C 41.991 96.402 43.468 99.963 46.100 102.580 L 58.000 114.490 L 58.000 218.000 L 40.000 218.000 C 36.686 218.000 34.000 220.686 34.000 224.000 C 34.000 227.314 36.686 230.000 40.000 230.000 L 216.000 230.000 C 219.314 230.000 222.000 227.314 222.000 224.000 C 222.000 220.686 219.314 218.000 216.000 218.000 ZM 68.240 107.760 L 54.580 94.100 C 54.208 93.725 54.000 93.218 54.000 92.690 L 54.000 48.000 C 54.000 46.895 54.895 46.000 56.000 46.000 L 74.000 46.000 L 74.000 72.000 C 74.000 75.314 76.686 78.000 80.000 78.000 L 112.000 78.000 C 115.314 78.000 118.000 75.314 118.000 72.000 L 118.000 46.000 L 138.000 46.000 L 138.000 72.000 C 138.000 75.314 140.686 78.000 144.000 78.000 L 176.000 78.000 C 179.314 78.000 182.000 75.314 182.000 72.000 L 182.000 46.000 L 200.000 46.000 C 201.105 46.000 202.000 46.895 202.000 48.000 L 202.000 92.690 C 202.000 93.218 201.792 93.725 201.420 94.100 L 187.760 107.760 C 186.634 108.884 186.001 110.409 186.000 112.000 L 186.000 218.000 L 158.000 218.000 L 158.000 168.000 C 158.000 151.431 144.569 138.000 128.000 138.000 C 111.431 138.000 98.000 151.431 98.000 168.000 L 98.000 218.000 L 70.000 218.000 L 70.000 112.000 C 69.999 110.409 69.366 108.884 68.240 107.760 ZM 146.000 218.000 L 110.000 218.000 L 110.000 168.000 C 110.000 158.059 118.059 150.000 128.000 150.000 C 137.941 150.000 146.000 158.059 146.000 168.000 Z"),
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
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
