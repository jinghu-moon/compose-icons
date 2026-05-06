package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TreeStructure: ImageVector
    get() {
        if (_treeStructure != null) return _treeStructure!!
        _treeStructure = phosphorBoldIcon(
            name = "TreeStructure",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 116h48c11.046 0 20-8.954 20-20v-48C228 36.954 219.046 28 208 28h-48c-11.046 0-20 8.954-20 20v12h-12c-15.464 0-28 12.536-28 28v28h-24v-4C76 100.954 67.046 92 56 92h-32C12.954 92 4 100.954 4 112v32c0 11.046 8.954 20 20 20h32c11.046 0 20-8.954 20-20v-4h24v28c0 15.464 12.536 28 28 28h12v12c0 11.046 8.954 20 20 20h48c11.046 0 20-8.954 20-20v-48c0-11.046-8.954-20-20-20h-48c-11.046 0-20 8.954-20 20v12h-12c-2.209 0-4-1.791-4-4v-80c0-2.209 1.791-4 4-4h12v12c0 11.046 8.954 20 20 20ZM52 140h-24v-24h24ZM164 164h40v40h-40ZM164 52h40v40h-40Z"),
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
        return _treeStructure!!
    }

private var _treeStructure: ImageVector? = null
