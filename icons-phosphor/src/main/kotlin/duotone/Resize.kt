package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Resize: ImageVector
    get() {
        if (_resize != null) return _resize!!
        _resize = phosphorDuotoneIcon(
            name = "Resize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 136.000 120.000 L 136.000 208.000 L 48.000 208.000 L 48.000 120.000 Z"),
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
                pathData = parseSvgPathData("M 136.000 112.000 L 48.000 112.000 C 43.582 112.000 40.000 115.582 40.000 120.000 L 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 L 136.000 216.000 C 140.418 216.000 144.000 212.418 144.000 208.000 L 144.000 120.000 C 144.000 115.582 140.418 112.000 136.000 112.000 ZM 128.000 200.000 L 56.000 200.000 L 56.000 128.000 L 128.000 128.000 ZM 216.000 184.000 L 216.000 200.000 C 216.000 208.837 208.837 216.000 200.000 216.000 L 176.000 216.000 C 171.582 216.000 168.000 212.418 168.000 208.000 C 168.000 203.582 171.582 200.000 176.000 200.000 L 200.000 200.000 L 200.000 184.000 C 200.000 179.582 203.582 176.000 208.000 176.000 C 212.418 176.000 216.000 179.582 216.000 184.000 ZM 216.000 112.000 L 216.000 144.000 C 216.000 148.418 212.418 152.000 208.000 152.000 C 203.582 152.000 200.000 148.418 200.000 144.000 L 200.000 112.000 C 200.000 107.582 203.582 104.000 208.000 104.000 C 212.418 104.000 216.000 107.582 216.000 112.000 ZM 216.000 56.000 L 216.000 72.000 C 216.000 76.418 212.418 80.000 208.000 80.000 C 203.582 80.000 200.000 76.418 200.000 72.000 L 200.000 56.000 L 184.000 56.000 C 179.582 56.000 176.000 52.418 176.000 48.000 C 176.000 43.582 179.582 40.000 184.000 40.000 L 200.000 40.000 C 208.837 40.000 216.000 47.163 216.000 56.000 ZM 152.000 48.000 C 152.000 52.418 148.418 56.000 144.000 56.000 L 112.000 56.000 C 107.582 56.000 104.000 52.418 104.000 48.000 C 104.000 43.582 107.582 40.000 112.000 40.000 L 144.000 40.000 C 148.418 40.000 152.000 43.582 152.000 48.000 ZM 40.000 80.000 L 40.000 56.000 C 40.000 47.163 47.163 40.000 56.000 40.000 L 72.000 40.000 C 76.418 40.000 80.000 43.582 80.000 48.000 C 80.000 52.418 76.418 56.000 72.000 56.000 L 56.000 56.000 L 56.000 80.000 C 56.000 84.418 52.418 88.000 48.000 88.000 C 43.582 88.000 40.000 84.418 40.000 80.000 Z"),
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
        return _resize!!
    }

private var _resize: ImageVector? = null
