package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.User3Fill: ImageVector
    get() {
        if (_user3Fill != null) return _user3Fill!!
        _user3Fill = remixIcon(
            name = "User3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 22.000 L 4.000 22.000 L 4.000 20.000 C 4.000 17.239 6.239 15.000 9.000 15.000 L 15.000 15.000 C 17.761 15.000 20.000 17.239 20.000 20.000 L 20.000 22.000 ZM 12.000 13.000 C 8.686 13.000 6.000 10.314 6.000 7.000 C 6.000 3.686 8.686 1.000 12.000 1.000 C 15.314 1.000 18.000 3.686 18.000 7.000 C 18.000 10.314 15.314 13.000 12.000 13.000 Z"),
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
        return _user3Fill!!
    }

private var _user3Fill: ImageVector? = null
