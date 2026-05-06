package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TumblrLogo: ImageVector
    get() {
        if (_tumblrLogo != null) return _tumblrLogo!!
        _tumblrLogo = phosphorThinIcon(
            name = "TumblrLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 116c2.209 0 4-1.791 4-4v-40c0-2.209-1.791-4-4-4h-44v-44c0-2.209-1.791-4-4-4h-32c-2.209 0-4 1.791-4 4C107.972 48.289 88.289 67.972 64 68c-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4h28v60c.039 33.121 26.879 59.961 60 60h40c2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4h-32c-6.627 0-12-5.373-12-12v-52ZM160 188h28v40h-36c-28.705-.033-51.967-23.295-52-52v-64c0-2.209-1.791-4-4-4h-28v-32.15C93.549 73.843 113.843 53.549 115.85 28h24.15v44c0 2.209 1.791 4 4 4h44v32h-44c-2.209 0-4 1.791-4 4v56c0 11.046 8.954 20 20 20Z"),
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
        return _tumblrLogo!!
    }

private var _tumblrLogo: ImageVector? = null
