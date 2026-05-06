package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.YoutubeLine: ImageVector
    get() {
        if (_youtubeLine != null) return _youtubeLine!!
        _youtubeLine = remixIcon(
            name = "YoutubeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.607 6.995c-.076-.298-.292-.523-.538-.592C18.63 6.281 16.501 6 12.001 6 7.501 6 5.373 6.281 4.932 6.403c-.244 .068-.46 .293-.537 .592C4.286 7.419 4.001 9.196 4.001 12c0 2.804 .285 4.581 .394 5.006 .076 .297 .291 .521 .537 .59 .44 .122 2.568 .403 7.068 .403 4.5 0 6.629-.281 7.069-.403 .244-.068 .46-.293 .537-.592 .109-.424 .394-2.205 .394-5.005 0-2.8-.285-4.581-.394-5.005ZM21.544 6.498c.457 1.782 .457 5.502 .457 5.502 0 0 0 3.72-.457 5.502-.255 .986-.997 1.76-1.939 2.022C17.897 20 12.001 20 12.001 20c0 0-5.893 0-7.605-.476C3.451 19.258 2.709 18.484 2.458 17.502 2.001 15.72 2.001 12 2.001 12c0 0 0-3.72 .457-5.502C2.712 5.513 3.455 4.738 4.396 4.476 6.108 4 12.001 4 12.001 4c0 0 5.896 0 7.605 .476 .945 .265 1.688 1.04 1.939 2.022ZM10.001 15.5v-7L16.001 12l-6 3.5Z"),
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
        return _youtubeLine!!
    }

private var _youtubeLine: ImageVector? = null
