package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Building2Line: ImageVector
    get() {
        if (_building2Line != null) return _building2Line!!
        _building2Line = remixIcon(
            name = "Building2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 19.000 L 3.000 5.700 C 3.000 5.280 3.263 4.904 3.658 4.761 L 13.329 1.244 C 13.589 1.150 13.875 1.283 13.970 1.543 C 13.990 1.598 14.000 1.656 14.000 1.714 L 14.000 6.667 L 20.316 8.772 C 20.725 8.908 21.000 9.290 21.000 9.721 L 21.000 19.000 L 23.000 19.000 L 23.000 21.000 L 1.000 21.000 L 1.000 19.000 L 3.000 19.000 ZM 5.000 19.000 L 12.000 19.000 L 12.000 3.855 L 5.000 6.401 L 5.000 19.000 ZM 19.000 19.000 L 19.000 10.442 L 14.000 8.775 L 14.000 19.000 L 19.000 19.000 Z"),
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
        return _building2Line!!
    }

private var _building2Line: ImageVector? = null
