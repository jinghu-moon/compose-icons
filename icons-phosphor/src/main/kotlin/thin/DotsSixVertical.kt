package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DotsSixVertical: ImageVector
    get() {
        if (_dotsSixVertical != null) return _dotsSixVertical!!
        _dotsSixVertical = phosphorThinIcon(
            name = "DotsSixVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 100.000 60.000 C 100.000 64.418 96.418 68.000 92.000 68.000 C 87.582 68.000 84.000 64.418 84.000 60.000 C 84.000 55.582 87.582 52.000 92.000 52.000 C 96.418 52.000 100.000 55.582 100.000 60.000 ZM 164.000 68.000 C 168.418 68.000 172.000 64.418 172.000 60.000 C 172.000 55.582 168.418 52.000 164.000 52.000 C 159.582 52.000 156.000 55.582 156.000 60.000 C 156.000 64.418 159.582 68.000 164.000 68.000 ZM 92.000 120.000 C 87.582 120.000 84.000 123.582 84.000 128.000 C 84.000 132.418 87.582 136.000 92.000 136.000 C 96.418 136.000 100.000 132.418 100.000 128.000 C 100.000 123.582 96.418 120.000 92.000 120.000 ZM 164.000 120.000 C 159.582 120.000 156.000 123.582 156.000 128.000 C 156.000 132.418 159.582 136.000 164.000 136.000 C 168.418 136.000 172.000 132.418 172.000 128.000 C 172.000 123.582 168.418 120.000 164.000 120.000 ZM 92.000 188.000 C 87.582 188.000 84.000 191.582 84.000 196.000 C 84.000 200.418 87.582 204.000 92.000 204.000 C 96.418 204.000 100.000 200.418 100.000 196.000 C 100.000 191.582 96.418 188.000 92.000 188.000 ZM 164.000 188.000 C 159.582 188.000 156.000 191.582 156.000 196.000 C 156.000 200.418 159.582 204.000 164.000 204.000 C 168.418 204.000 172.000 200.418 172.000 196.000 C 172.000 191.582 168.418 188.000 164.000 188.000 Z"),
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
        return _dotsSixVertical!!
    }

private var _dotsSixVertical: ImageVector? = null
