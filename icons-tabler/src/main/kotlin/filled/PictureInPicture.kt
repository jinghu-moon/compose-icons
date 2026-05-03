package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PictureInPicture: ImageVector
    get() {
        if (_pictureInPicture != null) return _pictureInPicture!!
        _pictureInPicture = tablerFilledIcon(
            name = "PictureInPicture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 4.000 C 20.657 4.000 22.000 5.343 22.000 7.000 L 22.000 11.000 C 22.000 11.552 21.552 12.000 21.000 12.000 C 20.448 12.000 20.000 11.552 20.000 11.000 L 20.000 7.000 C 20.000 6.448 19.552 6.000 19.000 6.000 L 5.000 6.000 C 4.448 6.000 4.000 6.448 4.000 7.000 L 4.000 17.000 C 4.000 17.552 4.448 18.000 5.000 18.000 L 11.000 18.000 C 11.552 18.000 12.000 18.448 12.000 19.000 C 12.000 19.552 11.552 20.000 11.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 7.000 C 2.000 5.343 3.343 4.000 5.000 4.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 20.000 13.000 C 21.105 13.000 22.000 13.895 22.000 15.000 L 22.000 18.000 C 22.000 19.105 21.105 20.000 20.000 20.000 L 15.000 20.000 C 13.895 20.000 13.000 19.105 13.000 18.000 L 13.000 15.000 C 13.000 13.895 13.895 13.000 15.000 13.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _pictureInPicture!!
    }

private var _pictureInPicture: ImageVector? = null
