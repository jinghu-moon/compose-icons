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
                pathData = parseSvgPathData("M 1.000 14.500 C 1.000 12.172 2.224 10.129 4.064 8.981 C 4.565 5.044 7.927 2.000 12.000 2.000 C 16.073 2.000 19.435 5.044 19.936 8.981 C 21.776 10.129 23.000 12.172 23.000 14.500 C 23.000 17.922 20.356 20.726 17.000 20.981 L 7.000 21.000 C 3.644 20.726 1.000 17.922 1.000 14.500 ZM 16.848 18.987 C 19.182 18.809 21.000 16.856 21.000 14.500 C 21.000 12.927 20.188 11.496 18.877 10.678 L 18.071 10.175 L 17.952 9.233 C 17.573 6.258 15.029 4.000 12.000 4.000 C 8.971 4.000 6.426 6.258 6.048 9.233 L 5.929 10.175 L 5.123 10.678 C 3.812 11.496 3.000 12.927 3.000 14.500 C 3.000 16.856 4.818 18.809 7.152 18.987 L 7.325 19.000 L 16.675 19.000 L 16.848 18.987 ZM 13.000 13.000 L 13.000 17.000 L 11.000 17.000 L 11.000 13.000 L 8.000 13.000 L 12.000 8.000 L 16.000 13.000 L 13.000 13.000 Z"),
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
