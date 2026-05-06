package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandLinkedin: ImageVector
    get() {
        if (_brandLinkedin != null) return _brandLinkedin!!
        _brandLinkedin = tablerFilledIcon(
            name = "BrandLinkedin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c2.761 0 5 2.239 5 5v10c0 2.761-2.239 5-5 5h-10C4.239 22 2 19.761 2 17v-10C2 4.239 4.239 2 7 2ZM8 10c-.552 0-1 .448-1 1v5c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-5C9 10.448 8.552 10 8 10M14 10c-.401-0-.798 .08-1.168 .236l-.125 .057c-.286-.286-.716-.371-1.09-.217-.374 .155-.617 .519-.617 .924v5c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-3c0-.552 .448-1 1-1 .552 0 1 .448 1 1v3c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-3c0-1.657-1.343-3-3-3M8 7c-.507 0-.934 .38-.993 .883L7 8.01c.001 .529 .413 .966 .941 .997 .528 .031 .989-.355 1.052-.88L9 8C9 7.448 8.552 7 8 7"),
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
        return _brandLinkedin!!
    }

private var _brandLinkedin: ImageVector? = null
