package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WindowsFill: ImageVector
    get() {
        if (_windowsFill != null) return _windowsFill!!
        _windowsFill = remixIcon(
            name = "WindowsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.001 5.479 L 10.378 4.463 L 10.378 11.590 L 3.001 11.590 L 3.001 5.479 ZM 3.001 18.521 L 10.378 19.538 L 10.378 12.498 L 3.001 12.498 L 3.001 18.521 ZM 11.189 19.646 L 21.001 21.000 L 21.001 12.498 L 11.189 12.498 L 11.189 19.646 ZM 11.189 4.354 L 11.189 11.590 L 21.001 11.590 L 21.001 3.000 L 11.189 4.354 Z"),
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
        return _windowsFill!!
    }

private var _windowsFill: ImageVector? = null
