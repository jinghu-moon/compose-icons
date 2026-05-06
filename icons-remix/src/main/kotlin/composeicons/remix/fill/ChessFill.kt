package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChessFill: ImageVector
    get() {
        if (_chessFill != null) return _chessFill!!
        _chessFill = remixIcon(
            name = "ChessFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 16h12.808c-.398-1.815-1.465-3.147-3.66-4.089-.22-.094-.338-.34-.262-.567 .067-.201 .265-.327 .475-.303l4.485 .51c.397 .045 .783-.151 .981-.497l.826-1.445c.208-.365 .167-.821-.105-1.142L15.5 2.5v-2.213C9.336 2.84 5 8.913 5 16ZM4 17h15v3h1v2h-17v-2h1v-3ZM15 7c0 .552-.448 1-1 1C13.448 8 13 7.552 13 7c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z"),
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
        return _chessFill!!
    }

private var _chessFill: ImageVector? = null
