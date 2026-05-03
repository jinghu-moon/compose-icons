package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Safe3Fill: ImageVector
    get() {
        if (_safe3Fill != null) return _safe3Fill!!
        _safe3Fill = remixIcon(
            name = "Safe3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 19.000 C 2.000 19.552 2.448 20.000 3.000 20.000 L 4.000 20.000 L 4.000 22.000 L 6.000 22.000 L 6.000 20.000 L 18.000 20.000 L 18.000 22.000 L 20.000 22.000 L 20.000 20.000 L 21.000 20.000 C 21.552 20.000 22.000 19.552 22.000 19.000 L 22.000 4.000 C 22.000 3.448 21.552 3.000 21.000 3.000 L 3.000 3.000 ZM 15.349 8.236 L 16.682 6.904 L 18.096 8.318 L 16.763 9.651 C 17.412 10.794 17.412 12.206 16.763 13.349 L 18.096 14.682 L 16.682 16.096 L 15.349 14.763 C 14.206 15.412 12.794 15.412 11.651 14.763 L 10.318 16.096 L 8.904 14.682 L 10.237 13.349 C 9.588 12.206 9.588 10.794 10.237 9.651 L 8.904 8.318 L 10.318 6.904 L 11.651 8.236 C 12.794 7.588 14.206 7.588 15.349 8.236 ZM 14.737 10.262 C 14.054 9.579 12.946 9.579 12.263 10.262 C 11.579 10.946 11.579 12.054 12.263 12.737 C 12.946 13.421 14.054 13.421 14.737 12.737 C 15.421 12.054 15.421 10.946 14.737 10.262 ZM 5.000 8.000 L 7.000 8.000 L 7.000 15.000 L 5.000 15.000 L 5.000 8.000 Z"),
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
        return _safe3Fill!!
    }

private var _safe3Fill: ImageVector? = null
