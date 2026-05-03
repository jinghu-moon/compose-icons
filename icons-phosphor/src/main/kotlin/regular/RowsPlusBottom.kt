package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.RowsPlusBottom: ImageVector
    get() {
        if (_rowsPlusBottom != null) return _rowsPlusBottom!!
        _rowsPlusBottom = phosphorRegularIcon(
            name = "RowsPlusBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 112.000 L 48.000 112.000 C 39.163 112.000 32.000 119.163 32.000 128.000 L 32.000 152.000 C 32.000 160.837 39.163 168.000 48.000 168.000 L 208.000 168.000 C 216.837 168.000 224.000 160.837 224.000 152.000 L 224.000 128.000 C 224.000 119.163 216.837 112.000 208.000 112.000 ZM 208.000 152.000 L 48.000 152.000 L 48.000 128.000 L 208.000 128.000 L 208.000 152.000 ZM 208.000 40.000 L 48.000 40.000 C 39.163 40.000 32.000 47.163 32.000 56.000 L 32.000 80.000 C 32.000 88.837 39.163 96.000 48.000 96.000 L 208.000 96.000 C 216.837 96.000 224.000 88.837 224.000 80.000 L 224.000 56.000 C 224.000 47.163 216.837 40.000 208.000 40.000 ZM 208.000 80.000 L 48.000 80.000 L 48.000 56.000 L 208.000 56.000 L 208.000 80.000 ZM 160.000 216.000 C 160.000 220.418 156.418 224.000 152.000 224.000 L 136.000 224.000 L 136.000 240.000 C 136.000 244.418 132.418 248.000 128.000 248.000 C 123.582 248.000 120.000 244.418 120.000 240.000 L 120.000 224.000 L 104.000 224.000 C 99.582 224.000 96.000 220.418 96.000 216.000 C 96.000 211.582 99.582 208.000 104.000 208.000 L 120.000 208.000 L 120.000 192.000 C 120.000 187.582 123.582 184.000 128.000 184.000 C 132.418 184.000 136.000 187.582 136.000 192.000 L 136.000 208.000 L 152.000 208.000 C 156.418 208.000 160.000 211.582 160.000 216.000 Z"),
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
        return _rowsPlusBottom!!
    }

private var _rowsPlusBottom: ImageVector? = null
