package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Scan2Fill: ImageVector
    get() {
        if (_scan2Fill != null) return _scan2Fill!!
        _scan2Fill = remixIcon(
            name = "Scan2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.257 5.671 L 6.394 7.808 C 5.518 8.976 5.000 10.428 5.000 12.000 C 5.000 15.866 8.134 19.000 12.000 19.000 C 15.866 19.000 19.000 15.866 19.000 12.000 C 19.000 8.134 15.866 5.000 12.000 5.000 C 10.428 5.000 8.976 5.518 7.808 6.394 L 5.671 4.257 C 7.395 2.846 9.599 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 9.599 2.846 7.395 4.257 5.671 ZM 7.828 9.243 L 12.000 13.414 L 13.414 12.000 L 9.243 7.828 C 10.033 7.305 10.981 7.000 12.000 7.000 C 14.761 7.000 17.000 9.239 17.000 12.000 C 17.000 14.761 14.761 17.000 12.000 17.000 C 9.239 17.000 7.000 14.761 7.000 12.000 C 7.000 10.981 7.305 10.033 7.828 9.243 Z"),
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
        return _scan2Fill!!
    }

private var _scan2Fill: ImageVector? = null
