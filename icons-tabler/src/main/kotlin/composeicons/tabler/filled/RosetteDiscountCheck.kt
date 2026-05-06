package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.RosetteDiscountCheck: ImageVector
    get() {
        if (_rosetteDiscountCheck != null) return _rosetteDiscountCheck!!
        _rosetteDiscountCheck = tablerFilledIcon(
            name = "RosetteDiscountCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.01 2.011c.778 0 1.529 .283 2.113 .797l.154 .145 .698 .698c.192 .19 .442 .31 .71 .341L15.82 4h1c1.697-0 3.099 1.324 3.195 3.018l.005 .182v1c0 .27 .092 .533 .258 .743l.09 .1 .697 .698c1.199 1.192 1.264 3.112 .147 4.382l-.145 .154-.698 .698c-.19 .192-.31 .442-.341 .71l-.008 .135v1c0 1.697-1.324 3.099-3.018 3.195l-.182 .005h-1c-.27 0-.531 .091-.743 .258l-.1 .09-.698 .697c-1.192 1.199-3.112 1.264-4.382 .147l-.154-.145-.698-.698c-.192-.19-.442-.31-.71-.341l-.135-.008h-1C5.503 20.02 4.101 18.696 4.005 17.002L4 16.82v-1c-0-.27-.091-.531-.258-.743l-.09-.1-.697-.698C1.756 13.087 1.691 11.167 2.808 9.897l.145-.154 .698-.698c.19-.192 .31-.442 .341-.71L4 8.2v-1l.005-.182C4.097 5.394 5.394 4.097 7.018 4.005L7.2 4h1c.27-0 .531-.091 .743-.258l.1-.09 .698-.697c.601-.604 1.417-.944 2.269-.944ZM15.707 9.293c-.391-.39-1.023-.39-1.414 0L11 12.585 9.707 11.293l-.094-.083c-.417-.323-1.013-.266-1.362 .13-.349 .395-.33 .994 .042 1.367l2 2 .094 .083c.398 .309 .964 .273 1.32-.083l4-4 .083-.094c.309-.398 .273-.964-.083-1.32Z"),
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
        return _rosetteDiscountCheck!!
    }

private var _rosetteDiscountCheck: ImageVector? = null
