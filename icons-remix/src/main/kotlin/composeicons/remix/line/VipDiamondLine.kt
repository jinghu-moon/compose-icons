package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VipDiamondLine: ImageVector
    get() {
        if (_vipDiamondLine != null) return _vipDiamondLine!!
        _vipDiamondLine = remixIcon(
            name = "VipDiamondLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.878 3.003h14.254c.32 0 .62 .153 .809 .412l3.823 5.256c.14 .193 .125 .458-.037 .633L12.372 21.605c-.187 .203-.504 .216-.707 .028C11.659 21.627 7.865 17.517 .283 9.304 .121 9.129 .106 8.864 .246 8.671L4.069 3.415c.188-.259 .489-.412 .809-.412ZM5.387 5.003 2.587 8.852l9.417 10.202L21.422 8.852 18.623 5.003h-13.236Z"),
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
        return _vipDiamondLine!!
    }

private var _vipDiamondLine: ImageVector? = null
