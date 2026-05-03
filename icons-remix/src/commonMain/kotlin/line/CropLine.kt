package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CropLine: ImageVector
    get() {
        if (_cropLine != null) return _cropLine!!
        _cropLine = remixIcon(
            name = "CropLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 17.000 L 15.000 19.000 L 6.000 19.000 C 5.448 19.000 5.000 18.552 5.000 18.000 L 5.000 7.000 L 2.000 7.000 L 2.000 5.000 L 5.000 5.000 L 5.000 2.000 L 7.000 2.000 L 7.000 17.000 L 15.000 17.000 ZM 17.000 22.000 L 17.000 7.000 L 9.000 7.000 L 9.000 5.000 L 18.000 5.000 C 18.552 5.000 19.000 5.448 19.000 6.000 L 19.000 17.000 L 22.000 17.000 L 22.000 19.000 L 19.000 19.000 L 19.000 22.000 L 17.000 22.000 Z"),
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
        return _cropLine!!
    }

private var _cropLine: ImageVector? = null
