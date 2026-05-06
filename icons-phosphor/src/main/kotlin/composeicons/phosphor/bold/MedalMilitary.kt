package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MedalMilitary: ImageVector
    get() {
        if (_medalMilitary != null) return _medalMilitary!!
        _medalMilitary = phosphorBoldIcon(
            name = "MedalMilitary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M207 36h-158C37.402 36 28 45.402 28 57v49.21c.003 8.232 4.816 15.703 12.31 19.11l56 25.47C78.639 164.353 71.569 187.665 78.731 208.758c7.162 21.094 26.963 35.283 49.239 35.283 22.276 0 42.078-14.189 49.239-35.283 7.162-21.094 .092-44.406-17.579-57.968l56-25.47c7.518-3.389 12.356-10.864 12.37-19.11v-49.21C228 45.402 218.598 36 207 36ZM128 138.82 100 126.09v-66.09h56v66.09ZM52 60h24v55.18L52 104.27ZM128 220c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM204 104.27l-24 10.91v-55.18h24Z"),
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
        return _medalMilitary!!
    }

private var _medalMilitary: ImageVector? = null
