package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bank: ImageVector
    get() {
        if (_bank != null) return _bank!!
        _bank = phosphorLightIcon(
            name = "Bank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 24.000 102.000 L 50.000 102.000 L 50.000 170.000 L 32.000 170.000 C 28.686 170.000 26.000 172.686 26.000 176.000 C 26.000 179.314 28.686 182.000 32.000 182.000 L 224.000 182.000 C 227.314 182.000 230.000 179.314 230.000 176.000 C 230.000 172.686 227.314 170.000 224.000 170.000 L 206.000 170.000 L 206.000 102.000 L 232.000 102.000 C 234.684 101.998 237.039 100.214 237.769 97.632 C 238.499 95.049 237.426 92.296 235.140 90.890 L 131.140 26.890 C 129.214 25.707 126.786 25.707 124.860 26.890 L 20.860 90.890 C 18.574 92.296 17.501 95.049 18.231 97.632 C 18.961 100.214 21.316 101.998 24.000 102.000 ZM 62.000 102.000 L 98.000 102.000 L 98.000 170.000 L 62.000 170.000 ZM 146.000 102.000 L 146.000 170.000 L 110.000 170.000 L 110.000 102.000 ZM 194.000 170.000 L 158.000 170.000 L 158.000 102.000 L 194.000 102.000 ZM 128.000 39.000 L 210.800 90.000 L 45.200 90.000 ZM 246.000 208.000 C 246.000 211.314 243.314 214.000 240.000 214.000 L 16.000 214.000 C 12.686 214.000 10.000 211.314 10.000 208.000 C 10.000 204.686 12.686 202.000 16.000 202.000 L 240.000 202.000 C 243.314 202.000 246.000 204.686 246.000 208.000 Z"),
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
        return _bank!!
    }

private var _bank: ImageVector? = null
