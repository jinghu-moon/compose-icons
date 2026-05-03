package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = tablerFilledIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 6.000 C 2.000 5.204 2.316 4.442 2.879 3.879 C 3.442 3.316 4.204 3.000 5.000 3.000 L 9.000 3.000 L 9.099 3.005 C 9.328 3.028 9.543 3.129 9.707 3.293 L 12.414 6.000 L 19.000 6.000 C 19.796 6.000 20.558 6.316 21.121 6.879 C 21.440 7.198 21.680 7.582 21.828 8.000 L 7.305 8.000 C 6.898 8.000 6.500 8.125 6.165 8.356 C 5.873 8.559 5.640 8.836 5.491 9.157 L 5.433 9.298 L 4.054 12.974 C 3.860 13.491 4.122 14.067 4.639 14.261 C 5.156 14.455 5.733 14.193 5.927 13.676 L 7.061 10.649 C 7.207 10.259 7.580 10.000 7.998 10.000 L 21.000 10.000 L 21.217 10.012 C 21.433 10.036 21.643 10.094 21.841 10.185 C 21.895 10.210 21.948 10.238 22.000 10.268 C 22.199 10.383 22.377 10.531 22.525 10.707 C 22.713 10.929 22.850 11.189 22.928 11.469 C 23.005 11.749 23.020 12.042 22.973 12.328 C 22.972 12.336 22.970 12.344 22.968 12.352 L 21.973 17.562 C 21.842 18.248 21.476 18.866 20.937 19.311 C 20.467 19.700 19.891 19.935 19.287 19.988 L 19.026 20.000 L 5.000 20.000 C 4.204 20.000 3.442 19.684 2.879 19.121 C 2.316 18.558 2.000 17.796 2.000 17.000 L 2.000 6.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
