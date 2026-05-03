package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DotsSix: ImageVector
    get() {
        if (_dotsSix != null) return _dotsSix!!
        _dotsSix = phosphorThinIcon(
            name = "DotsSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 68.000 92.000 C 68.000 96.418 64.418 100.000 60.000 100.000 C 55.582 100.000 52.000 96.418 52.000 92.000 C 52.000 87.582 55.582 84.000 60.000 84.000 C 64.418 84.000 68.000 87.582 68.000 92.000 ZM 128.000 84.000 C 123.582 84.000 120.000 87.582 120.000 92.000 C 120.000 96.418 123.582 100.000 128.000 100.000 C 132.418 100.000 136.000 96.418 136.000 92.000 C 136.000 87.582 132.418 84.000 128.000 84.000 ZM 196.000 100.000 C 200.418 100.000 204.000 96.418 204.000 92.000 C 204.000 87.582 200.418 84.000 196.000 84.000 C 191.582 84.000 188.000 87.582 188.000 92.000 C 188.000 96.418 191.582 100.000 196.000 100.000 ZM 60.000 156.000 C 55.582 156.000 52.000 159.582 52.000 164.000 C 52.000 168.418 55.582 172.000 60.000 172.000 C 64.418 172.000 68.000 168.418 68.000 164.000 C 68.000 159.582 64.418 156.000 60.000 156.000 ZM 128.000 156.000 C 123.582 156.000 120.000 159.582 120.000 164.000 C 120.000 168.418 123.582 172.000 128.000 172.000 C 132.418 172.000 136.000 168.418 136.000 164.000 C 136.000 159.582 132.418 156.000 128.000 156.000 ZM 196.000 156.000 C 191.582 156.000 188.000 159.582 188.000 164.000 C 188.000 168.418 191.582 172.000 196.000 172.000 C 200.418 172.000 204.000 168.418 204.000 164.000 C 204.000 159.582 200.418 156.000 196.000 156.000 Z"),
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
        return _dotsSix!!
    }

private var _dotsSix: ImageVector? = null
