package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) return _stripeLogo!!
        _stripeLogo = phosphorThinIcon(
            name = "StripeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 152c0 15.44-16.15 28-36 28C108.15 180 92 167.44 92 152c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 0 11 12.56 20 28 20 15.44 0 28-9 28-20 0-12.58-11.79-16.92-29.78-22.11C111 125.51 93.78 120.54 93.78 104 93.78 88 108.49 76 128 76c14.2 0 26.3 6.46 31.55 16.85 .724 1.282 .685 2.858-.102 4.103-.786 1.245-2.193 1.957-3.661 1.854-1.469-.103-2.762-1.004-3.367-2.347C148.53 88.78 139.17 84 128 84c-15 0-26.22 8.6-26.22 20 0 9.81 10.07 13.43 26.66 18.21C145.03 126.99 164 132.46 164 152ZM220 48v160c0 6.627-5.373 12-12 12h-160c-6.627 0-12-5.373-12-12v-160C36 41.373 41.373 36 48 36h160c6.627 0 12 5.373 12 12ZM212 48c0-2.209-1.791-4-4-4h-160c-2.209 0-4 1.791-4 4v160c0 2.209 1.791 4 4 4h160c2.209 0 4-1.791 4-4Z"),
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
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
