package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AddressBook: ImageVector
    get() {
        if (_addressBook != null) return _addressBook!!
        _addressBook = phosphorLightIcon(
            name = "AddressBook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 159.110 142.130 C 172.037 132.226 177.217 115.187 171.988 99.764 C 166.759 84.341 152.285 73.965 136.000 73.965 C 119.715 73.965 105.241 84.341 100.012 99.764 C 94.783 115.187 99.963 132.226 112.890 142.130 C 101.060 146.548 90.753 154.280 83.200 164.400 C 81.212 167.051 81.749 170.812 84.400 172.800 C 87.051 174.788 90.812 174.251 92.800 171.600 C 102.998 158.002 119.003 150.000 136.000 150.000 C 152.997 150.000 169.002 158.002 179.200 171.600 C 181.188 174.251 184.949 174.788 187.600 172.800 C 190.251 170.812 190.788 167.051 188.800 164.400 C 181.247 154.280 170.940 146.548 159.110 142.130 ZM 110.000 112.000 C 110.000 97.641 121.641 86.000 136.000 86.000 C 150.359 86.000 162.000 97.641 162.000 112.000 C 162.000 126.359 150.359 138.000 136.000 138.000 C 121.641 138.000 110.000 126.359 110.000 112.000 ZM 208.000 26.000 L 64.000 26.000 C 56.268 26.000 50.000 32.268 50.000 40.000 L 50.000 66.000 L 32.000 66.000 C 28.686 66.000 26.000 68.686 26.000 72.000 C 26.000 75.314 28.686 78.000 32.000 78.000 L 50.000 78.000 L 50.000 122.000 L 32.000 122.000 C 28.686 122.000 26.000 124.686 26.000 128.000 C 26.000 131.314 28.686 134.000 32.000 134.000 L 50.000 134.000 L 50.000 178.000 L 32.000 178.000 C 28.686 178.000 26.000 180.686 26.000 184.000 C 26.000 187.314 28.686 190.000 32.000 190.000 L 50.000 190.000 L 50.000 216.000 C 50.000 223.732 56.268 230.000 64.000 230.000 L 208.000 230.000 C 215.732 230.000 222.000 223.732 222.000 216.000 L 222.000 40.000 C 222.000 32.268 215.732 26.000 208.000 26.000 ZM 210.000 216.000 C 210.000 217.105 209.105 218.000 208.000 218.000 L 64.000 218.000 C 62.895 218.000 62.000 217.105 62.000 216.000 L 62.000 40.000 C 62.000 38.895 62.895 38.000 64.000 38.000 L 208.000 38.000 C 209.105 38.000 210.000 38.895 210.000 40.000 Z"),
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
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null
