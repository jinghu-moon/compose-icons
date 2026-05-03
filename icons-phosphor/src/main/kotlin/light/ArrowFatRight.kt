package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatRight: ImageVector
    get() {
        if (_arrowFatRight != null) return _arrowFatRight!!
        _arrowFatRight = phosphorLightIcon(
            name = "ArrowFatRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.240 123.760 L 140.240 27.760 C 138.524 26.046 135.945 25.534 133.705 26.462 C 131.464 27.389 130.002 29.575 130.000 32.000 L 130.000 74.000 L 48.000 74.000 C 40.268 74.000 34.000 80.268 34.000 88.000 L 34.000 168.000 C 34.000 175.732 40.268 182.000 48.000 182.000 L 130.000 182.000 L 130.000 224.000 C 130.002 226.425 131.464 228.611 133.705 229.538 C 135.945 230.466 138.524 229.954 140.240 228.240 L 236.240 132.240 C 238.580 129.897 238.580 126.103 236.240 123.760 ZM 142.000 209.510 L 142.000 176.000 C 142.000 172.686 139.314 170.000 136.000 170.000 L 48.000 170.000 C 46.895 170.000 46.000 169.105 46.000 168.000 L 46.000 88.000 C 46.000 86.895 46.895 86.000 48.000 86.000 L 136.000 86.000 C 139.314 86.000 142.000 83.314 142.000 80.000 L 142.000 46.490 L 223.510 128.000 Z"),
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
        return _arrowFatRight!!
    }

private var _arrowFatRight: ImageVector? = null
