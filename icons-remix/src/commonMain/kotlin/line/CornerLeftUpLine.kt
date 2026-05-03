package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CornerLeftUpLine: ImageVector
    get() {
        if (_cornerLeftUpLine != null) return _cornerLeftUpLine!!
        _cornerLeftUpLine = remixIcon(
            name = "CornerLeftUpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 19.000 L 19.000 19.000 L 19.000 17.000 L 12.000 17.000 L 12.000 6.828 L 15.950 10.778 L 17.364 9.364 L 11.000 3.000 L 4.636 9.364 L 6.050 10.778 L 10.000 6.828 L 10.000 19.000 Z"),
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
        return _cornerLeftUpLine!!
    }

private var _cornerLeftUpLine: ImageVector? = null
