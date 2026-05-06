package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Calendar: ImageVector
    get() {
        if (_calendar != null) return _calendar!!
        _calendar = phosphorThinIcon(
            name = "Calendar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-28v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12h-88v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12h-28C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM48 44h28v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h88v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h28c2.209 0 4 1.791 4 4v36h-168v-36c0-2.209 1.791-4 4-4ZM208 212h-160c-2.209 0-4-1.791-4-4v-116h168v116c0 2.209-1.791 4-4 4ZM108 120v64c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-57.53l-10.21 5.11c-1.977 .989-4.381 .187-5.37-1.79-.989-1.977-.187-4.381 1.79-5.37l16-8c1.24-.621 2.714-.554 3.894 .175 1.18 .729 1.897 2.018 1.896 3.405ZM168 148l-24 32h24c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-32c-1.515 0-2.9-.856-3.578-2.211-.678-1.355-.531-2.977 .378-4.189l28.78-38.37c1.579-2.079 2.43-4.62 2.42-7.23 .006-5.437-3.644-10.198-8.895-11.605-5.251-1.407-10.793 .893-13.505 5.605-1.15 1.809-3.522 2.39-5.377 1.317-1.856-1.073-2.536-3.418-1.543-5.317 4.526-7.839 13.753-11.66 22.496-9.318 8.743 2.343 14.823 10.266 14.824 19.318 .015 4.33-1.39 8.545-4 12Z"),
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
        return _calendar!!
    }

private var _calendar: ImageVector? = null
