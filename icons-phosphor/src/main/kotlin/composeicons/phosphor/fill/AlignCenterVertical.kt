package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) return _alignCenterVertical!!
        _alignCenterVertical = phosphorFillIcon(
            name = "AlignCenterVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 128c0 4.418-3.582 8-8 8h-16v48c0 8.837-7.163 16-16 16h-40c-8.837 0-16-7.163-16-16v-48h-16v72c0 8.837-7.163 16-16 16h-40c-8.837 0-16-7.163-16-16v-72h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-72C48 39.163 55.163 32 64 32h40c8.837 0 16 7.163 16 16v72h16v-48c0-8.837 7.163-16 16-16h40c8.837 0 16 7.163 16 16v48h16c4.418 0 8 3.582 8 8Z"),
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
        return _alignCenterVertical!!
    }

private var _alignCenterVertical: ImageVector? = null
