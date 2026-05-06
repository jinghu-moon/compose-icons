package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bath: ImageVector
    get() {
        if (_bath != null) return _bath!!
        _bath = tablerFilledIcon(
            name = "Bath",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2c.507 0 .934 .38 .993 .883L12 3v2.25c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L10 5.25v-1.25h-2c-.507 0-.934 .38-.993 .883L7 5v6h13c1.047-0 1.917 .806 1.995 1.85L22 13v3c0 1.475-.638 2.8-1.654 3.715l.486 .73c.296 .441 .196 1.036-.228 1.356-.424 .32-1.024 .253-1.366-.153l-.07-.093-.55-.823c-.432 .147-.882 .235-1.337 .26L17 21h-10c-.551 .001-1.098-.09-1.619-.268l-.549 .823c-.294 .441-.88 .577-1.338 .309-.457-.268-.626-.846-.385-1.318l.059-.1 .486-.73C2.667 18.829 2.074 17.585 2.007 16.259L2 16v-3c-0-1.047 .806-1.917 1.85-1.995L4 11h1v-6C5 3.411 6.238 2.098 7.824 2.005L8 2h3Z"),
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
        return _bath!!
    }

private var _bath: ImageVector? = null
