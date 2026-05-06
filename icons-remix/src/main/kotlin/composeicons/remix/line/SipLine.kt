package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SipLine: ImageVector
    get() {
        if (_sipLine != null) return _sipLine!!
        _sipLine = remixIcon(
            name = "SipLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.457 18.954l8.564-8.564L13.607 8.976 5.043 17.54l1.414 1.414ZM12.192 7.562 10.778 6.148 12.192 4.733l1.768 1.768L16.789 3.673c.39-.391 1.024-.391 1.414 0l2.121 2.121c.39 .391 .39 1.024 0 1.414l-2.828 2.828 1.768 1.768-1.414 1.414L16.435 11.804 7.243 20.997h-4.243v-4.243L12.192 7.562Z"),
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
        return _sipLine!!
    }

private var _sipLine: ImageVector? = null
