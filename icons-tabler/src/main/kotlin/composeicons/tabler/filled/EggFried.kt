package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EggFried: ImageVector
    get() {
        if (_eggFried != null) return _eggFried!!
        _eggFried = tablerFilledIcon(
            name = "EggFried",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.001 1.996q.06 0 .117 .007l.155 .003c1.637 .074 3.173 .815 4.25 2.05l.176 .21c.904 1.137 1.364 2.563 1.296 4.014l-.018 .244 .106 .06c1.092 .666 1.799 1.813 1.904 3.087l.011 .204c.038 1.21-.474 2.372-1.392 3.161l-.085 .069 .083 .16c.428 .888 .513 1.902 .239 2.848l-.065 .204c-.425 1.222-1.416 2.163-2.658 2.525-1.242 .362-2.583 .101-3.599-.701l-.115-.096-.092 .1c-1.066 1.084-2.503 1.722-4.022 1.787l-.257 .006C8.079 21.938 6.246 20.986 5.123 19.385 3.999 17.785 3.726 15.737 4.391 13.898l.034-.089-.155-.12C2.101 11.948 1.413 8.945 2.608 6.433l.105-.211C4.086 3.604 7.161 2.376 9.959 3.328l.188 .068 .073-.06c.996-.808 2.224-1.275 3.505-1.334ZM12 9c-1.598 0-2.916 1.254-2.996 2.85L9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9"),
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
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
