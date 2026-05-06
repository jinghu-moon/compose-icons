package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AlibabaCloudLine: ImageVector
    get() {
        if (_alibabaCloudLine != null) return _alibabaCloudLine!!
        _alibabaCloudLine = remixIcon(
            name = "AlibabaCloudLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 5C2.791 5 1 6.791 1 9v6c0 2.209 1.791 4 4 4h4L8 17h-3C3.895 17 3 16.105 3 15v-6C3 7.895 3.895 7 5 7h3L9 5h-4ZM16 7h3c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-3l-1 2h4c2.209 0 4-1.791 4-4v-6C23 6.791 21.209 5 19 5h-4l1 2ZM8 13h8v-2h-8v2Z"),
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
        return _alibabaCloudLine!!
    }

private var _alibabaCloudLine: ImageVector? = null
