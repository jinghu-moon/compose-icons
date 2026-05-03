package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Wallet: ImageVector
    get() {
        if (_wallet != null) return _wallet!!
        _wallet = lucideOutlineIcon(
            name = "Wallet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 7.000 L 19.000 4.000 C 19.000 3.448 18.552 3.000 18.000 3.000 L 5.000 3.000 C 3.895 3.000 3.000 3.895 3.000 5.000 C 3.000 6.105 3.895 7.000 5.000 7.000 L 20.000 7.000 C 20.552 7.000 21.000 7.448 21.000 8.000 L 21.000 12.000 L 18.000 12.000 C 16.895 12.000 16.000 12.895 16.000 14.000 C 16.000 15.105 16.895 16.000 18.000 16.000 L 21.000 16.000 C 21.552 16.000 22.000 15.552 22.000 15.000 L 22.000 13.000 C 22.000 12.448 21.552 12.000 21.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 5.000 L 3.000 19.000 C 3.000 20.105 3.895 21.000 5.000 21.000 L 20.000 21.000 C 20.552 21.000 21.000 20.552 21.000 20.000 L 21.000 16.000"),
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
        return _wallet!!
    }

private var _wallet: ImageVector? = null
