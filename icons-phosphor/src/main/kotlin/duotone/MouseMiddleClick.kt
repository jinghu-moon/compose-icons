package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MouseMiddleClick: ImageVector
    get() {
        if (_mouseMiddleClick != null) return _mouseMiddleClick!!
        _mouseMiddleClick = phosphorDuotoneIcon(
            name = "MouseMiddleClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 144.000 88.000 L 144.000 136.000 C 144.000 140.418 140.418 144.000 136.000 144.000 L 120.000 144.000 C 115.582 144.000 112.000 140.418 112.000 136.000 L 112.000 88.000 C 112.000 83.582 115.582 80.000 120.000 80.000 L 136.000 80.000 C 140.418 80.000 144.000 83.582 144.000 88.000 Z"),
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
                pathData = parseSvgPathData("M 144.000 16.000 L 112.000 16.000 C 76.670 16.039 48.039 44.670 48.000 80.000 L 48.000 176.000 C 48.039 211.330 76.670 239.961 112.000 240.000 L 144.000 240.000 C 179.330 239.961 207.961 211.330 208.000 176.000 L 208.000 80.000 C 207.961 44.670 179.330 16.039 144.000 16.000 ZM 192.000 80.000 L 192.000 104.000 L 152.000 104.000 L 152.000 88.000 C 152.000 79.163 144.837 72.000 136.000 72.000 L 136.000 32.000 L 144.000 32.000 C 170.498 32.028 191.972 53.502 192.000 80.000 ZM 136.000 136.000 L 120.000 136.000 L 120.000 88.000 L 136.000 88.000 L 136.000 111.900 C 135.987 111.966 135.987 112.034 136.000 112.100 ZM 112.000 32.000 L 120.000 32.000 L 120.000 72.000 C 111.163 72.000 104.000 79.163 104.000 88.000 L 104.000 104.000 L 64.000 104.000 L 64.000 80.000 C 64.028 53.502 85.502 32.028 112.000 32.000 ZM 144.000 224.000 L 112.000 224.000 C 85.502 223.972 64.028 202.498 64.000 176.000 L 64.000 120.000 L 104.000 120.000 L 104.000 136.000 C 104.000 144.837 111.163 152.000 120.000 152.000 L 136.000 152.000 C 144.837 152.000 152.000 144.837 152.000 136.000 L 152.000 120.000 L 192.000 120.000 L 192.000 176.000 C 191.972 202.498 170.498 223.972 144.000 224.000 Z"),
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
        return _mouseMiddleClick!!
    }

private var _mouseMiddleClick: ImageVector? = null
