package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TreeStructure: ImageVector
    get() {
        if (_treeStructure != null) return _treeStructure!!
        _treeStructure = phosphorFillIcon(
            name = "TreeStructure",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 96v-16h-16c-4.418 0-8 3.582-8 8v80c0 4.418 3.582 8 8 8h16v-16c0-8.837 7.163-16 16-16h48c8.837 0 16 7.163 16 16v48c0 8.837-7.163 16-16 16h-48c-8.837 0-16-7.163-16-16v-16h-16c-13.255 0-24-10.745-24-24v-32h-32v8c0 8.837-7.163 16-16 16h-32C15.163 160 8 152.837 8 144v-32C8 103.163 15.163 96 24 96h32c8.837 0 16 7.163 16 16v8h32v-32c0-13.255 10.745-24 24-24h16v-16c0-8.837 7.163-16 16-16h48c8.837 0 16 7.163 16 16v48c0 8.837-7.163 16-16 16h-48c-8.837 0-16-7.163-16-16Z"),
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
