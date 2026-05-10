package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AlibabaCloudFill: ImageVector
    get() {
        if (_alibabaCloudFill != null) return _alibabaCloudFill!!
        _alibabaCloudFill = remixIcon(
            name = "AlibabaCloudFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.514 5.14h-4.835c-.976 0-1.912 .388-2.602 1.078C1.388 6.908 1 7.844 1 8.82v6.358c0 .976 .388 1.912 1.078 2.602 .69 .69 1.626 1.078 2.602 1.078h4.85L8.359 17.201 4.823 16.12c-.312-.099-.584-.296-.776-.56-.193-.265-.296-.584-.294-.911v-5.276c-.003-.328 .1-.647 .293-.912 .193-.265 .465-.461 .778-.559L8.359 6.796 9.514 5.14ZM19.339 5.14h-4.85l1.17 1.656 3.536 1.104c.312 .099 .584 .295 .776 .56 .192 .265 .294 .585 .291 .912v5.276c.002 .327-.1 .646-.292 .911-.192 .265-.464 .461-.775 .561l-3.536 1.082-1.17 1.656h4.85c.483 0 .96-.094 1.406-.279 .446-.185 .85-.456 1.191-.798 .34-.342 .61-.748 .792-1.194 .183-.447 .275-.925 .272-1.407v-6.358c0-.973-.385-1.906-1.071-2.595C21.243 5.535 20.312 5.145 19.339 5.14ZM15.667 11.138h-7.33v1.652h7.33v-1.652Z"),
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
        return _alibabaCloudFill!!
    }

private var _alibabaCloudFill: ImageVector? = null
