package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = phosphorRegularIcon(
            name = "Cylinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 16C87.63 16 56 35.33 56 60v136c0 24.67 31.63 44 72 44 40.37 0 72-19.33 72-44v-136C200 35.33 168.37 16 128 16ZM128 32c26.49 0 56 11.5 56 28 0 16.5-29.51 28-56 28C101.51 88 72 76.5 72 60 72 43.5 101.51 32 128 32ZM128 224C98.17 224 72 210.92 72 196v-108c13.1 9.85 33.14 16 56 16 22.86 0 42.9-6.2 56-16v108c0 14.92-26.17 28-56 28Z"),
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
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
