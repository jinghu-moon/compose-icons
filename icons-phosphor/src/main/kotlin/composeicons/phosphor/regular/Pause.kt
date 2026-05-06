package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pause: ImageVector
    get() {
        if (_pause != null) return _pause!!
        _pause = phosphorRegularIcon(
            name = "Pause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 32h-40c-8.837 0-16 7.163-16 16v160c0 8.837 7.163 16 16 16h40c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM200 208h-40v-160h40ZM96 32h-40C47.163 32 40 39.163 40 48v160c0 8.837 7.163 16 16 16h40c8.837 0 16-7.163 16-16v-160C112 39.163 104.837 32 96 32ZM96 208h-40v-160h40Z"),
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
        return _pause!!
    }

private var _pause: ImageVector? = null
