package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) return _flagBannerFold!!
        _flagBannerFold = phosphorThinIcon(
            name = "FlagBannerFold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.36 45.83C234.623 44.689 233.358 44 232 44h-80c-1.567-0-2.99 .914-3.64 2.34L138.52 68h-110.52c-1.59-.016-3.039 .912-3.69 2.363-.651 1.451-.38 3.15 .69 4.327L62.59 116 25 157.31c-1.07 1.177-1.34 2.876-.69 4.327 .651 1.451 2.099 2.379 3.69 2.363h73.09c1.569-.002 2.993-.92 3.64-2.35L114.58 140h71.21l-37.43 82.34c-.439 .968-.475 2.071-.1 3.065 .375 .994 1.131 1.799 2.1 2.235 .516 .233 1.074 .355 1.64 .36 1.569-.002 2.993-.92 3.64-2.35l80-176c.562-1.238 .457-2.677-.28-3.82ZM98.52 156h-61.52L71 118.69c1.386-1.525 1.386-3.855 0-5.38L37 76h97.84ZM189.42 132h-71.21L154.58 52h71.21Z"),
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
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null
