package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserCircleCheck: ImageVector
    get() {
        if (_userCircleCheck != null) return _userCircleCheck!!
        _userCircleCheck = phosphorRegularIcon(
            name = "UserCircleCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.35 104.11c-4.357 .729-7.299 4.853-6.57 9.21 .812 4.851 1.22 9.761 1.22 14.68 .019 21.542-7.898 42.336-22.24 58.41-8.922-12.929-21.468-22.932-36.06-28.75 16.067-12.655 22.351-34.1 15.654-53.425C166.658 84.911 148.452 71.952 128 71.952c-20.452 0-38.658 12.959-45.354 32.284-6.696 19.325-.413 40.77 15.654 53.425-14.592 5.818-27.138 15.821-36.06 28.75C39.254 160.509 33.597 123.534 47.785 91.945 61.974 60.355 93.37 40.024 128 40c4.919-.001 9.829 .407 14.68 1.22 4.336 .684 8.413-2.253 9.137-6.582 .724-4.329-2.175-8.433-6.497-9.198C100.742 17.941 56.429 40.119 35.714 80.298 14.999 120.477 22.633 169.438 54.597 201.403c31.964 31.964 80.926 39.599 121.105 18.884 40.179-20.715 62.357-65.028 54.858-109.606-.729-4.357-4.853-7.299-9.21-6.57ZM96 120c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C110.327 152 96 137.673 96 120ZM74.08 197.5C85.841 179.106 106.167 167.977 128 167.977c21.833 0 42.159 11.13 53.92 29.523-31.715 24.666-76.125 24.666-107.84 0ZM237.66 45.66l-32 32c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346l-16-16c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L200 60.69 226.34 34.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32Z"),
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
