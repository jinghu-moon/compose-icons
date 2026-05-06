package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Puzzle: ImageVector
    get() {
        if (_puzzle != null) return _puzzle!!
        _puzzle = tablerFilledIcon(
            name = "Puzzle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 2c1.589-0 2.902 1.238 2.995 2.824L13 5v1h3c1.047-0 1.917 .806 1.995 1.85L18 8v3h1c1.624-.002 2.954 1.289 3.002 2.912 .048 1.623-1.205 2.989-2.826 3.083L19 17h-1v3c0 1.047-.806 1.917-1.85 1.995L16 22h-3c-1.047 0-1.917-.806-1.995-1.85L11 20v-1c-.001-.529-.413-.966-.941-.997-.528-.031-.989 .355-1.052 .88L9 19v1c0 1.047-.806 1.917-1.85 1.995L7 22h-3C2.953 22 2.083 21.194 2.005 20.15L2 20v-3c-0-1.047 .806-1.917 1.85-1.995L4 15h1c.529-.001 .966-.413 .997-.941 .031-.528-.355-.989-.88-1.052L5 13h-1C2.953 13 2.083 12.194 2.005 11.15L2 11v-3C2 6.953 2.806 6.083 3.85 6.005L4 6h3v-1C7 3.343 8.343 2 10 2Z"),
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
        return _puzzle!!
    }

private var _puzzle: ImageVector? = null
