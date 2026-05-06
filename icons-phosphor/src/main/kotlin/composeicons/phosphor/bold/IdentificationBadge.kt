package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) return _identificationBadge!!
        _identificationBadge = phosphorBoldIcon(
            name = "IdentificationBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 20h-144C44.954 20 36 28.954 36 40v176c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-176C220 28.954 211.046 20 200 20ZM196 212h-136v-168h136ZM84 68C84 61.373 89.373 56 96 56h64c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-64C89.373 80 84 74.627 84 68ZM92.8 195.37c9.083-9.798 21.839-15.366 35.2-15.366 13.361 0 26.117 5.569 35.2 15.366 4.507 4.86 12.1 5.147 16.96 .64 4.86-4.507 5.147-12.1 .64-16.96-5.53-5.941-12.025-10.904-19.21-14.68 15.08-17.829 13.605-44.333-3.359-60.379-16.964-16.047-43.509-16.047-60.473 0-16.964 16.047-18.438 42.55-3.359 60.379-7.18 3.778-13.671 8.741-19.2 14.68-4.507 4.86-4.22 12.453 .64 16.96 4.86 4.507 12.453 4.22 16.96-.64ZM128 116c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20Z"),
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
        return _identificationBadge!!
    }

private var _identificationBadge: ImageVector? = null
