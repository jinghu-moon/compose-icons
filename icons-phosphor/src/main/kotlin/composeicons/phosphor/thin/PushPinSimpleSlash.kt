package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) return _pushPinSimpleSlash!!
        _pushPinSimpleSlash = phosphorThinIcon(
            name = "PushPinSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M87.25 40c0-2.209 1.791-4 4-4h100.75c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-11.23l19.58 111c.381 2.173-1.068 4.244-3.24 4.63-.23 .048-.465 .071-.7 .07-1.939-.005-3.596-1.4-3.93-3.31L172.64 44h-81.39c-2.209 0-4-1.791-4-4ZM210.69 219c-1.635 1.485-4.164 1.365-5.65-.27L169.87 180h-37.87v60c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-60h-84c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h12.64L70.52 70.72 45 42.69C43.514 41.033 43.653 38.486 45.31 37c1.657-1.486 4.204-1.347 5.69 .31L211 213.31c.721 .792 1.094 1.84 1.036 2.91-.058 1.07-.543 2.071-1.346 2.78ZM162.59 172 77.32 78.2 60.77 172Z"),
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
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
