package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LinkSimpleHorizontalBreak: ImageVector
    get() {
        if (_linkSimpleHorizontalBreak != null) return _linkSimpleHorizontalBreak!!
        _linkSimpleHorizontalBreak = phosphorFillIcon(
            name = "LinkSimpleHorizontalBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 ZM 112.000 168.000 L 80.000 168.000 C 57.909 168.000 40.000 150.091 40.000 128.000 C 40.000 105.909 57.909 88.000 80.000 88.000 L 112.000 88.000 C 116.418 88.000 120.000 91.582 120.000 96.000 C 120.000 100.418 116.418 104.000 112.000 104.000 L 80.000 104.000 C 66.745 104.000 56.000 114.745 56.000 128.000 C 56.000 141.255 66.745 152.000 80.000 152.000 L 112.000 152.000 C 116.418 152.000 120.000 155.582 120.000 160.000 C 120.000 164.418 116.418 168.000 112.000 168.000 ZM 176.000 168.000 L 144.000 168.000 C 139.582 168.000 136.000 164.418 136.000 160.000 C 136.000 155.582 139.582 152.000 144.000 152.000 L 176.000 152.000 C 189.255 152.000 200.000 141.255 200.000 128.000 C 200.000 114.745 189.255 104.000 176.000 104.000 L 144.000 104.000 C 139.582 104.000 136.000 100.418 136.000 96.000 C 136.000 91.582 139.582 88.000 144.000 88.000 L 176.000 88.000 C 198.091 88.000 216.000 105.909 216.000 128.000 C 216.000 150.091 198.091 168.000 176.000 168.000 Z"),
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
        return _linkSimpleHorizontalBreak!!
    }

private var _linkSimpleHorizontalBreak: ImageVector? = null
