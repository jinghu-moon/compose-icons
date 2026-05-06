package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UploadCloudLine: ImageVector
    get() {
        if (_uploadCloudLine != null) return _uploadCloudLine!!
        _uploadCloudLine = remixIcon(
            name = "UploadCloudLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1 14.5C1 12.172 2.224 10.129 4.064 8.981 4.565 5.044 7.927 2 12 2c4.073 0 7.435 3.044 7.936 6.981C21.776 10.129 23 12.172 23 14.5c0 3.422-2.644 6.226-6 6.481L7 21C3.644 20.726 1 17.922 1 14.5ZM16.848 18.987C19.182 18.809 21 16.856 21 14.5c0-1.573-.812-3.004-2.123-3.822l-.806-.503-.12-.942C17.573 6.258 15.029 4 12 4 8.971 4 6.426 6.258 6.048 9.233l-.12 .942-.806 .503C3.812 11.496 3 12.927 3 14.5c0 2.356 1.818 4.309 4.152 4.487L7.325 19h9.35l.173-.013ZM13 13v4h-2v-4h-3L12 8l4 5h-3Z"),
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
        return _uploadCloudLine!!
    }

private var _uploadCloudLine: ImageVector? = null
