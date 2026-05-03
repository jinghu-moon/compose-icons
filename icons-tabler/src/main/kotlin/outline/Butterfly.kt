package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = tablerOutlineIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 18.176 C 11.920 19.537 10.932 20.673 9.595 20.941 C 8.258 21.209 6.908 20.542 6.310 19.317 C 5.711 18.092 6.014 16.617 7.047 15.727 L 7.022 15.750 C 4.953 15.024 3.708 12.912 4.074 10.750 C 4.441 8.587 6.312 7.004 8.505 7.000 C 9.919 7.000 11.180 7.652 12.005 8.671 C 13.206 7.188 15.212 6.623 17.010 7.262 C 18.808 7.901 20.008 9.605 20.003 11.514 C 19.998 13.422 18.790 15.120 16.988 15.750 C 18.025 16.663 18.304 18.166 17.664 19.391 C 17.024 20.615 15.631 21.244 14.289 20.914 C 12.947 20.585 12.004 19.382 12.005 18.000 L 12.000 18.176"),
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
                pathData = parseSvgPathData("M 12.000 19.000 L 12.000 9.000"),
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
                pathData = parseSvgPathData("M 9.000 3.000 L 12.000 5.000 L 15.000 3.000"),
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
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
