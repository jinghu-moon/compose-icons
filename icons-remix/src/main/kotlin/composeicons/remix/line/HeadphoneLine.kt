package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HeadphoneLine: ImageVector
    get() {
        if (_headphoneLine != null) return _headphoneLine!!
        _headphoneLine = remixIcon(
            name = "HeadphoneLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 4C7.582 4 4 7.582 4 12h3c1.105 0 2 .895 2 2v5c0 1.105-.895 2-2 2h-3C2.895 21 2 20.105 2 19v-7C2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10v7c0 1.105-.895 2-2 2h-3c-1.105 0-2-.895-2-2v-5c0-1.105 .895-2 2-2h3C20 7.582 16.418 4 12 4ZM4 14v5h3v-5h-3ZM17 14v5h3v-5h-3Z"),
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
        return _headphoneLine!!
    }

private var _headphoneLine: ImageVector? = null
