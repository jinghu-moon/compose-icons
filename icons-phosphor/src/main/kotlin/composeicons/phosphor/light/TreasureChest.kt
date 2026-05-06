package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) return _treasureChest!!
        _treasureChest = phosphorLightIcon(
            name = "TreasureChest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 42h-112C42.19 42.033 18.033 66.19 18 96v96c0 7.732 6.268 14 14 14h192c7.732 0 14-6.268 14-14v-96C237.967 66.19 213.81 42.033 184 42ZM226 96v10h-36v-51.56c20.65 3.002 35.974 20.693 36 41.56ZM138 138h-20v-36h20ZM112 150h32c3.314 0 6-2.686 6-6v-26h28v76h-100v-76h28v26c0 3.314 2.686 6 6 6ZM150 106v-10c0-3.314-2.686-6-6-6h-32c-3.314 0-6 2.686-6 6v10h-28v-52h100v52ZM66 54.44v51.56h-36v-10C30.026 75.133 45.35 57.442 66 54.44ZM30 192v-74h36v76h-34c-1.105 0-2-.895-2-2ZM224 194h-34v-76h36v74c0 1.105-.895 2-2 2Z"),
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
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
