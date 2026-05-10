package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UsersFour: ImageVector
    get() {
        if (_usersFour != null) return _usersFour!!
        _usersFour = phosphorFillIcon(
            name = "UsersFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.4 219.19c1.824 2.424 2.12 5.672 .764 8.385-1.356 2.714-4.13 4.427-7.164 4.425h-192c-3.03 0-5.8-1.712-7.155-4.422-1.355-2.71-1.063-5.954 .755-8.378C32.684 209.703 42.13 202.225 53 197.51 40.805 186.379 36.701 168.899 42.67 153.505c5.969-15.394 20.784-25.539 37.295-25.539 16.511 0 31.326 10.145 37.295 25.539 5.969 15.394 1.866 32.875-10.33 44.005 7.842 3.39 14.969 8.239 21 14.29 6.031-6.051 13.158-10.9 21-14.29C136.735 186.379 132.631 168.899 138.6 153.505c5.969-15.394 20.784-25.539 37.295-25.539 16.511 0 31.326 10.145 37.295 25.539 5.969 15.394 1.866 32.875-10.33 44.005 10.92 4.69 20.417 12.166 27.54 21.68ZM27.2 126.4c3.535 2.651 8.549 1.935 11.2-1.6C48.22 111.706 63.633 104 80 104c16.367 0 31.78 7.706 41.6 20.8 1.511 2.014 3.882 3.2 6.4 3.2 2.518 0 4.889-1.186 6.4-3.2C144.22 111.706 159.633 104 176 104c16.367 0 31.78 7.706 41.6 20.8 2.654 3.535 7.67 4.249 11.205 1.595 3.535-2.654 4.249-7.67 1.595-11.205C223.316 105.695 213.869 98.221 203 93.51 215.195 82.379 219.299 64.899 213.33 49.505 207.361 34.11 192.546 23.965 176.035 23.965c-16.511 0-31.326 10.145-37.295 25.539-5.969 15.394-1.866 32.875 10.33 44.005-7.842 3.39-14.969 8.239-21 14.29C122.039 101.749 114.912 96.9 107.07 93.51 119.265 82.379 123.369 64.899 117.4 49.505 111.431 34.11 96.616 23.965 80.105 23.965c-16.511 0-31.326 10.145-37.295 25.539C36.841 64.899 40.945 82.379 53.14 93.51 42.219 98.204 32.723 105.683 25.6 115.2c-2.651 3.535-1.935 8.549 1.6 11.2Z"),
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
        return _usersFour!!
    }

private var _usersFour: ImageVector? = null
