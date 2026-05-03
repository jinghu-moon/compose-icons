package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArticleMedium: ImageVector
    get() {
        if (_articleMedium != null) return _articleMedium!!
        _articleMedium = phosphorDuotoneIcon(
            name = "ArticleMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 232.000 104.000 L 232.000 200.000 L 80.000 200.000 L 80.000 168.000 L 168.000 168.000 L 168.000 104.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 56.000 136.000 C 56.000 140.418 52.418 144.000 48.000 144.000 L 24.000 144.000 C 19.582 144.000 16.000 140.418 16.000 136.000 C 16.000 131.582 19.582 128.000 24.000 128.000 L 32.000 128.000 L 32.000 64.000 L 24.000 64.000 C 19.582 64.000 16.000 60.418 16.000 56.000 C 16.000 51.582 19.582 48.000 24.000 48.000 L 40.000 48.000 L 40.000 48.000 C 42.753 47.997 45.314 49.410 46.780 51.740 L 80.000 104.910 L 113.220 51.760 C 114.681 49.422 117.243 48.001 120.000 48.000 L 120.000 48.000 L 136.000 48.000 C 140.418 48.000 144.000 51.582 144.000 56.000 C 144.000 60.418 140.418 64.000 136.000 64.000 L 128.000 64.000 L 128.000 128.000 L 136.000 128.000 C 140.418 128.000 144.000 131.582 144.000 136.000 C 144.000 140.418 140.418 144.000 136.000 144.000 L 112.000 144.000 C 107.582 144.000 104.000 140.418 104.000 136.000 C 104.000 131.582 107.582 128.000 112.000 128.000 L 112.000 83.890 L 86.780 124.240 C 85.317 126.575 82.756 127.994 80.000 127.994 C 77.244 127.994 74.683 126.575 73.220 124.240 L 48.000 83.890 L 48.000 128.000 C 52.418 128.000 56.000 131.582 56.000 136.000 ZM 168.000 112.000 L 232.000 112.000 C 236.418 112.000 240.000 108.418 240.000 104.000 C 240.000 99.582 236.418 96.000 232.000 96.000 L 168.000 96.000 C 163.582 96.000 160.000 99.582 160.000 104.000 C 160.000 108.418 163.582 112.000 168.000 112.000 ZM 232.000 128.000 L 168.000 128.000 C 163.582 128.000 160.000 131.582 160.000 136.000 C 160.000 140.418 163.582 144.000 168.000 144.000 L 232.000 144.000 C 236.418 144.000 240.000 140.418 240.000 136.000 C 240.000 131.582 236.418 128.000 232.000 128.000 ZM 232.000 160.000 L 80.000 160.000 C 75.582 160.000 72.000 163.582 72.000 168.000 C 72.000 172.418 75.582 176.000 80.000 176.000 L 232.000 176.000 C 236.418 176.000 240.000 172.418 240.000 168.000 C 240.000 163.582 236.418 160.000 232.000 160.000 ZM 232.000 192.000 L 80.000 192.000 C 75.582 192.000 72.000 195.582 72.000 200.000 C 72.000 204.418 75.582 208.000 80.000 208.000 L 232.000 208.000 C 236.418 208.000 240.000 204.418 240.000 200.000 C 240.000 195.582 236.418 192.000 232.000 192.000 Z"),
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
        return _articleMedium!!
    }

private var _articleMedium: ImageVector? = null
