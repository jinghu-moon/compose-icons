package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PantoneFill: ImageVector
    get() {
        if (_pantoneFill != null) return _pantoneFill!!
        _pantoneFill = remixIcon(
            name = "PantoneFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 18.922 L 2.651 18.377 C 2.138 18.170 1.891 17.587 2.098 17.075 L 4.000 12.367 L 4.000 18.922 ZM 8.860 21.000 L 7.000 21.000 C 6.448 21.000 6.000 20.552 6.000 20.000 L 6.000 13.922 L 8.860 21.000 ZM 6.022 5.968 L 15.294 2.222 C 15.806 2.015 16.389 2.262 16.596 2.774 L 22.215 16.682 C 22.422 17.194 22.174 17.777 21.662 17.984 L 12.390 21.730 C 11.878 21.937 11.295 21.689 11.089 21.177 L 5.469 7.269 C 5.263 6.757 5.510 6.175 6.022 5.968 ZM 9.000 9.000 C 9.552 9.000 10.000 8.552 10.000 8.000 C 10.000 7.448 9.552 7.000 9.000 7.000 C 8.448 7.000 8.000 7.448 8.000 8.000 C 8.000 8.552 8.448 9.000 9.000 9.000 Z"),
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
        return _pantoneFill!!
    }

private var _pantoneFill: ImageVector? = null
