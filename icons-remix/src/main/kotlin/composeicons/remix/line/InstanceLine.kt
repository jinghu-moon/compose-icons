package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.InstanceLine: ImageVector
    get() {
        if (_instanceLine != null) return _instanceLine!!
        _instanceLine = remixIcon(
            name = "InstanceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.5 7.653v8.694L12 20.689l7.5-4.342v-8.694L12 3.311 4.5 7.653ZM12 1l9.5 5.5v11L12 23 2.5 17.5v-11L12 1ZM6.499 9.971 11 12.576v5.049h2v-5.049L17.501 9.971 16.499 8.24 12 10.844 7.501 8.24 6.499 9.971Z"),
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
        return _instanceLine!!
    }

private var _instanceLine: ImageVector? = null
