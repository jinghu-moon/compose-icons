package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListHeart: ImageVector
    get() {
        if (_listHeart != null) return _listHeart!!
        _listHeart = phosphorLightIcon(
            name = "ListHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 34.000 64.000 C 34.000 60.686 36.686 58.000 40.000 58.000 L 216.000 58.000 C 219.314 58.000 222.000 60.686 222.000 64.000 C 222.000 67.314 219.314 70.000 216.000 70.000 L 40.000 70.000 C 36.686 70.000 34.000 67.314 34.000 64.000 ZM 40.000 134.000 L 104.000 134.000 C 107.314 134.000 110.000 131.314 110.000 128.000 C 110.000 124.686 107.314 122.000 104.000 122.000 L 40.000 122.000 C 36.686 122.000 34.000 124.686 34.000 128.000 C 34.000 131.314 36.686 134.000 40.000 134.000 ZM 120.000 186.000 L 40.000 186.000 C 36.686 186.000 34.000 188.686 34.000 192.000 C 34.000 195.314 36.686 198.000 40.000 198.000 L 120.000 198.000 C 123.314 198.000 126.000 195.314 126.000 192.000 C 126.000 188.686 123.314 186.000 120.000 186.000 ZM 246.000 144.000 C 246.000 179.300 196.780 204.320 194.680 205.370 C 192.993 206.212 191.007 206.212 189.320 205.370 C 187.220 204.320 138.000 179.300 138.000 144.000 C 138.000 131.087 146.263 119.623 158.513 115.539 C 170.763 111.456 184.252 115.670 192.000 126.000 C 199.748 115.670 213.237 111.456 225.487 115.539 C 237.737 119.623 246.000 131.087 246.000 144.000 ZM 234.000 144.000 C 234.000 134.059 225.941 126.000 216.000 126.000 C 206.059 126.000 198.000 134.059 198.000 144.000 C 198.000 147.314 195.314 150.000 192.000 150.000 C 188.686 150.000 186.000 147.314 186.000 144.000 C 186.000 134.059 177.941 126.000 168.000 126.000 C 158.059 126.000 150.000 134.059 150.000 144.000 C 150.000 158.150 161.780 171.000 171.670 179.250 C 178.020 184.490 184.823 189.155 192.000 193.190 C 199.179 189.159 205.983 184.494 212.330 179.250 C 222.220 171.000 234.000 158.150 234.000 144.000 Z"),
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
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
