package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = phosphorFillIcon(
            name = "CursorText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM144 120c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-8v24c0 8.837 7.163 16 16 16h8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-8c-9.192 .001-17.938-3.96-24-10.87-6.062 6.91-14.808 10.871-24 10.87h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8c8.837 0 16-7.163 16-16v-24h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8v-24c0-8.837-7.163-16-16-16h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8c9.192-.001 17.938 3.96 24 10.87C134.062 67.96 142.808 63.999 152 64h8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-8c-8.837 0-16 7.163-16 16v24Z"),
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
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
