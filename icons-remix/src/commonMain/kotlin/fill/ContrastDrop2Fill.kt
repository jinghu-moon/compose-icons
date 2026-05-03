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
                pathData = parseSvgPathData("M 5.636 6.633 L 12.000 0.269 L 18.364 6.633 C 21.879 10.148 21.879 15.846 18.364 19.361 C 14.849 22.875 9.151 22.875 5.636 19.361 C 2.121 15.846 2.121 10.148 5.636 6.633 L 5.636 6.633 ZM 12.000 3.097 L 7.050 8.047 C 5.784 9.314 5.000 11.064 5.000 12.997 L 19.000 12.997 C 19.000 11.064 18.216 9.314 16.950 8.047 L 12.000 3.097 Z"),
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
