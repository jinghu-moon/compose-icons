package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AlignCenterHorizontal: ImageVector
    get() {
        if (_alignCenterHorizontal != null) return _alignCenterHorizontal!!
        _alignCenterHorizontal = phosphorFillIcon(
            name = "AlignCenterHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 152v40c0 8.837-7.163 16-16 16h-72v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-72c-8.837 0-16-7.163-16-16v-40c0-8.837 7.163-16 16-16h72v-16h-48c-8.837 0-16-7.163-16-16v-40C56 55.163 63.163 48 72 48h48v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h48c8.837 0 16 7.163 16 16v40c0 8.837-7.163 16-16 16h-48v16h72c8.837 0 16 7.163 16 16Z"),
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
        return _alignCenterHorizontal!!
    }

private var _alignCenterHorizontal: ImageVector? = null
