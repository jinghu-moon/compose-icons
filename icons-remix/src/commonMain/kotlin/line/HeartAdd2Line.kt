package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HeartAdd2Line: ImageVector
    get() {
        if (_heartAdd2Line != null) return _heartAdd2Line!!
        _heartAdd2Line = remixIcon(
            name = "HeartAdd2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 9.000 C 4.000 6.492 5.714 5.000 7.500 5.000 C 9.406 5.000 10.754 6.582 12.000 7.828 C 13.246 6.582 14.594 5.000 16.500 5.000 C 18.316 5.000 20.000 6.484 20.000 9.000 C 20.000 10.122 19.764 11.150 19.351 12.102 L 21.186 12.898 C 21.701 11.711 22.000 10.413 22.000 9.000 C 22.000 5.496 19.534 3.000 16.500 3.000 C 14.590 3.000 13.146 3.985 12.000 5.028 C 10.854 3.985 9.410 3.000 7.500 3.000 C 4.504 3.000 2.000 5.496 2.000 9.000 C 2.000 12.020 3.362 14.470 5.203 16.445 C 7.033 18.407 9.385 19.955 11.492 21.198 L 12.508 19.476 C 10.441 18.256 8.293 16.826 6.666 15.081 C 5.051 13.349 4.000 11.363 4.000 9.000 ZM 19.000 17.000 L 19.000 14.000 L 17.000 14.000 L 17.000 17.000 L 14.000 17.000 L 14.000 19.000 L 16.999 19.000 L 17.000 22.000 L 19.000 22.000 L 18.999 19.000 L 22.000 19.000 L 22.000 17.000 L 19.000 17.000 Z"),
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
        return _heartAdd2Line!!
    }

private var _heartAdd2Line: ImageVector? = null
