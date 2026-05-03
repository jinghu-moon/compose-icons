package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Bookmark: ImageVector
    get() {
        if (_bookmark != null) return _bookmark!!
        _bookmark = phosphorDuotoneIcon(
            name = "Bookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 192.000 176.000 L 192.000 224.000 L 128.000 184.000 L 64.000 224.000 L 64.000 176.000 L 128.000 136.000 Z"),
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
                pathData = parseSvgPathData("M 184.000 32.000 L 72.000 32.000 C 63.163 32.000 56.000 39.163 56.000 48.000 L 56.000 224.000 C 56.001 226.907 57.580 229.585 60.124 230.994 C 62.667 232.403 65.774 232.321 68.240 230.780 L 128.000 193.430 L 187.770 230.780 C 190.235 232.316 193.339 232.395 195.879 230.987 C 198.419 229.578 199.996 226.904 200.000 224.000 L 200.000 48.000 C 200.000 39.163 192.837 32.000 184.000 32.000 ZM 184.000 48.000 L 184.000 161.570 L 132.230 129.220 C 129.636 127.599 126.344 127.599 123.750 129.220 L 72.000 161.560 L 72.000 48.000 ZM 132.230 177.220 C 129.636 175.599 126.344 175.599 123.750 177.220 L 72.000 209.570 L 72.000 180.430 L 128.000 145.430 L 184.000 180.430 L 184.000 209.570 Z"),
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
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
