package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PictureInPictureTop: ImageVector
    get() {
        if (_pictureInPictureTop != null) return _pictureInPictureTop!!
        _pictureInPictureTop = tablerFilledIcon(
            name = "PictureInPictureTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 4.000 C 11.552 4.000 12.000 4.448 12.000 5.000 C 12.000 5.552 11.552 6.000 11.000 6.000 L 5.000 6.000 C 4.448 6.000 4.000 6.448 4.000 7.000 L 4.000 17.000 C 4.000 17.552 4.448 18.000 5.000 18.000 L 19.000 18.000 C 19.552 18.000 20.000 17.552 20.000 17.000 L 20.000 13.000 C 20.000 12.448 20.448 12.000 21.000 12.000 C 21.552 12.000 22.000 12.448 22.000 13.000 L 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 7.000 C 2.000 5.343 3.343 4.000 5.000 4.000 Z"),
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
        pathData = parseSvgPathData("M 20.000 4.000 C 21.105 4.000 22.000 4.895 22.000 6.000 L 22.000 9.000 C 22.000 10.105 21.105 11.000 20.000 11.000 L 15.000 11.000 C 13.895 11.000 13.000 10.105 13.000 9.000 L 13.000 6.000 C 13.000 4.895 13.895 4.000 15.000 4.000 Z"),
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
        return _pictureInPictureTop!!
    }

private var _pictureInPictureTop: ImageVector? = null
