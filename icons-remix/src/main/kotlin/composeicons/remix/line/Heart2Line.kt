package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Heart2Line: ImageVector
    get() {
        if (_heart2Line != null) return _heart2Line!!
        _heart2Line = remixIcon(
            name = "Heart2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.243 4.757c2.263 2.267 2.34 5.88 .236 8.236l-8.479 8.492L3.521 12.993C1.417 10.637 1.496 7.019 3.757 4.757 6.022 2.493 9.645 2.417 12.001 4.529c2.349-2.109 5.979-2.039 8.242 .229ZM5.172 6.172C3.682 7.661 3.607 10.047 4.98 11.623l7.02 7.031 7.02-7.031c1.373-1.577 1.299-3.958-.193-5.453C17.34 4.68 14.946 4.608 13.374 5.984L9.172 10.187 7.757 8.773 10.582 5.946l-.082-.069C8.925 4.612 6.623 4.72 5.172 6.172Z"),
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
        return _heart2Line!!
    }

private var _heart2Line: ImageVector? = null
