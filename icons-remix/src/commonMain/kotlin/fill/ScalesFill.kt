package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ScalesFill: ImageVector
    get() {
        if (_scalesFill != null) return _scalesFill!!
        _scalesFill = remixIcon(
            name = "ScalesFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.998 2.000 L 12.998 3.000 L 19.998 3.000 L 19.998 5.000 L 12.998 5.000 L 12.998 19.000 L 16.998 19.000 L 16.998 21.000 L 6.998 21.000 L 6.998 19.000 L 10.998 19.000 L 10.998 5.000 L 3.998 5.000 L 3.998 3.000 L 10.998 3.000 L 10.998 2.000 L 12.998 2.000 ZM 4.998 6.343 L 7.826 9.172 C 8.550 9.895 8.998 10.895 8.998 12.000 C 8.998 14.209 7.207 16.000 4.998 16.000 C 2.789 16.000 0.998 14.209 0.998 12.000 C 0.998 10.895 1.446 9.895 2.170 9.172 L 4.998 6.343 ZM 18.998 6.343 L 21.826 9.172 C 22.550 9.895 22.998 10.895 22.998 12.000 C 22.998 14.209 21.207 16.000 18.998 16.000 C 16.789 16.000 14.998 14.209 14.998 12.000 C 14.998 10.895 15.446 9.895 16.170 9.172 L 18.998 6.343 ZM 18.998 9.172 L 17.584 10.586 C 17.210 10.960 16.998 11.461 16.998 12.000 L 20.998 12.001 C 20.998 11.461 20.786 10.960 20.412 10.586 L 18.998 9.172 ZM 4.998 9.172 L 3.584 10.586 C 3.210 10.960 2.998 11.461 2.998 12.000 L 6.998 12.001 C 6.998 11.461 6.786 10.960 6.412 10.586 L 4.998 9.172 Z"),
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
        return _scalesFill!!
    }

private var _scalesFill: ImageVector? = null
