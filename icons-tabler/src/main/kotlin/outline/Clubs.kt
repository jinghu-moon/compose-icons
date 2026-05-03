package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Clubs: ImageVector
    get() {
        if (_clubs != null) return _clubs!!
        _clubs = tablerOutlineIcon(
            name = "Clubs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 C 13.526 3.000 14.918 3.868 15.591 5.238 C 16.263 6.607 16.097 8.240 15.164 9.447 C 17.014 8.491 19.288 9.114 20.392 10.879 C 21.497 12.645 21.061 14.962 19.392 16.207 C 17.722 17.452 15.377 17.207 14.000 15.645 L 14.000 17.000 L 15.000 21.000 L 9.000 21.000 L 10.000 17.000 L 10.000 15.645 C 8.623 17.207 6.278 17.451 4.609 16.206 C 2.939 14.961 2.504 12.644 3.608 10.879 C 4.712 9.113 6.986 8.490 8.836 9.446 C 7.903 8.239 7.738 6.607 8.410 5.238 C 9.082 3.869 10.474 3.001 11.999 3.000"),
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
        return _clubs!!
    }

private var _clubs: ImageVector? = null
