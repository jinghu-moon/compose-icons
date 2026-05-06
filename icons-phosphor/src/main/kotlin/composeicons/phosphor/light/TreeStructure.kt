package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TreeStructure: ImageVector
    get() {
        if (_treeStructure != null) return _treeStructure!!
        _treeStructure = phosphorLightIcon(
            name = "TreeStructure",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 110h48c7.732 0 14-6.268 14-14v-48c0-7.732-6.268-14-14-14h-48c-7.732 0-14 6.268-14 14v18h-18c-12.15 0-22 9.85-22 22v34h-36v-10C70 104.268 63.732 98 56 98h-32c-7.732 0-14 6.268-14 14v32c0 7.732 6.268 14 14 14h32c7.732 0 14-6.268 14-14v-10h36v34c0 12.15 9.85 22 22 22h18v18c0 7.732 6.268 14 14 14h48c7.732 0 14-6.268 14-14v-48c0-7.732-6.268-14-14-14h-48c-7.732 0-14 6.268-14 14v18h-18c-5.523 0-10-4.477-10-10v-80c0-5.523 4.477-10 10-10h18v18c0 7.732 6.268 14 14 14ZM58 144c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2v-32c0-1.105 .895-2 2-2h32c1.105 0 2 .895 2 2ZM158 160c0-1.105 .895-2 2-2h48c1.105 0 2 .895 2 2v48c0 1.105-.895 2-2 2h-48c-1.105 0-2-.895-2-2ZM158 48c0-1.105 .895-2 2-2h48c1.105 0 2 .895 2 2v48c0 1.105-.895 2-2 2h-48c-1.105 0-2-.895-2-2Z"),
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
