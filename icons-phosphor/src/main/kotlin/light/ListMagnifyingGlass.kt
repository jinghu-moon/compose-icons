package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListMagnifyingGlass: ImageVector
    get() {
        if (_listMagnifyingGlass != null) return _listMagnifyingGlass!!
        _listMagnifyingGlass = phosphorLightIcon(
            name = "ListMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 34.000 64.000 C 34.000 60.686 36.686 58.000 40.000 58.000 L 216.000 58.000 C 219.314 58.000 222.000 60.686 222.000 64.000 C 222.000 67.314 219.314 70.000 216.000 70.000 L 40.000 70.000 C 36.686 70.000 34.000 67.314 34.000 64.000 ZM 40.000 134.000 L 112.000 134.000 C 115.314 134.000 118.000 131.314 118.000 128.000 C 118.000 124.686 115.314 122.000 112.000 122.000 L 40.000 122.000 C 36.686 122.000 34.000 124.686 34.000 128.000 C 34.000 131.314 36.686 134.000 40.000 134.000 ZM 128.000 186.000 L 40.000 186.000 C 36.686 186.000 34.000 188.686 34.000 192.000 C 34.000 195.314 36.686 198.000 40.000 198.000 L 128.000 198.000 C 131.314 198.000 134.000 195.314 134.000 192.000 C 134.000 188.686 131.314 186.000 128.000 186.000 ZM 236.240 196.240 C 233.897 198.580 230.103 198.580 227.760 196.240 L 206.270 174.760 C 190.194 186.408 167.865 183.743 154.982 168.638 C 142.099 153.534 142.989 131.065 157.027 117.027 C 171.065 102.989 193.534 102.099 208.638 114.982 C 223.743 127.865 226.408 150.194 214.760 166.270 L 236.240 187.760 C 238.580 190.103 238.580 193.897 236.240 196.240 ZM 184.000 170.000 C 198.359 170.000 210.000 158.359 210.000 144.000 C 210.000 129.641 198.359 118.000 184.000 118.000 C 169.641 118.000 158.000 129.641 158.000 144.000 C 158.000 158.359 169.641 170.000 184.000 170.000 Z"),
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
        return _listMagnifyingGlass!!
    }

private var _listMagnifyingGlass: ImageVector? = null
