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
                pathData = parseSvgPathData("M 18.000 2.000 C 18.552 2.000 19.000 2.448 19.000 3.000 L 19.000 21.000 C 19.000 21.552 18.552 22.000 18.000 22.000 L 6.000 22.000 C 5.448 22.000 5.000 21.552 5.000 21.000 L 5.000 3.000 C 5.000 2.448 5.448 2.000 6.000 2.000 L 18.000 2.000 ZM 15.000 15.000 L 13.000 15.000 L 13.000 17.000 L 15.000 17.000 L 15.000 15.000 ZM 11.000 15.000 L 9.000 15.000 L 9.000 17.000 L 11.000 17.000 L 11.000 15.000 ZM 13.000 6.000 L 11.000 6.000 L 11.000 8.000 L 9.000 8.000 L 9.000 10.000 L 10.999 10.000 L 11.000 12.000 L 13.000 12.000 L 12.999 10.000 L 15.000 10.000 L 15.000 8.000 L 13.000 8.000 L 13.000 6.000 Z"),
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
