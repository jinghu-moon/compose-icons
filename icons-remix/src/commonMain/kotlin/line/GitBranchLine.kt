package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GitBranchLine: ImageVector
    get() {
        if (_gitBranchLine != null) return _gitBranchLine!!
        _gitBranchLine = remixIcon(
            name = "GitBranchLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.105 15.210 C 8.215 15.650 9.000 16.733 9.000 18.000 C 9.000 19.657 7.657 21.000 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 C 3.000 16.694 3.835 15.583 5.000 15.171 L 5.000 8.829 C 3.835 8.417 3.000 7.306 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 C 7.657 3.000 9.000 4.343 9.000 6.000 C 9.000 7.306 8.165 8.417 7.000 8.829 L 7.000 12.000 C 7.836 11.372 8.874 11.000 10.000 11.000 L 14.000 11.000 C 15.384 11.000 16.548 10.064 16.895 8.790 C 15.785 8.350 15.000 7.267 15.000 6.000 C 15.000 4.343 16.343 3.000 18.000 3.000 C 19.657 3.000 21.000 4.343 21.000 6.000 C 21.000 7.333 20.130 8.463 18.927 8.854 C 18.522 11.208 16.470 13.000 14.000 13.000 L 10.000 13.000 C 8.617 13.000 7.452 13.936 7.105 15.210 ZM 6.000 17.000 C 5.448 17.000 5.000 17.448 5.000 18.000 C 5.000 18.552 5.448 19.000 6.000 19.000 C 6.552 19.000 7.000 18.552 7.000 18.000 C 7.000 17.448 6.552 17.000 6.000 17.000 ZM 6.000 5.000 C 5.448 5.000 5.000 5.448 5.000 6.000 C 5.000 6.552 5.448 7.000 6.000 7.000 C 6.552 7.000 7.000 6.552 7.000 6.000 C 7.000 5.448 6.552 5.000 6.000 5.000 ZM 18.000 5.000 C 17.448 5.000 17.000 5.448 17.000 6.000 C 17.000 6.552 17.448 7.000 18.000 7.000 C 18.552 7.000 19.000 6.552 19.000 6.000 C 19.000 5.448 18.552 5.000 18.000 5.000 Z"),
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
        return _gitBranchLine!!
    }

private var _gitBranchLine: ImageVector? = null
