package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandYoutube: ImageVector
    get() {
        if (_brandYoutube != null) return _brandYoutube!!
        _brandYoutube = tablerFilledIcon(
            name = "BrandYoutube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 3c2.761 0 5 2.239 5 5v8c0 2.761-2.239 5-5 5h-12C3.239 21 1 18.761 1 16v-8C1 5.239 3.239 3 6 3ZM9 9v6c0 .36 .194 .692 .507 .869 .313 .177 .698 .173 1.007-.012l5-3c.301-.181 .485-.506 .485-.857 0-.351-.184-.676-.485-.857l-5-3C10.205 7.958 9.821 7.953 9.507 8.131 9.194 8.308 9 8.64 9 9Z"),
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
        return _brandYoutube!!
    }

private var _brandYoutube: ImageVector? = null
