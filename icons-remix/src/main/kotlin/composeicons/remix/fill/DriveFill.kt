package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DriveFill: ImageVector
    get() {
        if (_driveFill != null) return _driveFill!!
        _driveFill = remixIcon(
            name = "DriveFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.94 4.146l3.481 6.03L5.482 20.469 2 14.44 7.94 4.146ZM10.116 14.44h11.884l-3.482 6.029h-11.883l3.481-6.029ZM14.459 13.44 8.518 3.145h6.964l5.941 10.295h-6.964Z"),
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
        return _driveFill!!
    }

private var _driveFill: ImageVector? = null
