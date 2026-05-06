package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HeartLine: ImageVector
    get() {
        if (_heartLine != null) return _heartLine!!
        _heartLine = remixIcon(
            name = "HeartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 4.529c2.349-2.109 5.979-2.039 8.242 .229 2.263 2.267 2.34 5.88 .236 8.236l-8.479 8.492L3.521 12.993C1.417 10.637 1.496 7.019 3.757 4.757 6.022 2.493 9.645 2.417 12.001 4.529ZM18.827 6.17C17.328 4.668 14.908 4.607 13.337 6.017L12.002 7.215 10.666 6.018C9.091 4.606 6.675 4.668 5.172 6.172 3.682 7.661 3.607 10.047 4.98 11.623l7.02 7.031 7.02-7.031c1.373-1.577 1.299-3.958-.193-5.453Z"),
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
        return _heartLine!!
    }

private var _heartLine: ImageVector? = null
