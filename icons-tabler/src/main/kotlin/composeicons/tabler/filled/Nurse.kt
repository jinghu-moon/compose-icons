package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Nurse: ImageVector
    get() {
        if (_nurse != null) return _nurse!!
        _nurse = tablerFilledIcon(
            name = "Nurse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.002 4c2.866 0 6.7 1.365 9.532 3.155 .345 .218 .523 .623 .45 1.024l-2 11c-.087 .475-.501 .821-.984 .821h-14c-.483 0-.897-.346-.984-.821L2.016 8.179c-.073-.401 .105-.806 .45-1.024C5.3 5.363 9.19 3.995 12.002 4M12 9c-.552 0-1 .448-1 1v1h-1c-.507 0-.934 .38-.993 .883L9 12c0 .552 .448 1 1 1h1v1c0 .507 .38 .934 .883 .993L12 15c.552 0 1-.448 1-1v-1h1c.507-0 .934-.38 .993-.883L15 12c0-.552-.448-1-1-1h-1v-1c-0-.507-.38-.934-.883-.993Z"),
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
        return _nurse!!
    }

private var _nurse: ImageVector? = null
