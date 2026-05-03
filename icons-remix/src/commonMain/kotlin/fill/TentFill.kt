package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TentFill: ImageVector
    get() {
        if (_tentFill != null) return _tentFill!!
        _tentFill = remixIcon(
            name = "TentFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.866 3.000 L 22.103 19.000 L 23.000 19.000 L 23.000 21.000 L 1.000 21.000 L 1.000 19.000 L 1.896 19.000 L 11.134 3.000 C 11.410 2.522 12.022 2.358 12.500 2.634 C 12.652 2.722 12.778 2.848 12.866 3.000 ZM 12.000 12.925 L 8.659 19.000 L 15.341 19.000 L 12.000 12.925 Z"),
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
        return _tentFill!!
    }

private var _tentFill: ImageVector? = null
