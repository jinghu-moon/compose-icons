package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Browser: ImageVector
    get() {
        if (_browser != null) return _browser!!
        _browser = phosphorDuotoneIcon(
            name = "Browser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 56.000 L 224.000 96.000 L 32.000 96.000 L 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 L 216.000 48.000 C 220.418 48.000 224.000 51.582 224.000 56.000 Z"),
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
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 216.000 56.000 L 216.000 88.000 L 40.000 88.000 L 40.000 56.000 ZM 216.000 200.000 L 40.000 200.000 L 40.000 104.000 L 216.000 104.000 L 216.000 200.000 Z"),
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
        return _browser!!
    }

private var _browser: ImageVector? = null
