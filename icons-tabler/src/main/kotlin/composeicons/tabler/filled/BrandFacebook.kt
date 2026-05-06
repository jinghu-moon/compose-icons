package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandFacebook: ImageVector
    get() {
        if (_brandFacebook != null) return _brandFacebook!!
        _brandFacebook = tablerFilledIcon(
            name = "BrandFacebook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 2c.507 0 .934 .38 .993 .883L19 3v4c-0 .507-.38 .934-.883 .993L18 8h-3v1h3c.288 0 .562 .124 .752 .341 .19 .217 .277 .505 .239 .79l-.02 .112-1 4c-.102 .404-.444 .703-.858 .75L17 15h-2v6c-0 .507-.38 .934-.883 .993L14 22h-4c-.507-0-.934-.38-.993-.883L9 21v-6h-2c-.507-0-.934-.38-.993-.883L6 14v-4c0-.507 .38-.934 .883-.993L7 9h2v-1C9 4.774 11.551 2.125 14.775 2.004L15 2h3Z"),
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
        return _brandFacebook!!
    }

private var _brandFacebook: ImageVector? = null
