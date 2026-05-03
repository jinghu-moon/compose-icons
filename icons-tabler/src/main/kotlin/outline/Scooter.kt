package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = tablerOutlineIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 17.000 C 16.000 18.105 16.895 19.000 18.000 19.000 C 19.105 19.000 20.000 18.105 20.000 17.000 C 20.000 15.895 19.105 15.000 18.000 15.000 C 16.895 15.000 16.000 15.895 16.000 17.000"),
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
                pathData = parseSvgPathData("M 4.000 17.000 C 4.000 18.105 4.895 19.000 6.000 19.000 C 7.105 19.000 8.000 18.105 8.000 17.000 C 8.000 15.895 7.105 15.000 6.000 15.000 C 4.895 15.000 4.000 15.895 4.000 17.000"),
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
                pathData = parseSvgPathData("M 8.000 17.000 L 13.000 17.000 C 13.403 14.424 15.424 12.403 18.000 12.000 L 18.000 7.000 C 18.000 5.895 17.105 5.000 16.000 5.000 L 15.000 5.000"),
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
        return _scooter!!
    }

private var _scooter: ImageVector? = null
