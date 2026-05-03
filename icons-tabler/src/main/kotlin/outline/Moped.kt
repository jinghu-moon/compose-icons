package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Moped: ImageVector
    get() {
        if (_moped != null) return _moped!!
        _moped = tablerOutlineIcon(
            name = "Moped",
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
                pathData = parseSvgPathData("M 5.000 16.000 L 5.000 17.000 C 5.000 18.105 5.895 19.000 7.000 19.000 C 8.105 19.000 9.000 18.105 9.000 17.000 L 9.000 12.000 L 6.000 12.000 C 4.343 12.000 3.000 13.343 3.000 15.000 L 3.000 16.000 L 13.000 16.000 C 13.756 13.814 15.702 12.258 18.000 12.000 L 18.000 7.000 C 18.000 5.895 17.105 5.000 16.000 5.000 L 15.000 5.000"),
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
                pathData = parseSvgPathData("M 6.000 9.000 L 9.000 9.000"),
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
        return _moped!!
    }

private var _moped: ImageVector? = null
