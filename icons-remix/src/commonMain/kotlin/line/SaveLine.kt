package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SaveLine: ImageVector
    get() {
        if (_saveLine != null) return _saveLine!!
        _saveLine = remixIcon(
            name = "SaveLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 19.000 L 7.000 13.000 L 17.000 13.000 L 17.000 19.000 L 19.000 19.000 L 19.000 7.828 L 16.172 5.000 L 5.000 5.000 L 5.000 19.000 L 7.000 19.000 ZM 4.000 3.000 L 17.000 3.000 L 21.000 7.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 ZM 9.000 15.000 L 9.000 19.000 L 15.000 19.000 L 15.000 15.000 L 9.000 15.000 Z"),
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
        return _saveLine!!
    }

private var _saveLine: ImageVector? = null
