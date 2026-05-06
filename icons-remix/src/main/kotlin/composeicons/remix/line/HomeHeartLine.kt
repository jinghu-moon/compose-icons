package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HomeHeartLine: ImageVector
    get() {
        if (_homeHeartLine != null) return _homeHeartLine!!
        _homeHeartLine = remixIcon(
            name = "HomeHeartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 20c0 .552-.448 1-1 1h-14C4.448 21 4 20.552 4 20v-9h-3L11.327 1.612c.381-.347 .964-.347 1.345 0L23 11h-3v9ZM18 19v-9.843L12 3.703 6 9.157v9.843h12ZM12 17 8.641 13.641c-.879-.879-.879-2.303 0-3.182 .879-.879 2.303-.879 3.182 0l.177 .177 .177-.177c.879-.879 2.303-.879 3.182 0 .879 .879 .879 2.303 0 3.182L12 17Z"),
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
        return _homeHeartLine!!
    }

private var _homeHeartLine: ImageVector? = null
