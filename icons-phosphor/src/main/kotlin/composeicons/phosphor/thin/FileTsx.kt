package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileTsx: ImageVector
    get() {
        if (_fileTsx != null) return _fileTsx!!
        _fileTsx = phosphorThinIcon(
            name = "FileTsx",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.25 154.33 192.92 180l18.33 25.67c.617 .863 .865 1.936 .691 2.983-.174 1.046-.757 1.981-1.621 2.597-.674 .491-1.486 .754-2.32 .75-1.293 .003-2.507-.619-3.26-1.67L188 186.88l-16.75 23.45c-1.287 1.798-3.787 2.212-5.585 .925-1.798-1.287-2.212-3.787-.925-5.585L183.08 180 164.74 154.33c-1.287-1.798-.873-4.298 .925-5.585 1.798-1.287 4.298-.873 5.585 .925L188 173.12l16.74-23.45c1.287-1.798 3.787-2.212 5.585-.925 1.798 1.287 2.212 3.787 .925 5.585ZM122.49 175.15c-10.53-3-15.08-4.91-14.42-10.08 .179-2.627 1.563-5.023 3.75-6.49 6.25-4.23 18.77-2.24 23.06-1.11 2.137 .566 4.329-.708 4.895-2.845 .566-2.137-.708-4.329-2.845-4.895-3.44-.838-6.947-1.377-10.48-1.61-8.12-.54-14.54 .75-19.1 3.82-4.085 2.774-6.73 7.216-7.22 12.13-1.58 12.49 10.46 16 20.14 18.77 11.26 3.25 16.47 5.49 15.64 11.94-.201 2.73-1.642 5.217-3.91 6.75-6.27 4.17-18.61 2.05-22.83 .88-1.395-.446-2.922-.094-3.981 .918-1.059 1.012-1.48 2.521-1.099 3.935 .382 1.414 1.505 2.506 2.929 2.847 4.627 1.213 9.387 1.848 14.17 1.89 5.18 0 10.83-.86 15.22-3.77 4.201-2.824 6.924-7.373 7.43-12.41C145.64 181.84 132.26 178 122.49 175.15ZM80 148h-40c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h16v52c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-52h16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM212 88v24c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-52c-2.209 0-4-1.791-4-4v-52h-92c-2.209 0-4 1.791-4 4v72c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-72C44 33.373 49.373 28 56 28h96c1.061-.001 2.079 .42 2.83 1.17l56 56c.75 .751 1.171 1.769 1.17 2.83ZM198.34 84 156 41.65v42.35Z"),
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
        return _fileTsx!!
    }

private var _fileTsx: ImageVector? = null
