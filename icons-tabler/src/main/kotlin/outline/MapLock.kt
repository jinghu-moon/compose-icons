package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapLock: ImageVector
    get() {
        if (_mapLock != null) return _mapLock!!
        _mapLock = tablerOutlineIcon(
            name = "MapLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 11.000 C 9.000 12.657 10.343 14.000 12.000 14.000 C 13.657 14.000 15.000 12.657 15.000 11.000 C 15.000 9.343 13.657 8.000 12.000 8.000 C 10.343 8.000 9.000 9.343 9.000 11.000"),
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
                pathData = parseSvgPathData("M 13.004 21.216 C 12.220 21.671 11.228 21.541 10.587 20.900 L 6.343 16.657 C 3.219 13.533 3.219 8.467 6.343 5.343 C 9.467 2.219 14.533 2.219 17.657 5.343 C 19.164 6.839 20.008 8.877 20.000 11.000"),
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
                pathData = parseSvgPathData("M 17.000 19.000 C 17.000 18.448 17.448 18.000 18.000 18.000 L 21.000 18.000 C 21.552 18.000 22.000 18.448 22.000 19.000 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 18.000 22.000 C 17.448 22.000 17.000 21.552 17.000 21.000 L 17.000 19.000"),
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
                pathData = parseSvgPathData("M 18.000 18.000 L 18.000 16.500 C 18.000 15.672 18.672 15.000 19.500 15.000 C 20.328 15.000 21.000 15.672 21.000 16.500 L 21.000 18.000"),
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
        return _mapLock!!
    }

private var _mapLock: ImageVector? = null
