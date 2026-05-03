package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SaveFill: ImageVector
    get() {
        if (_saveFill != null) return _saveFill!!
        _saveFill = remixIcon(
            name = "SaveFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 21.000 L 18.000 13.000 L 6.000 13.000 L 6.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 17.000 3.000 L 21.000 7.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 18.000 21.000 ZM 16.000 21.000 L 8.000 21.000 L 8.000 15.000 L 16.000 15.000 L 16.000 21.000 Z"),
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
        return _saveFill!!
    }

private var _saveFill: ImageVector? = null
