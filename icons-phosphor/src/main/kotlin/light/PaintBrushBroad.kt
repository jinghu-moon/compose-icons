package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) return _paintBrushBroad!!
        _paintBrushBroad = phosphorLightIcon(
            name = "PaintBrushBroad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 26.000 L 72.000 26.000 C 51.013 26.000 34.000 43.013 34.000 64.000 L 34.000 136.000 C 34.000 148.150 43.850 158.000 56.000 158.000 L 104.000 158.000 C 104.573 157.996 105.120 158.238 105.502 158.665 C 105.885 159.091 106.066 159.661 106.000 160.230 L 98.080 207.000 C 98.029 207.331 98.002 207.665 98.000 208.000 C 98.000 224.569 111.431 238.000 128.000 238.000 C 144.569 238.000 158.000 224.569 158.000 208.000 C 157.998 207.665 157.971 207.331 157.920 207.000 L 150.000 160.230 C 149.934 159.661 150.115 159.091 150.498 158.665 C 150.880 158.238 151.427 157.996 152.000 158.000 L 200.000 158.000 C 212.150 158.000 222.000 148.150 222.000 136.000 L 222.000 32.000 C 222.000 28.686 219.314 26.000 216.000 26.000 ZM 72.000 38.000 L 178.000 38.000 L 178.000 80.000 C 178.000 83.314 180.686 86.000 184.000 86.000 C 187.314 86.000 190.000 83.314 190.000 80.000 L 190.000 38.000 L 210.000 38.000 L 210.000 106.000 L 46.000 106.000 L 46.000 64.000 C 46.000 49.641 57.641 38.000 72.000 38.000 ZM 200.000 146.000 L 152.000 146.000 C 147.937 145.999 144.075 147.763 141.415 150.833 C 138.755 153.904 137.560 157.979 138.140 162.000 L 138.140 162.150 L 146.000 208.470 C 146.000 218.411 137.941 226.470 128.000 226.470 C 118.059 226.470 110.000 218.411 110.000 208.470 L 117.820 162.130 L 117.820 161.980 C 118.393 157.969 117.200 153.907 114.550 150.842 C 111.900 147.777 108.052 146.011 104.000 146.000 L 56.000 146.000 C 50.477 146.000 46.000 141.523 46.000 136.000 L 46.000 118.000 L 210.000 118.000 L 210.000 136.000 C 210.000 141.523 205.523 146.000 200.000 146.000 Z"),
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
        return _paintBrushBroad!!
    }

private var _paintBrushBroad: ImageVector? = null
