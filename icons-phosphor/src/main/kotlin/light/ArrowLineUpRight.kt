package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineUpRight: ImageVector
    get() {
        if (_arrowLineUpRight != null) return _arrowLineUpRight!!
        _arrowLineUpRight = phosphorLightIcon(
            name = "ArrowLineUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 216.000 C 222.000 219.314 219.314 222.000 216.000 222.000 L 40.000 222.000 C 36.686 222.000 34.000 219.314 34.000 216.000 C 34.000 212.686 36.686 210.000 40.000 210.000 L 216.000 210.000 C 219.314 210.000 222.000 212.686 222.000 216.000 ZM 80.000 174.000 C 81.591 173.999 83.116 173.366 84.240 172.240 L 186.000 70.490 L 186.000 152.000 C 186.000 155.314 188.686 158.000 192.000 158.000 C 195.314 158.000 198.000 155.314 198.000 152.000 L 198.000 56.000 C 198.000 52.686 195.314 50.000 192.000 50.000 L 96.000 50.000 C 92.686 50.000 90.000 52.686 90.000 56.000 C 90.000 59.314 92.686 62.000 96.000 62.000 L 177.510 62.000 L 75.760 163.760 C 74.046 165.476 73.534 168.055 74.462 170.295 C 75.389 172.536 77.575 173.998 80.000 174.000 Z"),
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
        return _arrowLineUpRight!!
    }

private var _arrowLineUpRight: ImageVector? = null
