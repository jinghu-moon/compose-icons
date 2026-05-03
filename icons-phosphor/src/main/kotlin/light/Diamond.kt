package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = phosphorLightIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 233.920 118.140 L 137.860 22.080 C 132.402 16.665 123.598 16.665 118.140 22.080 L 22.080 118.140 C 16.665 123.598 16.665 132.402 22.080 137.860 L 118.140 233.920 L 118.140 233.920 C 123.598 239.335 132.402 239.335 137.860 233.920 L 233.860 137.860 C 236.476 135.245 237.946 131.699 237.946 128.000 C 237.946 124.301 236.476 120.754 233.860 118.140 ZM 225.430 129.380 L 129.380 225.440 C 128.607 226.177 127.393 226.177 126.620 225.440 L 30.570 129.380 C 29.833 128.607 29.833 127.393 30.570 126.620 L 126.620 30.560 C 127.393 29.823 128.607 29.823 129.380 30.560 L 225.430 126.620 C 226.167 127.393 226.167 128.607 225.430 129.380 Z"),
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
        return _diamond!!
    }

private var _diamond: ImageVector? = null
