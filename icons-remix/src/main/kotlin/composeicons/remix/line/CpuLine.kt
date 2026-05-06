package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CpuLine: ImageVector
    get() {
        if (_cpuLine != null) return _cpuLine!!
        _cpuLine = remixIcon(
            name = "CpuLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 18h12v-12h-12v12ZM14 20h-4v2h-2v-2h-3C4.448 20 4 19.552 4 19v-3h-2v-2h2v-4h-2v-2h2v-3C4 4.448 4.448 4 5 4h3v-2h2v2h4v-2h2v2h3c.552 0 1 .448 1 1v3h2v2h-2v4h2v2h-2v3c0 .552-.448 1-1 1h-3v2h-2v-2ZM8 8h8v8h-8v-8Z"),
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
        return _cpuLine!!
    }

private var _cpuLine: ImageVector? = null
