package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = phosphorLightIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.84 35.77c-4.452-2.469-9.893-2.328-14.21 .37L62 112.83v-72.83c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v176c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-72.84l122.63 76.7c4.317 2.698 9.758 2.839 14.21 .37 4.437-2.408 7.189-7.062 7.16-12.11v-160.24c.029-5.048-2.723-9.702-7.16-12.11ZM194 208.12c.005 .687-.383 1.317-1 1.62-.628 .342-1.39 .323-2-.05L62.88 129.56c-.548-.329-.883-.921-.883-1.56 0-.639 .335-1.231 .883-1.56L191 46.31c.3-.19 .645-.297 1-.31 .35 .002 .694 .091 1 .26 .617 .303 1.005 .933 1 1.62Z"),
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
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
