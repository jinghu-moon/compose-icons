package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserFocus: ImageVector
    get() {
        if (_userFocus != null) return _userFocus!!
        _userFocus = phosphorFillIcon(
            name = "UserFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 40.000 L 224.000 76.000 C 224.000 80.418 220.418 84.000 216.000 84.000 C 211.582 84.000 208.000 80.418 208.000 76.000 L 208.000 48.000 L 180.000 48.000 C 175.582 48.000 172.000 44.418 172.000 40.000 C 172.000 35.582 175.582 32.000 180.000 32.000 L 216.000 32.000 C 220.418 32.000 224.000 35.582 224.000 40.000 ZM 216.000 172.000 C 211.582 172.000 208.000 175.582 208.000 180.000 L 208.000 208.000 L 180.000 208.000 C 175.582 208.000 172.000 211.582 172.000 216.000 C 172.000 220.418 175.582 224.000 180.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 L 224.000 180.000 C 224.000 175.582 220.418 172.000 216.000 172.000 ZM 76.000 208.000 L 48.000 208.000 L 48.000 180.000 C 48.000 175.582 44.418 172.000 40.000 172.000 C 35.582 172.000 32.000 175.582 32.000 180.000 L 32.000 216.000 C 32.000 220.418 35.582 224.000 40.000 224.000 L 76.000 224.000 C 80.418 224.000 84.000 220.418 84.000 216.000 C 84.000 211.582 80.418 208.000 76.000 208.000 ZM 40.000 84.000 C 44.418 84.000 48.000 80.418 48.000 76.000 L 48.000 48.000 L 76.000 48.000 C 80.418 48.000 84.000 44.418 84.000 40.000 C 84.000 35.582 80.418 32.000 76.000 32.000 L 40.000 32.000 C 35.582 32.000 32.000 35.582 32.000 40.000 L 32.000 76.000 C 32.000 80.418 35.582 84.000 40.000 84.000 ZM 101.000 141.510 C 90.133 146.224 80.687 153.698 73.600 163.190 C 71.776 165.614 71.480 168.862 72.836 171.575 C 74.192 174.289 76.966 176.003 80.000 176.000 L 176.000 176.000 C 179.034 176.003 181.808 174.289 183.164 171.575 C 184.520 168.862 184.224 165.614 182.400 163.190 C 175.313 153.698 165.867 146.224 155.000 141.510 C 167.193 130.378 171.293 112.899 165.323 97.506 C 159.354 82.113 144.540 71.970 128.030 71.970 C 111.520 71.970 96.706 82.113 90.737 97.506 C 84.767 112.899 88.867 130.378 101.060 141.510 Z"),
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
        return _userFocus!!
    }

private var _userFocus: ImageVector? = null
