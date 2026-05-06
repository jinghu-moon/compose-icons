package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TyphoonLine: ImageVector
    get() {
        if (_typhoonLine != null) return _typhoonLine!!
        _typhoonLine = remixIcon(
            name = "TyphoonLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.654 1.7 14.872 4.233c1.275 .39 2.474 1.048 3.49 1.973 3.513 3.2 3.513 8.388 0 11.588-2.592 2.36-6.597 3.862-12.016 4.506L9.128 19.767C7.853 19.377 6.655 18.719 5.639 17.794 2.126 14.594 2.105 9.425 5.639 6.206 8.23 3.846 12.236 2.344 17.654 1.7ZM12 6C8.134 6 5 8.686 5 12c0 3.314 3.134 6 7 6 3.866 0 7-2.686 7-6C19 8.686 15.866 6 12 6ZM12 8.3c2.209 0 4 1.657 4 3.7 0 2.043-1.791 3.7-4 3.7C9.791 15.7 8 14.043 8 12 8 9.957 9.791 8.3 12 8.3ZM12 10.3c-1.138 0-2 .797-2 1.7 0 .903 .862 1.7 2 1.7 1.138 0 2-.797 2-1.7 0-.903-.862-1.7-2-1.7Z"),
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
        return _typhoonLine!!
    }

private var _typhoonLine: ImageVector? = null
