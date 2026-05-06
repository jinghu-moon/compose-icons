package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserRectangle: ImageVector
    get() {
        if (_userRectangle != null) return _userRectangle!!
        _userRectangle = phosphorRegularIcon(
            name = "UserRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM96 120c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C110.327 152 96 137.673 96 120ZM72.57 200C84.001 180.194 105.132 167.992 128 167.992c22.868 0 43.999 12.202 55.43 32.008ZM216 200h-14.67c-8.445-19.285-24.139-34.472-43.69-42.28 16.098-12.638 22.412-34.092 15.727-53.436C166.681 84.941 148.466 71.965 128 71.965c-20.466 0-38.681 12.977-45.367 32.32-6.686 19.343-.371 40.798 15.727 53.436C78.809 165.528 63.115 180.715 54.67 200h-14.67v-144h176v144Z"),
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
        return _userRectangle!!
    }

private var _userRectangle: ImageVector? = null
