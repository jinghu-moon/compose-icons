package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GogglesFill: ImageVector
    get() {
        if (_gogglesFill != null) return _gogglesFill!!
        _gogglesFill = remixIcon(
            name = "GogglesFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.952 6.942C7.081 6.118 9.751 6 12 6c2.249 0 4.919 .118 7.049 .942 1.081 .419 2.081 1.04 2.81 1.973 .739 .946 1.142 2.138 1.142 3.584 0 1.47-.525 2.933-1.379 4.042-.852 1.105-2.117 1.958-3.621 1.958-1.425 0-2.656-.791-3.575-1.38C13.719 16.667 12.883 16 12 16c-.883 0-1.72 .667-2.425 1.12C8.656 17.709 7.425 18.5 6 18.5c-1.503 0-2.769-.853-3.621-1.958C1.525 15.433 1 13.97 1 12.5 1 11.054 1.402 9.862 2.142 8.916 2.871 7.983 3.87 7.361 4.952 6.942Z"),
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
        return _gogglesFill!!
    }

private var _gogglesFill: ImageVector? = null
