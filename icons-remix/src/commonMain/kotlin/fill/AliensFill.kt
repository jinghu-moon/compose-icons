package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AliensFill: ImageVector
    get() {
        if (_aliensFill != null) return _aliensFill!!
        _aliensFill = remixIcon(
            name = "AliensFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 16.694 2.000 20.500 5.806 20.500 10.500 C 20.500 17.000 15.000 22.500 12.000 22.500 C 9.000 22.500 3.500 17.000 3.500 10.500 C 3.500 5.806 7.306 2.000 12.000 2.000 ZM 17.500 12.000 C 15.015 12.000 13.000 14.015 13.000 16.500 C 13.000 16.660 13.008 16.819 13.025 16.975 C 13.181 16.992 13.340 17.000 13.500 17.000 C 15.985 17.000 18.000 14.985 18.000 12.500 C 18.000 12.340 17.992 12.181 17.975 12.025 C 17.819 12.008 17.660 12.000 17.500 12.000 ZM 6.500 12.000 C 6.340 12.000 6.181 12.008 6.025 12.025 C 6.008 12.181 6.000 12.340 6.000 12.500 C 6.000 14.985 8.015 17.000 10.500 17.000 C 10.660 17.000 10.819 16.992 10.975 16.975 C 10.992 16.819 11.000 16.660 11.000 16.500 C 11.000 14.015 8.985 12.000 6.500 12.000 Z"),
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
        return _aliensFill!!
    }

private var _aliensFill: ImageVector? = null
