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
                pathData = parseSvgPathData("M 3.000 13.000 L 9.000 13.000 L 9.000 11.000 L 3.000 11.000 L 3.000 1.846 C 3.000 1.569 3.224 1.346 3.500 1.346 C 3.584 1.346 3.667 1.367 3.741 1.407 L 22.203 11.562 C 22.445 11.695 22.534 11.999 22.401 12.241 C 22.355 12.324 22.287 12.392 22.203 12.438 L 3.741 22.592 C 3.499 22.726 3.195 22.637 3.062 22.395 C 3.021 22.321 3.000 22.239 3.000 22.154 L 3.000 13.000 Z"),
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
