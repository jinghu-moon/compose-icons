package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserCircleDashed: ImageVector
    get() {
        if (_userCircleDashed != null) return _userCircleDashed!!
        _userCircleDashed = phosphorRegularIcon(
            name = "UserCircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96.26 37C95.178 32.736 97.742 28.398 102 27.29c17.054-4.398 34.946-4.398 52 0 3.909 1.001 6.46 4.755 5.952 8.758-.508 4.002-3.917 7-7.952 6.992-.675-.004-1.347-.091-2-.26-14.43-3.726-29.57-3.726-44 0-2.058 .528-4.242 .215-6.069-.87C98.104 40.826 96.783 39.059 96.26 37ZM33.35 110c2.045 .568 4.232 .3 6.079-.744 1.847-1.045 3.204-2.781 3.771-4.826C47.186 90.074 54.756 76.966 65.2 66.34c2.84-3.186 2.679-8.04-.365-11.03C61.791 52.319 56.935 52.244 53.8 55.14c-12.338 12.556-21.285 28.04-26 45-.572 2.043-.308 4.23 .733 6.08 1.041 1.849 2.774 3.209 4.817 3.78ZM150 213.22c-14.43 3.726-29.57 3.726-44 0-4.248-1.028-8.535 1.544-9.627 5.775-1.093 4.232 1.413 8.557 5.627 9.715 17.054 4.398 34.946 4.398 52 0 4.215-1.157 6.72-5.483 5.627-9.715-1.093-4.232-5.379-6.803-9.627-5.775ZM212.8 104.45c1.182 4.258 5.592 6.752 9.85 5.57 4.258-1.182 6.752-5.592 5.57-9.85-4.719-16.959-13.665-32.442-26-45-1.985-2.12-4.962-2.998-7.78-2.293-2.817 .704-5.032 2.88-5.786 5.684-.754 2.804 .071 5.797 2.155 7.819 10.424 10.63 17.986 23.727 21.98 38.07ZM228.24 155.84c-5.293 19.081-15.939 36.248-30.68 49.47-1.848 1.668-4.367 2.381-6.815 1.928-2.448-.453-4.546-2.019-5.675-4.238C174.161 181.507 152.103 167.966 128 167.966c-24.103 0-46.161 13.541-57.07 35.034-1.128 2.217-3.223 3.783-5.668 4.237-2.445 .455-4.963-.254-6.812-1.917C43.708 192.091 33.062 174.917 27.77 155.83c-1.179-4.258 1.317-8.666 5.575-9.845 4.258-1.179 8.666 1.317 9.845 5.575 3.579 12.928 10.079 24.862 19 34.88 8.926-12.947 21.488-22.958 36.1-28.77C82.218 145.018 75.929 123.571 82.624 104.244 89.318 84.916 107.526 71.954 127.98 71.954c20.454 0 38.662 12.962 45.356 32.29 6.695 19.328 .406 40.775-15.666 53.426 14.612 5.812 27.174 15.823 36.1 28.77 8.921-10.018 15.421-21.952 19-34.88 1.182-4.258 5.592-6.752 9.85-5.57 4.258 1.182 6.752 5.592 5.57 9.85ZM128 152c17.673 0 32-14.327 32-32C160 102.327 145.673 88 128 88c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32Z"),
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
        return _userCircleDashed!!
    }

private var _userCircleDashed: ImageVector? = null
