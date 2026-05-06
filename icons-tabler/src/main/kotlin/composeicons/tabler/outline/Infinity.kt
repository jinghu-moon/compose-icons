package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = tablerOutlineIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.828 9.172C8.684 8.028 6.964 7.685 5.469 8.304 3.974 8.923 2.999 10.382 2.999 12c0 1.618 .975 3.077 2.47 3.696 1.495 .619 3.215 .277 4.359-.868C10.716 14.023 11.451 13.065 12 12c.549-1.065 1.284-2.023 2.172-2.828 1.144-1.144 2.864-1.487 4.359-.868 1.495 .619 2.47 2.078 2.47 3.696 0 1.618-.975 3.077-2.47 3.696-1.495 .619-3.215 .277-4.359-.868C13.284 14.023 12.549 13.065 12 12 11.451 10.935 10.716 9.977 9.828 9.172"),
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null
