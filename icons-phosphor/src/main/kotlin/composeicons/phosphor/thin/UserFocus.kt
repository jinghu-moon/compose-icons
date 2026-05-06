package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserFocus: ImageVector
    get() {
        if (_userFocus != null) return _userFocus!!
        _userFocus = phosphorThinIcon(
            name = "UserFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 40v36c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-32h-32c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h36c2.209 0 4 1.791 4 4ZM216 176c-2.209 0-4 1.791-4 4v32h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h36c2.209 0 4-1.791 4-4v-36c0-2.209-1.791-4-4-4ZM76 212h-32v-32c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v36c0 2.209 1.791 4 4 4h36c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM40 80c2.209 0 4-1.791 4-4v-32h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-36c-2.209 0-4 1.791-4 4v36c0 2.209 1.791 4 4 4ZM176 172c-1.259 0-2.445-.593-3.2-1.6C162.224 156.299 145.626 148 128 148c-17.626 0-34.224 8.299-44.8 22.4-1.325 1.767-3.833 2.125-5.6 .8-1.767-1.325-2.125-3.833-.8-5.6 8.118-10.889 19.506-18.896 32.5-22.85C95.506 134.365 88.98 117.822 93.334 102.278 97.688 86.734 111.857 75.988 128 75.988c16.143 0 30.312 10.746 34.666 26.29 4.354 15.544-2.172 32.087-15.966 40.472 12.994 3.954 24.382 11.961 32.5 22.85 .909 1.212 1.055 2.834 .378 4.189-.678 1.355-2.063 2.211-3.578 2.211ZM128 140c15.464 0 28-12.536 28-28C156 96.536 143.464 84 128 84c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28Z"),
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
        return _userFocus!!
    }

private var _userFocus: ImageVector? = null
