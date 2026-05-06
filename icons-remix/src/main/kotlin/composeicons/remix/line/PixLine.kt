package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PixLine: ImageVector
    get() {
        if (_pixLine != null) return _pixLine!!
        _pixLine = remixIcon(
            name = "PixLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.473 1.745l7.778 7.778c1.367 1.367 1.367 3.583 0 4.95l-7.778 7.778c-1.367 1.367-3.583 1.367-4.95 0L1.745 14.473C.378 13.106 .378 10.89 1.745 9.523L9.523 1.745c1.367-1.367 3.583-1.367 4.95 0ZM11.998 14.827 9.523 17.302c-.38 .38-.825 .654-1.299 .823l2.713 2.713c.586 .586 1.536 .586 2.121 0l2.713-2.713c-.474-.169-.919-.443-1.299-.823L11.998 14.827ZM5.988 8.108 3.159 10.938c-.586 .586-.586 1.535 0 2.121l2.828 2.828c.586 .586 1.536 .586 2.121 0l2.475-2.475c.781-.781 2.047-.781 2.828 0l2.475 2.475c.586 .586 1.535 .585 2.121 0l2.828-2.828c.586-.586 .586-1.535 0-2.121L18.008 8.109c-.586-.585-1.536-.585-2.121 0l-2.475 2.475c-.781 .781-2.047 .781-2.828 0L8.109 8.109C7.523 7.524 6.574 7.523 5.988 8.108ZM10.937 3.159 8.224 5.872c.474 .169 .919 .443 1.299 .822l2.475 2.475L14.473 6.695c.38-.379 .825-.654 1.299-.822L13.059 3.159c-.586-.586-1.536-.586-2.121 0Z"),
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
        return _pixLine!!
    }

private var _pixLine: ImageVector? = null
