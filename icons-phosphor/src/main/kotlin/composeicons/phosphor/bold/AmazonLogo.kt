package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) return _amazonLogo!!
        _amazonLogo = phosphorBoldIcon(
            name = "AmazonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 168v32c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-3.09C215.56 208.41 180.25 236 128 236 63.4 236 24.7 193.82 23.08 192c-3.145-3.141-4.296-7.763-2.991-12.011 1.304-4.249 4.85-7.429 9.215-8.265 4.365-.836 8.835 .81 11.616 4.276 .3 .33 33.48 36 87.08 36 42.65 0 72.34-22.58 82.87-32h-2.87c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12ZM156 86.08v-2.08c.004-14.172-9.313-26.659-22.9-30.689C119.513 49.281 104.894 54.668 97.17 66.55c-3.617 5.553-11.052 7.122-16.605 3.505C75.012 66.438 73.443 59.003 77.06 53.45 90.582 32.666 116.162 23.249 139.933 30.303 163.703 37.358 180.005 59.205 180 84v92c-.042 6.244-4.865 11.413-11.092 11.886-6.227 .473-11.775-3.909-12.758-10.076-23.247 16.342-55.048 12.683-73.975-8.512C63.247 148.102 63.195 116.091 82.053 94.834 100.911 73.577 132.7 69.814 156 86.08ZM156 132c0-17.673-14.327-32-32-32-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32Z"),
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
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null
