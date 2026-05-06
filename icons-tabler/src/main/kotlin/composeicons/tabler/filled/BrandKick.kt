package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandKick: ImageVector
    get() {
        if (_brandKick != null) return _brandKick!!
        _brandKick = tablerFilledIcon(
            name = "BrandKick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 3c.552 0 1 .448 1 1v3h1v-1c0-.507 .38-.934 .883-.993L12 5h1v-1c0-.507 .38-.934 .883-.993L14 3h6c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-1v1c-0 .507-.38 .934-.883 .993L18 11h-1v2h1c.507 0 .934 .38 .993 .883L19 14v1h1c.507 0 .934 .38 .993 .883L21 16v4c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-1h-1c-.507-0-.934-.38-.993-.883L11 18v-1h-1v3c-0 .507-.38 .934-.883 .993L9 21h-5C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3Z"),
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
        return _brandKick!!
    }

private var _brandKick: ImageVector? = null
