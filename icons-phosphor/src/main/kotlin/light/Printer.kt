package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Printer: ImageVector
    get() {
        if (_printer != null) return _printer!!
        _printer = phosphorLightIcon(
            name = "Printer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.670 74.000 L 198.000 74.000 L 198.000 40.000 C 198.000 36.686 195.314 34.000 192.000 34.000 L 64.000 34.000 C 60.686 34.000 58.000 36.686 58.000 40.000 L 58.000 74.000 L 41.330 74.000 C 28.470 74.000 18.000 83.870 18.000 96.000 L 18.000 176.000 C 18.000 179.314 20.686 182.000 24.000 182.000 L 58.000 182.000 L 58.000 216.000 C 58.000 219.314 60.686 222.000 64.000 222.000 L 192.000 222.000 C 195.314 222.000 198.000 219.314 198.000 216.000 L 198.000 182.000 L 232.000 182.000 C 235.314 182.000 238.000 179.314 238.000 176.000 L 238.000 96.000 C 238.000 83.870 227.530 74.000 214.670 74.000 ZM 70.000 46.000 L 186.000 46.000 L 186.000 74.000 L 70.000 74.000 ZM 186.000 210.000 L 70.000 210.000 L 70.000 158.000 L 186.000 158.000 ZM 226.000 170.000 L 198.000 170.000 L 198.000 152.000 C 198.000 148.686 195.314 146.000 192.000 146.000 L 64.000 146.000 C 60.686 146.000 58.000 148.686 58.000 152.000 L 58.000 170.000 L 30.000 170.000 L 30.000 96.000 C 30.000 90.490 35.080 86.000 41.330 86.000 L 214.670 86.000 C 220.920 86.000 226.000 90.490 226.000 96.000 ZM 198.000 116.000 C 198.000 121.523 193.523 126.000 188.000 126.000 C 182.477 126.000 178.000 121.523 178.000 116.000 C 178.000 110.477 182.477 106.000 188.000 106.000 C 193.523 106.000 198.000 110.477 198.000 116.000 Z"),
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
        return _printer!!
    }

private var _printer: ImageVector? = null
