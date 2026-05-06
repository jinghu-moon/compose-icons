package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TreeStructure: ImageVector
    get() {
        if (_treeStructure != null) return _treeStructure!!
        _treeStructure = phosphorDuotoneIcon(
            name = "TreeStructure",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M64 112v32c0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8v-32c0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8ZM208 40h-48c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8ZM208 152h-48c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M160 112h48c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16h-48c-8.837 0-16 7.163-16 16v16h-16c-13.255 0-24 10.745-24 24v32h-32v-8C72 103.163 64.837 96 56 96h-32C15.163 96 8 103.163 8 112v32c0 8.837 7.163 16 16 16h32c8.837 0 16-7.163 16-16v-8h32v32c0 13.255 10.745 24 24 24h16v16c0 8.837 7.163 16 16 16h48c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16h-48c-8.837 0-16 7.163-16 16v16h-16c-4.418 0-8-3.582-8-8v-80c0-4.418 3.582-8 8-8h16v16c0 8.837 7.163 16 16 16ZM56 144h-32v-32h32v32ZM160 160h48v48h-48ZM160 48h48v48h-48Z"),
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
