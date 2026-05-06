package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserSquare: ImageVector
    get() {
        if (_userSquare != null) return _userSquare!!
        _userSquare = phosphorRegularIcon(
            name = "UserSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM96 120c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C110.327 152 96 137.673 96 120ZM68.67 208c4.094-10.078 10.675-18.955 19.13-25.8 23.456-18.934 56.944-18.934 80.4 0 8.455 6.845 15.036 15.722 19.13 25.8ZM208 208h-3.67c-7.204-22.931-24.348-41.401-46.68-50.29 16.093-12.641 22.402-34.094 15.715-53.434C166.677 84.936 148.464 71.962 128 71.962c-20.464 0-38.677 12.974-45.365 32.314-6.687 19.34-.378 40.793 15.715 53.434C76.018 166.599 58.874 185.069 51.67 208h-3.67v-160h160v160Z"),
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
        return _userSquare!!
    }

private var _userSquare: ImageVector? = null
