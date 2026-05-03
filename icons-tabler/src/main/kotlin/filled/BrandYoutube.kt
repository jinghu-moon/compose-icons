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
                pathData = parseSvgPathData("M 18.000 3.000 C 20.761 3.000 23.000 5.239 23.000 8.000 L 23.000 16.000 C 23.000 18.761 20.761 21.000 18.000 21.000 L 6.000 21.000 C 3.239 21.000 1.000 18.761 1.000 16.000 L 1.000 8.000 C 1.000 5.239 3.239 3.000 6.000 3.000 ZM 9.000 9.000 L 9.000 15.000 C 9.000 15.360 9.194 15.692 9.507 15.869 C 9.821 16.047 10.205 16.042 10.514 15.857 L 15.514 12.857 C 15.815 12.676 15.999 12.351 15.999 12.000 C 15.999 11.649 15.815 11.324 15.514 11.143 L 10.514 8.143 C 10.205 7.958 9.821 7.953 9.507 8.131 C 9.194 8.308 9.000 8.640 9.000 9.000 Z"),
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
