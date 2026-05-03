package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MenFill: ImageVector
    get() {
        if (_menFill != null) return _menFill!!
        _menFill = remixIcon(
            name = "MenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.586 5.000 L 14.000 5.000 L 14.000 3.000 L 22.000 3.000 L 22.000 11.000 L 20.000 11.000 L 20.000 6.414 L 16.463 9.951 C 17.427 11.213 18.000 12.790 18.000 14.500 C 18.000 18.642 14.642 22.000 10.500 22.000 C 6.358 22.000 3.000 18.642 3.000 14.500 C 3.000 10.358 6.358 7.000 10.500 7.000 C 12.210 7.000 13.787 7.573 15.049 8.537 L 18.586 5.000 Z"),
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
        return _menFill!!
    }

private var _menFill: ImageVector? = null
