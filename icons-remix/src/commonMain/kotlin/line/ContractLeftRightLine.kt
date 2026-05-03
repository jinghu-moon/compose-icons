package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ContractLeftRightLine: ImageVector
    get() {
        if (_contractLeftRightLine != null) return _contractLeftRightLine!!
        _contractLeftRightLine = remixIcon(
            name = "ContractLeftRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.793 5.793 L 12.586 12.000 L 18.793 18.207 L 20.207 16.793 L 15.414 12.000 L 20.207 7.207 L 18.793 5.793 ZM 5.207 18.207 L 11.414 12.000 L 5.207 5.793 L 3.793 7.207 L 8.586 12.000 L 3.793 16.793 L 5.207 18.207 Z"),
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
        return _contractLeftRightLine!!
    }

private var _contractLeftRightLine: ImageVector? = null
