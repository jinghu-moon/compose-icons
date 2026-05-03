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
                pathData = parseSvgPathData("M 5.000 5.000 C 2.791 5.000 1.000 6.791 1.000 9.000 L 1.000 15.000 C 1.000 17.209 2.791 19.000 5.000 19.000 L 9.000 19.000 L 8.000 17.000 L 5.000 17.000 C 3.895 17.000 3.000 16.105 3.000 15.000 L 3.000 9.000 C 3.000 7.895 3.895 7.000 5.000 7.000 L 8.000 7.000 L 9.000 5.000 L 5.000 5.000 ZM 16.000 7.000 L 19.000 7.000 C 20.105 7.000 21.000 7.895 21.000 9.000 L 21.000 15.000 C 21.000 16.105 20.105 17.000 19.000 17.000 L 16.000 17.000 L 15.000 19.000 L 19.000 19.000 C 21.209 19.000 23.000 17.209 23.000 15.000 L 23.000 9.000 C 23.000 6.791 21.209 5.000 19.000 5.000 L 15.000 5.000 L 16.000 7.000 ZM 8.000 13.000 L 16.000 13.000 L 16.000 11.000 L 8.000 11.000 L 8.000 13.000 Z"),
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
