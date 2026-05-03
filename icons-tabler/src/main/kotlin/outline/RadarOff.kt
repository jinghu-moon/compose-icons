package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RadarOff: ImageVector
    get() {
        if (_radarOff != null) return _radarOff!!
        _radarOff = tablerOutlineIcon(
            name = "RadarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.291 11.295 C 11.006 11.581 10.922 12.011 11.077 12.384 C 11.232 12.757 11.596 13.000 12.000 13.000 L 12.000 21.000 C 14.488 21.000 16.740 19.990 18.370 18.358M 20.045 16.039 C 20.675 14.786 21.002 13.403 21.000 12.000 L 16.000 12.000"),
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
                pathData = parseSvgPathData("M 16.000 9.000 C 14.825 7.437 12.847 6.703 10.937 7.120M 8.471 8.467 C 7.446 9.491 6.915 10.910 7.017 12.355 C 7.118 13.801 7.842 15.131 9.001 16.002"),
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
                pathData = parseSvgPathData("M 20.486 9.000 C 19.623 6.566 17.755 4.620 15.359 3.658 C 12.963 2.695 10.268 2.808 7.961 3.968M 5.644 5.643 C 3.457 7.828 2.545 10.981 3.227 13.996 C 3.909 17.011 6.090 19.464 9.004 20.495"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _radarOff!!
    }

private var _radarOff: ImageVector? = null
