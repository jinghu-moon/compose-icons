package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandArrowUp: ImageVector
    get() {
        if (_handArrowUp != null) return _handArrowUp!!
        _handArrowUp = phosphorThinIcon(
            name = "HandArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.9 144.24c-5.068-3.902-11.669-5.208-17.84-3.53L160.75 152c2.129-3.641 3.251-7.782 3.25-12 0-13.255-10.745-24-24-24h-50.06c-7.43-.022-14.561 2.931-19.8 8.2L46.34 148h-30.34C9.373 148 4 153.373 4 160v40c0 6.627 5.373 12 12 12h104c.337 .002 .673-.038 1-.12l64-16c.204-.053 .405-.12 .6-.2l38.82-16.54 .22-.1c6.358-3.178 10.629-9.41 11.298-16.487 .669-7.077-2.358-13.999-8.008-18.313ZM12 200v-40c0-2.209 1.791-4 4-4h28v48h-28c-2.209 0-4-1.791-4-4ZM221.13 171.83l-38.41 16.37L119.51 204h-67.51v-50.34L75.8 129.86c3.741-3.764 8.833-5.874 14.14-5.86h50.06c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16h-28c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c.303 .001 .605-.032 .9-.1l67-15.41h.16c6.217-1.648 12.678 1.65 14.988 7.653 2.311 6.002-.271 12.782-5.988 15.727ZM157.13 58.83c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83l32-32c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l32 32c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L196 33.66v70.34c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-70.34L162.83 58.83c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173Z"),
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
        return _handArrowUp!!
    }

private var _handArrowUp: ImageVector? = null
