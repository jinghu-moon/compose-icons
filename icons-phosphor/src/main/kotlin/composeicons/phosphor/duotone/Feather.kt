package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = phosphorDuotoneIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215.8 119.6l-69.26 70.06c-1.499 1.497-3.531 2.339-5.65 2.34h-76.69v-76.69c.001-2.119 .843-4.151 2.34-5.65L112.2 64.52v79.48l24-24Z"),
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
                pathData = parseSvgPathData("M221.28 34.75C196.289 9.77 155.781 9.77 130.79 34.75L60.69 104c-3.01 2.993-4.699 7.065-4.69 11.31v73.38L26.34 218.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L67.32 200h73.38c4.24 .007 8.307-1.678 11.3-4.68h0l69.23-70c12.027-11.998 18.791-28.286 18.8-45.275 .009-16.989-6.736-33.284-18.75-45.295ZM142.07 46.06c18.376-18.384 48.046-18.8 66.931-.94 18.885 17.861 20.121 47.509 2.789 66.88h-56.46L189.68 77.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L120 124.69v-56.82ZM72 115.35 104 83.68v57l-32 32ZM140.7 184h-57.38l56-56h56.74Z"),
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
        return _feather!!
    }

private var _feather: ImageVector? = null
