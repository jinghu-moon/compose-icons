package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VipCrownLine: ImageVector
    get() {
        if (_vipCrownLine != null) return _vipCrownLine!!
        _vipCrownLine = remixIcon(
            name = "VipCrownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.005 19h20v2h-20v-2ZM2.005 5l5 3.5L12.005 2l5 6.5L22.005 5v12h-20v-12ZM4.005 8.841v6.159h16v-6.159l-3.42 2.394L12.005 5.28 7.424 11.235 4.005 8.841Z"),
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
        return _vipCrownLine!!
    }

private var _vipCrownLine: ImageVector? = null
