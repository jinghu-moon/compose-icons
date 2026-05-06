package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flag3: ImageVector
    get() {
        if (_flag3 != null) return _flag3!!
        _flag3 = tablerFilledIcon(
            name = "Flag3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4c.852 0 1.297 .986 .783 1.623l-.076 .084L15.915 9.5l3.792 3.793c.603 .602 .22 1.614-.593 1.701L19 15h-13v6c-0 .507-.38 .934-.883 .993L5 22c-.507-0-.934-.38-.993-.883L4 21v-16c0-.507 .38-.934 .883-.993L5 4h14Z"),
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
        return _flag3!!
    }

private var _flag3: ImageVector? = null
