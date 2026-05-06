package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Bathtub: ImageVector
    get() {
        if (_bathtub != null) return _bathtub!!
        _bathtub = phosphorDuotoneIcon(
            name = "Bathtub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 104v40c0 26.51-21.49 48-48 48h-128C37.49 192 16 170.51 16 144v-40h120v40h64v-40Z"),
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
                pathData = parseSvgPathData("M240 96h-32c0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8h-64v-44C64 45.373 69.373 40 76 40c5.792-.024 10.833 3.952 12.16 9.59 .915 4.291 5.115 7.045 9.414 6.173 4.3-.872 7.095-5.044 6.266-9.353C101.04 33.288 89.417 23.932 76 24 60.536 24 48 36.536 48 52v44h-32c-4.418 0-8 3.582-8 8v40c.033 30.914 25.086 55.967 56 56v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h96v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16c30.914-.033 55.967-25.086 56-56v-40c0-4.418-3.582-8-8-8ZM192 104v32h-48v-32ZM232 144c0 22.091-17.909 40-40 40h-128C41.909 184 24 166.091 24 144v-32h104v32c0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8v-32h24Z"),
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
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null
