package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) return _thermometerSimple!!
        _thermometerSimple = phosphorFillIcon(
            name = "ThermometerSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 146.08v-106.08C160 22.327 145.673 8 128 8 110.327 8 96 22.327 96 40v106.08C75.92 160.062 67.243 185.461 74.57 208.806c7.327 23.345 28.962 39.23 53.43 39.23 24.468 0 46.103-15.885 53.43-39.23C188.757 185.461 180.08 160.062 160 146.08ZM128 24c8.837 0 16 7.163 16 16v64h-32v-64c0-8.837 7.163-16 16-16Z"),
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
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null
