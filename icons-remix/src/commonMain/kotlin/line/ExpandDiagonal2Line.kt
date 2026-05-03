package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandDiagonal2Line: ImageVector
    get() {
        if (_expandDiagonal2Line != null) return _expandDiagonal2Line!!
        _expandDiagonal2Line = remixIcon(
            name = "ExpandDiagonal2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.414 5.000 L 10.000 5.000 L 10.000 3.000 L 3.000 3.000 L 3.000 10.000 L 5.000 10.000 L 5.000 6.414 L 9.293 10.707 L 10.707 9.293 L 6.414 5.000 ZM 21.000 14.000 L 19.000 14.000 L 19.000 17.586 L 14.707 13.293 L 13.293 14.707 L 17.586 19.000 L 14.000 19.000 L 14.000 21.000 L 21.000 21.000 L 21.000 14.000 Z"),
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
        return _expandDiagonal2Line!!
    }

private var _expandDiagonal2Line: ImageVector? = null
