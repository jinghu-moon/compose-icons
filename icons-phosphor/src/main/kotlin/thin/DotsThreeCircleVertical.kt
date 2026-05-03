package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DotsThreeCircleVertical: ImageVector
    get() {
        if (_dotsThreeCircleVertical != null) return _dotsThreeCircleVertical!!
        _dotsThreeCircleVertical = phosphorThinIcon(
            name = "DotsThreeCircleVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 136.000 84.000 C 136.000 88.418 132.418 92.000 128.000 92.000 C 123.582 92.000 120.000 88.418 120.000 84.000 C 120.000 79.582 123.582 76.000 128.000 76.000 C 132.418 76.000 136.000 79.582 136.000 84.000 ZM 136.000 128.000 C 136.000 132.418 132.418 136.000 128.000 136.000 C 123.582 136.000 120.000 132.418 120.000 128.000 C 120.000 123.582 123.582 120.000 128.000 120.000 C 132.418 120.000 136.000 123.582 136.000 128.000 ZM 136.000 172.000 C 136.000 176.418 132.418 180.000 128.000 180.000 C 123.582 180.000 120.000 176.418 120.000 172.000 C 120.000 167.582 123.582 164.000 128.000 164.000 C 132.418 164.000 136.000 167.582 136.000 172.000 Z"),
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
        return _dotsThreeCircleVertical!!
    }

private var _dotsThreeCircleVertical: ImageVector? = null
