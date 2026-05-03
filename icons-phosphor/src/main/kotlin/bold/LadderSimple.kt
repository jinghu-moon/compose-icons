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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 20.000 C 185.373 20.000 180.000 25.373 180.000 32.000 L 180.000 60.000 L 76.000 60.000 L 76.000 32.000 C 76.000 25.373 70.627 20.000 64.000 20.000 C 57.373 20.000 52.000 25.373 52.000 32.000 L 52.000 224.000 C 52.000 230.627 57.373 236.000 64.000 236.000 C 70.627 236.000 76.000 230.627 76.000 224.000 L 76.000 196.000 L 180.000 196.000 L 180.000 224.000 C 180.000 230.627 185.373 236.000 192.000 236.000 C 198.627 236.000 204.000 230.627 204.000 224.000 L 204.000 32.000 C 204.000 25.373 198.627 20.000 192.000 20.000 ZM 180.000 84.000 L 180.000 116.000 L 76.000 116.000 L 76.000 84.000 ZM 76.000 172.000 L 76.000 140.000 L 180.000 140.000 L 180.000 172.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _ladderSimple!!
    }

private var _ladderSimple: ImageVector? = null
