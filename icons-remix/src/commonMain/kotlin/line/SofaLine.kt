package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SofaLine: ImageVector
    get() {
        if (_sofaLine != null) return _sofaLine!!
        _sofaLine = remixIcon(
            name = "SofaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.001 3.000 C 5.687 3.000 3.001 5.686 3.001 9.000 L 3.001 9.351 C 1.480 10.097 0.633 11.916 1.267 13.658 L 1.579 14.517 C 1.858 15.284 2.001 16.094 2.001 16.909 L 2.001 19.500 C 2.001 20.328 2.672 21.000 3.501 21.000 L 20.501 21.000 C 21.329 21.000 22.001 20.328 22.001 19.500 L 22.001 16.909 C 22.001 16.094 22.143 15.284 22.422 14.517 L 22.735 13.658 C 23.368 11.916 22.522 10.097 21.001 9.351 L 21.001 9.000 C 21.001 5.686 18.314 3.000 15.001 3.000 L 9.001 3.000 ZM 19.001 9.032 C 17.306 9.262 16.001 10.714 16.001 12.472 L 16.001 14.000 L 8.001 14.000 L 8.001 12.472 C 8.001 10.714 6.695 9.262 5.001 9.032 L 5.001 9.000 C 5.001 6.791 6.792 5.000 9.001 5.000 L 15.001 5.000 C 17.210 5.000 19.001 6.791 19.001 9.000 L 19.001 9.032 ZM 16.001 16.000 L 16.001 17.000 L 18.001 17.000 L 18.001 12.472 C 18.001 11.659 18.660 11.000 19.472 11.000 C 20.493 11.000 21.204 12.015 20.855 12.974 L 20.542 13.834 C 20.184 14.819 20.001 15.860 20.001 16.909 L 20.001 19.000 L 4.001 19.000 L 4.001 16.909 C 4.001 15.860 3.817 14.819 3.459 13.834 L 3.146 12.974 C 2.797 12.015 3.508 11.000 4.529 11.000 C 5.342 11.000 6.001 11.659 6.001 12.472 L 6.001 17.000 L 8.001 17.000 L 8.001 16.000 L 16.001 16.000 Z"),
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
        return _sofaLine!!
    }

private var _sofaLine: ImageVector? = null
