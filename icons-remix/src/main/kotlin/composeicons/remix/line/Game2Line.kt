package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Game2Line: ImageVector
    get() {
        if (_game2Line != null) return _game2Line!!
        _game2Line = remixIcon(
            name = "Game2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 4h2v2h6v-2h2v-2h2v4h-2v2h2v2h4v6h-2v-4h-1v6h-3v2h2v2h-4v-4h-6v4h-4v-2h2v-2h-3v-6h-1v4h-2v-6h4v-2h2v-2h-2v-4h2v2ZM9 10h-2v2h-1v4h12v-4h-1v-2h-2v-2h-6v2ZM11 14h-2v-3h2v3ZM15 14h-2v-3h2v3Z"),
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
        return _game2Line!!
    }

private var _game2Line: ImageVector? = null
