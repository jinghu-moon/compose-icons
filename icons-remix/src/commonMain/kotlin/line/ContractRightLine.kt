package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ContractRightLine: ImageVector
    get() {
        if (_contractRightLine != null) return _contractRightLine!!
        _contractRightLine = remixIcon(
            name = "ContractRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.172 11.000 L 7.515 6.343 L 8.929 4.929 L 16.000 12.000 L 8.929 19.071 L 7.515 17.657 L 12.171 13.000 L 3.000 13.000 L 3.000 11.000 L 12.172 11.000 ZM 18.000 19.000 L 18.000 5.000 L 20.000 5.000 L 20.000 19.000 L 18.000 19.000 Z"),
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
        return _contractRightLine!!
    }

private var _contractRightLine: ImageVector? = null
