package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ContractRightFill: ImageVector
    get() {
        if (_contractRightFill != null) return _contractRightFill!!
        _contractRightFill = remixIcon(
            name = "ContractRightFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 5.000 L 16.000 12.000 L 9.000 19.000 L 9.000 13.000 L 3.000 13.000 L 3.000 11.000 L 9.000 11.000 L 9.000 5.000 ZM 18.000 19.000 L 18.000 5.000 L 20.000 5.000 L 20.000 19.000 L 18.000 19.000 Z"),
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
        return _contractRightFill!!
    }

private var _contractRightFill: ImageVector? = null
