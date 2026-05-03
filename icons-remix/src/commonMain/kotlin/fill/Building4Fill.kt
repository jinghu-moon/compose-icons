package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Building4Fill: ImageVector
    get() {
        if (_building4Fill != null) return _building4Fill!!
        _building4Fill = remixIcon(
            name = "Building4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 20.000 L 23.000 20.000 L 23.000 22.000 L 1.000 22.000 L 1.000 20.000 L 3.000 20.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 20.000 ZM 8.000 11.000 L 8.000 13.000 L 11.000 13.000 L 11.000 11.000 L 8.000 11.000 ZM 8.000 7.000 L 8.000 9.000 L 11.000 9.000 L 11.000 7.000 L 8.000 7.000 ZM 8.000 15.000 L 8.000 17.000 L 11.000 17.000 L 11.000 15.000 L 8.000 15.000 ZM 13.000 15.000 L 13.000 17.000 L 16.000 17.000 L 16.000 15.000 L 13.000 15.000 ZM 13.000 11.000 L 13.000 13.000 L 16.000 13.000 L 16.000 11.000 L 13.000 11.000 ZM 13.000 7.000 L 13.000 9.000 L 16.000 9.000 L 16.000 7.000 L 13.000 7.000 Z"),
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
        return _building4Fill!!
    }

private var _building4Fill: ImageVector? = null
