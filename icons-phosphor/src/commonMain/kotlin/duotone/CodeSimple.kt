package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) return _codeSimple!!
        _codeSimple = phosphorDuotoneIcon(
            name = "CodeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 128.0f),
                    PathNode.LineTo(168.0f, 192.0f),
                    PathNode.LineTo(88.0f, 192.0f),
                    PathNode.LineTo(16.0f, 128.0f),
                    PathNode.LineTo(88.0f, 64.0f),
                    PathNode.LineTo(168.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(93.31f, 70.0f),
                    PathNode.LineTo(28.0f, 128.0f),
                    PathNode.LineTo(93.27f, 186.0f),
                    PathNode.CurveTo(96.58371f, 188.93263f, 96.89263f, 193.99629f, 93.96f, 197.31f),
                    PathNode.CurveTo(91.02737f, 200.6237f, 85.96371f, 200.93263f, 82.65f, 198.0f),
                    PathNode.LineTo(10.65f, 134.0f),
                    PathNode.CurveTo(8.927997f, 132.48134f, 7.941503f, 130.296f, 7.941503f, 128.0f),
                    PathNode.CurveTo(7.941503f, 125.703995f, 8.927997f, 123.51866f, 10.65f, 122.0f),
                    PathNode.LineTo(82.65f, 58.0f),
                    PathNode.CurveTo(85.96371f, 55.056324f, 91.03632f, 55.356293f, 93.98f, 58.67f),
                    PathNode.CurveTo(96.923676f, 61.983707f, 96.62371f, 67.05632f, 93.31f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(245.31f, 122.0f),
                    PathNode.LineTo(173.31f, 58.0f),
                    PathNode.CurveTo(169.99629f, 55.067368f, 164.93263f, 55.376293f, 162.0f, 58.69f),
                    PathNode.CurveTo(159.06737f, 62.003708f, 159.3763f, 67.06737f, 162.69f, 70.0f),
                    PathNode.LineTo(228.0f, 128.0f),
                    PathNode.LineTo(162.73f, 186.0f),
                    PathNode.CurveTo(159.41629f, 188.93263f, 159.10736f, 193.99629f, 162.04f, 197.31f),
                    PathNode.CurveTo(164.97263f, 200.6237f, 170.03629f, 200.93263f, 173.35f, 198.0f),
                    PathNode.LineTo(245.35f, 134.0f),
                    PathNode.CurveTo(247.072f, 132.48134f, 248.0585f, 130.296f, 248.0585f, 128.0f),
                    PathNode.CurveTo(248.0585f, 125.703995f, 247.072f, 123.51866f, 245.35f, 122.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
