package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SurgicalMaskFill: ImageVector
    get() {
        if (_surgicalMaskFill != null) return _surgicalMaskFill!!
        _surgicalMaskFill = remixIcon(
            name = "SurgicalMaskFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.485 3.121l7.757 1.939c.445 .111 .757 .511 .757 .97v.969l1 0c1.1 0 2 .9 2 2v3c0 1.657-1.343 3-3 3l-.421 0c-.535 1.35-1.551 2.486-2.896 3.158l-4.789 2.394c-.563 .281-1.226 .281-1.789 0L6.317 18.158C4.973 17.486 3.956 16.35 3.421 15L3 15C1.343 15 0 13.657 0 12v-3C0 7.895 .895 7 2 7L3 7v-.969c0-.459 .312-.859 .757-.97L11.515 3.121c.318-.08 .652-.08 .97 0ZM3 9h-1v3c0 .552 .448 1 1 1v-4ZM22 9h-1v4c.552 0 1-.448 1-1v-3Z"),
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
        return _surgicalMaskFill!!
    }

private var _surgicalMaskFill: ImageVector? = null
