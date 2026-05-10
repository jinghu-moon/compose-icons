package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Goblet2Fill: ImageVector
    get() {
        if (_goblet2Fill != null) return _goblet2Fill!!
        _goblet2Fill = remixIcon(
            name = "Goblet2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.133 2 5.011 9.859c-.302 2.114 .522 3.931 1.881 5.188 1.105 1.022 2.568 1.685 4.109 1.888v3.066h-5v2h12v-2h-5v-3.066c1.541-.202 3.004-.865 4.109-1.888 1.359-1.257 2.183-3.074 1.881-5.188L17.868 2h-11.735ZM10 7c-.831 0-1.838 .242-2.629 .476L7.868 4h8.265l.49 3.431C15.785 7.707 14.89 8 14 8 12.608 8 11.428 7 10 7Z"),
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
        return _goblet2Fill!!
    }

private var _goblet2Fill: ImageVector? = null
