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
                pathData = parseSvgPathData("M12 3c1.526 0 2.918 .868 3.591 2.238 .672 1.37 .507 3.002-.427 4.209 1.85-.956 4.124-.333 5.228 1.432 1.104 1.766 .669 4.083-1.001 5.328C17.722 17.452 15.377 17.207 14 15.645v1.355l1 4h-6l1-4v-1.355c-1.377 1.562-3.722 1.806-5.391 .561C2.939 14.961 2.504 12.644 3.608 10.879 4.712 9.113 6.986 8.49 8.836 9.446 7.903 8.239 7.738 6.607 8.41 5.238 9.082 3.869 10.474 3.001 11.999 3"),
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
