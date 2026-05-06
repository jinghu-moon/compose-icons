package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Umbrella: ImageVector
    get() {
        if (_umbrella != null) return _umbrella!!
        _umbrella = tablerFilledIcon(
            name = "Umbrella",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c4.971 0 9 4.029 9 9-0 .507-.38 .934-.883 .993L20 13h-7v5c.001 .529 .413 .966 .941 .997 .528 .031 .989-.355 1.052-.88L15 18c0-.552 .448-1 1-1 .552 0 1 .448 1 1 .002 1.624-1.289 2.954-2.912 3.002-1.623 .048-2.989-1.205-3.083-2.826L11 18v-5h-7c-.507-0-.934-.38-.993-.883L3 12C3 7.029 7.029 3 12 3Z"),
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
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
