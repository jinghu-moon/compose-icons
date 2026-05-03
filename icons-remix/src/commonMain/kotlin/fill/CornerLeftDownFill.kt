package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CornerLeftDownFill: ImageVector
    get() {
        if (_cornerLeftDownFill != null) return _cornerLeftDownFill!!
        _cornerLeftDownFill = remixIcon(
            name = "CornerLeftDownFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 5.000 L 19.000 5.000 L 19.000 7.000 L 12.000 7.000 L 12.000 14.586 L 17.414 14.586 L 11.000 21.000 L 4.586 14.586 L 10.000 14.586 L 10.000 5.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _cornerLeftDownFill!!
    }

private var _cornerLeftDownFill: ImageVector? = null
