package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UserLocationLine: ImageVector
    get() {
        if (_userLocationLine != null) return _userLocationLine!!
        _userLocationLine = remixIcon(
            name = "UserLocationLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 14v2C8.686 16 6 18.686 6 22h-2c0-4.418 3.582-8 8-8ZM12 13C8.685 13 6 10.315 6 7 6 3.685 8.685 1 12 1c3.315 0 6 2.685 6 6 0 3.315-2.685 6-6 6ZM12 11c2.21 0 4-1.79 4-4C16 4.79 14.21 3 12 3 9.79 3 8 4.79 8 7c0 2.21 1.79 4 4 4ZM20.828 21.071 18 24 15.172 21.071c-1.562-1.618-1.562-4.24 0-5.858 1.562-1.618 4.095-1.618 5.657 0 1.562 1.618 1.562 4.24 0 5.858ZM19.39 19.682c.814-.843 .814-2.237 0-3.079-.776-.803-2.004-.803-2.779 0-.814 .843-.814 2.237 0 3.079L18 21.121l1.39-1.439Z"),
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
        return _userLocationLine!!
    }

private var _userLocationLine: ImageVector? = null
