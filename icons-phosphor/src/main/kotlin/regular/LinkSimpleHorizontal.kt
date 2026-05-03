package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LinkSimpleHorizontal: ImageVector
    get() {
        if (_linkSimpleHorizontal != null) return _linkSimpleHorizontal!!
        _linkSimpleHorizontal = phosphorRegularIcon(
            name = "LinkSimpleHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 80.000 120.000 L 176.000 120.000 C 180.418 120.000 184.000 123.582 184.000 128.000 C 184.000 132.418 180.418 136.000 176.000 136.000 L 80.000 136.000 C 75.582 136.000 72.000 132.418 72.000 128.000 C 72.000 123.582 75.582 120.000 80.000 120.000 ZM 104.000 168.000 L 64.000 168.000 C 41.909 168.000 24.000 150.091 24.000 128.000 C 24.000 105.909 41.909 88.000 64.000 88.000 L 104.000 88.000 C 108.418 88.000 112.000 84.418 112.000 80.000 C 112.000 75.582 108.418 72.000 104.000 72.000 L 64.000 72.000 C 33.072 72.000 8.000 97.072 8.000 128.000 C 8.000 158.928 33.072 184.000 64.000 184.000 L 104.000 184.000 C 108.418 184.000 112.000 180.418 112.000 176.000 C 112.000 171.582 108.418 168.000 104.000 168.000 ZM 192.000 72.000 L 152.000 72.000 C 147.582 72.000 144.000 75.582 144.000 80.000 C 144.000 84.418 147.582 88.000 152.000 88.000 L 192.000 88.000 C 214.091 88.000 232.000 105.909 232.000 128.000 C 232.000 150.091 214.091 168.000 192.000 168.000 L 152.000 168.000 C 147.582 168.000 144.000 171.582 144.000 176.000 C 144.000 180.418 147.582 184.000 152.000 184.000 L 192.000 184.000 C 222.928 184.000 248.000 158.928 248.000 128.000 C 248.000 97.072 222.928 72.000 192.000 72.000 Z"),
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
        return _linkSimpleHorizontal!!
    }

private var _linkSimpleHorizontal: ImageVector? = null
