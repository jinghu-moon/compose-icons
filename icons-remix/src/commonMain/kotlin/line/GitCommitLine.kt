package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GitCommitLine: ImageVector
    get() {
        if (_gitCommitLine != null) return _gitCommitLine!!
        _gitCommitLine = remixIcon(
            name = "GitCommitLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.874 13.000 C 15.430 14.725 13.864 16.000 12.000 16.000 C 10.136 16.000 8.570 14.725 8.126 13.000 L 3.000 13.000 L 3.000 11.000 L 8.126 11.000 C 8.570 9.275 10.136 8.000 12.000 8.000 C 13.864 8.000 15.430 9.275 15.874 11.000 L 21.000 11.000 L 21.000 13.000 L 15.874 13.000 ZM 12.000 14.000 C 13.105 14.000 14.000 13.105 14.000 12.000 C 14.000 10.895 13.105 10.000 12.000 10.000 C 10.895 10.000 10.000 10.895 10.000 12.000 C 10.000 13.105 10.895 14.000 12.000 14.000 Z"),
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
        return _gitCommitLine!!
    }

private var _gitCommitLine: ImageVector? = null
