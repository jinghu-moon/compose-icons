package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) return _userCirclePlus!!
        _userCirclePlus = phosphorFillIcon(
            name = "UserCirclePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 76c24.301 0 44 19.699 44 44 0 24.301-19.699 44-44 44C103.699 164 84 144.301 84 120 84 95.699 103.699 76 128 76ZM176 64h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM221.35 104.11c-4.357 .729-7.299 4.853-6.57 9.21 .812 4.851 1.22 9.761 1.22 14.68 .019 21.542-7.898 42.336-22.24 58.41C187.941 177.977 180.553 170.742 172 165.1c-1.501-.995-3.483-.864-4.84 .32-22.468 19.441-55.802 19.441-78.27 0-1.366-1.21-3.378-1.341-4.89-.32-8.566 5.636-15.965 12.871-21.79 21.31C39.221 160.504 33.565 123.523 47.762 91.931 61.958 60.339 93.365 40.012 128 40c4.919-.001 9.829 .407 14.68 1.22 4.336 .684 8.413-2.253 9.137-6.582 .724-4.329-2.175-8.433-6.497-9.198C100.742 17.941 56.429 40.119 35.714 80.298 14.999 120.477 22.633 169.438 54.597 201.403c31.964 31.964 80.926 39.599 121.105 18.884 40.179-20.715 62.357-65.028 54.858-109.606-.729-4.357-4.853-7.299-9.21-6.57Z"),
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
        return _userCirclePlus!!
    }

private var _userCirclePlus: ImageVector? = null
