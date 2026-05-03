package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DownloadCloudFill: ImageVector
    get() {
        if (_downloadCloudFill != null) return _downloadCloudFill!!
        _downloadCloudFill = remixIcon(
            name = "DownloadCloudFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 20.981 C 3.644 20.726 1.000 17.922 1.000 14.500 C 1.000 12.172 2.224 10.129 4.064 8.981 C 4.565 5.044 7.927 2.000 12.000 2.000 C 16.073 2.000 19.435 5.044 19.936 8.981 C 21.776 10.129 23.000 12.172 23.000 14.500 C 23.000 17.922 20.356 20.726 17.000 20.981 L 17.000 21.000 L 7.000 21.000 L 7.000 20.981 ZM 13.000 12.000 L 13.000 8.000 L 11.000 8.000 L 11.000 12.000 L 8.000 12.000 L 12.000 17.000 L 16.000 12.000 L 13.000 12.000 Z"),
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
        return _downloadCloudFill!!
    }

private var _downloadCloudFill: ImageVector? = null
