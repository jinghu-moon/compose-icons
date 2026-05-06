package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RemoteControl2Line: ImageVector
    get() {
        if (_remoteControl2Line != null) return _remoteControl2Line!!
        _remoteControl2Line = remixIcon(
            name = "RemoteControl2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 2c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-12C5.448 22 5 21.552 5 21v-18C5 2.448 5.448 2 6 2h12ZM17 4h-10v16h10v-16ZM15 15v2h-2v-2h2ZM11 15v2h-2v-2h2ZM13 6v2h2v2h-2.001L13 12h-2l-.001-2h-1.999v-2h2v-2h2Z"),
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
        return _remoteControl2Line!!
    }

private var _remoteControl2Line: ImageVector? = null
