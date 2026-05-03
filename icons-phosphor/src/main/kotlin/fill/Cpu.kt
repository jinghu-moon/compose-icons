package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cpu: ImageVector
    get() {
        if (_cpu != null) return _cpu!!
        _cpu = phosphorFillIcon(
            name = "Cpu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 104.000 104.000 L 152.000 104.000 L 152.000 152.000 L 104.000 152.000 ZM 240.000 152.000 C 240.000 156.418 236.418 160.000 232.000 160.000 L 216.000 160.000 L 216.000 200.000 C 216.000 208.837 208.837 216.000 200.000 216.000 L 160.000 216.000 L 160.000 232.000 C 160.000 236.418 156.418 240.000 152.000 240.000 C 147.582 240.000 144.000 236.418 144.000 232.000 L 144.000 216.000 L 112.000 216.000 L 112.000 232.000 C 112.000 236.418 108.418 240.000 104.000 240.000 C 99.582 240.000 96.000 236.418 96.000 232.000 L 96.000 216.000 L 56.000 216.000 C 47.163 216.000 40.000 208.837 40.000 200.000 L 40.000 160.000 L 24.000 160.000 C 19.582 160.000 16.000 156.418 16.000 152.000 C 16.000 147.582 19.582 144.000 24.000 144.000 L 40.000 144.000 L 40.000 112.000 L 24.000 112.000 C 19.582 112.000 16.000 108.418 16.000 104.000 C 16.000 99.582 19.582 96.000 24.000 96.000 L 40.000 96.000 L 40.000 56.000 C 40.000 47.163 47.163 40.000 56.000 40.000 L 96.000 40.000 L 96.000 24.000 C 96.000 19.582 99.582 16.000 104.000 16.000 C 108.418 16.000 112.000 19.582 112.000 24.000 L 112.000 40.000 L 144.000 40.000 L 144.000 24.000 C 144.000 19.582 147.582 16.000 152.000 16.000 C 156.418 16.000 160.000 19.582 160.000 24.000 L 160.000 40.000 L 200.000 40.000 C 208.837 40.000 216.000 47.163 216.000 56.000 L 216.000 96.000 L 232.000 96.000 C 236.418 96.000 240.000 99.582 240.000 104.000 C 240.000 108.418 236.418 112.000 232.000 112.000 L 216.000 112.000 L 216.000 144.000 L 232.000 144.000 C 236.418 144.000 240.000 147.582 240.000 152.000 ZM 168.000 96.000 C 168.000 91.582 164.418 88.000 160.000 88.000 L 96.000 88.000 C 91.582 88.000 88.000 91.582 88.000 96.000 L 88.000 160.000 C 88.000 164.418 91.582 168.000 96.000 168.000 L 160.000 168.000 C 164.418 168.000 168.000 164.418 168.000 160.000 Z"),
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
        return _cpu!!
    }

private var _cpu: ImageVector? = null
