package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CornerUpRightDoubleFill: ImageVector
    get() {
        if (_cornerUpRightDoubleFill != null) return _cornerUpRightDoubleFill!!
        _cornerUpRightDoubleFill = remixIcon(
            name = "CornerUpRightDoubleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 19l0-9h5.586v-5.414l6.414 6.414L9.586 17.414v-5.414h-3.586l-0 7h-2ZM13.836 6.05 15.25 4.636 21.615 11l-6.364 6.364L13.836 15.95 18.786 11 13.836 6.05Z"),
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
        return _cornerUpRightDoubleFill!!
    }

private var _cornerUpRightDoubleFill: ImageVector? = null
