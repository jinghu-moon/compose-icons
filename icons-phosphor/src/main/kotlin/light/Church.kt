package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Church: ImageVector
    get() {
        if (_church != null) return _church!!
        _church = phosphorLightIcon(
            name = "Church",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.090 146.860 L 190.000 124.600 L 190.000 104.000 C 190.005 101.851 188.861 99.864 187.000 98.790 L 134.000 68.520 L 134.000 46.000 L 152.000 46.000 C 155.314 46.000 158.000 43.314 158.000 40.000 C 158.000 36.686 155.314 34.000 152.000 34.000 L 134.000 34.000 L 134.000 16.000 C 134.000 12.686 131.314 10.000 128.000 10.000 C 124.686 10.000 122.000 12.686 122.000 16.000 L 122.000 34.000 L 104.000 34.000 C 100.686 34.000 98.000 36.686 98.000 40.000 C 98.000 43.314 100.686 46.000 104.000 46.000 L 122.000 46.000 L 122.000 68.520 L 69.000 98.790 C 67.139 99.864 65.995 101.851 66.000 104.000 L 66.000 124.600 L 28.910 146.860 C 27.105 147.944 26.001 149.895 26.000 152.000 L 26.000 216.000 C 26.000 219.314 28.686 222.000 32.000 222.000 L 112.000 222.000 C 115.314 222.000 118.000 219.314 118.000 216.000 L 118.000 168.000 C 118.000 162.477 122.477 158.000 128.000 158.000 C 133.523 158.000 138.000 162.477 138.000 168.000 L 138.000 216.000 C 138.000 219.314 140.686 222.000 144.000 222.000 L 224.000 222.000 C 227.314 222.000 230.000 219.314 230.000 216.000 L 230.000 152.000 C 229.999 149.895 228.895 147.944 227.090 146.860 ZM 38.000 155.400 L 66.000 138.600 L 66.000 210.000 L 38.000 210.000 ZM 128.000 146.000 C 115.850 146.000 106.000 155.850 106.000 168.000 L 106.000 210.000 L 78.000 210.000 L 78.000 107.480 L 128.000 78.910 L 178.000 107.480 L 178.000 210.000 L 150.000 210.000 L 150.000 168.000 C 150.000 155.850 140.150 146.000 128.000 146.000 ZM 218.000 210.000 L 190.000 210.000 L 190.000 138.600 L 218.000 155.400 Z"),
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
        return _church!!
    }

private var _church: ImageVector? = null
