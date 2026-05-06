package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserCircleDashed: ImageVector
    get() {
        if (_userCircleDashed != null) return _userCircleDashed!!
        _userCircleDashed = phosphorThinIcon(
            name = "UserCircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100.13 36c-.525-2.124 .753-4.276 2.87-4.83 16.398-4.23 33.602-4.23 50 0 1.964 .492 3.251 2.375 2.996 4.384-.255 2.009-1.971 3.51-3.996 3.496-.337-.005-.673-.048-1-.13-15.086-3.895-30.914-3.895-46 0-1.033 .263-2.129 .102-3.043-.446-.914-.548-1.572-1.439-1.827-2.474ZM34.42 106.16c2.129 .588 4.332-.661 4.92-2.79 4.169-15.008 12.083-28.71 23-39.82 1.549-1.577 1.527-4.111-.05-5.66-1.577-1.549-4.111-1.527-5.66 .05C44.77 70.028 36.169 84.925 31.63 101.24c-.588 2.129 .661 4.332 2.79 4.92ZM151 217.09c-15.086 3.895-30.914 3.895-46 0-2.14-.552-4.323 .735-4.875 2.875-.552 2.14 .735 4.323 2.875 4.875 16.398 4.234 33.602 4.234 50 0 1.432-.312 2.578-1.383 2.988-2.79 .41-1.407 .017-2.925-1.023-3.957-1.04-1.032-2.561-1.413-3.965-.993ZM216.65 103.38c.33 1.435 1.421 2.572 2.841 2.962 1.42 .389 2.939-.033 3.954-1.099 1.015-1.066 1.363-2.604 .905-4.003-4.534-16.32-13.136-31.221-25-43.31-1.549-1.577-4.083-1.599-5.66-.05-1.577 1.549-1.599 4.083-.05 5.66 10.92 11.117 18.838 24.826 23.01 39.84ZM224.38 154.77c-5.093 18.347-15.329 34.853-29.5 47.57-.925 .832-2.183 1.186-3.406 .959-1.223-.227-2.27-1.01-2.834-2.119C177.051 178.34 153.612 163.95 128 163.95c-25.612 0-49.051 14.391-60.64 37.23-.563 1.108-1.609 1.891-2.83 2.12-.24 .048-.485 .072-.73 .07-.986 .008-1.94-.348-2.68-1C46.949 189.649 36.712 173.14 31.62 154.79c-.409-1.386-.038-2.886 .97-3.921 1.008-1.036 2.497-1.447 3.894-1.076 1.397 .371 2.485 1.467 2.846 2.867 4.235 15.21 12.319 29.072 23.47 40.25 9.933-16.646 25.876-28.845 44.54-34.08C89.505 149.345 80.42 128.935 85.307 109.336 90.195 89.736 107.8 75.982 128 75.982c20.2 0 37.805 13.754 42.693 33.354 4.888 19.6-4.198 40.01-22.033 49.494 18.664 5.235 34.607 17.434 44.54 34.08 11.158-11.184 19.242-25.058 23.47-40.28 .591-2.129 2.796-3.376 4.925-2.785 2.129 .591 3.376 2.796 2.785 4.925ZM128 156c19.882 0 36-16.118 36-36C164 100.118 147.882 84 128 84c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36Z"),
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
