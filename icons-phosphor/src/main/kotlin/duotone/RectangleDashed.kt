package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.RectangleDashed: ImageVector
    get() {
        if (_rectangleDashed != null) return _rectangleDashed!!
        _rectangleDashed = phosphorDuotoneIcon(
            name = "RectangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 56.000 L 224.000 200.000 C 224.000 204.418 220.418 208.000 216.000 208.000 L 40.000 208.000 C 35.582 208.000 32.000 204.418 32.000 200.000 L 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 L 216.000 48.000 C 220.418 48.000 224.000 51.582 224.000 56.000 Z"),
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
                pathData = parseSvgPathData("M 80.000 48.000 C 80.000 52.418 76.418 56.000 72.000 56.000 L 40.000 56.000 L 40.000 72.000 C 40.000 76.418 36.418 80.000 32.000 80.000 C 27.582 80.000 24.000 76.418 24.000 72.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 72.000 40.000 C 76.418 40.000 80.000 43.582 80.000 48.000 ZM 32.000 152.000 C 36.418 152.000 40.000 148.418 40.000 144.000 L 40.000 112.000 C 40.000 107.582 36.418 104.000 32.000 104.000 C 27.582 104.000 24.000 107.582 24.000 112.000 L 24.000 144.000 C 24.000 148.418 27.582 152.000 32.000 152.000 ZM 72.000 200.000 L 40.000 200.000 L 40.000 184.000 C 40.000 179.582 36.418 176.000 32.000 176.000 C 27.582 176.000 24.000 179.582 24.000 184.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 72.000 216.000 C 76.418 216.000 80.000 212.418 80.000 208.000 C 80.000 203.582 76.418 200.000 72.000 200.000 ZM 144.000 200.000 L 112.000 200.000 C 107.582 200.000 104.000 203.582 104.000 208.000 C 104.000 212.418 107.582 216.000 112.000 216.000 L 144.000 216.000 C 148.418 216.000 152.000 212.418 152.000 208.000 C 152.000 203.582 148.418 200.000 144.000 200.000 ZM 224.000 176.000 C 219.582 176.000 216.000 179.582 216.000 184.000 L 216.000 200.000 L 184.000 200.000 C 179.582 200.000 176.000 203.582 176.000 208.000 C 176.000 212.418 179.582 216.000 184.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 184.000 C 232.000 179.582 228.418 176.000 224.000 176.000 ZM 224.000 104.000 C 219.582 104.000 216.000 107.582 216.000 112.000 L 216.000 144.000 C 216.000 148.418 219.582 152.000 224.000 152.000 C 228.418 152.000 232.000 148.418 232.000 144.000 L 232.000 112.000 C 232.000 107.582 228.418 104.000 224.000 104.000 ZM 216.000 40.000 L 184.000 40.000 C 179.582 40.000 176.000 43.582 176.000 48.000 C 176.000 52.418 179.582 56.000 184.000 56.000 L 216.000 56.000 L 216.000 72.000 C 216.000 76.418 219.582 80.000 224.000 80.000 C 228.418 80.000 232.000 76.418 232.000 72.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 144.000 40.000 L 112.000 40.000 C 107.582 40.000 104.000 43.582 104.000 48.000 C 104.000 52.418 107.582 56.000 112.000 56.000 L 144.000 56.000 C 148.418 56.000 152.000 52.418 152.000 48.000 C 152.000 43.582 148.418 40.000 144.000 40.000 Z"),
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
        return _rectangleDashed!!
    }

private var _rectangleDashed: ImageVector? = null
