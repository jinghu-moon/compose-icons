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
                pathData = parseSvgPathData("M159.11 142.13c12.927-9.904 18.107-26.943 12.878-42.366C166.759 84.341 152.285 73.965 136 73.965c-16.285 0-30.759 10.376-35.988 25.799-5.229 15.423-.049 32.462 12.878 42.366-11.83 4.418-22.137 12.15-29.69 22.27-1.988 2.651-1.451 6.412 1.2 8.4 2.651 1.988 6.412 1.451 8.4-1.2C102.998 158.002 119.003 150 136 150c16.997 0 33.002 8.002 43.2 21.6 1.988 2.651 5.749 3.188 8.4 1.2 2.651-1.988 3.188-5.749 1.2-8.4-7.553-10.12-17.86-17.852-29.69-22.27ZM110 112c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26-14.359 0-26-11.641-26-26ZM208 26h-144C56.268 26 50 32.268 50 40v26h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v44h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v44h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v26c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-176c0-7.732-6.268-14-14-14ZM210 216c0 1.105-.895 2-2 2h-144c-1.105 0-2-.895-2-2v-176c0-1.105 .895-2 2-2h144c1.105 0 2 .895 2 2Z"),
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
