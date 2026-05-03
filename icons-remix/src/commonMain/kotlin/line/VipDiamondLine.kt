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
                pathData = parseSvgPathData("M 4.878 3.003 L 19.132 3.003 C 19.452 3.003 19.752 3.156 19.941 3.415 L 23.763 8.671 C 23.904 8.864 23.888 9.129 23.726 9.304 L 12.372 21.605 C 12.185 21.808 11.868 21.820 11.666 21.633 C 11.659 21.627 7.865 17.517 0.283 9.304 C 0.121 9.129 0.106 8.864 0.246 8.671 L 4.069 3.415 C 4.257 3.156 4.558 3.003 4.878 3.003 ZM 5.387 5.003 L 2.587 8.852 L 12.005 19.054 L 21.422 8.852 L 18.623 5.003 L 5.387 5.003 Z"),
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
