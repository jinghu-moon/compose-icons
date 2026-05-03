package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Browsers: ImageVector
    get() {
        if (_browsers != null) return _browsers!!
        _browsers = phosphorDuotoneIcon(
            name = "Browsers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 56.000 L 224.000 168.000 C 224.000 172.418 220.418 176.000 216.000 176.000 L 192.000 176.000 L 192.000 88.000 C 192.000 83.582 188.418 80.000 184.000 80.000 L 64.000 80.000 L 64.000 56.000 C 64.000 51.582 67.582 48.000 72.000 48.000 L 216.000 48.000 C 220.418 48.000 224.000 51.582 224.000 56.000 Z"),
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
                pathData = parseSvgPathData("M 216.000 40.000 L 72.000 40.000 C 63.163 40.000 56.000 47.163 56.000 56.000 L 56.000 72.000 L 40.000 72.000 C 31.163 72.000 24.000 79.163 24.000 88.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 184.000 216.000 C 192.837 216.000 200.000 208.837 200.000 200.000 L 200.000 184.000 L 216.000 184.000 C 224.837 184.000 232.000 176.837 232.000 168.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 40.000 88.000 L 184.000 88.000 L 184.000 104.000 L 40.000 104.000 ZM 184.000 200.000 L 40.000 200.000 L 40.000 120.000 L 184.000 120.000 L 184.000 200.000 ZM 216.000 168.000 L 200.000 168.000 L 200.000 88.000 C 200.000 79.163 192.837 72.000 184.000 72.000 L 72.000 72.000 L 72.000 56.000 L 216.000 56.000 Z"),
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
        return _browsers!!
    }

private var _browsers: ImageVector? = null
