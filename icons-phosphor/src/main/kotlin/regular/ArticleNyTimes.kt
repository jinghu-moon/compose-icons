package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) return _articleNyTimes!!
        _articleNyTimes = phosphorRegularIcon(
            name = "ArticleNyTimes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 96.000 L 232.000 96.000 C 236.418 96.000 240.000 99.582 240.000 104.000 C 240.000 108.418 236.418 112.000 232.000 112.000 L 128.000 112.000 C 123.582 112.000 120.000 108.418 120.000 104.000 C 120.000 99.582 123.582 96.000 128.000 96.000 ZM 232.000 128.000 L 128.000 128.000 C 123.582 128.000 120.000 131.582 120.000 136.000 C 120.000 140.418 123.582 144.000 128.000 144.000 L 232.000 144.000 C 236.418 144.000 240.000 140.418 240.000 136.000 C 240.000 131.582 236.418 128.000 232.000 128.000 ZM 232.000 160.000 L 80.000 160.000 C 75.582 160.000 72.000 163.582 72.000 168.000 C 72.000 172.418 75.582 176.000 80.000 176.000 L 232.000 176.000 C 236.418 176.000 240.000 172.418 240.000 168.000 C 240.000 163.582 236.418 160.000 232.000 160.000 ZM 232.000 192.000 L 80.000 192.000 C 75.582 192.000 72.000 195.582 72.000 200.000 C 72.000 204.418 75.582 208.000 80.000 208.000 L 232.000 208.000 C 236.418 208.000 240.000 204.418 240.000 200.000 C 240.000 195.582 236.418 192.000 232.000 192.000 ZM 96.000 144.000 C 100.418 144.000 104.000 140.418 104.000 136.000 C 104.000 131.582 100.418 128.000 96.000 128.000 L 88.000 128.000 L 88.000 64.000 L 120.000 64.000 L 120.000 72.000 C 120.000 76.418 123.582 80.000 128.000 80.000 C 132.418 80.000 136.000 76.418 136.000 72.000 L 136.000 56.000 C 136.000 51.582 132.418 48.000 128.000 48.000 L 32.000 48.000 C 27.582 48.000 24.000 51.582 24.000 56.000 L 24.000 72.000 C 24.000 76.418 27.582 80.000 32.000 80.000 C 36.418 80.000 40.000 76.418 40.000 72.000 L 40.000 64.000 L 72.000 64.000 L 72.000 128.000 L 64.000 128.000 C 59.582 128.000 56.000 131.582 56.000 136.000 C 56.000 140.418 59.582 144.000 64.000 144.000 Z"),
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
        return _articleNyTimes!!
    }

private var _articleNyTimes: ImageVector? = null
