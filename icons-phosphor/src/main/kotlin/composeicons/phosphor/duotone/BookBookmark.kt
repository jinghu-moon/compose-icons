package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) return _bookBookmark!!
        _bookBookmark = phosphorDuotoneIcon(
            name = "BookBookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32v160h-136c-13.255 0-24 10.745-24 24v-160C48 42.745 58.745 32 72 32h40v96l32-24 32 24v-96Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208 24h-136C54.327 24 40 38.327 40 56v168c0 4.418 3.582 8 8 8h144c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-136c0-8.837 7.163-16 16-16h136c4.418 0 8-3.582 8-8v-160c0-4.418-3.582-8-8-8ZM120 40h48v72L148.79 97.6c-2.844-2.133-6.756-2.133-9.6 0L120 112ZM200 184h-128c-5.619-.008-11.139 1.472-16 4.29v-132.29C56 47.163 63.163 40 72 40h32v88c0 3.03 1.712 5.8 4.422 7.155 2.71 1.355 5.954 1.063 8.378-.755L144 114l27.21 20.4c1.382 1.037 3.062 1.598 4.79 1.6 1.242-.002 2.467-.289 3.58-.84 2.711-1.357 4.422-4.129 4.42-7.16v-88h16Z"),
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
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null
