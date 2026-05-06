package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ScanSmiley: ImageVector
    get() {
        if (_scanSmiley != null) return _scanSmiley!!
        _scanSmiley = phosphorThinIcon(
            name = "ScanSmiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 40v36c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-32h-32c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h36c2.209 0 4 1.791 4 4ZM216 176c-2.209 0-4 1.791-4 4v32h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h36c2.209 0 4-1.791 4-4v-36c0-2.209-1.791-4-4-4ZM76 212h-32v-32c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v36c0 2.209 1.791 4 4 4h36c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM40 80c2.209 0 4-1.791 4-4v-32h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-36c-2.209 0-4 1.791-4 4v36c0 2.209 1.791 4 4 4ZM128 196C90.445 196 60 165.555 60 128 60 90.445 90.445 60 128 60c37.555 0 68 30.445 68 68-.039 37.539-30.461 67.961-68 68ZM188 128C188 94.863 161.137 68 128 68 94.863 68 68 94.863 68 128c0 33.137 26.863 60 60 60 33.121-.039 59.961-26.879 60-60ZM112 116c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8ZM152 108c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM149.35 149c-4.52 4-13.7 7-21.35 7-7.65 0-16.83-3-21.35-7-1.657-1.464-4.186-1.307-5.65 .35-1.464 1.657-1.307 4.186 .35 5.65 6 5.3 17 9 26.65 9 9.65 0 20.64-3.7 26.65-9 1.657-1.464 1.814-3.993 .35-5.65-1.464-1.657-3.993-1.814-5.65-.35Z"),
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
        return _scanSmiley!!
    }

private var _scanSmiley: ImageVector? = null
