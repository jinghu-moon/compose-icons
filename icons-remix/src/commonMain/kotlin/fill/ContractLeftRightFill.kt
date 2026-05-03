package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ContractLeftRightFill: ImageVector
    get() {
        if (_contractLeftRightFill != null) return _contractLeftRightFill!!
        _contractLeftRightFill = remixIcon(
            name = "ContractLeftRightFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 18.000 L 11.000 12.000 L 5.000 6.000 L 5.000 18.000 ZM 19.000 6.000 L 13.000 12.000 L 19.000 18.000 L 19.000 6.000 Z"),
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
        return _contractLeftRightFill!!
    }

private var _contractLeftRightFill: ImageVector? = null
