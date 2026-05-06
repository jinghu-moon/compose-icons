package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Checks: ImageVector
    get() {
        if (_checks != null) return _checks!!
        _checks = phosphorRegularIcon(
            name = "Checks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M149.61 85.71 60.01 173.71c-3.113 3.062-8.107 3.062-11.22 0L10.39 136c-3.151-3.098-3.193-8.164-.095-11.315 3.098-3.151 8.164-3.193 11.315-.095l32.79 32.2L138.4 74.29c3.154-3.098 8.222-3.054 11.32 .1 3.098 3.154 3.054 8.222-.1 11.32ZM245.71 74.39c-1.487-1.516-3.516-2.378-5.639-2.396-2.123-.019-4.167 .807-5.681 2.296l-84 82.5L131.56 138.29c-3.154-3.096-8.219-3.049-11.315 .105-3.096 3.154-3.049 8.219 .105 11.315l24.43 24c3.113 3.062 8.107 3.062 11.22 0L245.6 85.71c1.517-1.486 2.381-3.514 2.401-5.637 .021-2.123-.804-4.168-2.291-5.683Z"),
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
        return _checks!!
    }

private var _checks: ImageVector? = null
