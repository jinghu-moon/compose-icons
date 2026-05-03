package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CameraSwitchFill: ImageVector
    get() {
        if (_cameraSwitchFill != null) return _cameraSwitchFill!!
        _cameraSwitchFill = remixIcon(
            name = "CameraSwitchFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 3.000 L 15.000 3.000 L 17.000 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 6.000 C 2.000 5.448 2.448 5.000 3.000 5.000 L 7.000 5.000 L 9.000 3.000 ZM 14.684 18.368 L 13.789 16.579 C 13.251 16.848 12.643 17.000 12.000 17.000 C 9.791 17.000 8.000 15.209 8.000 13.000 L 10.000 13.000 L 7.839 8.677 C 6.705 9.769 6.000 11.302 6.000 13.000 C 6.000 16.314 8.686 19.000 12.000 19.000 C 12.965 19.000 13.876 18.772 14.684 18.368 ZM 9.316 7.632 L 10.211 9.422 C 10.749 9.152 11.357 9.000 12.000 9.000 C 14.209 9.000 16.000 10.791 16.000 13.000 L 14.000 13.000 L 16.161 17.323 C 17.295 16.231 18.000 14.698 18.000 13.000 C 18.000 9.686 15.314 7.000 12.000 7.000 C 11.035 7.000 10.124 7.228 9.316 7.632 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _cameraSwitchFill!!
    }

private var _cameraSwitchFill: ImageVector? = null
