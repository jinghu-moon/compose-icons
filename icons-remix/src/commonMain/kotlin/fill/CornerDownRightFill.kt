package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CornerDownRightFill: ImageVector
    get() {
        if (_cornerDownRightFill != null) return _cornerDownRightFill!!
        _cornerDownRightFill = remixIcon(
            name = "CornerDownRightFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 14.000 L 5.000 5.000 L 7.000 5.000 L 7.000 12.000 L 14.586 12.000 L 14.586 6.586 L 21.000 13.000 L 14.586 19.414 L 14.586 14.000 L 5.000 14.000 Z"),
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
        return _cornerDownRightFill!!
    }

private var _cornerDownRightFill: ImageVector? = null
