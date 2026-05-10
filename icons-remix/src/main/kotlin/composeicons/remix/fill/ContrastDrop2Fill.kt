package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ContrastDrop2Fill: ImageVector
    get() {
        if (_contrastDrop2Fill != null) return _contrastDrop2Fill!!
        _contrastDrop2Fill = remixIcon(
            name = "ContrastDrop2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.636 6.633 12 .269l6.364 6.364c3.515 3.515 3.515 9.213 0 12.728-3.515 3.515-9.213 3.515-12.728 0C2.121 15.846 2.121 10.148 5.636 6.633h0ZM12 3.097 7.05 8.047C5.784 9.314 5 11.064 5 12.997h14C19 11.064 18.216 9.314 16.95 8.047L12 3.097Z"),
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
        return _contrastDrop2Fill!!
    }

private var _contrastDrop2Fill: ImageVector? = null
