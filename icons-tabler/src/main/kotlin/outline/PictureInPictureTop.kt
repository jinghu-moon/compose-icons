package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PictureInPictureTop: ImageVector
    get() {
        if (_pictureInPictureTop != null) return _pictureInPictureTop!!
        _pictureInPictureTop = tablerOutlineIcon(
            name = "PictureInPictureTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 5.000 L 5.000 5.000 C 3.895 5.000 3.000 5.895 3.000 7.000 L 3.000 17.000 C 3.000 18.105 3.895 19.000 5.000 19.000 L 19.000 19.000 C 20.105 19.000 21.000 18.105 21.000 17.000 L 21.000 13.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 15.000 10.000 L 20.000 10.000 C 20.552 10.000 21.000 9.552 21.000 9.000 L 21.000 6.000 C 21.000 5.448 20.552 5.000 20.000 5.000 L 15.000 5.000 C 14.448 5.000 14.000 5.448 14.000 6.000 L 14.000 9.000 C 14.000 9.552 14.448 10.000 15.000 10.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _pictureInPictureTop!!
    }

private var _pictureInPictureTop: ImageVector? = null
