package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StopCircle: ImageVector
    get() {
        if (_stopCircle != null) return _stopCircle!!
        _stopCircle = phosphorFillIcon(
            name = "StopCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 160.000 156.000 C 160.000 158.209 158.209 160.000 156.000 160.000 L 100.000 160.000 C 97.791 160.000 96.000 158.209 96.000 156.000 L 96.000 100.000 C 96.000 97.791 97.791 96.000 100.000 96.000 L 156.000 96.000 C 158.209 96.000 160.000 97.791 160.000 100.000 Z"),
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
        return _stopCircle!!
    }

private var _stopCircle: ImageVector? = null
