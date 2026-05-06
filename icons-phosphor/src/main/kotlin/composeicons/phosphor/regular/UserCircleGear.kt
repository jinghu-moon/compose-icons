package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserCircleGear: ImageVector
    get() {
        if (_userCircleGear != null) return _userCircleGear!!
        _userCircleGear = phosphorRegularIcon(
            name = "UserCircleGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.25 63.07l-4.66-2.69c.547-2.894 .547-5.866 0-8.76l4.66-2.69c3.827-2.209 5.139-7.103 2.93-10.93-2.209-3.827-7.103-5.139-10.93-2.93l-4.67 2.7C213.345 35.853 210.775 34.364 208 33.38v-5.38c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v5.38c-2.775 .984-5.345 2.473-7.58 4.39l-4.67-2.7c-3.827-2.209-8.721-.897-10.93 2.93-2.209 3.827-.897 8.721 2.93 10.93l4.66 2.69c-.547 2.894-.547 5.866 0 8.76l-4.66 2.69c-3.138 1.81-4.668 5.502-3.731 9 .937 3.499 4.109 5.931 7.731 5.93 1.405 .004 2.785-.365 4-1.07l4.67-2.7c2.235 1.917 4.805 3.406 7.58 4.39v5.38c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-5.38c2.775-.984 5.345-2.473 7.58-4.39l4.67 2.7c1.215 .705 2.595 1.074 4 1.07 3.622 .001 6.793-2.431 7.731-5.93 .937-3.499-.593-7.191-3.731-9ZM192 56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM221.35 104.11c-4.357 .729-7.299 4.853-6.57 9.21 .812 4.851 1.22 9.761 1.22 14.68 .019 21.542-7.898 42.336-22.24 58.41-8.922-12.929-21.468-22.932-36.06-28.75 16.067-12.655 22.351-34.1 15.654-53.425C166.658 84.911 148.452 71.952 128 71.952c-20.452 0-38.658 12.959-45.354 32.284-6.696 19.325-.413 40.77 15.654 53.425-14.592 5.818-27.138 15.821-36.06 28.75C39.254 160.509 33.597 123.534 47.785 91.945 61.974 60.355 93.37 40.024 128 40c4.919-.001 9.829 .407 14.68 1.22 4.336 .684 8.413-2.253 9.137-6.582 .724-4.329-2.175-8.433-6.497-9.198C100.742 17.941 56.429 40.119 35.714 80.298 14.999 120.477 22.633 169.438 54.597 201.403c31.964 31.964 80.926 39.599 121.105 18.884 40.179-20.715 62.357-65.028 54.858-109.606-.729-4.357-4.853-7.299-9.21-6.57ZM96 120c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C110.327 152 96 137.673 96 120ZM74.08 197.5C85.841 179.106 106.167 167.977 128 167.977c21.833 0 42.159 11.13 53.92 29.523-31.715 24.666-76.125 24.666-107.84 0Z"),
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
        return _userCircleGear!!
    }

private var _userCircleGear: ImageVector? = null
