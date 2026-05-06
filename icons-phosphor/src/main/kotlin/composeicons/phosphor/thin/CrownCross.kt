package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CrownCross: ImageVector
    get() {
        if (_crownCross != null) return _crownCross!!
        _crownCross = phosphorThinIcon(
            name = "CrownCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 60c-15.15 0-29.15 5.06-39.43 14.25-3.291 2.935-6.173 6.298-8.57 10v-48.25h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v48.26c-2.397-3.702-5.279-7.065-8.57-10C105.15 65.06 91.15 60 76 60 45.086 60.033 20.033 85.086 20 116c0 28.36 13.79 46.38 25.37 56.51 6.751 5.9 14.388 10.702 22.63 14.23v21.26c0 6.627 5.373 12 12 12h96c6.627 0 12-5.373 12-12v-21.26c8.242-3.529 15.879-8.33 22.63-14.23C222.21 162.38 236 144.36 236 116 235.967 85.086 210.914 60.033 180 60ZM205.59 166.29c-6.728 5.963-14.466 10.677-22.85 13.92-1.634 .542-2.737 2.069-2.74 3.79v24c0 2.209-1.791 4-4 4h-96c-2.209 0-4-1.791-4-4v-24c-.001-1.719-1.1-3.244-2.73-3.79C64.881 176.971 57.139 172.256 50.41 166.29 35.54 153.17 28 136.25 28 116 28.028 89.502 49.502 68.028 76 68c27.81 0 48 18.5 48 44v64c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-64c0-25.5 20.19-44 48-44 26.498 .028 47.972 21.502 48 48 0 20.25-7.54 37.17-22.41 50.29Z"),
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
        return _crownCross!!
    }

private var _crownCross: ImageVector? = null
