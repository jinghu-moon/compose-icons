package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Replay10Fill: ImageVector
    get() {
        if (_replay10Fill != null) return _replay10Fill!!
        _replay10Fill = remixIcon(
            name = "Replay10Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 L 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 9.536 4.000 7.332 5.114 5.865 6.865 L 8.000 9.000 L 2.000 9.000 L 2.000 3.000 L 4.447 5.446 C 6.280 3.335 8.984 2.000 12.000 2.000 ZM 14.500 8.250 C 13.119 8.250 12.000 9.369 12.000 10.750 L 12.000 13.250 C 12.000 14.631 13.119 15.750 14.500 15.750 C 15.881 15.750 17.000 14.631 17.000 13.250 L 17.000 10.750 C 17.000 9.369 15.881 8.250 14.500 8.250 ZM 15.500 10.750 L 15.500 13.250 C 15.500 13.802 15.052 14.250 14.500 14.250 C 13.948 14.250 13.500 13.802 13.500 13.250 L 13.500 10.750 C 13.500 10.198 13.948 9.750 14.500 9.750 C 15.052 9.750 15.500 10.198 15.500 10.750 ZM 10.000 8.500 L 8.500 8.500 L 8.500 15.500 L 10.000 15.500 L 10.000 8.500 Z"),
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
        return _replay10Fill!!
    }

private var _replay10Fill: ImageVector? = null
