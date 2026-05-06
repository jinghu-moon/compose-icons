package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RulerFill: ImageVector
    get() {
        if (_rulerFill != null) return _rulerFill!!
        _rulerFill = remixIcon(
            name = "RulerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.929 13.314l2.121 2.121L8.465 14.021 6.343 11.9 8.465 9.778l2.828 2.828 1.414-1.414L9.879 8.364 12 6.243l2.121 2.121L15.536 6.95 13.414 4.829 16.243 2c.39-.391 1.024-.391 1.414 0l4.95 4.95c.39 .391 .39 1.024 0 1.414L7.757 23.213c-.391 .39-1.024 .39-1.414 0L1.393 18.264c-.391-.391-.391-1.024 0-1.414L4.929 13.314Z"),
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
        return _rulerFill!!
    }

private var _rulerFill: ImageVector? = null
