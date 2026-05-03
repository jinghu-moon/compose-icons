package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FirstAidKit: ImageVector
    get() {
        if (_firstAidKit != null) return _firstAidKit!!
        _firstAidKit = phosphorFillIcon(
            name = "FirstAidKit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 56.000 L 176.000 56.000 L 176.000 48.000 C 176.000 34.745 165.255 24.000 152.000 24.000 L 104.000 24.000 C 90.745 24.000 80.000 34.745 80.000 48.000 L 80.000 56.000 L 40.000 56.000 C 31.163 56.000 24.000 63.163 24.000 72.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 72.000 C 232.000 63.163 224.837 56.000 216.000 56.000 ZM 152.000 144.000 L 136.000 144.000 L 136.000 160.000 C 136.000 164.418 132.418 168.000 128.000 168.000 C 123.582 168.000 120.000 164.418 120.000 160.000 L 120.000 144.000 L 104.000 144.000 C 99.582 144.000 96.000 140.418 96.000 136.000 C 96.000 131.582 99.582 128.000 104.000 128.000 L 120.000 128.000 L 120.000 112.000 C 120.000 107.582 123.582 104.000 128.000 104.000 C 132.418 104.000 136.000 107.582 136.000 112.000 L 136.000 128.000 L 152.000 128.000 C 156.418 128.000 160.000 131.582 160.000 136.000 C 160.000 140.418 156.418 144.000 152.000 144.000 ZM 160.000 56.000 L 96.000 56.000 L 96.000 48.000 C 96.000 43.582 99.582 40.000 104.000 40.000 L 152.000 40.000 C 156.418 40.000 160.000 43.582 160.000 48.000 Z"),
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
        return _firstAidKit!!
    }

private var _firstAidKit: ImageVector? = null
