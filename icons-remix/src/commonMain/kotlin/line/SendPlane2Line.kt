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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.500 1.346 C 3.584 1.346 3.667 1.367 3.741 1.407 L 22.203 11.562 C 22.445 11.695 22.534 11.999 22.401 12.241 C 22.355 12.324 22.287 12.392 22.203 12.438 L 3.741 22.592 C 3.499 22.726 3.195 22.637 3.062 22.395 C 3.021 22.321 3.000 22.239 3.000 22.154 L 3.000 1.846 C 3.000 1.569 3.224 1.346 3.500 1.346 ZM 5.000 4.382 L 5.000 11.000 L 10.000 11.000 L 10.000 13.000 L 5.000 13.000 L 5.000 19.617 L 18.850 12.000 L 5.000 4.382 Z"),
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
        return _sendPlane2Line!!
    }

private var _sendPlane2Line: ImageVector? = null
