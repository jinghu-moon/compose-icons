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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3h5.2v3.2l3.2 0v3.2l1.2 0 0-3.2h3.2v-3.2h5.2v18h-5.2v-6.4l-1.2-0v3.2h-5.2v-3.2L8.2 14.6v6.4h-5.2v-18ZM5 5v14h1.2v-6.4l5.2 0v3.2h1.2v-3.2l5.2 0v6.4h1.2v-14h-1.2v3.2h-3.2l-0 3.2L9.4 11.4v-3.2L6.2 8.2v-3.2h-1.2Z"),
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
        return _mixtralLine!!
    }

private var _mixtralLine: ImageVector? = null
