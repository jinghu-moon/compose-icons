package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoonFoggyFill: ImageVector
    get() {
        if (_moonFoggyFill != null) return _moonFoggyFill!!
        _moonFoggyFill = remixIcon(
            name = "MoonFoggyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 20.334 L 16.000 18.000 L 14.000 18.000 L 14.000 14.000 L 3.332 14.000 C 3.116 13.203 3.000 12.365 3.000 11.500 C 3.000 6.940 6.213 3.130 10.500 2.211 C 10.177 3.079 10.000 4.019 10.000 5.000 C 10.000 9.418 13.582 13.000 18.000 13.000 C 19.453 13.000 20.816 12.613 21.990 11.935 C 21.818 15.758 19.387 18.992 16.000 20.334 ZM 7.000 20.000 L 14.000 20.000 L 14.000 22.000 L 7.000 22.000 L 7.000 20.000 ZM 2.000 16.000 L 12.000 16.000 L 12.000 18.000 L 2.000 18.000 L 2.000 16.000 Z"),
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
        return _moonFoggyFill!!
    }

private var _moonFoggyFill: ImageVector? = null
