package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CollapseDiagonal2Line: ImageVector
    get() {
        if (_collapseDiagonal2Line != null) return _collapseDiagonal2Line!!
        _collapseDiagonal2Line = remixIcon(
            name = "CollapseDiagonal2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 4.000 L 11.000 4.000 L 11.000 11.000 L 4.000 11.000 L 4.000 9.000 L 7.586 9.000 L 3.293 4.707 L 4.707 3.293 L 9.000 7.586 L 9.000 4.000 ZM 20.000 15.000 L 16.414 15.000 L 20.707 19.293 L 19.293 20.707 L 15.000 16.414 L 15.000 20.000 L 13.000 20.000 L 13.000 13.000 L 20.000 13.000 L 20.000 15.000 Z"),
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
        return _collapseDiagonal2Line!!
    }

private var _collapseDiagonal2Line: ImageVector? = null
