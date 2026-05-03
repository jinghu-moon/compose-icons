package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Suitcase: ImageVector
    get() {
        if (_suitcase != null) return _suitcase!!
        _suitcase = phosphorDuotoneIcon(
            name = "Suitcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 40.000 64.000 L 88.000 64.000 L 88.000 208.000 L 40.000 208.000 C 35.582 208.000 32.000 204.418 32.000 200.000 L 32.000 72.000 C 32.000 67.582 35.582 64.000 40.000 64.000 ZM 216.000 64.000 L 168.000 64.000 L 168.000 208.000 L 216.000 208.000 C 220.418 208.000 224.000 204.418 224.000 200.000 L 224.000 72.000 C 224.000 67.582 220.418 64.000 216.000 64.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 216.000 56.000 L 176.000 56.000 L 176.000 48.000 C 176.000 34.745 165.255 24.000 152.000 24.000 L 104.000 24.000 C 90.745 24.000 80.000 34.745 80.000 48.000 L 80.000 56.000 L 40.000 56.000 C 31.163 56.000 24.000 63.163 24.000 72.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 72.000 C 232.000 63.163 224.837 56.000 216.000 56.000 ZM 96.000 48.000 C 96.000 43.582 99.582 40.000 104.000 40.000 L 152.000 40.000 C 156.418 40.000 160.000 43.582 160.000 48.000 L 160.000 56.000 L 96.000 56.000 ZM 160.000 72.000 L 160.000 200.000 L 96.000 200.000 L 96.000 72.000 ZM 40.000 72.000 L 80.000 72.000 L 80.000 200.000 L 40.000 200.000 ZM 216.000 200.000 L 176.000 200.000 L 176.000 72.000 L 216.000 72.000 L 216.000 200.000 Z"),
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
        return _suitcase!!
    }

private var _suitcase: ImageVector? = null
