package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoonFill: ImageVector
    get() {
        if (_moonFill != null) return _moonFill!!
        _moonFill = remixIcon(
            name = "MoonFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.381 2.019C9.916 3.388 9 5.337 9 7.5 9 11.642 12.358 15 16.5 15c2.163 0 4.112-.916 5.481-2.381C21.661 17.854 17.315 22 12 22 6.477 22 2 17.523 2 12 2 6.685 6.146 2.339 11.381 2.019Z"),
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
        return _moonFill!!
    }

private var _moonFill: ImageVector? = null
