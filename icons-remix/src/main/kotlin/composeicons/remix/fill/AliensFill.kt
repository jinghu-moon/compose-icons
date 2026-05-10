package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AliensFill: ImageVector
    get() {
        if (_aliensFill != null) return _aliensFill!!
        _aliensFill = remixIcon(
            name = "AliensFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c4.694 0 8.5 3.806 8.5 8.5 0 6.5-5.5 12-8.5 12C9 22.5 3.5 17 3.5 10.5 3.5 5.806 7.306 2 12 2ZM17.5 12C15.015 12 13 14.015 13 16.5c0 .16 .008 .319 .025 .475 .156 .016 .314 .025 .475 .025C15.985 17 18 14.985 18 12.5c0-.16-.008-.319-.025-.475C17.819 12.008 17.66 12 17.5 12ZM6.5 12c-.16 0-.319 .008-.475 .025C6.008 12.181 6 12.34 6 12.5 6 14.985 8.015 17 10.5 17c.16 0 .319-.008 .475-.025 .016-.156 .025-.314 .025-.475C11 14.015 8.985 12 6.5 12Z"),
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
        return _aliensFill!!
    }

private var _aliensFill: ImageVector? = null
