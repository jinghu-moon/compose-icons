package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatLinesRight: ImageVector
    get() {
        if (_arrowFatLinesRight != null) return _arrowFatLinesRight!!
        _arrowFatLinesRight = phosphorLightIcon(
            name = "ArrowFatLinesRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.240 123.760 L 140.240 27.760 C 138.524 26.046 135.945 25.534 133.705 26.462 C 131.464 27.389 130.002 29.575 130.000 32.000 L 130.000 74.000 L 104.000 74.000 C 100.686 74.000 98.000 76.686 98.000 80.000 L 98.000 176.000 C 98.000 179.314 100.686 182.000 104.000 182.000 L 130.000 182.000 L 130.000 224.000 C 130.002 226.425 131.464 228.611 133.705 229.538 C 135.945 230.466 138.524 229.954 140.240 228.240 L 236.240 132.240 C 238.580 129.897 238.580 126.103 236.240 123.760 ZM 142.000 209.510 L 142.000 176.000 C 142.000 172.686 139.314 170.000 136.000 170.000 L 110.000 170.000 L 110.000 86.000 L 136.000 86.000 C 139.314 86.000 142.000 83.314 142.000 80.000 L 142.000 46.490 L 223.510 128.000 ZM 46.000 80.000 L 46.000 176.000 C 46.000 179.314 43.314 182.000 40.000 182.000 C 36.686 182.000 34.000 179.314 34.000 176.000 L 34.000 80.000 C 34.000 76.686 36.686 74.000 40.000 74.000 C 43.314 74.000 46.000 76.686 46.000 80.000 ZM 78.000 80.000 L 78.000 176.000 C 78.000 179.314 75.314 182.000 72.000 182.000 C 68.686 182.000 66.000 179.314 66.000 176.000 L 66.000 80.000 C 66.000 76.686 68.686 74.000 72.000 74.000 C 75.314 74.000 78.000 76.686 78.000 80.000 Z"),
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
        return _arrowFatLinesRight!!
    }

private var _arrowFatLinesRight: ImageVector? = null
