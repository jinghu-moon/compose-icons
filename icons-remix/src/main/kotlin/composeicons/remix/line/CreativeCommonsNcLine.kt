package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CreativeCommonsNcLine: ImageVector
    get() {
        if (_creativeCommonsNcLine != null) return _creativeCommonsNcLine!!
        _creativeCommonsNcLine = remixIcon(
            name = "CreativeCommonsNcLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2C6.477 2 2 6.477 2 12c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2ZM7.094 5.68C8.449 4.627 10.151 4 12 4c4.418 0 8 3.582 8 8 0 1.849-.627 3.551-1.68 4.906L16.165 14.751c.213-.368 .335-.795 .335-1.251C16.5 12.119 15.381 11 14 11h-4c-.276 0-.5-.224-.5-.5C9.5 10.224 9.724 10 10 10h5.5v-2h-2.5v-2h-2v2h-1c-.182 0-.359 .019-.53 .056L7.094 5.68ZM5.68 7.094 7.835 9.249c-.213 .368-.335 .795-.335 1.251C7.5 11.881 8.619 13 10 13h4c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-5.5v2h2.5v2h2v-2h1c.182 0 .359-.019 .53-.056l2.376 2.376C15.551 19.373 13.849 20 12 20 7.582 20 4 16.418 4 12 4 10.151 4.627 8.449 5.68 7.094Z"),
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
        return _creativeCommonsNcLine!!
    }

private var _creativeCommonsNcLine: ImageVector? = null
