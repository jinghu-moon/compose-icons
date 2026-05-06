package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SendPlane2Line: ImageVector
    get() {
        if (_sendPlane2Line != null) return _sendPlane2Line!!
        _sendPlane2Line = remixIcon(
            name = "SendPlane2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.5 1.346c.084 0 .167 .021 .241 .062L22.203 11.562c.242 .133 .33 .437 .197 .679-.046 .083-.114 .151-.197 .197L3.741 22.592c-.242 .133-.546 .045-.679-.197C3.021 22.321 3 22.239 3 22.154v-20.309c0-.276 .224-.5 .5-.5ZM5 4.382v6.617h5v2h-5v6.617L18.85 12 5 4.382Z"),
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
        return _sendPlane2Line!!
    }

private var _sendPlane2Line: ImageVector? = null
