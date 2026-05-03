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
                pathData = parseSvgPathData("M 10.000 5.000 L 19.000 5.000 L 19.000 7.000 L 12.000 7.000 L 12.000 17.172 L 15.950 13.222 L 17.364 14.636 L 11.000 21.000 L 4.636 14.636 L 6.050 13.222 L 10.000 17.172 L 10.000 5.000 Z"),
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
