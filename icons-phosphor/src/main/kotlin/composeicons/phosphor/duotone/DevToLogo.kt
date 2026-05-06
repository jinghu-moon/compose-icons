package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DevToLogo: ImageVector
    get() {
        if (_devToLogo != null) return _devToLogo!!
        _devToLogo = phosphorDuotoneIcon(
            name = "DevToLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 72v112c0 4.418-3.582 8-8 8h-208c-4.418 0-8-3.582-8-8v-112c0-4.418 3.582-8 8-8h208c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M232 56h-208C15.163 56 8 63.163 8 72v112c0 8.837 7.163 16 16 16h208c8.837 0 16-7.163 16-16v-112c0-8.837-7.163-16-16-16ZM232 184h-208v-112h208v112ZM128 104v16h8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-8v16h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-24c-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM215.7 98.17l-18 64c-.972 3.448-4.118 5.83-7.7 5.83-3.582 0-6.728-2.382-7.7-5.83l-18-64c-1.177-4.245 1.299-8.643 5.539-9.838 4.24-1.195 8.648 1.263 9.861 5.498L190 130.45 200.3 93.83c.766-2.762 2.951-4.903 5.728-5.613 2.777-.71 5.721 .12 7.718 2.175 1.997 2.055 2.743 5.022 1.954 7.777ZM64 88h-8c-4.418 0-8 3.582-8 8v64c0 4.418 3.582 8 8 8h8c17.673 0 32-14.327 32-32v-16C96 102.327 81.673 88 64 88ZM80 136c0 8.837-7.163 16-16 16v-48c8.837 0 16 7.163 16 16Z"),
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
        return _devToLogo!!
    }

private var _devToLogo: ImageVector? = null
