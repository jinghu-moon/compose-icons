package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NotionLine: ImageVector
    get() {
        if (_notionLine != null) return _notionLine!!
        _notionLine = remixIcon(
            name = "NotionLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.285 2.955c-.357-.238-.784-.347-1.211-.31L4.015 3.606c-.511 .044-.903 .472-.903 .985v11.575c0 .409 .133 .806 .378 1.133l2.767 3.689c.203 .27 .53 .418 .867 .393l12.853-.989c.515-.04 .913-.469 .913-.986v-12.881c0-.314-.157-.607-.418-.781L16.285 2.955ZM15.228 4.416c.025-.002 .05 .004 .071 .018l2.746 1.831L7.839 7.081 5.978 5.22l9.25-.804ZM19.111 18.677 8.389 19.502v-10.681L19.111 7.963v10.714ZM4.889 6.646 6.611 8.368v10.132L4.911 16.233c-.014-.019-.022-.043-.022-.067v-9.521ZM11.979 10.123l-1.976 .13v7.562l1.996-.131v-4.337l3.512 4.169 1.976-.129v-7.562l-1.996 .131v4.337L11.979 10.123Z"),
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
        return _notionLine!!
    }

private var _notionLine: ImageVector? = null
