package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ContractUpDownLine: ImageVector
    get() {
        if (_contractUpDownLine != null) return _contractUpDownLine!!
        _contractUpDownLine = remixIcon(
            name = "ContractUpDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.793 5.207 L 12.000 11.414 L 18.207 5.207 L 16.793 3.793 L 12.000 8.586 L 7.207 3.793 L 5.793 5.207 ZM 18.207 18.793 L 12.000 12.586 L 5.793 18.793 L 7.207 20.207 L 12.000 15.414 L 16.793 20.207 L 18.207 18.793 Z"),
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
        return _contractUpDownLine!!
    }

private var _contractUpDownLine: ImageVector? = null
