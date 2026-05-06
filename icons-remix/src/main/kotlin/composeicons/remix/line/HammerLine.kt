package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HammerLine: ImageVector
    get() {
        if (_hammerLine != null) return _hammerLine!!
        _hammerLine = remixIcon(
            name = "HammerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 2c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-5v13c0 .552-.448 1-1 1h-4C9.448 23 9 22.552 9 22v-13h-5.5c-.552 0-1-.448-1-1v-2.382c0-.379 .214-.725 .553-.894L8.5 2h11.5ZM15 4h-6.028L4.5 6.236v.764h6.5v14h2v-14h2v-3ZM19 4h-2v3h2v-3Z"),
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
        return _hammerLine!!
    }

private var _hammerLine: ImageVector? = null
