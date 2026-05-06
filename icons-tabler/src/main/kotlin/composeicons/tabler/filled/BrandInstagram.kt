package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandInstagram: ImageVector
    get() {
        if (_brandInstagram != null) return _brandInstagram!!
        _brandInstagram = tablerFilledIcon(
            name = "BrandInstagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 3c2.761 0 5 2.239 5 5v8c0 2.761-2.239 5-5 5h-8C5.239 21 3 18.761 3 16v-8C3 5.239 5.239 3 8 3ZM12 8C9.869 8 8.112 9.671 8.005 11.8L8 12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C16 9.791 14.209 8 12 8M16.5 6.5c-.507 0-.934 .38-.993 .883l-.007 .127c.001 .529 .413 .966 .941 .997 .528 .031 .989-.355 1.052-.88l.007-.127c0-.552-.448-1-1-1"),
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
        return _brandInstagram!!
    }

private var _brandInstagram: ImageVector? = null
