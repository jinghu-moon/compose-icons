package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCircleCheck: ImageVector
    get() {
        if (_userCircleCheck != null) return _userCircleCheck!!
        _userCircleCheck = phosphorFillIcon(
            name = "UserCircleCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.56 110.68c7.499 44.578-14.679 88.891-54.858 109.606C135.523 241.001 86.562 233.367 54.597 201.403 22.633 169.438 14.999 120.477 35.714 80.298 56.429 40.119 100.742 17.941 145.32 25.44c4.322 .764 7.221 4.869 6.497 9.198-.724 4.329-4.801 7.266-9.137 6.582C117.139 36.924 91.002 44.087 71.221 60.805 51.44 77.523 40.021 102.101 40 128c-.019 21.542 7.898 42.336 22.24 58.41C68.056 177.974 75.444 170.739 84 165.1c1.501-.995 3.483-.864 4.84 .32 22.465 19.439 55.795 19.439 78.26 0 1.357-1.184 3.339-1.315 4.84-.32 8.564 5.639 15.962 12.874 21.79 21.31C208.082 170.34 216.011 149.546 216 128c0-4.919-.408-9.829-1.22-14.68-.501-2.832 .557-5.715 2.77-7.551 2.213-1.836 5.242-2.343 7.933-1.327 2.691 1.016 4.629 3.397 5.077 6.238ZM84 120c0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44C172 95.699 152.301 76 128 76 103.699 76 84 95.699 84 120ZM237.66 34.34C236.159 32.838 234.123 31.994 232 31.994c-2.123 0-4.159 .844-5.66 2.346L200 60.69 189.66 50.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32l16 16c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l32-32c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66Z"),
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
        return _userCircleCheck!!
    }

private var _userCircleCheck: ImageVector? = null
