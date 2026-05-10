package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Megaphone: ImageVector
    get() {
        if (_megaphone != null) return _megaphone!!
        _megaphone = phosphorFillIcon(
            name = "Megaphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 72h-39.8C157.29 71.83 106.58 68.26 58.29 27.76 53.529 23.762 46.883 22.883 41.247 25.507 35.611 28.131 32.005 33.783 32 40v160c.001 6.219 3.605 11.874 9.242 14.501 5.637 2.627 12.285 1.749 17.048-2.251C96.06 180.57 135.29 171.49 152 168.95v31.72c-.007 5.355 2.666 10.358 7.12 13.33l11 7.33c4.314 2.88 9.757 3.489 14.601 1.635 4.844-1.854 8.489-5.941 9.779-10.965l11.77-44.36c25.262-3.104 43.709-25.385 42.044-50.782C246.649 91.461 225.451 71.779 200 72ZM179 207.89v.11l-11-7.33v-32.67h21.6ZM200 152h-32v-64h32c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
