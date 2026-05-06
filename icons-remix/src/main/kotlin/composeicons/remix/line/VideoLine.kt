package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VideoLine: ImageVector
    get() {
        if (_videoLine != null) return _videoLine!!
        _videoLine = remixIcon(
            name = "VideoLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3.993C3 3.445 3.445 3 3.993 3h16.013c.549 0 .993 .445 .993 .993v16.013c0 .549-.445 .993-.993 .993h-16.013C3.445 21 3 20.555 3 20.007v-16.013ZM5 5v14h14v-14h-14ZM10.622 8.415l4.879 3.253c.184 .122 .233 .371 .111 .555-.029 .044-.067 .082-.111 .111l-4.879 3.253c-.184 .123-.432 .073-.555-.111C10.023 15.409 10 15.332 10 15.253v-6.505c0-.221 .179-.4 .4-.4 .079 0 .156 .023 .222 .067Z"),
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
        return _videoLine!!
    }

private var _videoLine: ImageVector? = null
