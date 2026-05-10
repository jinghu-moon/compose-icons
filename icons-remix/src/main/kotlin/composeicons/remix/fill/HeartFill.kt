package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HeartFill: ImageVector
    get() {
        if (_heartFill != null) return _heartFill!!
        _heartFill = remixIcon(
            name = "HeartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 4.529c2.349-2.109 5.979-2.039 8.242 .229 2.263 2.267 2.34 5.88 .236 8.236l-8.479 8.492L3.521 12.993C1.417 10.637 1.496 7.019 3.757 4.757 6.022 2.493 9.645 2.417 12.001 4.529Z"),
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
        return _heartFill!!
    }

private var _heartFill: ImageVector? = null
