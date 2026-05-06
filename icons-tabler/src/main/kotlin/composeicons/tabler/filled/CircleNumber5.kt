package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber5: ImageVector
    get() {
        if (_circleNumber5 != null) return _circleNumber5!!
        _circleNumber5 = tablerFilledIcon(
            name = "CircleNumber5",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM14 7h-4c-.507 0-.934 .38-.993 .883L9 8v4c0 .507 .38 .934 .883 .993L10 13h3v2h-2l-.007-.117c-.062-.525-.523-.911-1.052-.88C9.413 14.034 9.001 14.471 9 15c-0 1.047 .806 1.917 1.85 1.995L11 17h2c1.047 0 1.917-.806 1.995-1.85L15 15v-2c0-1.047-.806-1.917-1.85-1.995L13 11h-2v-2h3c.507-0 .934-.38 .993-.883L15 8c-0-.507-.38-.934-.883-.993L14 7Z"),
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
        return _circleNumber5!!
    }

private var _circleNumber5: ImageVector? = null
