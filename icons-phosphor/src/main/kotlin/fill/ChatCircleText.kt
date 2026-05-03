package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatCircleText: ImageVector
    get() {
        if (_chatCircleText != null) return _chatCircleText!!
        _chatCircleText = phosphorFillIcon(
            name = "ChatCircleText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 91.477 23.992 57.627 43.143 38.822 74.453 C 20.017 105.763 19.014 144.642 36.180 176.880 L 24.830 210.930 C 22.912 216.680 24.409 223.020 28.695 227.305 C 32.980 231.591 39.320 233.088 45.070 231.170 L 79.120 219.820 C 117.327 240.141 164.125 234.680 196.625 206.107 C 229.126 177.534 240.537 131.821 225.277 91.326 C 210.016 50.831 171.275 24.018 128.000 24.000 ZM 160.000 152.000 L 96.000 152.000 C 91.582 152.000 88.000 148.418 88.000 144.000 C 88.000 139.582 91.582 136.000 96.000 136.000 L 160.000 136.000 C 164.418 136.000 168.000 139.582 168.000 144.000 C 168.000 148.418 164.418 152.000 160.000 152.000 ZM 160.000 120.000 L 96.000 120.000 C 91.582 120.000 88.000 116.418 88.000 112.000 C 88.000 107.582 91.582 104.000 96.000 104.000 L 160.000 104.000 C 164.418 104.000 168.000 107.582 168.000 112.000 C 168.000 116.418 164.418 120.000 160.000 120.000 Z"),
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
        return _chatCircleText!!
    }

private var _chatCircleText: ImageVector? = null
