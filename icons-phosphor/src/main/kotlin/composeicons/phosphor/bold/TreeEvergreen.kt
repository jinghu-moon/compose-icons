package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) return _treeEvergreen!!
        _treeEvergreen = phosphorBoldIcon(
            name = "TreeEvergreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233.47 184.63 192.54 132h15.46c4.573 0 8.748-2.598 10.768-6.7 2.019-4.103 1.532-8.996-1.258-12.62l-80-104C135.238 5.736 131.729 4.011 128.01 4.011c-3.719 0-7.228 1.724-9.5 4.669l-80 104c-2.787 3.621-3.276 8.51-1.262 12.611 2.014 4.101 6.183 6.702 10.752 6.709h15.46L22.53 184.63c-2.815 3.617-3.324 8.523-1.31 12.641 2.013 4.118 6.197 6.729 10.78 6.729h84v36c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-36h84c4.584-0 8.767-2.611 10.78-6.729 2.013-4.118 1.505-9.023-1.31-12.641ZM56.54 180 97.47 127.37c2.815-3.617 3.324-8.523 1.31-12.641C96.767 110.611 92.584 108 88 108h-15.63L128 35.68 183.63 108h-15.63c-4.584 0-8.767 2.611-10.78 6.729-2.013 4.118-1.505 9.023 1.31 12.641L199.46 180Z"),
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
        return _treeEvergreen!!
    }

private var _treeEvergreen: ImageVector? = null
