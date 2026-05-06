package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mountain: ImageVector
    get() {
        if (_mountain != null) return _mountain!!
        _mountain = tablerFilledIcon(
            name = "Mountain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.18 10.95l2.54 3.175 .084 .093c.392 .38 1.017 .376 1.403-.01l1.637-1.638 1.324 1.985c.155 .233 .402 .391 .679 .434 .277 .043 .559-.032 .778-.208l3.632-2.906 3.647 7.697c.147 .31 .125 .673-.059 .963-.183 .29-.502 .465-.845 .465h-18c-.343 0-.662-.175-.845-.465-.183-.29-.206-.653-.059-.963ZM12 3.072c1.276-0 2.437 .735 2.983 1.888l2.394 5.057-3.15 2.52L12.832 10.445l-.075-.099c-.182-.21-.443-.335-.72-.346-.278-.01-.547 .096-.744 .293L9.582 12.002 8.281 10.375 7.13 8.94 9.018 4.96C9.564 3.807 10.725 3.072 12 3.072"),
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
        return _mountain!!
    }

private var _mountain: ImageVector? = null
