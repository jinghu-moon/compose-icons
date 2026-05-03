package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MacbookFill: ImageVector
    get() {
        if (_macbookFill != null) return _macbookFill!!
        _macbookFill = remixIcon(
            name = "MacbookFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 4.007 C 2.000 3.451 2.455 3.000 2.992 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.450 22.000 4.007 L 22.000 17.000 L 2.000 17.000 L 2.000 4.007 ZM 1.000 19.000 L 23.000 19.000 L 23.000 21.000 L 1.000 21.000 L 1.000 19.000 Z"),
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
        return _macbookFill!!
    }

private var _macbookFill: ImageVector? = null
