package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VipFill: ImageVector
    get() {
        if (_vipFill != null) return _vipFill!!
        _vipFill = remixIcon(
            name = "VipFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.005 3h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1ZM11.005 8.5v7h2v-7h-2ZM10.72 8.5h-2.114L7.109 12.613 5.612 8.5h-2.114l2.611 6.964h2L10.72 8.5ZM16.005 13.5h1.5c1.381 0 2.5-1.119 2.5-2.5 0-1.381-1.119-2.5-2.5-2.5h-3.5v7h2v-2ZM16.005 11.5v-1h1.5c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-1.5Z"),
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
        return _vipFill!!
    }

private var _vipFill: ImageVector? = null
