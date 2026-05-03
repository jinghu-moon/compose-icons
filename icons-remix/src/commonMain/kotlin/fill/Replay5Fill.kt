package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Replay5Fill: ImageVector
    get() {
        if (_replay5Fill != null) return _replay5Fill!!
        _replay5Fill = remixIcon(
            name = "Replay5Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 8.984 2.000 6.280 3.335 4.447 5.446 L 2.000 3.000 L 2.000 9.000 L 8.000 9.000 L 5.865 6.865 C 7.332 5.114 9.536 4.000 12.000 4.000 C 16.418 4.000 20.000 7.582 20.000 12.000 C 20.000 16.418 16.418 20.000 12.000 20.000 C 7.582 20.000 4.000 16.418 4.000 12.000 L 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 ZM 14.500 10.000 L 14.500 8.500 L 9.500 8.500 L 9.500 12.750 L 12.625 12.750 C 12.970 12.750 13.250 13.030 13.250 13.375 C 13.250 13.720 12.970 14.000 12.625 14.000 L 9.500 14.000 L 9.500 15.500 L 12.625 15.500 C 13.799 15.500 14.750 14.549 14.750 13.375 C 14.750 12.201 13.799 11.250 12.625 11.250 L 11.000 11.250 L 11.000 10.000 L 14.500 10.000 Z"),
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
        return _replay5Fill!!
    }

private var _replay5Fill: ImageVector? = null
