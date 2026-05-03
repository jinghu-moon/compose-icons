package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GitRepositoryLine: ImageVector
    get() {
        if (_gitRepositoryLine != null) return _gitRepositoryLine!!
        _gitRepositoryLine = remixIcon(
            name = "GitRepositoryLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 21.000 L 13.000 23.500 L 10.000 21.500 L 7.000 23.500 L 7.000 21.000 L 6.500 21.000 C 4.567 21.000 3.000 19.433 3.000 17.500 L 3.000 5.000 C 3.000 3.343 4.343 2.000 6.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 13.000 21.000 ZM 13.000 19.000 L 19.000 19.000 L 19.000 16.000 L 6.500 16.000 C 5.672 16.000 5.000 16.672 5.000 17.500 C 5.000 18.328 5.672 19.000 6.500 19.000 L 7.000 19.000 L 7.000 17.000 L 13.000 17.000 L 13.000 19.000 ZM 19.000 14.000 L 19.000 4.000 L 6.000 4.000 L 6.000 14.035 C 6.163 14.012 6.330 14.000 6.500 14.000 L 19.000 14.000 ZM 7.000 5.000 L 9.000 5.000 L 9.000 7.000 L 7.000 7.000 L 7.000 5.000 ZM 7.000 8.000 L 9.000 8.000 L 9.000 10.000 L 7.000 10.000 L 7.000 8.000 ZM 7.000 11.000 L 9.000 11.000 L 9.000 13.000 L 7.000 13.000 L 7.000 11.000 Z"),
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
        return _gitRepositoryLine!!
    }

private var _gitRepositoryLine: ImageVector? = null
