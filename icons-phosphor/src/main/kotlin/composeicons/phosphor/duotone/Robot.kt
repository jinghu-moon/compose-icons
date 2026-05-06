package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Robot: ImageVector
    get() {
        if (_robot != null) return _robot!!
        _robot = phosphorDuotoneIcon(
            name = "Robot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 56h-144C42.745 56 32 66.745 32 80v112c0 13.255 10.745 24 24 24h144c13.255 0 24-10.745 24-24v-112C224 66.745 213.255 56 200 56ZM164 184h-72C80.954 184 72 175.046 72 164c0-11.046 8.954-20 20-20h72c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
                pathData = parseSvgPathData("M200 48h-64v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32h-64C38.327 48 24 62.327 24 80v112c0 17.673 14.327 32 32 32h144c17.673 0 32-14.327 32-32v-112C232 62.327 217.673 48 200 48ZM216 192c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-112C40 71.163 47.163 64 56 64h144c8.837 0 16 7.163 16 16ZM72 108c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM160 108c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM164 136h-72c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28h72c15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28ZM140 152v24h-24v-24ZM80 164c0-6.627 5.373-12 12-12h8v24h-8c-6.627 0-12-5.373-12-12ZM164 176h-8v-24h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _robot!!
    }

private var _robot: ImageVector? = null
