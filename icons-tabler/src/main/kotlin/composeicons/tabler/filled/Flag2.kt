package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flag2: ImageVector
    get() {
        if (_flag2 != null) return _flag2!!
        _flag2 = tablerFilledIcon(
            name = "Flag2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4c.507 0 .934 .38 .993 .883L20 5v9c-0 .507-.38 .934-.883 .993L19 15h-13v6c-0 .507-.38 .934-.883 .993L5 22c-.507-0-.934-.38-.993-.883L4 21v-16c0-.507 .38-.934 .883-.993L5 4h14Z"),
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
        return _flag2!!
    }

private var _flag2: ImageVector? = null
