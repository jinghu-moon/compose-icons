package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Prohibit: ImageVector
    get() {
        if (_prohibit != null) return _prohibit!!
        _prohibit = phosphorBoldIcon(
            name = "Prohibit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM212 128c.017 18.133-5.861 35.78-16.75 50.28L77.72 60.75c25.46-19.024 59.477-22.05 87.895-7.817C194.033 67.165 211.985 96.217 212 128ZM44 128C43.983 109.867 49.861 92.22 60.75 77.72L178.28 195.25c-25.46 19.024-59.477 22.05-87.895 7.817C61.967 188.835 44.015 159.783 44 128Z"),
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
        return _prohibit!!
    }

private var _prohibit: ImageVector? = null
