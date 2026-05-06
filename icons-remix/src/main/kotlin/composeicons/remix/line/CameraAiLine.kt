package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CameraAiLine: ImageVector
    get() {
        if (_cameraAiLine != null) return _cameraAiLine!!
        _cameraAiLine = remixIcon(
            name = "CameraAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.713 8.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C18.847 7.119 18.056 6.316 17.068 5.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251ZM9 3h5v2h-4.172l-2 2h-3.828v12h16v-8h2v9c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-14C2 5.448 2.448 5 3 5h4L9 3ZM12 18C8.962 18 6.5 15.538 6.5 12.5 6.5 9.462 8.962 7 12 7c3.038 0 5.5 2.462 5.5 5.5C17.5 15.538 15.038 18 12 18ZM12 16c1.933 0 3.5-1.567 3.5-3.5C15.5 10.567 13.933 9 12 9 10.067 9 8.5 10.567 8.5 12.5 8.5 14.433 10.067 16 12 16Z"),
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
        return _cameraAiLine!!
    }

private var _cameraAiLine: ImageVector? = null
