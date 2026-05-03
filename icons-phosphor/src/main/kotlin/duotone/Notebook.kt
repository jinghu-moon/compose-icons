package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Notebook: ImageVector
    get() {
        if (_notebook != null) return _notebook!!
        _notebook = phosphorDuotoneIcon(
            name = "Notebook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 80.000 40.000 L 80.000 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 L 40.000 48.000 C 40.000 43.582 43.582 40.000 48.000 40.000 Z"),
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
                pathData = parseSvgPathData("M 184.000 112.000 C 184.000 116.418 180.418 120.000 176.000 120.000 L 112.000 120.000 C 107.582 120.000 104.000 116.418 104.000 112.000 C 104.000 107.582 107.582 104.000 112.000 104.000 L 176.000 104.000 C 180.418 104.000 184.000 107.582 184.000 112.000 ZM 176.000 136.000 L 112.000 136.000 C 107.582 136.000 104.000 139.582 104.000 144.000 C 104.000 148.418 107.582 152.000 112.000 152.000 L 176.000 152.000 C 180.418 152.000 184.000 148.418 184.000 144.000 C 184.000 139.582 180.418 136.000 176.000 136.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 48.000 208.000 L 72.000 208.000 L 72.000 48.000 L 48.000 48.000 ZM 208.000 208.000 L 208.000 48.000 L 88.000 48.000 L 88.000 208.000 L 208.000 208.000 Z"),
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
        return _notebook!!
    }

private var _notebook: ImageVector? = null
