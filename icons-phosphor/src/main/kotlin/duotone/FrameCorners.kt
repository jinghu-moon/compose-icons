package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FrameCorners: ImageVector
    get() {
        if (_frameCorners != null) return _frameCorners!!
        _frameCorners = phosphorDuotoneIcon(
            name = "FrameCorners",
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
                pathData = parseSvgPathData("M 200.000 80.000 L 200.000 112.000 C 200.000 116.418 196.418 120.000 192.000 120.000 C 187.582 120.000 184.000 116.418 184.000 112.000 L 184.000 88.000 L 160.000 88.000 C 155.582 88.000 152.000 84.418 152.000 80.000 C 152.000 75.582 155.582 72.000 160.000 72.000 L 192.000 72.000 C 196.418 72.000 200.000 75.582 200.000 80.000 ZM 96.000 168.000 L 72.000 168.000 L 72.000 144.000 C 72.000 139.582 68.418 136.000 64.000 136.000 C 59.582 136.000 56.000 139.582 56.000 144.000 L 56.000 176.000 C 56.000 180.418 59.582 184.000 64.000 184.000 L 96.000 184.000 C 100.418 184.000 104.000 180.418 104.000 176.000 C 104.000 171.582 100.418 168.000 96.000 168.000 ZM 232.000 56.000 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 216.000 200.000 L 216.000 56.000 L 40.000 56.000 L 40.000 200.000 L 216.000 200.000 Z"),
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
        return _frameCorners!!
    }

private var _frameCorners: ImageVector? = null
