package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ServiceLine: ImageVector
    get() {
        if (_serviceLine != null) return _serviceLine!!
        _serviceLine = remixIcon(
            name = "ServiceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.161 4.469C5.585 2.045 9.447 1.936 12.001 4.141c2.552-2.205 6.414-2.096 8.838 .328 2.42 2.42 2.533 6.272 .34 8.826l-7.764 7.791c-.746 .746-1.933 .779-2.719 .102l-.109-.102L2.821 13.295C.628 10.741 .742 6.888 3.161 4.469ZM4.575 5.883C2.868 7.59 2.819 10.328 4.429 12.094l.146 .153L12 19.671l5.303-5.304L13.768 10.833l-1.061 1.061c-1.172 1.172-3.071 1.172-4.243 0C7.293 10.722 7.293 8.822 8.464 7.651L10.566 5.548C8.853 4.177 6.371 4.24 4.729 5.737l-.153 .146ZM13.061 8.711c.391-.391 1.024-.391 1.414 0l4.242 4.242 .708-.706c1.757-1.757 1.757-4.607 0-6.364C17.717 4.176 14.98 4.127 13.214 5.737l-.153 .146L9.879 9.065c-.363 .363-.389 .934-.078 1.327l.078 .087c.363 .363 .934 .388 1.327 .078l.087-.078L13.061 8.711Z"),
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
        return _serviceLine!!
    }

private var _serviceLine: ImageVector? = null
