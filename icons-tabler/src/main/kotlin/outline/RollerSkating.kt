package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RollerSkating: ImageVector
    get() {
        if (_rollerSkating != null) return _rollerSkating!!
        _rollerSkating = tablerOutlineIcon(
            name = "RollerSkating",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.905 5.000 L 9.323 5.000 C 9.732 5.000 10.099 5.249 10.251 5.629 L 11.394 8.485 C 11.772 9.430 12.603 10.119 13.601 10.315 L 18.318 11.241 C 19.295 11.433 20.000 12.290 20.000 13.286 L 20.000 14.000 C 20.000 14.552 19.552 15.000 19.000 15.000 L 5.105 15.000 C 4.822 15.001 4.551 14.882 4.360 14.673 C 4.169 14.463 4.077 14.182 4.105 13.900 L 4.905 5.900 C 4.957 5.387 5.390 4.997 5.905 5.000"),
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
                pathData = parseSvgPathData("M 6.000 17.000 C 6.000 18.105 6.895 19.000 8.000 19.000 C 9.105 19.000 10.000 18.105 10.000 17.000 C 10.000 15.895 9.105 15.000 8.000 15.000 C 6.895 15.000 6.000 15.895 6.000 17.000"),
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
                pathData = parseSvgPathData("M 14.000 17.000 C 14.000 18.105 14.895 19.000 16.000 19.000 C 17.105 19.000 18.000 18.105 18.000 17.000 C 18.000 15.895 17.105 15.000 16.000 15.000 C 14.895 15.000 14.000 15.895 14.000 17.000"),
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
        return _rollerSkating!!
    }

private var _rollerSkating: ImageVector? = null
