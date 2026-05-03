package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CropFill: ImageVector
    get() {
        if (_cropFill != null) return _cropFill!!
        _cropFill = remixIcon(
            name = "CropFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 17.000 L 22.000 17.000 L 22.000 19.000 L 19.000 19.000 L 19.000 22.000 L 17.000 22.000 L 17.000 19.000 L 6.000 19.000 C 5.448 19.000 5.000 18.552 5.000 18.000 L 5.000 7.000 L 2.000 7.000 L 2.000 5.000 L 5.000 5.000 L 5.000 2.000 L 7.000 2.000 L 7.000 5.000 L 18.000 5.000 C 18.552 5.000 19.000 5.448 19.000 6.000 L 19.000 17.000 Z"),
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
        return _cropFill!!
    }

private var _cropFill: ImageVector? = null
