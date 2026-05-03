package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PictureInPicture2: ImageVector
    get() {
        if (_pictureInPicture2 != null) return _pictureInPicture2!!
        _pictureInPicture2 = lucideOutlineIcon(
            name = "PictureInPicture2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 9.000 L 21.000 6.000 C 21.000 4.895 20.105 4.000 19.000 4.000 L 4.000 4.000 C 2.895 4.000 2.000 4.895 2.000 6.000 L 2.000 16.000 C 2.000 17.100 2.900 18.000 4.000 18.000 L 8.000 18.000"),
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
        pathData = parseSvgPathData("M 14.000 13.000 L 20.000 13.000 C 21.105 13.000 22.000 13.895 22.000 15.000 L 22.000 18.000 C 22.000 19.105 21.105 20.000 20.000 20.000 L 14.000 20.000 C 12.895 20.000 12.000 19.105 12.000 18.000 L 12.000 15.000 C 12.000 13.895 12.895 13.000 14.000 13.000 Z"),
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
        return _pictureInPicture2!!
    }

private var _pictureInPicture2: ImageVector? = null
