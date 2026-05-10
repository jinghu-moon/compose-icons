package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Translate: ImageVector
    get() {
        if (_translate != null) return _translate!!
        _translate = phosphorFillIcon(
            name = "Translate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 129.89 175.06 160h-30.12l6.36-12.7h0ZM224 48v160c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM207.16 188.42l-40-80c-1.353-2.715-4.126-4.431-7.16-4.431-3.034 0-5.807 1.716-7.16 4.431l-13.18 26.38c-8.478-1.661-16.518-5.066-23.61-10C127.103 112.286 133.942 96.614 135.6 80h16.4c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-40v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h63.48c-1.587 12.623-6.916 24.482-15.3 34.05-3.552-4.147-6.575-8.718-9-13.61C93.137 96.631 88.438 95.133 84.568 97.057c-3.87 1.924-5.512 6.575-3.708 10.503 3.062 6.174 6.892 11.937 11.4 17.15C81.605 132.077 68.954 136.016 56 136c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 17.367 .018 34.264-5.646 48.11-16.13 8.378 6.404 17.963 11.05 28.18 13.66l-19.45 38.89c-1.977 3.954-.374 8.763 3.58 10.74 3.954 1.977 8.763 .374 10.74-3.58L136.94 176h46.12l9.78 19.58c1.977 3.954 6.786 5.557 10.74 3.58 3.954-1.977 5.557-6.786 3.58-10.74Z"),
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
        return _translate!!
    }

private var _translate: ImageVector? = null
