package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserCircle: ImageVector
    get() {
        if (_userCircle != null) return _userCircle!!
        _userCircle = phosphorDuotoneIcon(
            name = "UserCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c.029 27.229-11.535 53.183-31.8 71.37C179.916 175.209 155.105 159.993 128 160c22.091 0 40-17.909 40-40C168 97.909 150.091 80 128 80 105.909 80 88 97.909 88 120c0 22.091 17.909 40 40 40-27.105-.007-51.916 15.209-64.2 39.37h0C31.027 169.891 22.54 121.881 43.222 82.953 63.904 44.026 108.439 24.185 151.212 34.844 193.984 45.502 224.002 83.919 224 128Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM74.08 197.5C85.841 179.106 106.167 167.977 128 167.977c21.833 0 42.159 11.13 53.92 29.523-31.715 24.666-76.125 24.666-107.84 0ZM96 120c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C110.327 152 96 137.673 96 120ZM193.76 186.41c-8.922-12.929-21.468-22.932-36.06-28.75 16.067-12.655 22.351-34.1 15.654-53.425C166.658 84.911 148.452 71.952 128 71.952c-20.452 0-38.658 12.959-45.354 32.284-6.696 19.325-.413 40.77 15.654 53.425-14.592 5.818-27.138 15.821-36.06 28.75C30.832 151.09 32.934 97.267 67.001 64.505c34.067-32.763 87.931-32.763 121.998 0 34.067 32.763 36.169 86.586 4.761 121.905Z"),
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
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
