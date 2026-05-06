package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SensorLine: ImageVector
    get() {
        if (_sensorLine != null) return _sensorLine!!
        _sensorLine = remixIcon(
            name = "SensorLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 8v11h12v-11h-3v-6h2v4h5v2h-2v12c0 .552-.448 1-1 1h-14C4.448 21 4 20.552 4 20v-12h-2v-2h5v-4h2v6h-3ZM13 2v6h-2v-6h2Z"),
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
        return _sensorLine!!
    }

private var _sensorLine: ImageVector? = null
