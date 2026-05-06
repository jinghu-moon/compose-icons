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
                pathData = parseSvgPathData("M10 19 19 19v-2l-7-0L12 6.828l3.95 3.95L17.364 9.364 11 3 4.636 9.364l1.414 1.414L10 6.828l0 12.172Z"),
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
