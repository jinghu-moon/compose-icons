package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpyFill: ImageVector
    get() {
        if (_spyFill != null) return _spyFill!!
        _spyFill = remixIcon(
            name = "SpyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 13.000 C 19.209 13.000 21.000 14.791 21.000 17.000 C 21.000 19.209 19.209 21.000 17.000 21.000 C 14.858 21.000 13.000 19.210 13.000 17.000 L 11.000 17.000 C 11.000 19.209 9.209 21.000 7.000 21.000 C 4.791 21.000 3.000 19.209 3.000 17.000 C 3.000 14.791 4.791 13.000 7.000 13.000 C 8.481 13.000 9.773 13.804 10.465 15.000 L 13.535 15.000 C 14.227 13.804 15.519 13.000 17.000 13.000 ZM 2.000 12.000 L 2.000 10.000 L 4.000 10.000 L 4.000 7.000 C 4.000 4.791 5.791 3.000 8.000 3.000 L 16.000 3.000 C 18.209 3.000 20.000 4.791 20.000 7.000 L 20.000 10.000 L 22.000 10.000 L 22.000 12.000 L 2.000 12.000 Z"),
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
        return _spyFill!!
    }

private var _spyFill: ImageVector? = null
