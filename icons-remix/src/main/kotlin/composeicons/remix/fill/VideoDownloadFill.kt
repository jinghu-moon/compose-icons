package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VideoDownloadFill: ImageVector
    get() {
        if (_videoDownloadFill != null) return _videoDownloadFill!!
        _videoDownloadFill = remixIcon(
            name = "VideoDownloadFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 4c.552 0 1 .448 1 1v4.2L22.213 5.551c.226-.158 .538-.103 .696 .123 .059 .084 .09 .184 .09 .287v12.079c0 .276-.224 .5-.5 .5-.103 0-.203-.032-.287-.09L17 14.8v4.2c0 .552-.448 1-1 1h-14C1.448 20 1 19.552 1 19v-14C1 4.448 1.448 4 2 4h14ZM10 8h-2v4h-3l4 4 4-4h-3v-4Z"),
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
        return _videoDownloadFill!!
    }

private var _videoDownloadFill: ImageVector? = null
