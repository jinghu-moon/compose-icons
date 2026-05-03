package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ToggleLine: ImageVector
    get() {
        if (_toggleLine != null) return _toggleLine!!
        _toggleLine = remixIcon(
            name = "ToggleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 7.000 C 5.239 7.000 3.000 9.239 3.000 12.000 C 3.000 14.761 5.239 17.000 8.000 17.000 L 16.000 17.000 C 18.761 17.000 21.000 14.761 21.000 12.000 C 21.000 9.239 18.761 7.000 16.000 7.000 L 8.000 7.000 ZM 8.000 5.000 L 16.000 5.000 C 19.866 5.000 23.000 8.134 23.000 12.000 C 23.000 15.866 19.866 19.000 16.000 19.000 L 8.000 19.000 C 4.134 19.000 1.000 15.866 1.000 12.000 C 1.000 8.134 4.134 5.000 8.000 5.000 ZM 8.000 15.000 C 6.343 15.000 5.000 13.657 5.000 12.000 C 5.000 10.343 6.343 9.000 8.000 9.000 C 9.657 9.000 11.000 10.343 11.000 12.000 C 11.000 13.657 9.657 15.000 8.000 15.000 Z"),
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
        return _toggleLine!!
    }

private var _toggleLine: ImageVector? = null
