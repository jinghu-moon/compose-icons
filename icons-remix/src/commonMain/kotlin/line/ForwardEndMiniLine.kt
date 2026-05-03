package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ForwardEndMiniLine: ImageVector
    get() {
        if (_forwardEndMiniLine != null) return _forwardEndMiniLine!!
        _forwardEndMiniLine = remixIcon(
            name = "ForwardEndMiniLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 6.000 C 20.448 6.000 20.000 6.448 20.000 7.000 L 20.000 17.000 C 20.000 17.552 20.448 18.000 21.000 18.000 C 21.552 18.000 22.000 17.552 22.000 17.000 L 22.000 7.000 C 22.000 6.448 21.552 6.000 21.000 6.000 ZM 4.000 9.860 L 7.032 12.000 L 4.000 14.140 L 4.000 9.860 ZM 2.500 17.535 C 2.603 17.535 2.704 17.503 2.788 17.443 L 9.921 12.408 C 10.147 12.249 10.201 11.937 10.042 11.712 C 10.009 11.665 9.968 11.624 9.921 11.591 L 2.788 6.556 C 2.563 6.397 2.251 6.451 2.092 6.677 C 2.032 6.761 2.000 6.862 2.000 6.965 L 2.000 17.035 C 2.000 17.311 2.224 17.535 2.500 17.535 ZM 16.032 12.000 L 13.000 14.140 L 13.000 9.860 L 16.032 12.000 ZM 11.092 6.677 C 11.032 6.761 11.000 6.862 11.000 6.965 L 11.000 17.035 C 11.000 17.311 11.224 17.535 11.500 17.535 C 11.603 17.535 11.704 17.503 11.788 17.443 L 18.921 12.408 C 19.147 12.249 19.201 11.937 19.042 11.712 C 19.009 11.665 18.968 11.624 18.921 11.591 L 11.788 6.556 C 11.563 6.397 11.251 6.451 11.092 6.677 Z"),
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
        return _forwardEndMiniLine!!
    }

private var _forwardEndMiniLine: ImageVector? = null
