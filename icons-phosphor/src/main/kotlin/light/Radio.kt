package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Radio: ImageVector
    get() {
        if (_radio != null) return _radio!!
        _radio = phosphorLightIcon(
            name = "Radio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 102.000 104.000 C 102.000 107.314 99.314 110.000 96.000 110.000 L 64.000 110.000 C 60.686 110.000 58.000 107.314 58.000 104.000 C 58.000 100.686 60.686 98.000 64.000 98.000 L 96.000 98.000 C 99.314 98.000 102.000 100.686 102.000 104.000 ZM 96.000 130.000 L 64.000 130.000 C 60.686 130.000 58.000 132.686 58.000 136.000 C 58.000 139.314 60.686 142.000 64.000 142.000 L 96.000 142.000 C 99.314 142.000 102.000 139.314 102.000 136.000 C 102.000 132.686 99.314 130.000 96.000 130.000 ZM 96.000 162.000 L 64.000 162.000 C 60.686 162.000 58.000 164.686 58.000 168.000 C 58.000 171.314 60.686 174.000 64.000 174.000 L 96.000 174.000 C 99.314 174.000 102.000 171.314 102.000 168.000 C 102.000 164.686 99.314 162.000 96.000 162.000 ZM 230.000 80.000 L 230.000 192.000 C 230.000 199.732 223.732 206.000 216.000 206.000 L 40.000 206.000 C 32.268 206.000 26.000 199.732 26.000 192.000 L 26.000 72.000 C 25.999 69.348 27.739 67.010 30.280 66.250 L 190.280 18.250 C 193.456 17.300 196.800 19.104 197.750 22.280 C 198.700 25.456 196.896 28.800 193.720 29.750 L 72.880 66.000 L 216.000 66.000 C 223.732 66.000 230.000 72.268 230.000 80.000 ZM 218.000 80.000 C 218.000 78.895 217.105 78.000 216.000 78.000 L 38.000 78.000 L 38.000 192.000 C 38.000 193.105 38.895 194.000 40.000 194.000 L 216.000 194.000 C 217.105 194.000 218.000 193.105 218.000 192.000 ZM 198.000 136.000 C 198.000 156.987 180.987 174.000 160.000 174.000 C 139.013 174.000 122.000 156.987 122.000 136.000 C 122.000 115.013 139.013 98.000 160.000 98.000 C 180.987 98.000 198.000 115.013 198.000 136.000 ZM 186.000 136.000 C 186.000 121.641 174.359 110.000 160.000 110.000 C 145.641 110.000 134.000 121.641 134.000 136.000 C 134.000 150.359 145.641 162.000 160.000 162.000 C 174.359 162.000 186.000 150.359 186.000 136.000 Z"),
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
        return _radio!!
    }

private var _radio: ImageVector? = null
