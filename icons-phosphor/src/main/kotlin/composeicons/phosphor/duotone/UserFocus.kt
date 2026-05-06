package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserFocus: ImageVector
    get() {
        if (_userFocus != null) return _userFocus!!
        _userFocus = phosphorDuotoneIcon(
            name = "UserFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 112c0 17.673-14.327 32-32 32C110.327 144 96 129.673 96 112 96 94.327 110.327 80 128 80c17.673 0 32 14.327 32 32Z"),
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
                pathData = parseSvgPathData("M224 40v36c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-28h-28c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h36c4.418 0 8 3.582 8 8ZM216 172c-4.418 0-8 3.582-8 8v28h-28c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h36c4.418 0 8-3.582 8-8v-36c0-4.418-3.582-8-8-8ZM76 208h-28v-28c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v36c0 4.418 3.582 8 8 8h36c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM40 84c4.418 0 8-3.582 8-8v-28h28c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-36c-4.418 0-8 3.582-8 8v36c0 4.418 3.582 8 8 8ZM176 176c-2.52 .006-4.895-1.176-6.41-3.19-9.82-13.094-25.233-20.8-41.6-20.8-16.367 0-31.78 7.706-41.6 20.8-2.656 3.535-7.675 4.246-11.21 1.59-3.535-2.656-4.246-7.675-1.59-11.21C80.68 153.697 90.129 146.223 101 141.51 88.807 130.378 84.707 112.899 90.677 97.506 96.646 82.113 111.46 71.97 127.97 71.97c16.51 0 31.324 10.144 37.293 25.536 5.97 15.393 1.869 32.872-10.323 44.004 10.878 4.71 20.335 12.184 27.43 21.68 1.821 2.42 2.119 5.66 .771 8.372-1.348 2.712-4.112 4.429-7.141 4.438ZM128 136c13.255 0 24-10.745 24-24C152 98.745 141.255 88 128 88c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24Z"),
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
        return _userFocus!!
    }

private var _userFocus: ImageVector? = null
