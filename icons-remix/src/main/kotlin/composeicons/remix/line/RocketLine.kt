package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RocketLine: ImageVector
    get() {
        if (_rocketLine != null) return _rocketLine!!
        _rocketLine = remixIcon(
            name = "RocketLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 13C5 7.912 7.902 3.564 12 1.818c4.097 1.746 7 6.094 7 11.182 0 .823-.076 1.627-.221 2.403l1.94 1.833c.165 .156 .204 .404 .096 .603l-2.495 4.575c-.132 .242-.436 .332-.678 .2-.042-.023-.08-.052-.114-.085L15.292 20.293c-.188-.188-.442-.293-.707-.293h-5.172c-.265 0-.52 .105-.707 .293L6.472 22.527c-.195 .195-.512 .195-.707 0-.034-.034-.063-.072-.085-.114L3.184 17.838c-.109-.199-.069-.447 .096-.603L5.22 15.403c-.145-.776-.221-1.58-.221-2.403ZM6.475 19.696l.817-.817c.563-.563 1.326-.879 2.121-.879h5.172c.796 0 1.559 .316 2.121 .879l.817 .817 .982-1.8L17.406 16.857c-.494-.467-.717-1.152-.593-1.82 .124-.664 .187-1.345 .187-2.036 0-3.87-1.995-7.3-5-8.96C8.995 5.7 7 9.13 7 13c0 .691 .063 1.372 .187 2.036 .124 .668-.099 1.354-.593 1.82L5.494 17.896l.982 1.8ZM12 13c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.104 0 2 .895 2 2 0 1.105-.896 2-2 2Z"),
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
        return _rocketLine!!
    }

private var _rocketLine: ImageVector? = null
