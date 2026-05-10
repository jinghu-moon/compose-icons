package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UploadCloudFill: ImageVector
    get() {
        if (_uploadCloudFill != null) return _uploadCloudFill!!
        _uploadCloudFill = remixIcon(
            name = "UploadCloudFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 20.981C3.644 20.726 1 17.922 1 14.5 1 12.172 2.224 10.129 4.064 8.981 4.565 5.044 7.927 2 12 2c4.073 0 7.435 3.044 7.936 6.981C21.776 10.129 23 12.172 23 14.5c0 3.422-2.644 6.226-6 6.481v.019h-10v-.019ZM13 13h3L12 8 8 13h3v4h2v-4Z"),
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
        return _uploadCloudFill!!
    }

private var _uploadCloudFill: ImageVector? = null
