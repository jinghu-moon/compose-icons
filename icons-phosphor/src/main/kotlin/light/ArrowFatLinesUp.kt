package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatLinesUp: ImageVector
    get() {
        if (_arrowFatLinesUp != null) return _arrowFatLinesUp!!
        _arrowFatLinesUp = phosphorLightIcon(
            name = "ArrowFatLinesUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.240 115.760 L 132.240 19.760 C 129.897 17.420 126.103 17.420 123.760 19.760 L 27.760 115.760 C 26.046 117.476 25.534 120.055 26.462 122.295 C 27.389 124.536 29.575 125.998 32.000 126.000 L 74.000 126.000 L 74.000 152.000 C 74.000 155.314 76.686 158.000 80.000 158.000 L 176.000 158.000 C 179.314 158.000 182.000 155.314 182.000 152.000 L 182.000 126.000 L 224.000 126.000 C 226.425 125.998 228.611 124.536 229.538 122.295 C 230.466 120.055 229.954 117.476 228.240 115.760 ZM 176.000 114.000 C 172.686 114.000 170.000 116.686 170.000 120.000 L 170.000 146.000 L 86.000 146.000 L 86.000 120.000 C 86.000 116.686 83.314 114.000 80.000 114.000 L 46.490 114.000 L 128.000 32.490 L 209.510 114.000 ZM 182.000 216.000 C 182.000 219.314 179.314 222.000 176.000 222.000 L 80.000 222.000 C 76.686 222.000 74.000 219.314 74.000 216.000 C 74.000 212.686 76.686 210.000 80.000 210.000 L 176.000 210.000 C 179.314 210.000 182.000 212.686 182.000 216.000 ZM 182.000 184.000 C 182.000 187.314 179.314 190.000 176.000 190.000 L 80.000 190.000 C 76.686 190.000 74.000 187.314 74.000 184.000 C 74.000 180.686 76.686 178.000 80.000 178.000 L 176.000 178.000 C 179.314 178.000 182.000 180.686 182.000 184.000 Z"),
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
        return _arrowFatLinesUp!!
    }

private var _arrowFatLinesUp: ImageVector? = null
