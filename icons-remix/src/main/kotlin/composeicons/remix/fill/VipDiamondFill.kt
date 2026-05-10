package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VipDiamondFill: ImageVector
    get() {
        if (_vipDiamondFill != null) return _vipDiamondFill!!
        _vipDiamondFill = remixIcon(
            name = "VipDiamondFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.878 3.003h14.254c.32 0 .62 .153 .809 .412l3.823 5.256c.14 .193 .125 .458-.037 .633L12.372 21.605c-.187 .203-.504 .216-.707 .028-.01-.009-.019-.018-.028-.028L.283 9.304C.121 9.129 .106 8.864 .246 8.671L4.069 3.415c.188-.259 .489-.412 .809-.412Z"),
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
        return _vipDiamondFill!!
    }

private var _vipDiamondFill: ImageVector? = null
