package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) return _lightningSlash!!
        _lightningSlash = phosphorThinIcon(
            name = "LightningSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L86.77 88.6 45.08 133.27c-.909 .976-1.272 2.342-.967 3.641 .305 1.299 1.238 2.36 2.487 2.829l60.81 22.81L92.08 239.22c-.344 1.75 .512 3.516 2.099 4.33 1.586 .814 3.52 .48 4.741-.82l64.83-69.46L205 218.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM102.68 227l13.24-66.2c.384-1.924-.683-3.842-2.52-4.53L55 134.36 92.17 94.54l66.18 72.79ZM111.39 68.1c-1.614-1.506-1.704-4.034-.2-5.65L157.08 13.29c1.221-1.299 3.155-1.634 4.741-.82 1.586 .814 2.442 2.58 2.099 4.33L148.59 93.45l60.81 22.8c1.253 .471 2.187 1.536 2.49 2.84 .296 1.304-.079 2.67-1 3.64l-22.3 23.89c-1.523 1.526-3.981 1.571-5.558 .102-1.577-1.47-1.706-3.925-.292-5.552L201 121.64 142.6 99.74c-1.833-.687-2.899-2.6-2.52-4.52L153.32 29 117 67.89c-1.504 1.585-4.002 1.67-5.61 .19Z"),
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
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
