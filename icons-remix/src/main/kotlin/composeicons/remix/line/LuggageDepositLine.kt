package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LuggageDepositLine: ImageVector
    get() {
        if (_luggageDepositLine != null) return _luggageDepositLine!!
        _luggageDepositLine = remixIcon(
            name = "LuggageDepositLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 3c.552 0 1 .448 1 1v2h4c.552 0 1 .448 1 1v12h2v2h-22v-2h2v-12C3 6.448 3.448 6 4 6h4v-2C8 3.448 8.448 3 9 3h6ZM8 8h-3v11h3v-11ZM14 8h-4v11h4v-11ZM19 8h-3v11h3v-11ZM14 5h-4v1h4v-1Z"),
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
        return _luggageDepositLine!!
    }

private var _luggageDepositLine: ImageVector? = null
