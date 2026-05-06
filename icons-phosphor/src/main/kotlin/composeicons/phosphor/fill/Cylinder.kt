package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = phosphorFillIcon(
            name = "Cylinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 16C87.63 16 56 35.33 56 60v136c0 24.67 31.63 44 72 44 40.37 0 72-19.33 72-44v-136C200 35.33 168.37 16 128 16ZM128 224C98.17 224 72 210.92 72 196v-118.57C82.92 88.5 103.9 96 128 96c24.1 0 45.08-7.5 56-18.57v118.57c0 14.92-26.17 28-56 28Z"),
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
