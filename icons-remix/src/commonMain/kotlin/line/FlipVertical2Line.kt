package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FlipVertical2Line: ImageVector
    get() {
        if (_flipVertical2Line != null) return _flipVertical2Line!!
        _flipVertical2Line = remixIcon(
            name = "FlipVertical2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 19.000 L 19.000 19.000 L 19.000 5.000 L 5.000 5.000 L 5.000 19.000 ZM 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 ZM 8.000 10.000 L 12.000 6.000 L 16.000 10.000 L 13.000 10.000 L 13.000 14.000 L 16.000 14.000 L 12.000 18.000 L 8.000 14.000 L 11.000 14.000 L 11.000 10.000 L 8.000 10.000 Z"),
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
        return _flipVertical2Line!!
    }

private var _flipVertical2Line: ImageVector? = null
