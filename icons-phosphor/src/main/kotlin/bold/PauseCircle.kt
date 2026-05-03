package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PauseCircle: ImageVector
    get() {
        if (_pauseCircle != null) return _pauseCircle!!
        _pauseCircle = phosphorBoldIcon(
            name = "PauseCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 116.000 96.000 L 116.000 160.000 C 116.000 166.627 110.627 172.000 104.000 172.000 C 97.373 172.000 92.000 166.627 92.000 160.000 L 92.000 96.000 C 92.000 89.373 97.373 84.000 104.000 84.000 C 110.627 84.000 116.000 89.373 116.000 96.000 ZM 164.000 96.000 L 164.000 160.000 C 164.000 166.627 158.627 172.000 152.000 172.000 C 145.373 172.000 140.000 166.627 140.000 160.000 L 140.000 96.000 C 140.000 89.373 145.373 84.000 152.000 84.000 C 158.627 84.000 164.000 89.373 164.000 96.000 Z"),
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
        return _pauseCircle!!
    }

private var _pauseCircle: ImageVector? = null
