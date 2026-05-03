package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PantoneLine: ImageVector
    get() {
        if (_pantoneLine != null) return _pantoneLine!!
        _pantoneLine = remixIcon(
            name = "PantoneLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.765 8.000 L 5.469 7.269 C 5.263 6.757 5.510 6.174 6.022 5.968 L 15.294 2.222 C 15.806 2.015 16.389 2.262 16.596 2.774 L 22.215 16.682 C 22.422 17.194 22.174 17.777 21.662 17.984 L 12.390 21.730 C 11.878 21.937 11.295 21.689 11.089 21.177 L 11.000 20.958 L 11.000 21.000 L 7.000 21.000 C 6.448 21.000 6.000 20.552 6.000 20.000 L 6.000 19.730 L 2.651 18.377 C 2.138 18.170 1.891 17.587 2.098 17.075 L 5.765 8.000 ZM 8.000 19.000 L 10.209 19.000 L 8.000 13.533 L 8.000 19.000 ZM 6.000 12.756 L 4.327 16.897 L 6.000 17.608 L 6.000 12.756 ZM 7.698 7.447 L 12.568 19.501 L 19.986 16.504 L 15.116 4.450 L 7.698 7.447 ZM 10.677 9.480 C 10.165 9.687 9.582 9.439 9.375 8.927 C 9.168 8.415 9.415 7.832 9.927 7.625 C 10.439 7.418 11.022 7.666 11.229 8.178 C 11.436 8.690 11.189 9.273 10.677 9.480 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _pantoneLine!!
    }

private var _pantoneLine: ImageVector? = null
