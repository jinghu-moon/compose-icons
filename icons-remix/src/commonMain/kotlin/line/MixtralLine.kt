package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MixtralLine: ImageVector
    get() {
        if (_mixtralLine != null) return _mixtralLine!!
        _mixtralLine = remixIcon(
            name = "MixtralLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 3.000 L 8.200 3.000 L 8.200 6.200 L 11.400 6.200 L 11.400 9.400 L 12.600 9.400 L 12.600 6.200 L 15.800 6.200 L 15.800 3.000 L 21.000 3.000 L 21.000 21.000 L 15.800 21.000 L 15.800 14.600 L 14.600 14.600 L 14.600 17.800 L 9.400 17.800 L 9.400 14.600 L 8.200 14.600 L 8.200 21.000 L 3.000 21.000 L 3.000 3.000 ZM 5.000 5.000 L 5.000 19.000 L 6.200 19.000 L 6.200 12.600 L 11.400 12.600 L 11.400 15.800 L 12.600 15.800 L 12.600 12.600 L 17.800 12.600 L 17.800 19.000 L 19.000 19.000 L 19.000 5.000 L 17.800 5.000 L 17.800 8.200 L 14.600 8.200 L 14.600 11.400 L 9.400 11.400 L 9.400 8.200 L 6.200 8.200 L 6.200 5.000 L 5.000 5.000 Z"),
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
        return _mixtralLine!!
    }

private var _mixtralLine: ImageVector? = null
