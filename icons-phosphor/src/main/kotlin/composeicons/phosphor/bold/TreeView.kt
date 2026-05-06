package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TreeView: ImageVector
    get() {
        if (_treeView != null) return _treeView!!
        _treeView = phosphorBoldIcon(
            name = "TreeView",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 156h32c11.046 0 20-8.954 20-20v-32C228 92.954 219.046 84 208 84h-32c-11.046 0-20 8.954-20 20v4h-64v-24h4c11.046 0 20-8.954 20-20v-32C116 20.954 107.046 12 96 12h-32C52.954 12 44 20.954 44 32v32c0 11.046 8.954 20 20 20h4v108c0 15.464 12.536 28 28 28h60v4c0 11.046 8.954 20 20 20h32c11.046 0 20-8.954 20-20v-32c0-11.046-8.954-20-20-20h-32c-11.046 0-20 8.954-20 20v4h-60c-2.209 0-4-1.791-4-4v-60h64v4c0 11.046 8.954 20 20 20ZM68 36h24v24h-24ZM180 196h24v24h-24ZM180 108h24v24h-24Z"),
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
        return _treeView!!
    }

private var _treeView: ImageVector? = null
