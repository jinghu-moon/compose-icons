package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AnchorLine: ImageVector
    get() {
        if (_anchorLine != null) return _anchorLine!!
        _anchorLine = remixIcon(
            name = "AnchorLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.049 11.000 L 7.000 11.000 L 7.000 13.000 L 4.062 13.000 C 4.513 16.619 7.381 19.487 11.000 19.938 L 11.000 9.874 C 9.275 9.430 8.000 7.864 8.000 6.000 C 8.000 3.791 9.791 2.000 12.000 2.000 C 14.209 2.000 16.000 3.791 16.000 6.000 C 16.000 7.864 14.725 9.430 13.000 9.874 L 13.000 19.938 C 16.619 19.487 19.487 16.619 19.938 13.000 L 17.000 13.000 L 17.000 11.000 L 21.951 11.000 C 21.983 11.329 22.000 11.663 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 11.663 2.017 11.329 2.049 11.000 ZM 12.000 8.000 C 13.105 8.000 14.000 7.105 14.000 6.000 C 14.000 4.895 13.105 4.000 12.000 4.000 C 10.895 4.000 10.000 4.895 10.000 6.000 C 10.000 7.105 10.895 8.000 12.000 8.000 Z"),
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
        return _anchorLine!!
    }

private var _anchorLine: ImageVector? = null
