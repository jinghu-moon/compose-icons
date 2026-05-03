package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ContractLeftLine: ImageVector
    get() {
        if (_contractLeftLine != null) return _contractLeftLine!!
        _contractLeftLine = remixIcon(
            name = "ContractLeftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.071 4.929 L 16.485 6.343 L 11.829 11.000 L 21.000 11.000 L 21.000 13.000 L 11.829 13.000 L 16.485 17.657 L 15.071 19.071 L 8.000 12.000 L 15.071 4.929 ZM 4.000 19.000 L 4.000 5.000 L 6.000 5.000 L 6.000 19.000 L 4.000 19.000 Z"),
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
        return _contractLeftLine!!
    }

private var _contractLeftLine: ImageVector? = null
