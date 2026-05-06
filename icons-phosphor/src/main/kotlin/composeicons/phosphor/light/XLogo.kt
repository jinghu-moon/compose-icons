package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.XLogo: ImageVector
    get() {
        if (_xLogo != null) return _xLogo!!
        _xLogo = phosphorLightIcon(
            name = "XLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.06 212.78 149.64 113.12 212.44 44c1.665-1.545 2.314-3.899 1.678-6.079-.637-2.181-2.451-3.815-4.686-4.221-2.235-.407-4.508 .484-5.872 2.301L143 102.62 101.1 36.78C99.992 35.037 98.065 33.987 96 34h-48c-2.189 .001-4.204 1.194-5.257 3.113-1.053 1.919-.978 4.26 .197 6.107l63.42 99.66L43.56 212c-1.865 2.484-1.526 5.981 .782 8.06 2.308 2.079 5.821 2.053 8.098-.06L113 153.38l41.9 65.84c1.108 1.743 3.035 2.793 5.1 2.78h48c2.189-.001 4.204-1.194 5.257-3.113 1.053-1.919 .978-4.26-.197-6.107ZM163.29 210 58.93 46h33.78L197.07 210Z"),
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
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
