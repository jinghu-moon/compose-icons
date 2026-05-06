package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RemoteControl2Fill: ImageVector
    get() {
        if (_remoteControl2Fill != null) return _remoteControl2Fill!!
        _remoteControl2Fill = remixIcon(
            name = "RemoteControl2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 2c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-12C5.448 22 5 21.552 5 21v-18C5 2.448 5.448 2 6 2h12ZM15 15h-2v2h2v-2ZM11 15h-2v2h2v-2ZM13 6h-2v2h-2v2h1.999L11 12h2l-.001-2h2.001v-2h-2v-2Z"),
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
        return _remoteControl2Fill!!
    }

private var _remoteControl2Fill: ImageVector? = null
