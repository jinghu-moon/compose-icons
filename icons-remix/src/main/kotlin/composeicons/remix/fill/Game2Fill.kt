package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Game2Fill: ImageVector
    get() {
        if (_game2Fill != null) return _game2Fill!!
        _game2Fill = remixIcon(
            name = "Game2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 4h2v2h6v-2h2v-2h2v4h-2v2h2v2h4v6h-2v-4h-1v6h-3v2h2v2h-4v-4h-6v4h-4v-2h2v-2h-3v-6h-1v4h-2v-6h4v-2h2v-2h-2v-4h2v2ZM9 11v3h2v-3h-2ZM13 11v3h2v-3h-2Z"),
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
        return _game2Fill!!
    }

private var _game2Fill: ImageVector? = null
