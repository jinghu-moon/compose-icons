package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MagicFill: ImageVector
    get() {
        if (_magicFill != null) return _magicFill!!
        _magicFill = remixIcon(
            name = "MagicFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.224 15.508l-2.213 4.65c-.142 .299-.5 .426-.8 .284-.067-.032-.127-.075-.178-.129L8.492 16.574c-.095-.1-.221-.165-.358-.182L3.028 15.724c-.329-.043-.56-.344-.517-.673 .01-.073 .033-.144 .068-.209L5.04 10.319c.066-.121 .088-.261 .063-.397L4.16 4.86c-.061-.326 .154-.639 .48-.7 .073-.014 .147-.014 .22 0l5.063 .943c.136 .025 .276 .003 .397-.063L14.842 2.579c.291-.158 .656-.051 .814 .24 .035 .065 .058 .136 .068 .209l.667 5.106c.018 .137 .082 .263 .182 .358l3.739 3.541c.241 .228 .251 .608 .023 .848-.051 .054-.111 .097-.178 .129l-4.65 2.213c-.125 .059-.225 .16-.284 .284ZM16.021 17.435l1.414-1.414 4.243 4.243-1.414 1.414L16.021 17.435Z"),
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
        return _magicFill!!
    }

private var _magicFill: ImageVector? = null
