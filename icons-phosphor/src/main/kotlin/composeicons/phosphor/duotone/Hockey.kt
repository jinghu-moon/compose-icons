package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Hockey: ImageVector
    get() {
        if (_hockey != null) return _hockey!!
        _hockey = phosphorDuotoneIcon(
            name = "Hockey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 160v48h-28.3c-2.349 .001-4.579-1.03-6.1-2.82L127.6 160.48 90.4 205.12c-1.521 1.826-3.774 2.881-6.15 2.88h-28.25v-48h144Z"),
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
                pathData = parseSvgPathData("M224 152h-93.1L38.1 42.82C35.239 39.451 30.189 39.039 26.82 41.9c-3.369 2.861-3.781 7.911-.92 11.28L159.51 210.36c3.039 3.577 7.496 5.639 12.19 5.64h52.3c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16ZM144.5 168h47.5v32h-20.3ZM224 200h-16v-32h16ZM112.18 179.55c-3.367-2.856-8.411-2.444-11.27 .92L84.3 200h-20.3v-32h21.2c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-53.2c-8.837 0-16 7.163-16 16v32c0 8.837 7.163 16 16 16h52.3c4.694-.001 9.151-2.063 12.19-5.64l16.61-19.53c1.374-1.618 2.05-3.715 1.877-5.831-.173-2.116-1.179-4.076-2.797-5.449ZM32 168h16v32h-16ZM149.9 122.82l68-80c2.861-3.369 7.911-3.781 11.28-.92 3.369 2.861 3.781 7.911 .92 11.28l-68 80c-2.861 3.369-7.911 3.781-11.28 .92-3.369-2.861-3.781-7.911-.92-11.28Z"),
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
        return _hockey!!
    }

private var _hockey: ImageVector? = null
