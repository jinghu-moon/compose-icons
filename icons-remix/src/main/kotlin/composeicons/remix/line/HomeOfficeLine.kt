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
                pathData = parseSvgPathData("M12.673 1.612 20.8 9h-2.973L12 3.703 6 9.158v9.843h5v2h-6c-.552 0-1-.448-1-1v-9h-3L11.327 1.612c.381-.347 .964-.347 1.345 0ZM14 11h9v7h-9v-7ZM16 13v3h5v-3h-5ZM24 21h-11v-2h11v2Z"),
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
