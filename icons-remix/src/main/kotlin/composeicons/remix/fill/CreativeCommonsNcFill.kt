package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CreativeCommonsNcFill: ImageVector
    get() {
        if (_creativeCommonsNcFill != null) return _creativeCommonsNcFill!!
        _creativeCommonsNcFill = remixIcon(
            name = "CreativeCommonsNcFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.256 5.672 7.835 9.249c-.213 .368-.335 .796-.335 1.251C7.5 11.881 8.619 13 10 13h4l.09 .008c.233 .042 .41 .246 .41 .492 0 .276-.224 .5-.5 .5h-5.5v2h2.5v2h2v-2h1c.182 0 .359-.019 .53-.056l3.798 3.8C16.604 21.154 14.401 22 12 22 6.477 22 2 17.523 2 12 2 9.599 2.846 7.396 4.256 5.672ZM12 2c5.523 0 10 4.477 10 10 0 2.401-.846 4.604-2.256 6.328L16.165 14.751c.213-.368 .335-.795 .335-1.251C16.5 12.119 15.381 11 14 11h-4l-.09-.008c-.233-.042-.41-.246-.41-.492C9.5 10.224 9.724 10 10 10h5.5v-2h-2.5v-2h-2v2h-1c-.181 0-.358 .019-.529 .056L5.672 4.256C7.396 2.846 9.599 2 12 2Z"),
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
        return _creativeCommonsNcFill!!
    }

private var _creativeCommonsNcFill: ImageVector? = null
