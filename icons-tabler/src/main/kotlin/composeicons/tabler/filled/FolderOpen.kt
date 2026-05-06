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
                pathData = parseSvgPathData("M2 6C2 5.204 2.316 4.442 2.879 3.879 3.442 3.316 4.204 3 5 3h4l.099 .005c.229 .023 .444 .124 .608 .288L12.414 6h6.586c.796 0 1.558 .316 2.121 .879 .319 .319 .559 .703 .707 1.121h-14.523c-.407 0-.805 .125-1.14 .356-.292 .203-.525 .48-.674 .801l-.058 .141L4.054 12.974c-.194 .517 .068 1.093 .585 1.287 .517 .194 1.094-.068 1.288-.585L7.061 10.649C7.207 10.259 7.58 10 7.998 10h13.002l.217 .012c.216 .024 .426 .082 .624 .173 .054 .025 .107 .053 .159 .083 .199 .115 .377 .263 .525 .439 .188 .222 .325 .482 .403 .762 .077 .28 .092 .573 .045 .859-.001 .008-.003 .016-.005 .024l-.995 5.21c-.131 .686-.497 1.304-1.036 1.749-.47 .389-1.046 .624-1.65 .677L19.026 20h-14.026c-.796 0-1.558-.316-2.121-.879C2.316 18.558 2 17.796 2 17v-11Z"),
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
