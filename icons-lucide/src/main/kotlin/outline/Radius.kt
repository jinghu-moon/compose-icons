package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Radius: ImageVector
    get() {
        if (_radius != null) return _radius!!
        _radius = lucideOutlineIcon(
            name = "Radius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.340 17.520 C 23.174 13.238 22.304 7.506 18.328 4.257 C 14.351 1.008 8.561 1.299 4.930 4.930 C 1.299 8.561 1.008 14.351 4.257 18.328 C 7.506 22.304 13.238 23.174 17.520 20.340"),
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
                pathData = parseSvgPathData("M 21.000 19.000 C 21.000 20.105 20.105 21.000 19.000 21.000 C 17.895 21.000 17.000 20.105 17.000 19.000 C 17.000 17.895 17.895 17.000 19.000 17.000 C 20.105 17.000 21.000 17.895 21.000 19.000 Z"),
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
                pathData = parseSvgPathData("M 13.410 13.410 L 17.590 17.590"),
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
                pathData = parseSvgPathData("M 14.000 12.000 C 14.000 13.105 13.105 14.000 12.000 14.000 C 10.895 14.000 10.000 13.105 10.000 12.000 C 10.000 10.895 10.895 10.000 12.000 10.000 C 13.105 10.000 14.000 10.895 14.000 12.000 Z"),
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
        return _radius!!
    }

private var _radius: ImageVector? = null
