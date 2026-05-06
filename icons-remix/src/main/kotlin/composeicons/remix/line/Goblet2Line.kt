package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Goblet2Line: ImageVector
    get() {
        if (_goblet2Line != null) return _goblet2Line!!
        _goblet2Line = remixIcon(
            name = "Goblet2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.133 2 5.011 9.859c-.302 2.114 .522 3.931 1.881 5.188 1.105 1.022 2.568 1.685 4.109 1.888v3.066h-5v2h12v-2h-5v-3.066c1.541-.202 3.004-.865 4.109-1.888 1.359-1.257 2.183-3.074 1.881-5.188L17.868 2h-11.735ZM6.99 10.141 7.868 4h8.265l.877 6.141c.198 1.386-.321 2.569-1.259 3.437C14.797 14.462 13.418 15 12 15 10.583 15 9.204 14.462 8.249 13.578 7.312 12.711 6.792 11.527 6.99 10.141Z"),
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
        return _goblet2Line!!
    }

private var _goblet2Line: ImageVector? = null
