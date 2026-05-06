package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LadderSimple: ImageVector
    get() {
        if (_ladderSimple != null) return _ladderSimple!!
        _ladderSimple = phosphorBoldIcon(
            name = "LadderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 20c-6.627 0-12 5.373-12 12v28h-104v-28C76 25.373 70.627 20 64 20 57.373 20 52 25.373 52 32v192c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-28h104v28c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-192c0-6.627-5.373-12-12-12ZM180 84v32h-104v-32ZM76 172v-32h104v32Z"),
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
        return _ladderSimple!!
    }

private var _ladderSimple: ImageVector? = null
