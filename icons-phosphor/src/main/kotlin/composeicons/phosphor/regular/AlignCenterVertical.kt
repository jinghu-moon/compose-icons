package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) return _alignCenterVertical!!
        _alignCenterVertical = phosphorRegularIcon(
            name = "AlignCenterVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 120h-16v-48c0-8.837-7.163-16-16-16h-40c-8.837 0-16 7.163-16 16v48h-16v-72c0-8.837-7.163-16-16-16h-40C55.163 32 48 39.163 48 48v72h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v72c0 8.837 7.163 16 16 16h40c8.837 0 16-7.163 16-16v-72h16v48c0 8.837 7.163 16 16 16h40c8.837 0 16-7.163 16-16v-48h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM104 208h-40v-160h40ZM192 184h-40v-112h40Z"),
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
