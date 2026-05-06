package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TreeView: ImageVector
    get() {
        if (_treeView != null) return _treeView!!
        _treeView = phosphorLightIcon(
            name = "TreeView",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 150h32c7.732 0 14-6.268 14-14v-32c0-7.732-6.268-14-14-14h-32c-7.732 0-14 6.268-14 14v10h-76v-36h10c7.732 0 14-6.268 14-14v-32C110 24.268 103.732 18 96 18h-32C56.268 18 50 24.268 50 32v32c0 7.732 6.268 14 14 14h10v114c0 12.15 9.85 22 22 22h66v10c0 7.732 6.268 14 14 14h32c7.732 0 14-6.268 14-14v-32c0-7.732-6.268-14-14-14h-32c-7.732 0-14 6.268-14 14v10h-66c-5.523 0-10-4.477-10-10v-66h76v10c0 7.732 6.268 14 14 14ZM62 64v-32c0-1.105 .895-2 2-2h32c1.105 0 2 .895 2 2v32c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2ZM174 192c0-1.105 .895-2 2-2h32c1.105 0 2 .895 2 2v32c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2ZM174 104c0-1.105 .895-2 2-2h32c1.105 0 2 .895 2 2v32c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2Z"),
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
