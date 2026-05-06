package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserSquare: ImageVector
    get() {
        if (_userSquare != null) return _userSquare!!
        _userSquare = phosphorFillIcon(
            name = "UserSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 120c0 24.301-19.699 44-44 44C103.699 164 84 144.301 84 120 84 95.699 103.699 76 128 76c24.301 0 44 19.699 44 44ZM224 48v160c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM208 208v-160h-160v160h3.67c4.762-15.025 13.826-28.324 26.07-38.25q3.08-2.48 6.36-4.62c1.497-.977 3.461-.842 4.81 .33 22.455 19.385 55.725 19.385 78.18 0 1.349-1.172 3.313-1.307 4.81-.33q3.28 2.15 6.36 4.62c12.244 9.926 21.308 23.225 26.07 38.25h3.67Z"),
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
