package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) return _articleNyTimes!!
        _articleNyTimes = phosphorFillIcon(
            name = "ArticleNyTimes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 64.000 92.000 C 64.000 96.418 60.418 100.000 56.000 100.000 C 51.582 100.000 48.000 96.418 48.000 92.000 L 48.000 80.000 C 48.000 75.582 51.582 72.000 56.000 72.000 L 128.000 72.000 C 132.418 72.000 136.000 75.582 136.000 80.000 L 136.000 92.000 C 136.000 96.418 132.418 100.000 128.000 100.000 C 123.582 100.000 120.000 96.418 120.000 92.000 L 120.000 88.000 L 100.000 88.000 L 100.000 136.000 L 104.000 136.000 C 108.418 136.000 112.000 139.582 112.000 144.000 C 112.000 148.418 108.418 152.000 104.000 152.000 L 80.000 152.000 C 75.582 152.000 72.000 148.418 72.000 144.000 C 72.000 139.582 75.582 136.000 80.000 136.000 L 84.000 136.000 L 84.000 88.000 L 64.000 88.000 ZM 200.000 184.000 L 80.000 184.000 C 75.582 184.000 72.000 180.418 72.000 176.000 C 72.000 171.582 75.582 168.000 80.000 168.000 L 200.000 168.000 C 204.418 168.000 208.000 171.582 208.000 176.000 C 208.000 180.418 204.418 184.000 200.000 184.000 ZM 200.000 152.000 L 136.000 152.000 C 131.582 152.000 128.000 148.418 128.000 144.000 C 128.000 139.582 131.582 136.000 136.000 136.000 L 200.000 136.000 C 204.418 136.000 208.000 139.582 208.000 144.000 C 208.000 148.418 204.418 152.000 200.000 152.000 ZM 200.000 120.000 L 152.000 120.000 C 147.582 120.000 144.000 116.418 144.000 112.000 C 144.000 107.582 147.582 104.000 152.000 104.000 L 200.000 104.000 C 204.418 104.000 208.000 107.582 208.000 112.000 C 208.000 116.418 204.418 120.000 200.000 120.000 Z"),
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
