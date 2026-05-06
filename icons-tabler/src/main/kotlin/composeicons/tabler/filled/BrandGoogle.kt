package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandGoogle: ImageVector
    get() {
        if (_brandGoogle != null) return _brandGoogle!!
        _brandGoogle = tablerFilledIcon(
            name = "BrandGoogle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c2.29-.003 4.512 .783 6.29 2.226 .227 .184 .363 .458 .37 .751 .008 .292-.113 .573-.33 .769L16.82 7.108c-.354 .318-.883 .344-1.265 .06C13.47 5.635 10.636 5.612 8.527 7.111 6.417 8.61 5.506 11.293 6.267 13.767c.761 2.474 3.022 4.181 5.61 4.234 2.588 .054 4.918-1.557 5.781-3.997L17.659 14h-3.66c-.507-.001-.933-.38-.992-.883L13 13v-2c0-.552 .448-1 1-1h6.945c.51-0 .938 .383 .994 .89 .04 .367 .061 .737 .061 1.11 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2Z"),
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
        return _brandGoogle!!
    }

private var _brandGoogle: ImageVector? = null
