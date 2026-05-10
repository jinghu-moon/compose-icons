package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CameraAiFill: ImageVector
    get() {
        if (_cameraAiFill != null) return _cameraAiFill!!
        _cameraAiFill = remixIcon(
            name = "CameraAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.713 8.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C18.847 7.119 18.056 6.316 17.068 5.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251ZM22 20v-9.341c-.626 .221-1.299 .341-2 .341-.925 0-1.801-.209-2.583-.583 .374 .782 .583 1.658 .583 2.583 0 3.314-2.686 6-6 6C8.686 19 6 16.314 6 13 6 9.686 8.686 7 12 7c.925 0 1.801 .209 2.583 .583C14.209 6.801 14 5.925 14 5c0-.701 .12-1.374 .341-2h-5.341L7 5h-4C2.448 5 2 5.448 2 6v14c0 .552 .448 1 1 1h18c.552 0 1-.448 1-1ZM12 17C9.791 17 8 15.209 8 13 8 10.791 9.791 9 12 9c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4Z"),
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
        return _cameraAiFill!!
    }

private var _cameraAiFill: ImageVector? = null
