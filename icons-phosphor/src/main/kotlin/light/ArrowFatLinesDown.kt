package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatLinesDown: ImageVector
    get() {
        if (_arrowFatLinesDown != null) return _arrowFatLinesDown!!
        _arrowFatLinesDown = phosphorLightIcon(
            name = "ArrowFatLinesDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.540 133.700 C 228.611 131.461 226.425 130.001 224.000 130.000 L 182.000 130.000 L 182.000 104.000 C 182.000 100.686 179.314 98.000 176.000 98.000 L 80.000 98.000 C 76.686 98.000 74.000 100.686 74.000 104.000 L 74.000 130.000 L 32.000 130.000 C 29.575 130.002 27.389 131.464 26.462 133.705 C 25.534 135.945 26.046 138.524 27.760 140.240 L 123.760 236.240 C 126.103 238.580 129.897 238.580 132.240 236.240 L 228.240 140.240 C 229.956 138.524 230.469 135.942 229.540 133.700 ZM 128.000 223.510 L 46.490 142.000 L 80.000 142.000 C 83.314 142.000 86.000 139.314 86.000 136.000 L 86.000 110.000 L 170.000 110.000 L 170.000 136.000 C 170.000 139.314 172.686 142.000 176.000 142.000 L 209.510 142.000 ZM 74.000 40.000 C 74.000 36.686 76.686 34.000 80.000 34.000 L 176.000 34.000 C 179.314 34.000 182.000 36.686 182.000 40.000 C 182.000 43.314 179.314 46.000 176.000 46.000 L 80.000 46.000 C 76.686 46.000 74.000 43.314 74.000 40.000 ZM 74.000 72.000 C 74.000 68.686 76.686 66.000 80.000 66.000 L 176.000 66.000 C 179.314 66.000 182.000 68.686 182.000 72.000 C 182.000 75.314 179.314 78.000 176.000 78.000 L 80.000 78.000 C 76.686 78.000 74.000 75.314 74.000 72.000 Z"),
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
        return _arrowFatLinesDown!!
    }

private var _arrowFatLinesDown: ImageVector? = null
