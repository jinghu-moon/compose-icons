package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = phosphorRegularIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 40h-160C39.163 40 32 47.163 32 56v56c0 52.72 25.52 84.67 46.93 102.19 23.06 18.86 46 25.27 47 25.53 1.375 .374 2.825 .374 4.2 0 1-.26 23.91-6.67 47-25.53C198.48 196.67 224 164.72 224 112v-56c0-8.837-7.163-16-16-16ZM208 56v56c0 2.71-.08 5.37-.23 8h-71.77v-64ZM48 56h72v64h-71.77C48.08 117.37 48 114.71 48 112ZM50.06 136h69.94v84.55C108.872 215.765 98.463 209.458 89.07 201.81 67.92 184.51 54.87 162.44 50.08 136ZM167.4 201.42c-9.519 7.811-20.089 14.244-31.4 19.11v-84.53h69.91c-4.75 26.24-17.64 48.18-38.51 65.42Z"),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
