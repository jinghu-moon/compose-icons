package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HomeOfficeLine: ImageVector
    get() {
        if (_homeOfficeLine != null) return _homeOfficeLine!!
        _homeOfficeLine = remixIcon(
            name = "HomeOfficeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.673 1.612 L 20.800 9.000 L 17.827 9.000 L 12.000 3.703 L 6.000 9.158 L 6.000 19.000 L 11.000 19.000 L 11.000 21.000 L 5.000 21.000 C 4.448 21.000 4.000 20.552 4.000 20.000 L 4.000 11.000 L 1.000 11.000 L 11.327 1.612 C 11.709 1.265 12.291 1.265 12.673 1.612 ZM 14.000 11.000 L 23.000 11.000 L 23.000 18.000 L 14.000 18.000 L 14.000 11.000 ZM 16.000 13.000 L 16.000 16.000 L 21.000 16.000 L 21.000 13.000 L 16.000 13.000 ZM 24.000 21.000 L 13.000 21.000 L 13.000 19.000 L 24.000 19.000 L 24.000 21.000 Z"),
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
        return _homeOfficeLine!!
    }

private var _homeOfficeLine: ImageVector? = null
