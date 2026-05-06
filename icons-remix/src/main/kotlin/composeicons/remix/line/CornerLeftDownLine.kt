package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CornerLeftDownLine: ImageVector
    get() {
        if (_cornerLeftDownLine != null) return _cornerLeftDownLine!!
        _cornerLeftDownLine = remixIcon(
            name = "CornerLeftDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 5l9-0v2l-7 0-0 10.172 3.95-3.95 1.414 1.414-6.364 6.364L4.636 14.636 6.05 13.222l3.95 3.95L10 5Z"),
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
        return _cornerLeftDownLine!!
    }

private var _cornerLeftDownLine: ImageVector? = null
