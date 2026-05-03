package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatLinesLeft: ImageVector
    get() {
        if (_arrowFatLinesLeft != null) return _arrowFatLinesLeft!!
        _arrowFatLinesLeft = phosphorLightIcon(
            name = "ArrowFatLinesLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 74.000 L 126.000 74.000 L 126.000 32.000 C 125.998 29.575 124.536 27.389 122.295 26.462 C 120.055 25.534 117.476 26.046 115.760 27.760 L 19.760 123.760 C 17.420 126.103 17.420 129.897 19.760 132.240 L 115.760 228.240 C 117.476 229.954 120.055 230.466 122.295 229.538 C 124.536 228.611 125.998 226.425 126.000 224.000 L 126.000 182.000 L 152.000 182.000 C 155.314 182.000 158.000 179.314 158.000 176.000 L 158.000 80.000 C 158.000 76.686 155.314 74.000 152.000 74.000 ZM 146.000 170.000 L 120.000 170.000 C 116.686 170.000 114.000 172.686 114.000 176.000 L 114.000 209.510 L 32.490 128.000 L 114.000 46.490 L 114.000 80.000 C 114.000 83.314 116.686 86.000 120.000 86.000 L 146.000 86.000 ZM 222.000 80.000 L 222.000 176.000 C 222.000 179.314 219.314 182.000 216.000 182.000 C 212.686 182.000 210.000 179.314 210.000 176.000 L 210.000 80.000 C 210.000 76.686 212.686 74.000 216.000 74.000 C 219.314 74.000 222.000 76.686 222.000 80.000 ZM 190.000 80.000 L 190.000 176.000 C 190.000 179.314 187.314 182.000 184.000 182.000 C 180.686 182.000 178.000 179.314 178.000 176.000 L 178.000 80.000 C 178.000 76.686 180.686 74.000 184.000 74.000 C 187.314 74.000 190.000 76.686 190.000 80.000 Z"),
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
        return _arrowFatLinesLeft!!
    }

private var _arrowFatLinesLeft: ImageVector? = null
