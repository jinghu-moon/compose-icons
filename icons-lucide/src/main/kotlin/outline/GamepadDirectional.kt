package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GamepadDirectional: ImageVector
    get() {
        if (_gamepadDirectional != null) return _gamepadDirectional!!
        _gamepadDirectional = lucideOutlineIcon(
            name = "GamepadDirectional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.146 15.854 C 11.372 15.627 11.680 15.500 12.000 15.500 C 12.320 15.500 12.628 15.627 12.854 15.854 L 14.414 17.414 C 14.789 17.789 15.000 18.298 15.000 18.828 L 15.000 21.000 C 15.000 21.552 14.552 22.000 14.000 22.000 L 10.000 22.000 C 9.448 22.000 9.000 21.552 9.000 21.000 L 9.000 18.828 C 9.000 18.298 9.211 17.789 9.586 17.414 Z"),
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
                pathData = parseSvgPathData("M 18.828 15.000 C 18.298 15.000 17.789 14.789 17.414 14.414 L 15.854 12.854 C 15.627 12.628 15.500 12.320 15.500 12.000 C 15.500 11.680 15.627 11.372 15.854 11.146 L 17.414 9.586 C 17.789 9.211 18.298 9.000 18.828 9.000 L 21.000 9.000 C 21.552 9.000 22.000 9.448 22.000 10.000 L 22.000 14.000 C 22.000 14.552 21.552 15.000 21.000 15.000 Z"),
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
                pathData = parseSvgPathData("M 6.586 14.414 C 6.211 14.789 5.702 15.000 5.172 15.000 L 3.000 15.000 C 2.448 15.000 2.000 14.552 2.000 14.000 L 2.000 10.000 C 2.000 9.448 2.448 9.000 3.000 9.000 L 5.172 9.000 C 5.702 9.000 6.211 9.211 6.586 9.586 L 8.146 11.146 C 8.373 11.372 8.500 11.680 8.500 12.000 C 8.500 12.320 8.373 12.628 8.146 12.854 Z"),
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
                pathData = parseSvgPathData("M 9.000 3.000 C 9.000 2.448 9.448 2.000 10.000 2.000 L 14.000 2.000 C 14.552 2.000 15.000 2.448 15.000 3.000 L 15.000 5.172 C 15.000 5.702 14.789 6.211 14.414 6.586 L 12.854 8.146 C 12.628 8.373 12.320 8.500 12.000 8.500 C 11.680 8.500 11.372 8.373 11.146 8.146 L 9.586 6.586 C 9.211 6.211 9.000 5.702 9.000 5.172 Z"),
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
        return _gamepadDirectional!!
    }

private var _gamepadDirectional: ImageVector? = null
