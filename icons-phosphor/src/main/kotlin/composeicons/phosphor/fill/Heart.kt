package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = phosphorFillIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 102c0 70-103.79 126.66-108.21 129-2.366 1.273-5.214 1.273-7.58 0C119.79 228.66 16 172 16 102 16.039 67.774 43.774 40.039 78 40c20.65 0 38.73 8.88 50 23.89C139.27 48.88 157.35 40 178 40c34.226 .039 61.961 27.774 62 62Z"),
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
        return _heart!!
    }

private var _heart: ImageVector? = null
