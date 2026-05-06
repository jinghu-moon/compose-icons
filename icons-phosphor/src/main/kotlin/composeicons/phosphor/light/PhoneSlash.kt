package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) return _phoneSlash!!
        _phoneSlash = phosphorLightIcon(
            name = "PhoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L73.08 76.51C55.364 83.528 39.275 94.106 25.81 107.59c-19.25 19.26-21.11 47.65-4.52 69 3.808 4.859 10.348 6.65 16.1 4.41l49-17.37 .22-.09c4.4-1.745 7.613-5.606 8.53-10.25l5.9-29.51c.129-.663 .584-1.216 1.21-1.47 3.27-1.132 6.611-2.05 10-2.75L203.56 220c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM98.29 111c-4.627 1.662-8.043 5.628-9 10.45L83.37 151c-.129 .635-.558 1.168-1.15 1.43L33.28 169.77l-.22 .08c-.808 .326-1.735 .092-2.29-.58-13-16.73-11.56-38.11 3.53-53.19C47.692 102.661 63.9 92.386 81.75 86l21.34 23.48c-1.62 .52-3.22 .99-4.8 1.52ZM234.71 176.61c-3.808 4.859-10.348 6.65-16.1 4.41l-9.28-3.29c-2.07-.676-3.612-2.422-4.027-4.56-.415-2.138 .361-4.333 2.028-5.735 1.667-1.402 3.963-1.79 5.998-1.015l9.38 3.33 .22 .08c.808 .326 1.735 .092 2.29-.58 13-16.73 11.56-38.11-3.53-53.19C195.64 90 158.86 76.2 120.83 78.19c-3.314 .174-6.141-2.371-6.315-5.685-.174-3.314 2.371-6.141 5.685-6.315 41.44-2.15 81.52 12.93 110 41.39 19.24 19.27 21.1 47.66 4.51 69.05Z"),
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
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
