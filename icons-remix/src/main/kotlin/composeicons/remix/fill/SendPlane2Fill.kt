package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SendPlane2Fill: ImageVector
    get() {
        if (_sendPlane2Fill != null) return _sendPlane2Fill!!
        _sendPlane2Fill = remixIcon(
            name = "SendPlane2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 13h6v-2h-6v-9.154c0-.276 .224-.5 .5-.5 .084 0 .167 .021 .241 .062L22.203 11.562c.242 .133 .33 .437 .197 .679-.046 .083-.114 .151-.197 .197L3.741 22.592c-.242 .133-.546 .045-.679-.197C3.021 22.321 3 22.239 3 22.154v-9.154Z"),
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
        return _sendPlane2Fill!!
    }

private var _sendPlane2Fill: ImageVector? = null
