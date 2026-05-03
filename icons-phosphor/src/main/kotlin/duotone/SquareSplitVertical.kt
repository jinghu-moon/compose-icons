package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SquareSplitVertical: ImageVector
    get() {
        if (_squareSplitVertical != null) return _squareSplitVertical!!
        _squareSplitVertical = phosphorDuotoneIcon(
            name = "SquareSplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 56.000 L 208.000 200.000 C 208.000 204.418 204.418 208.000 200.000 208.000 L 56.000 208.000 C 51.582 208.000 48.000 204.418 48.000 200.000 L 48.000 56.000 C 48.000 51.582 51.582 48.000 56.000 48.000 L 200.000 48.000 C 204.418 48.000 208.000 51.582 208.000 56.000 Z"),
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
                pathData = parseSvgPathData("M 200.000 40.000 L 56.000 40.000 C 47.163 40.000 40.000 47.163 40.000 56.000 L 40.000 200.000 C 40.000 208.837 47.163 216.000 56.000 216.000 L 200.000 216.000 C 208.837 216.000 216.000 208.837 216.000 200.000 L 216.000 56.000 C 216.000 47.163 208.837 40.000 200.000 40.000 ZM 200.000 56.000 L 200.000 120.000 L 56.000 120.000 L 56.000 56.000 ZM 200.000 200.000 L 56.000 200.000 L 56.000 136.000 L 200.000 136.000 L 200.000 200.000 Z"),
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
        return _squareSplitVertical!!
    }

private var _squareSplitVertical: ImageVector? = null
