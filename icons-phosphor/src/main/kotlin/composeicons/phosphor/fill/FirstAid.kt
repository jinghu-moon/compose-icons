package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FirstAid: ImageVector
    get() {
        if (_firstAid != null) return _firstAid!!
        _firstAid = phosphorFillIcon(
            name = "FirstAid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 108v40c0 8.837-7.163 16-16 16h-52v52c0 8.837-7.163 16-16 16h-40c-8.837 0-16-7.163-16-16v-52h-52c-8.837 0-16-7.163-16-16v-40C24 99.163 31.163 92 40 92h52v-52c0-8.837 7.163-16 16-16h40c8.837 0 16 7.163 16 16v52h52c8.837 0 16 7.163 16 16Z"),
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
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null
