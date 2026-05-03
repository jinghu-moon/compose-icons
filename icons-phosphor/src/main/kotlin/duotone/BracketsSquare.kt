package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BracketsSquare: ImageVector
    get() {
        if (_bracketsSquare != null) return _bracketsSquare!!
        _bracketsSquare = phosphorDuotoneIcon(
            name = "BracketsSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 40.000 L 216.000 216.000 L 40.000 216.000 L 40.000 40.000 Z"),
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
                pathData = parseSvgPathData("M 48.000 48.000 L 48.000 208.000 L 80.000 208.000 C 84.418 208.000 88.000 211.582 88.000 216.000 C 88.000 220.418 84.418 224.000 80.000 224.000 L 40.000 224.000 C 35.582 224.000 32.000 220.418 32.000 216.000 L 32.000 40.000 C 32.000 35.582 35.582 32.000 40.000 32.000 L 80.000 32.000 C 84.418 32.000 88.000 35.582 88.000 40.000 C 88.000 44.418 84.418 48.000 80.000 48.000 ZM 216.000 32.000 L 176.000 32.000 C 171.582 32.000 168.000 35.582 168.000 40.000 C 168.000 44.418 171.582 48.000 176.000 48.000 L 208.000 48.000 L 208.000 208.000 L 176.000 208.000 C 171.582 208.000 168.000 211.582 168.000 216.000 C 168.000 220.418 171.582 224.000 176.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 L 224.000 40.000 C 224.000 35.582 220.418 32.000 216.000 32.000 Z"),
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
        return _bracketsSquare!!
    }

private var _bracketsSquare: ImageVector? = null
