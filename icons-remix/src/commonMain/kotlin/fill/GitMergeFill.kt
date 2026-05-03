package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GitMergeFill: ImageVector
    get() {
        if (_gitMergeFill != null) return _gitMergeFill!!
        _gitMergeFill = remixIcon(
            name = "GitMergeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.105 8.790 C 7.452 10.064 8.617 11.000 10.000 11.000 L 14.000 11.000 C 16.470 11.000 18.522 12.792 18.927 15.146 C 20.130 15.537 21.000 16.667 21.000 18.000 C 21.000 19.657 19.657 21.000 18.000 21.000 C 16.343 21.000 15.000 19.657 15.000 18.000 C 15.000 16.733 15.785 15.650 16.895 15.210 C 16.548 13.936 15.384 13.000 14.000 13.000 L 10.000 13.000 C 8.874 13.000 7.836 12.628 7.000 12.000 L 7.000 15.171 C 8.165 15.583 9.000 16.694 9.000 18.000 C 9.000 19.657 7.657 21.000 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 C 3.000 16.694 3.835 15.583 5.000 15.171 L 5.000 8.829 C 3.835 8.417 3.000 7.306 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 C 7.657 3.000 9.000 4.343 9.000 6.000 C 9.000 7.267 8.215 8.350 7.105 8.790 Z"),
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
        return _gitMergeFill!!
    }

private var _gitMergeFill: ImageVector? = null
