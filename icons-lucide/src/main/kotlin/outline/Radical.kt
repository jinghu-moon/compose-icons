package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = lucideOutlineIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 12.000 L 6.280 12.000 C 6.710 12.000 7.092 12.276 7.228 12.684 L 9.526 20.618 C 9.597 20.829 9.800 20.968 10.023 20.957 C 10.245 20.947 10.434 20.791 10.486 20.574 L 13.820 4.771 C 13.926 4.320 14.328 4.001 14.792 4.000 L 21.000 4.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _radical!!
    }

private var _radical: ImageVector? = null
