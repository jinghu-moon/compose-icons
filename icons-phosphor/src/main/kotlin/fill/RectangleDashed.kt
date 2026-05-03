package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RectangleDashed: ImageVector
    get() {
        if (_rectangleDashed != null) return _rectangleDashed!!
        _rectangleDashed = phosphorFillIcon(
            name = "RectangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 80.000 192.000 L 64.000 192.000 C 55.163 192.000 48.000 184.837 48.000 176.000 L 48.000 144.000 C 48.000 139.582 51.582 136.000 56.000 136.000 C 60.418 136.000 64.000 139.582 64.000 144.000 L 64.000 176.000 L 80.000 176.000 C 84.418 176.000 88.000 179.582 88.000 184.000 C 88.000 188.418 84.418 192.000 80.000 192.000 ZM 80.000 80.000 L 64.000 80.000 L 64.000 112.000 C 64.000 116.418 60.418 120.000 56.000 120.000 C 51.582 120.000 48.000 116.418 48.000 112.000 L 48.000 80.000 C 48.000 71.163 55.163 64.000 64.000 64.000 L 80.000 64.000 C 84.418 64.000 88.000 67.582 88.000 72.000 C 88.000 76.418 84.418 80.000 80.000 80.000 ZM 144.000 192.000 L 112.000 192.000 C 107.582 192.000 104.000 188.418 104.000 184.000 C 104.000 179.582 107.582 176.000 112.000 176.000 L 144.000 176.000 C 148.418 176.000 152.000 179.582 152.000 184.000 C 152.000 188.418 148.418 192.000 144.000 192.000 ZM 144.000 80.000 L 112.000 80.000 C 107.582 80.000 104.000 76.418 104.000 72.000 C 104.000 67.582 107.582 64.000 112.000 64.000 L 144.000 64.000 C 148.418 64.000 152.000 67.582 152.000 72.000 C 152.000 76.418 148.418 80.000 144.000 80.000 ZM 208.000 176.000 C 208.000 184.837 200.837 192.000 192.000 192.000 L 176.000 192.000 C 171.582 192.000 168.000 188.418 168.000 184.000 C 168.000 179.582 171.582 176.000 176.000 176.000 L 192.000 176.000 L 192.000 144.000 C 192.000 139.582 195.582 136.000 200.000 136.000 C 204.418 136.000 208.000 139.582 208.000 144.000 ZM 208.000 112.000 C 208.000 116.418 204.418 120.000 200.000 120.000 C 195.582 120.000 192.000 116.418 192.000 112.000 L 192.000 80.000 L 176.000 80.000 C 171.582 80.000 168.000 76.418 168.000 72.000 C 168.000 67.582 171.582 64.000 176.000 64.000 L 192.000 64.000 C 200.837 64.000 208.000 71.163 208.000 80.000 Z"),
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
        return _rectangleDashed!!
    }

private var _rectangleDashed: ImageVector? = null
