package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CpuFill: ImageVector
    get() {
        if (_cpuFill != null) return _cpuFill!!
        _cpuFill = remixIcon(
            name = "CpuFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 20.000 L 10.000 20.000 L 10.000 22.000 L 8.000 22.000 L 8.000 20.000 L 5.000 20.000 C 4.448 20.000 4.000 19.552 4.000 19.000 L 4.000 16.000 L 2.000 16.000 L 2.000 14.000 L 4.000 14.000 L 4.000 10.000 L 2.000 10.000 L 2.000 8.000 L 4.000 8.000 L 4.000 5.000 C 4.000 4.448 4.448 4.000 5.000 4.000 L 8.000 4.000 L 8.000 2.000 L 10.000 2.000 L 10.000 4.000 L 14.000 4.000 L 14.000 2.000 L 16.000 2.000 L 16.000 4.000 L 19.000 4.000 C 19.552 4.000 20.000 4.448 20.000 5.000 L 20.000 8.000 L 22.000 8.000 L 22.000 10.000 L 20.000 10.000 L 20.000 14.000 L 22.000 14.000 L 22.000 16.000 L 20.000 16.000 L 20.000 19.000 C 20.000 19.552 19.552 20.000 19.000 20.000 L 16.000 20.000 L 16.000 22.000 L 14.000 22.000 L 14.000 20.000 ZM 7.000 7.000 L 7.000 11.000 L 11.000 11.000 L 11.000 7.000 L 7.000 7.000 Z"),
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
        return _cpuFill!!
    }

private var _cpuFill: ImageVector? = null
