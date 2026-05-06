package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Wallet3Line: ImageVector
    get() {
        if (_wallet3Line != null) return _wallet3Line!!
        _wallet3Line = remixIcon(
            name = "Wallet3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.005 7h1v10h-1v3c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1h18c.552 0 1 .448 1 1v3ZM20.005 17h-6c-2.761 0-5-2.239-5-5 0-2.761 2.239-5 5-5h6v-2h-16v14h16v-2ZM21.005 15v-6h-7c-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3h7ZM14.005 11h3v2h-3v-2Z"),
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
        return _wallet3Line!!
    }

private var _wallet3Line: ImageVector? = null
