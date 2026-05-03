package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Article: ImageVector
    get() {
        if (_article != null) return _article!!
        _article = phosphorDuotoneIcon(
            name = "Article",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 56.000 L 224.000 200.000 C 224.000 204.418 220.418 208.000 216.000 208.000 L 40.000 208.000 C 35.582 208.000 32.000 204.418 32.000 200.000 L 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 L 216.000 48.000 C 220.418 48.000 224.000 51.582 224.000 56.000 Z"),
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
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 216.000 200.000 L 40.000 200.000 L 40.000 56.000 L 216.000 56.000 L 216.000 200.000 ZM 184.000 96.000 C 184.000 100.418 180.418 104.000 176.000 104.000 L 80.000 104.000 C 75.582 104.000 72.000 100.418 72.000 96.000 C 72.000 91.582 75.582 88.000 80.000 88.000 L 176.000 88.000 C 180.418 88.000 184.000 91.582 184.000 96.000 ZM 184.000 128.000 C 184.000 132.418 180.418 136.000 176.000 136.000 L 80.000 136.000 C 75.582 136.000 72.000 132.418 72.000 128.000 C 72.000 123.582 75.582 120.000 80.000 120.000 L 176.000 120.000 C 180.418 120.000 184.000 123.582 184.000 128.000 ZM 184.000 160.000 C 184.000 164.418 180.418 168.000 176.000 168.000 L 80.000 168.000 C 75.582 168.000 72.000 164.418 72.000 160.000 C 72.000 155.582 75.582 152.000 80.000 152.000 L 176.000 152.000 C 180.418 152.000 184.000 155.582 184.000 160.000 Z"),
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
        return _article!!
    }

private var _article: ImageVector? = null
