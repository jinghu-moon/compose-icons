package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ServiceBellLine: ImageVector
    get() {
        if (_serviceBellLine != null) return _serviceBellLine!!
        _serviceBellLine = remixIcon(
            name = "ServiceBellLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 3h-6v2h2v1.049C5.947 6.551 2 10.815 2 16v1h20v-1C22 10.815 18.053 6.551 13 6.049v-1.049h2v-2ZM12 8c4.08 0 7.446 3.054 7.938 7h-15.876C4.554 11.054 7.92 8 12 8ZM23 20v-2h-22v2h22Z"),
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
        return _serviceBellLine!!
    }

private var _serviceBellLine: ImageVector? = null
