package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Pushpin2Line: ImageVector
    get() {
        if (_pushpin2Line != null) return _pushpin2Line!!
        _pushpin2Line = remixIcon(
            name = "Pushpin2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 3.000 L 18.000 5.000 L 17.000 5.000 L 17.000 11.000 L 19.000 14.000 L 19.000 16.000 L 13.000 16.000 L 13.000 23.000 L 11.000 23.000 L 11.000 16.000 L 5.000 16.000 L 5.000 14.000 L 7.000 11.000 L 7.000 5.000 L 6.000 5.000 L 6.000 3.000 L 18.000 3.000 ZM 9.000 5.000 L 9.000 11.606 L 7.404 14.000 L 16.596 14.000 L 15.000 11.606 L 15.000 5.000 L 9.000 5.000 Z"),
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
        return _pushpin2Line!!
    }

private var _pushpin2Line: ImageVector? = null
