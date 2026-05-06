package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) return _magnetStraight!!
        _magnetStraight = phosphorRegularIcon(
            name = "MagnetStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 40h-40c-8.837 0-16 7.163-16 16v88c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16v-88C112 47.163 104.837 40 96 40h-40C47.163 40 40 47.163 40 56v88c0 48.601 39.399 88 88 88h.67C176.82 231.64 216 191.71 216 143v-87c0-8.837-7.163-16-16-16ZM200 56v32h-40v-32ZM96 56v32h-40v-32ZM128.55 216c-19.191 .147-37.646-7.374-51.268-20.893C63.661 181.589 55.999 163.191 56 144v-40h40v40c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32v-40h40v39c0 40-32 72.71-71.45 73Z"),
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
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null
