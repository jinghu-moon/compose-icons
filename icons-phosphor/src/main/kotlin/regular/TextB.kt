package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextB: ImageVector
    get() {
        if (_textB != null) return _textB!!
        _textB = phosphorRegularIcon(
            name = "TextB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 178.480 115.700 C 191.407 103.257 195.483 84.210 188.782 67.566 C 182.080 50.922 165.943 40.014 148.000 40.000 L 80.000 40.000 C 75.582 40.000 72.000 43.582 72.000 48.000 L 72.000 200.000 C 72.000 204.418 75.582 208.000 80.000 208.000 L 160.000 208.000 C 182.877 208.000 202.575 191.855 207.066 169.423 C 211.557 146.992 199.594 124.508 178.480 115.700 ZM 88.000 56.000 L 148.000 56.000 C 163.464 56.000 176.000 68.536 176.000 84.000 C 176.000 99.464 163.464 112.000 148.000 112.000 L 88.000 112.000 ZM 160.000 192.000 L 88.000 192.000 L 88.000 128.000 L 160.000 128.000 C 177.673 128.000 192.000 142.327 192.000 160.000 C 192.000 177.673 177.673 192.000 160.000 192.000 Z"),
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
        return _textB!!
    }

private var _textB: ImageVector? = null
