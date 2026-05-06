package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartPolar: ImageVector
    get() {
        if (_chartPolar != null) return _chartPolar!!
        _chartPolar = phosphorBoldIcon(
            name = "ChartPolar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM211.13 116h-16.21C189.854 88.033 167.967 66.146 140 61.08v-16.21c36.827 5.379 65.751 34.303 71.13 71.13ZM116 116h-30.32C89.867 101.332 101.332 89.867 116 85.68ZM116 140v30.32C101.332 166.133 89.867 154.668 85.68 140ZM140 140h30.32c-4.187 14.668-15.652 26.133-30.32 30.32ZM140 116v-30.32c14.668 4.187 26.133 15.652 30.32 30.32ZM116 44.87v16.21C88.033 66.146 66.146 88.033 61.08 116h-16.21C50.249 79.173 79.173 50.249 116 44.87ZM44.87 140h16.21c5.066 27.967 26.953 49.854 54.92 54.92v16.21C79.173 205.751 50.249 176.827 44.87 140ZM140 211.13v-16.21c27.967-5.066 49.854-26.953 54.92-54.92h16.21c-5.379 36.827-34.303 65.751-71.13 71.13Z"),
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
        return _chartPolar!!
    }

private var _chartPolar: ImageVector? = null
