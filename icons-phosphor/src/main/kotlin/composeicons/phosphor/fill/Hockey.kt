package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hockey: ImageVector
    get() {
        if (_hockey != null) return _hockey!!
        _hockey = phosphorFillIcon(
            name = "Hockey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M149.9 122.82l68-80c2.861-3.369 7.911-3.781 11.28-.92 3.369 2.861 3.781 7.911 .92 11.28l-68 80c-2.861 3.369-7.911 3.781-11.28 .92-3.369-2.861-3.781-7.911-.92-11.28ZM240 168v32c0 8.837-7.163 16-16 16h-52.3c-4.694-.001-9.151-2.063-12.19-5.64L25.9 53.18h0c-2.861-3.369-2.449-8.419 .92-11.28 3.369-2.861 8.419-2.449 11.28 .92L130.9 152h93.1c8.837 0 16 7.163 16 16ZM224 168h-16v32h16ZM115.3 183.06c1.269 1.494 1.269 3.686 0 5.18L96.49 210.36c-3.039 3.577-7.496 5.639-12.19 5.64h-52.3c-8.837 0-16-7.163-16-16v-32c0-8.837 7.163-16 16-16h55.05c1.157 .014 2.251 .528 3 1.41ZM48 168h-16v32h16Z"),
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
