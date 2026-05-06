package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserSquare: ImageVector
    get() {
        if (_userSquare != null) return _userSquare!!
        _userSquare = phosphorDuotoneIcon(
            name = "UserSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 40h-160c-4.418 0-8 3.582-8 8v160c0 4.418 3.582 8 8 8h160c4.418 0 8-3.582 8-8v-160c0-4.418-3.582-8-8-8ZM57.78 216C65.248 183.233 94.392 159.991 128 160 105.909 160 88 142.091 88 120 88 97.909 105.909 80 128 80c22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40 33.608-.009 62.752 23.233 70.22 56Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM96 120c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C110.327 152 96 137.673 96 120ZM68.67 208c4.097-10.077 10.678-18.952 19.13-25.8 23.456-18.934 56.944-18.934 80.4 0 8.452 6.848 15.033 15.723 19.13 25.8ZM208 208h-3.67c-7.202-22.936-24.351-41.407-46.69-50.29 16.098-12.638 22.412-34.093 15.727-53.436C166.681 84.931 148.466 71.955 128 71.955c-20.466 0-38.681 12.977-45.367 32.32-6.686 19.343-.371 40.798 15.727 53.436C76.021 166.593 58.872 185.064 51.67 208h-3.67v-160h160v160Z"),
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
