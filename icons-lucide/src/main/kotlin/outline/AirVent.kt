package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AirVent: ImageVector
    get() {
        if (_airVent != null) return _airVent!!
        _airVent = lucideOutlineIcon(
            name = "AirVent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 17.500 C 18.937 18.203 19.261 19.463 18.777 20.531 C 18.294 21.598 17.134 22.187 15.987 21.947 C 14.840 21.706 14.014 20.702 14.000 19.530 L 14.000 12.000"),
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
                pathData = parseSvgPathData("M 6.000 12.000 L 4.000 12.000 C 2.895 12.000 2.000 11.105 2.000 10.000 L 2.000 5.000 C 2.000 3.895 2.895 3.000 4.000 3.000 L 20.000 3.000 C 21.105 3.000 22.000 3.895 22.000 5.000 L 22.000 10.000 C 22.000 11.105 21.105 12.000 20.000 12.000 L 18.000 12.000"),
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
                pathData = parseSvgPathData("M 6.000 8.000 L 18.000 8.000"),
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
                pathData = parseSvgPathData("M 6.600 15.572 C 5.952 16.207 5.813 17.200 6.261 17.989 C 6.710 18.778 7.634 19.166 8.511 18.934 C 9.389 18.702 10.000 17.908 10.000 17.000 L 10.000 12.000"),
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
        return _airVent!!
    }

private var _airVent: ImageVector? = null
