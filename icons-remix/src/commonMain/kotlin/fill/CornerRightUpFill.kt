package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CornerRightUpFill: ImageVector
    get() {
        if (_cornerRightUpFill != null) return _cornerRightUpFill!!
        _cornerRightUpFill = remixIcon(
            name = "CornerRightUpFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 19.000 L 5.000 19.000 L 5.000 17.000 L 12.000 17.000 L 12.000 9.414 L 6.586 9.414 L 13.000 3.000 L 19.414 9.414 L 14.000 9.414 L 14.000 19.000 Z"),
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
        return _cornerRightUpFill!!
    }

private var _cornerRightUpFill: ImageVector? = null
