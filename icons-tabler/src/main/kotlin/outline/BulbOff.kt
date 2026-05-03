package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BulbOff: ImageVector
    get() {
        if (_bulbOff != null) return _bulbOff!!
        _bulbOff = tablerOutlineIcon(
            name = "BulbOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 12.000 L 4.000 12.000M 12.000 3.000 L 12.000 4.000M 20.000 12.000 L 21.000 12.000M 5.600 5.600 L 6.300 6.300M 18.400 5.600 L 17.700 6.300"),
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
                pathData = parseSvgPathData("M 11.089 7.083 C 12.711 6.782 14.376 7.300 15.541 8.468 C 16.706 9.635 17.220 11.302 16.915 12.923M 15.537 15.534 C 15.369 15.702 15.190 15.858 15.000 16.000 C 14.208 16.784 13.837 17.898 14.000 19.000 C 14.000 20.105 13.105 21.000 12.000 21.000 C 10.895 21.000 10.000 20.105 10.000 19.000 C 10.163 17.898 9.792 16.784 9.000 16.000 C 7.839 15.129 7.113 13.797 7.012 12.349 C 6.910 10.901 7.443 9.480 8.472 8.456"),
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
                pathData = parseSvgPathData("M 9.700 17.000 L 14.300 17.000"),
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
        return _bulbOff!!
    }

private var _bulbOff: ImageVector? = null
