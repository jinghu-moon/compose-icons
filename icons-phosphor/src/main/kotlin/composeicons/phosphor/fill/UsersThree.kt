package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UsersThree: ImageVector
    get() {
        if (_usersThree != null) return _usersThree!!
        _usersThree = phosphorFillIcon(
            name = "UsersThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M64.12 147.8c.055 1.095-.342 2.165-1.098 2.959-.756 .794-1.805 1.243-2.902 1.241h-44.12c-3.718 .006-6.95-2.551-7.8-6.17-.521-2.436 .073-4.977 1.62-6.93C16.878 129.54 26.243 122.17 37 117.51 24.025 105.68 20.282 86.773 27.77 70.892 35.259 55.011 52.228 45.87 69.61 48.354c17.381 2.484 31.111 16.013 33.85 33.356 .265 1.744-.663 3.452-2.27 4.18C78.534 96.364 64.021 119.04 64 144c0 1.28 0 2.54 .12 3.8ZM246.12 138.89C239.078 129.541 229.735 122.175 219 117.51c12.975-11.83 16.718-30.737 9.23-46.618C220.741 55.011 203.772 45.87 186.39 48.354c-17.381 2.484-31.111 16.013-33.85 33.356-.265 1.744 .663 3.452 2.27 4.18C177.466 96.364 191.979 119.04 192 144c0 1.28 0 2.54-.12 3.8-.055 1.095 .342 2.165 1.098 2.959 .756 .794 1.805 1.243 2.902 1.241h44.12c3.718 .006 6.95-2.551 7.8-6.17 .524-2.441-.074-4.988-1.63-6.94ZM157.12 182.07c16.332-12.508 22.878-34.033 16.275-53.516C166.791 109.071 148.507 95.962 127.935 95.962c-20.572 0-38.856 13.109-45.46 32.592-6.603 19.483-.058 41.008 16.275 53.516C84.615 188.194 72.813 198.683 65.07 212c-1.429 2.475-1.429 5.525 0 8.001 1.429 2.475 4.071 4 6.93 3.999h112c2.858 .001 5.5-1.524 6.93-3.999 1.43-2.475 1.43-5.525 0-8.001-7.759-13.326-19.584-23.815-33.74-29.93Z"),
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
        return _usersThree!!
    }

private var _usersThree: ImageVector? = null
