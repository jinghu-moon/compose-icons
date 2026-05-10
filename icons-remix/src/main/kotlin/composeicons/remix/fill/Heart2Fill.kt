package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Heart2Fill: ImageVector
    get() {
        if (_heart2Fill != null) return _heart2Fill!!
        _heart2Fill = remixIcon(
            name = "Heart2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.243 4.757c2.263 2.267 2.34 5.88 .236 8.236l-8.479 8.492L3.521 12.993C1.417 10.637 1.496 7.019 3.757 4.757 5.515 2.999 8.093 2.56 10.26 3.44L6.343 7.358 7.757 8.773 12 4.53l-.013-.014c.005 .004 .009 .008 .014 .012 2.349-2.109 5.979-2.039 8.242 .229Z"),
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
        return _heart2Fill!!
    }

private var _heart2Fill: ImageVector? = null
