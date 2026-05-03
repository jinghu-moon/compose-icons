package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowLeftDownLine: ImageVector
    get() {
        if (_arrowLeftDownLine != null) return _arrowLeftDownLine!!
        _arrowLeftDownLine = remixIcon(
            name = "ArrowLeftDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 13.589 L 17.607 4.982 L 19.021 6.397 L 10.414 15.003 L 18.000 15.003 L 18.000 17.003 L 7.000 17.003 L 7.000 6.003 L 9.000 6.003 L 9.000 13.589 Z"),
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
        return _arrowLeftDownLine!!
    }

private var _arrowLeftDownLine: ImageVector? = null
