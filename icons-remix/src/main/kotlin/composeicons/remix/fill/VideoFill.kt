package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VideoFill: ImageVector
    get() {
        if (_videoFill != null) return _videoFill!!
        _videoFill = remixIcon(
            name = "VideoFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3.993C3 3.445 3.445 3 3.993 3h16.013c.549 0 .993 .445 .993 .993v16.013c0 .549-.445 .993-.993 .993h-16.013C3.445 21 3 20.555 3 20.007v-16.013ZM10.622 8.415c-.066-.044-.143-.067-.222-.067-.221 0-.4 .179-.4 .4v6.505c0 .079 .023 .156 .067 .222 .123 .184 .371 .234 .555 .111l4.879-3.253c.044-.029 .082-.067 .111-.111 .123-.184 .073-.432-.111-.555L10.622 8.415Z"),
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
        return _videoFill!!
    }

private var _videoFill: ImageVector? = null
