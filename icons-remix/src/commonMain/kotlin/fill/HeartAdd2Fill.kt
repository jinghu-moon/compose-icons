package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HeartAdd2Fill: ImageVector
    get() {
        if (_heartAdd2Fill != null) return _heartAdd2Fill!!
        _heartAdd2Fill = remixIcon(
            name = "HeartAdd2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.500 3.000 C 19.538 3.000 22.000 5.500 22.000 9.000 C 22.000 10.425 21.689 11.726 21.173 12.907 C 20.252 12.332 19.165 12.000 18.000 12.000 C 14.686 12.000 12.000 14.686 12.000 18.000 C 12.000 19.101 12.296 20.132 12.813 21.018 C 12.506 21.201 12.232 21.361 12.000 21.500 C 9.500 20.000 2.000 16.000 2.000 9.000 C 2.000 5.500 4.500 3.000 7.500 3.000 C 9.360 3.000 11.000 4.000 12.000 5.000 C 13.000 4.000 14.640 3.000 16.500 3.000 ZM 19.000 17.000 L 19.000 14.000 L 17.000 14.000 L 17.000 17.000 L 14.000 17.000 L 14.000 19.000 L 16.999 19.000 L 17.000 22.000 L 19.000 22.000 L 18.999 19.000 L 22.000 19.000 L 22.000 17.000 L 19.000 17.000 Z"),
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
        return _heartAdd2Fill!!
    }

private var _heartAdd2Fill: ImageVector? = null
