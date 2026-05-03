package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SkipForwardMiniFill: ImageVector
    get() {
        if (_skipForwardMiniFill != null) return _skipForwardMiniFill!!
        _skipForwardMiniFill = remixIcon(
            name = "SkipForwardMiniFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.788 17.444 C 7.704 17.503 7.603 17.535 7.500 17.535 C 7.224 17.535 7.000 17.311 7.000 17.035 L 7.000 6.965 C 7.000 6.862 7.032 6.761 7.092 6.677 C 7.251 6.451 7.563 6.397 7.788 6.556 L 14.921 11.592 C 14.968 11.624 15.009 11.665 15.042 11.712 C 15.201 11.937 15.147 12.249 14.921 12.408 L 7.788 17.444 ZM 16.000 7.000 C 16.000 6.448 16.448 6.000 17.000 6.000 C 17.552 6.000 18.000 6.448 18.000 7.000 L 18.000 17.000 C 18.000 17.552 17.552 18.000 17.000 18.000 C 16.448 18.000 16.000 17.552 16.000 17.000 L 16.000 7.000 Z"),
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
        return _skipForwardMiniFill!!
    }

private var _skipForwardMiniFill: ImageVector? = null
