package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FlashlightLine: ImageVector
    get() {
        if (_flashlightLine != null) return _flashlightLine!!
        _flashlightLine = remixIcon(
            name = "FlashlightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 9.000 L 21.000 9.000 L 11.000 24.000 L 11.000 15.000 L 4.000 15.000 L 13.000 0.000 L 13.000 9.000 ZM 11.000 11.000 L 11.000 7.221 L 7.532 13.000 L 13.000 13.000 L 13.000 17.394 L 17.263 11.000 L 11.000 11.000 Z"),
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
        return _flashlightLine!!
    }

private var _flashlightLine: ImageVector? = null
