package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EjectLine: ImageVector
    get() {
        if (_ejectLine != null) return _ejectLine!!
        _ejectLine = remixIcon(
            name = "EjectLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.737 13h8.526L12 6.606 7.737 13ZM12.416 3.624l7.066 10.599c.153 .23 .091 .54-.139 .693-.082 .055-.179 .084-.277 .084h-14.131c-.276 0-.5-.224-.5-.5 0-.099 .029-.195 .084-.277L11.584 3.624c.153-.23 .464-.292 .693-.139 .055 .037 .102 .084 .139 .139ZM5 17h14c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-14C4.448 19 4 18.552 4 18c0-.552 .448-1 1-1Z"),
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
        return _ejectLine!!
    }

private var _ejectLine: ImageVector? = null
