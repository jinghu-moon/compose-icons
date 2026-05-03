package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ListDashes: ImageVector
    get() {
        if (_listDashes != null) return _listDashes!!
        _listDashes = phosphorFillIcon(
            name = "ListDashes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 72.000 184.000 L 64.000 184.000 C 59.582 184.000 56.000 180.418 56.000 176.000 C 56.000 171.582 59.582 168.000 64.000 168.000 L 72.000 168.000 C 76.418 168.000 80.000 171.582 80.000 176.000 C 80.000 180.418 76.418 184.000 72.000 184.000 ZM 72.000 136.000 L 64.000 136.000 C 59.582 136.000 56.000 132.418 56.000 128.000 C 56.000 123.582 59.582 120.000 64.000 120.000 L 72.000 120.000 C 76.418 120.000 80.000 123.582 80.000 128.000 C 80.000 132.418 76.418 136.000 72.000 136.000 ZM 72.000 88.000 L 64.000 88.000 C 59.582 88.000 56.000 84.418 56.000 80.000 C 56.000 75.582 59.582 72.000 64.000 72.000 L 72.000 72.000 C 76.418 72.000 80.000 75.582 80.000 80.000 C 80.000 84.418 76.418 88.000 72.000 88.000 ZM 192.000 184.000 L 104.000 184.000 C 99.582 184.000 96.000 180.418 96.000 176.000 C 96.000 171.582 99.582 168.000 104.000 168.000 L 192.000 168.000 C 196.418 168.000 200.000 171.582 200.000 176.000 C 200.000 180.418 196.418 184.000 192.000 184.000 ZM 192.000 136.000 L 104.000 136.000 C 99.582 136.000 96.000 132.418 96.000 128.000 C 96.000 123.582 99.582 120.000 104.000 120.000 L 192.000 120.000 C 196.418 120.000 200.000 123.582 200.000 128.000 C 200.000 132.418 196.418 136.000 192.000 136.000 ZM 192.000 88.000 L 104.000 88.000 C 99.582 88.000 96.000 84.418 96.000 80.000 C 96.000 75.582 99.582 72.000 104.000 72.000 L 192.000 72.000 C 196.418 72.000 200.000 75.582 200.000 80.000 C 200.000 84.418 196.418 88.000 192.000 88.000 Z"),
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
        return _listDashes!!
    }

private var _listDashes: ImageVector? = null
