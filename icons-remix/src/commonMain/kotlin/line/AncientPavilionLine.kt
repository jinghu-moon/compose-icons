package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AncientPavilionLine: ImageVector
    get() {
        if (_ancientPavilionLine != null) return _ancientPavilionLine!!
        _ancientPavilionLine = remixIcon(
            name = "AncientPavilionLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 1.516 7.877 C 1.680 9.830 3.089 11.452 5.000 11.887 L 5.000 19.001 L 3.000 19.001 L 3.000 21.001 L 21.000 21.001 L 21.000 19.001 L 19.000 19.001 L 19.000 11.887 C 20.911 11.452 22.320 9.830 22.484 7.877 C 21.994 7.959 21.497 8.000 21.000 8.000 C 17.186 8.000 13.786 5.596 12.515 2.000 L 11.485 2.000 C 10.214 5.596 6.814 8.000 3.000 8.000 C 2.503 8.000 2.006 7.959 1.516 7.877 ZM 17.000 19.001 L 7.000 19.001 L 7.000 12.000 L 17.000 12.000 L 17.000 19.001 ZM 18.556 9.937 L 18.281 10.000 L 5.719 10.000 L 5.445 9.937 C 5.308 9.906 5.178 9.866 5.053 9.816 C 6.590 9.532 8.023 8.921 9.351 7.981 C 10.408 7.234 11.291 6.356 12.000 5.346 C 12.710 6.356 13.593 7.234 14.649 7.981 C 15.977 8.921 17.410 9.532 18.947 9.816 C 18.822 9.866 18.692 9.906 18.556 9.937 Z"),
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
        return _ancientPavilionLine!!
    }

private var _ancientPavilionLine: ImageVector? = null
