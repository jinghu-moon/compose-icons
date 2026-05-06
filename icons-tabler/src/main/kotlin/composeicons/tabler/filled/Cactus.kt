package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cactus: ImageVector
    get() {
        if (_cactus != null) return _cactus!!
        _cactus = tablerFilledIcon(
            name = "Cactus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 22c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L7 20h2v-6C6.869 14 5.112 12.329 5.005 10.2L5 10v-1c.001-.529 .413-.966 .941-.997 .528-.031 .989 .355 1.052 .88L7 9v1c-0 1.047 .806 1.917 1.85 1.995L9 12v-7C8.998 3.376 10.289 2.046 11.912 1.998c1.623-.048 2.989 1.205 3.083 2.826L15 5v10c1.047 0 1.917-.806 1.995-1.85L17 13v-5c.001-.529 .413-.966 .941-.997 .528-.031 .989 .355 1.052 .88L19 8v5c0 2.131-1.671 3.888-3.8 3.995L15 17v3h2c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L17 22h-10Z"),
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
        return _cactus!!
    }

private var _cactus: ImageVector? = null
